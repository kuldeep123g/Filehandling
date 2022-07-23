package file.handle;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

		//package writeafile;

		import java.io.FileWriter;

		import java.io.IOException;

		public class Update {
			public static void main(String[] args) {
				try {
		            FileWriter Writer
		                = new FileWriter("myfile.txt");
		            Writer.write(
		                "Files in Java are seriously good!!");
		            Writer.close();
		            System.out.println("Successfully written.");
		        }
		        catch (IOException e) {
		            System.out.println("An error has occurred.");
		            e.printStackTrace();
		        }

			}

		}