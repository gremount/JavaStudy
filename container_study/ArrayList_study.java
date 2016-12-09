package container_study;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;


public class ArrayList_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> al=new ArrayList<String>();
		for(int i=0;i<3;i++)
			al.add("a");
		for(int i=0;i<3;i++)
			System.out.println(al.get(i));
		
		
	}
}
