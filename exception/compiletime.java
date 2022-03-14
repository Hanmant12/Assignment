package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class compiletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("hello.txt");
        try {
            FileWriter fileWriter=new FileWriter(f);
            fileWriter.write("Hi i am writing a file");
            fileWriter.close();
        } catch (IOException e) {   // Compile time exception
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
