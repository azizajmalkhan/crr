import java.io.*;
public class FileWriterWithBufferWriter
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw = new FileWriter("xyz.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write('a');
		bw.newLine();
		bw.write("Hyerabad");
		bw.newLine();
		bw.write("Nagole");
		bw.newLine();
		//bw.write(56877);
		bw.write(new char[]{'w','e','l','c','o','m','e'});
		//bw.flush();
		bw.close();
	}
}