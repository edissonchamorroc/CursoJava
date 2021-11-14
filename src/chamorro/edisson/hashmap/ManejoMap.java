package chamorro.edisson.hashmap;

import java.util.*;

public class ManejoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mapa=new HashMap<String,String>();
		mapa.put("p1", "101");
		mapa.put("p2", "001");
		mapa.put("p3", "101");
		System.out.println(mapa.get("p1"));
	}

}
