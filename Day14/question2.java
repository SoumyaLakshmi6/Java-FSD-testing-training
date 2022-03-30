package Day14;
import java.io.File;

public class question2 {
	
		public static void main(String[] args) {
			File f=new File("C:\\Users\\DELL\\eclipse-workspace\\JavaTraining");
			if(f.exists()) {
				System.out.println("File name is "+f.getName());
				System.out.println("Absolute path is "+f.getAbsolutePath());
				System.out.println("Is the file readable? "+f.canRead());
				System.out.println("Is the file writeable? "+f.canWrite());
				System.out.println("The file size in bytes is "+f.length());	
			}
			else {
				System.out.println("The file does not exist.");
			}

		}

	}
	

