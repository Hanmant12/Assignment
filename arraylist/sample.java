package arraylist;

import java.util.ArrayList;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new ArrayList();
        lst.add("One");
        lst.add("Two");
        lst.add("Three");
        lst.add("Four");
        for(Object obj:lst){
            System.out.println(obj);
        }
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }
        System.out.println(lst);
	}

}
