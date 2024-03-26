import java.io.*;
public class FileReaderEx
{
	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader(new File("abc.txt"));
		int ch=0;
		while((ch = fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
}