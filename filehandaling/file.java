package filehandaling;

import java.io.File;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   File f = new File("ece.xls");
	          System.out.println("File Name = "+f.getName());
	          System.out.println("Parent Name = "+f.getParent());
	          System.out.println("Full Path = "+f.getPath());
	          System.out.println("AbsolutePath ="+f.getAbsolutePath());
	          System.out.println("Is it a File: "+f.isFile());
	          System.out.println("Is it a Directory: "+f.isDirectory());
	          System.out.println("Length ="+f.length());
	          System.out.println("Is the File Exists ="+f.exists());
	}

}
