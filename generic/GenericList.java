package generic;


	import java.util.ArrayList;
import java.util.Collection;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	 
	public class GenericList<E>  implements List<E>{
	 
	    @Override
	    public boolean add(E e) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public void add(int arg0, E arg1) {
	        // TODO Auto-generated method stub

	    }
	 
	    @Override
	    public boolean addAll(Collection<? extends E> c) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public boolean addAll(int arg0, Collection<? extends E> arg1) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public void clear() {
	        // TODO Auto-generated method stub

	    }
	 
	    @Override
	    public boolean contains(Object o) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public boolean containsAll(Collection<?> c) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public E get(int index) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public int indexOf(Object o) {
	        // TODO Auto-generated method stub
	        return 0;
	    }
	 
	    @Override
	    public boolean isEmpty() {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public Iterator<E> iterator() {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public int lastIndexOf(Object o) {
	        // TODO Auto-generated method stub
	        return 0;
	    }
	 
	    @Override
	    public ListIterator<E> listIterator() {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public ListIterator<E> listIterator(int index) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public boolean remove(Object o) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public E remove(int index) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public boolean removeAll(Collection<?> c) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public boolean retainAll(Collection<?> c) {
	        // TODO Auto-generated method stub
	        return false;
	    }
	 
	    @Override
	    public E set(int arg0, E arg1) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public int size() {
	        // TODO Auto-generated method stub
	        return 0;
	    }
	 
	    @Override
	    public List<E> subList(int arg0, int arg1) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public Object[] toArray() {
	        // TODO Auto-generated method stub
	        return null;
	    }
	 
	    @Override
	    public <T> T[] toArray(T[] a) {
	        // TODO Auto-generated method stub
	        return null;
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        List<String> li = new ArrayList();
	       
	        GenericList<String> genericList= new GenericList<String>();
	        genericList.add("hi");
	        genericList.add("hi hello");
	            System.out.println( li.get(0).charAt(0) );
	            // previous line has syntax error
	            // return type of get is Object
	            // Object does not have a charAt method
	            // compiler relies on declared type
	            System.out.println( 
	                    ((String) li.get(0)).charAt(0) );
	            // must cast to a String
	}

}