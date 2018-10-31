import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csvsorting {
public static void main(String[] args) {
//csv sorting
String filename="file1.csv";
File file =new File(filename);
try {

Scanner inputStream =new Scanner(file);
while (inputStream.hasNext()) {
	String data=inputStream.next();	
	
}
inputStream.close();
String filename2="file2.csv";
File file2 =new File(filename2);

@SuppressWarnings("resource")
Scanner inputStream2 =new Scanner(file2);
while (inputStream2.hasNext()) {
	String sorted=inputStream2.next();
	System.out.println(sorted);

}
}
catch (FileNotFoundException e)
{
e.printStackTrace();
}

}}

