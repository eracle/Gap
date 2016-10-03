# Gap
Data Mining library with special focus on Clustering of non-vector instances.

## Non Metric Distance Clustering Library
There are some clustering domains where is not useful to use vector based representation of instances.
Alternatives representations of instances allows also the definitions of custom metrics (even not metrics) distances.
All algorithms implemented do not rely on the vector values of the instances.
For instance, domains where there are:
- High dimensionality of data;
- Heterogeneity or Complex Data Types.

In some high dimensional domains the computation phase of the distance (or similarity) values spends a lot of time scanning the entire vector of attributes for each instance. 

There are some clustering domains where is considerably better to abstract the notion of distance:
- Nodes of a Graph:
    Where the distances between nodes is represented as their shortest path or the number of shared neighbors.
- Car driving behaviour, represented as time-labelled GPS sequences:
    Where their distance measure can be implemented as a customized Euclidean Distance.
- Document, and their bag-of-words representation:
    Some [authors][1] suggests to restrict the words to a subset of the N most frequent words of the language.


### Alternative libraries:
- [Weka][1]:
    In [Weka][1] the distance functions used are all based on vector alike instances, for example Euclidean Distance or Manhattan Distance. 
- [Elki][7]:
    Very interesting library, maybe too much complicated for the purposes of this project.


## History:
I started this project as a University class homework where the purpose was to perform a news clustering, the class subject was Information Retrieval 
taught by Prof. [Paolo Ferragina][6] from University of Pisa, then, after graduation, I refined it during some freelance jobs obtained on [UpWork][5]. 


## Implementation Details:
- Jaccard Similarity class;
- Mutual Information Similarity;
- K-Medoids algorithm.

    
#### Implemented Classes:
In order to extend the [JavaML](http://java-ml.sourceforge.net/) library, I implemented some customized classes:

- MiDistanceMatrix:
    Main class where are implemented the functionality described in this readme file;
    
- it.ci.JavaMlAdaptors.DMDistance:
    Customized distance function, it basically wraps a matrix that contains the distances between couples of Instance objects.

- it.ci.JavaMlAdaptors.DMInstance:
    Customized Instance object, it simply contains an integer which is the index used for retrieving all the distances between the Instance and the rest of the dataset into the distance matrix.    

- it.ci.JavaMlAdaptors.DMDataset:
    Customized Dataset class, it simply allows to create a dataset of it.ci.JavaMlAdaptors.DMInstance objects; 

- it.ci.JavaMlAdaptors.DMKMedoids:
    Extends the net.sf.javaml.clustering.KMedoids class. I simply overridden a method: recalculateMedoids, which is the phase where, for each cluster, its medoid instance is recomputed. The problem was that its superclass accomplishes that by computing a mean value between all the instances of each cluster and then chooses the closest instance of the cluster to that mean value. This behaviour, for my implementation wouldn't be possible, because I designed the Instances to not have values, as normal vectors does, but instead, the only permitted operations were computing distances between them. I solved it by overriding the method, its implementation finds for each cluster the Instance which minimizes the sum of the distance toward all the other cluster's Instances.
	Every cluster obtained have at least an element which is the representative object of the cluster (from now on the "Medoid"). The algorithm tries to minimize the sum of the distances between every instance and the Medoid of its cluster.

- it.ci.SimilarityMeasures.JaccardSimilarity
	Is defined over pairs of instances, both have to extend both the Set interface and the Instance interface.


# Example of Usage: 
## Dimentionality Reduction via Mutual Information
1. Simple script which reads from an arff file with N attributes;
2. Compute a distance matrix, composed by N x N entries, every entry composed by the Mutual Information Distance between a pair of attributes of the dataset (obtained by their Mutual Information Similarity);
3. Cluster the attributes in k groups using k-medoids algorithm;
4. For each cluster of attributes found, the attribute (its medoid) name is printed.

In order to compute the mutual information values and execute the clustering of the attributes, I used some open source libraries:

- [Weka][4]:
    Used for opening the arff files;
    
- [JavaMI](https://github.com/Craigacp/JavaMI):
    Used for computing the Mutual Information between every pair of attributes in the dataset;
    
- [JavaML](http://java-ml.sourceforge.net/):
    Used for implement a clustering algorithm based on a distance matrix, I imported the source code and I slightly changed it in order make it easily extendable with my custom implementations of the clustering classes.
   
# Install

## Ubuntu:
I used 14.04 and Java 7 (version "1.7.0_111" - OpenJDK Runtime Environment (IcedTea 2.6.7)).
It works for me.

##### Building
```
./gradlew build
```

##### Usage
Type whose command from the project directory:
```
./gradlew clean
./gradlew fatJar


java -jar ./build/libs/gap-all*.jar -f /path/to/file.arff -i 10 -k 5
```
Where -i is the option for the maximum number of iterations of the k-medoids algorithm and k is the number of cluster searched.

Or:
```
bash start.sh
```

## Windows:

##### Usage:
Open the command [prompt](http://www.digitalcitizen.life/7-ways-launch-command-prompt-windows-7-windows-8) and type the following commands:

```
# Change directory to the project's one
cd \directory\where\is\located\the\project\gap

# compile the code and build the jar (executable) file
.\gradlew fatJar

# execute che the program contained in the jar file, change the arff file location and the numbler of desired clusters (the number after the -k )
java -jar .\build\libs\gap-all-1.0-SNAPSHOT.jar -f .\path\to\file.arff -i 10 -k 5


```

## Todo:
- Distances Matrix [graphical plotting][2], either with the instances already clustered;
- Interfacing with knn-libraries (cite please) in order to use it as an efficient way to retrieve close instances.



[1]: http://nlp.stanford.edu/IR-book/pdf/irbookonlinereading.pdf
[2]: http://en.wikipedia.org/wiki/Distance_matrix
[3]: http://www.linkedin.com/pub/antonio-ercole-de-luca/1b/340/197
[4]: http://www.cs.waikato.ac.nz/ml/weka/
[5]: https://www.upwork.com/
[6]: http://pages.di.unipi.it/ferragina/
[7]: http://elki.dbs.ifi.lmu.de/