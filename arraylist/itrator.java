package arraylist;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List lst=new ArrayList();
	        lst.add("One");
	        lst.add("Two");
	        lst.add("Three");
	        lst.add("Four");
	        java.util.Iterator iterator = lst.iterator();
	        while(iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
//	        for(Object obj:lst){
//	            System.out.println(obj);
//	        }
//	        for(int i=0;i<lst.size();i++){
//	            System.out.println(lst.get(i));
//	        }
	        lst.remove(2);
	        lst.remove("Four");
	        System.out.println(lst);
	        System.out.println(lst);
	}

}
