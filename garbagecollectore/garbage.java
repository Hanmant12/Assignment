package garbagecollectore;

public class garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 200;
        StringBuffer s;
        for (int i = 0; i < SIZE; i++){    }
        System.out.println("Garbage Collection started explicitly.");
        long time = System.currentTimeMillis();
        System.gc();
    System.out.println("It took " + (System.currentTimeMillis()-time) + " ms");
	}

}
