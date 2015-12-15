package org.cnhalo.mem;

import static org.junit.Assert.assertEquals;

import org.cnhalo.mem.DbDataMgr;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月13日 下午11:30:59
 * 
 */
public class DbDataMgrTest {

	private DbDataMgr dataMgr;
	
	@Before
	public void init() {
		dataMgr = DbDataMgr.getInstance();
	}
	
	@Test
	public void testGetInstance() {
		assertEquals(DbDataMgr.class, dataMgr.getClass()); 
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
