package basic_study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_study {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		for(Integer i:hs){
			System.out.println(i);
		}
		System.out.println("**************************");
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()){
			int i=it.next();
			System.out.println(i);
		}
	}

}
