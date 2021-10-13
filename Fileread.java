import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.FileInputStream;
	import java.io.FileReader;
	 
	
class Fileread{
	public static void main(String[] args) {
		
	        StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
	             while (strLine != null)
	             {
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                System.out.println(strLine);
	            }
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
	}
	
