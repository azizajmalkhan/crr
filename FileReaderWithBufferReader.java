import java.io.*;
public class FileReaderWithBufferReader
{
	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader(new File("abc.txt"));
		BufferedReader br = new BufferedReader(fr);
		String str =null;
		while((str= br.readLine())!=null)
		{
			System.out.println(str);
		}
		fr.close();
	}
}