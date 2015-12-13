package org.cnhalo.data;

import static org.junit.Assert.assertEquals;

import org.cnhalo.mem.DataMgr;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月13日 下午11:30:59
 * 
 */
public class DataMgrTest {

	private DataMgr dataMgr;
	
	@Before
	public void init() {
		dataMgr = DataMgr.getInstance();
	}
	
	@Test
	public void testGetInstance() {
		assertEquals(DataMgr.class, dataMgr.getClass()); 
	}

	@Test
	public void testGetFactoryMeterialById() {
		assertEquals("Metal", dataMgr.getFactoryMeterialById("Rs-i").getItem());
	}

	@Test
	public void testGetFactoryMeterialIdByItem() {
		assertEquals("Rs-i", dataMgr.getFactoryMeterialIdByItem("Metal"));
	}

	@Test
	public void testGetFactoryMeterialIdSet() {
		assertEquals(11, dataMgr.getFactoryMeterialIdSet().size());
	}

	
}
