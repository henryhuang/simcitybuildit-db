package org.cnhalo.web;

import org.cnhalo.web.controller.CommercialBuildingCtrlr;
import org.cnhalo.web.controller.CommercialMaterialCtrlr;
import org.cnhalo.web.controller.FactoryMaterialCtrlr;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月21日 下午10:22:57
 * 
 */
public class Server {

	public static void main(String[] args) {
		
		new CommercialBuildingCtrlr();
		new CommercialMaterialCtrlr();
		new FactoryMaterialCtrlr();
		
	}
	
}
