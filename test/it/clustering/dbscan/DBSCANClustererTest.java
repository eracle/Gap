package it.clustering.dbscan;

import static org.junit.Assert.*;

import org.apache.commons.math3.ml.clustering.DBSCANClusterer;
import org.junit.Before;
import org.junit.Test;

import it.clustering.ClusteringAlgorithmTest;
import it.clustering.kmedoids.instanceStub.InstanceStub;

public class DBSCANClustererTest extends ClusteringAlgorithmTest {

	double eps;
	
	int minPts;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		eps = 0.001;
		minPts=4;
		
		this.sut = new DBSCANClusterer<InstanceStub>(
				this.list,
				this.df, this.eps, this.minPts);
				
	}

	@Override
	@Test
	public void clusterTest_ThreeClusters_NotNull() {
		super.clusterTest_ThreeClusters_NotNull();
	}

}
