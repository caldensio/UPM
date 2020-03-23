package aed.individual5;

import es.upm.aedlib.Pair;
import es.upm.aedlib.map.*;


public class TempUtils {
	public static Map<String,Integer> maxTemperatures(long startTime, long endTime, TempData[] tempData) {

		Map <String, Integer> map = new HashTableMap <String, Integer>() ; 

		if(tempData.length==0) {
			return map;
		}

		for(int i=0; i<tempData.length; i++) {
			if(startTime<= tempData[i].getTime() && endTime>=tempData[i].getTime()) {			  
				if(map.get(tempData[i].getLocation())==null || map.get(tempData[i].getLocation())<tempData[i].getTemperature()){
					map.put(tempData[i].getLocation(), tempData[i].getTemperature());
				}
			}
		}

		return map;
	}

	public static Pair<String,Integer> maxTemperatureInRegion(long startTime, long endTime, String region, TempData[] tempData, Map<String,String> regionMap) {

		Pair<String,Integer> par=null;


		if(tempData.length==0 || regionMap.isEmpty() || region==null) {
			return null;
		}

		for(int i=0; i<tempData.length; i++) {
			if(regionMap.get(tempData[i].getLocation()).equals(region)) {
				if(startTime<= tempData[i].getTime() && endTime>=tempData[i].getTime()) {			  
					if(par==null || tempData[i].getTemperature()>par.getRight()){
						par=new Pair<String, Integer>(tempData[i].getLocation(), tempData[i].getTemperature());											
					}
				}
			}
		}
		return par;
	}	
}
	
	

	
	

