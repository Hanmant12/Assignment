package filehandaling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class displaynoofline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileReader f = new FileReader("demo.txt");
         int l,w,ch;
         l=w=ch=0;
         int c;
         while((c=f.read())!=-1)
         {    if(c==' ')
                 w++;
             else if(c=='\n')
             {    l++; w++;
             }
             else
                 ch++;
         }
 System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
	}

}
