package it.clustering.distanceFunction.jaccard;

import it.Instance;
import it.clustering.distanceFunction.DistanceFunction;

import java.util.Set;
import java.util.TreeSet;

/**
 * This class implements as DistanceFunction the JaccardDistance function
 * defined as follows: JaccardDistance(x,y) = 1 - JaccardSimilarity(x,y)
 * 
 * From Wikipedia: Jaccard similarity coefficient
 * "The Jaccard coefficient measures similarity between sample sets, and is defined as the size of the intersection divided by the size of the union of the sample sets"
 * 
 * Wikipedia: http://en.wikipedia.org/wiki/Jaccard_index
 * 
 * 
 * Abouts generics type:
 * This class declares two types:
 * S:	The type of the objects that composes the sets.
 * 		The method {@code}equals{@code} is used on this objects.
 * C:	The implementation of the Instance interface.
 * 		It must extend Set<S>.
 * 
 * 
 * @author Antonio Ercole De Luca 
 * 
 */
public class JaccardDistance<S,C extends Set<S> & Instance> implements
		DistanceFunction<C> {


	/**
	 * Returns the Jaccard Distance between the Instance object passed. The
	 * objects passed must be different from null.
	 * 
	 * @param first
	 *            First object passed.
	 * @param second
	 *            Second object passed.
	 * @return A real value between 0 and 1 that is the Jaccard distance between
	 *         the objects passed.
	 */
	@Override
	public double distance(C first, C second) {
		return 1 - this.jaccardSimilarity(first, second);
	}

	/**
	 * Computes the Jaccard similarity between the sets passed by arguments. The
	 * intersection and the union of the sets passed are computed using the
	 * equals function of the objects.
	 * 
	 * @param set1
	 *            First set of objects.
	 * @param set2
	 *            Second set of objects.
	 * @return A real number between 0 and 1.
	 */
	public double jaccardSimilarity(Set<S> set1, Set<S> set2) {
		// if the instances are exactly the same java object
		// the similarity is 1.
		if (set1.equals(set2))
			return 1;

		// building the intersection set
		Set<S> interception = new TreeSet<S>();
		interception.addAll(set1);
		interception.retainAll(set2);

		// computing the size of the union set
		double unionCardinality = set1.size() + set2.size()
				- interception.size();

		// computing the jaccard value
		double jaccardValue = ((double) interception.size())
				/ ((double) unionCardinality);

		return jaccardValue;
	}

}
