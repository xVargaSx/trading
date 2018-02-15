package com.varga.trading.server;

import com.varga.trading.server.database.UtilHistData;

public class ServerApp {
	public void test() {
		// TODO Auto-generated method stub
		UtilHistData tmpData = new UtilHistData();
		tmpData.storeData();
	
		tmpData.getPairData("BTN-ETH");
		tmpData.storeData();
			
		
		
		//GetInfo news = new GetInfo();
		//news.x();
	}

}
