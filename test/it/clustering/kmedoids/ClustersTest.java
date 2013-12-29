package it.clustering.kmedoids;

import static org.junit.Assert.*;
import it.clustering.kmedoids.instanceStub.InstanceStub;
import it.clustering.kmedoids.instanceStub.InstanceStubDistanceFunction;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ClustersTest {

	private Clusters<InstanceStub> sut;

	@Before
	public void setUp() throws Exception {
		List<InstanceStub> medoids = new ArrayList<InstanceStub>();
		medoids.add(new InstanceStub());
		medoids.add(new InstanceStub());
		medoids.add(new InstanceStub());
		medoids.add(new InstanceStub());
		
		InstanceStubDistanceFunction df = new InstanceStubDistanceFunction();
		
		this.sut = new Clusters<InstanceStub>(medoids, df);
	}

	//TODO: finish the testing methods
	@Test
	public void testToString_notNull_notEmpty() {
		String str = this.sut.toString();
		assertNotNull(str);
		assertTrue("ToString lenght is 0", str.length() != 0);
		System.out.println(str);
	}

	

	@Test
	public void testStripClusters() {
		fail("Not yet implemented");
	}

	@Test
	public void testAssignToTheNearestCluster() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveShadowClusters() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMedoids() {
		fail("Not yet implemented");
	}

}