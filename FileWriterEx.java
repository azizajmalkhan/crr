import java.io.*;
public class FileWriterEx
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw = new FileWriter("xyz.txt");
		fw.write('a');
		fw.write("\r\n");
		fw.write("Hyerabad");
		fw.write("\r\n");
		fw.write("Lb Nagar");
		fw.write("\r\n");
		fw.write(new char[]{'w','e','l','c','o','m','e'});
		fw.flush();
		fw.close();
	}
}