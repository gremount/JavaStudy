package container_study;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMap_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("wsc",1);
		m1.put("zdh",2);
		m1.put("tmy",3);
		m1.put("jlq",4);
		Iterator iter=m1.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Map.Entry) iter.next();
			Object key=entry.getKey();
			Object val=entry.getValue();
			System.out.println(key.toString());
			System.out.println(val.toString());
		}
	}
}
