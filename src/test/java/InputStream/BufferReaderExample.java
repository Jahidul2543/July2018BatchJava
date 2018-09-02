package InputStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("C:\\Users\\I99063\\Documents\\StudyMaterials\\Java\\test.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();
    }
}
