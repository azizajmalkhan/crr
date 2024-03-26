import java.io.*;
public class FilePrintWriterEx
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter pw = new PrintWriter("notes.txt");
		pw.println('@');
		pw.println("Welcome");
		pw.println(100);
		pw.println(12.5);
		pw.println(true);
		pw.println(new char[]{'h','e','l','l'});
		pw.flush();
		pw.close();
	}
}