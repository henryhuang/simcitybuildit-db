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
	public void testGetFactoryMaterialById() {
		assertEquals("Metal", dataMgr.getFactoryMaterialById("Rs-i").getItem());
	}

	@Test
	public void testGetFactoryMaterialIdByItem() {
		assertEquals("Rs-i", dataMgr.getFactoryMaterialIdByItem("Metal"));
	}

	@Test
	public void testGetFactoryMaterialIdSet() {
		assertEquals(11, dataMgr.getFactoryMaterialIdSet().size());
	}

	@Test
	public void testGetCommercialMaterialById() {
		assertEquals("Nails", dataMgr.getCommercialMaterialById("Bs-n").getItem());
	}

	@Test
	public void testGetCommercialMaterialIdByItem() {
		assertEquals("Bs-n", dataMgr.getCommercialMaterialIdByItem("Nails"));
	}

	@Test
	public void testGetCommercialMaterialIdSet() {
		assertEquals(43, dataMgr.getCommercialMaterialIdSet().size());
	}
	
}
