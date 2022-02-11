package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> s=new ArrayList<>();
		s.add(10);
		s.add(12);
		s.add(20);
		s.add(13);
		List<Integer> t=s.stream().filter(p->p>10).collect(Collectors.toList());
		System.out.println(t);
		
		s.stream().map(p->p+10).forEach(p->{System.out.println(p);});
		
	}

}
