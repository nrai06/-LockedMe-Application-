package operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {

	public void delete() {

		Scanner filename = new Scanner(System.in);
		String file = filename.next();

		File file1=  new File("C:\\Users\\nrai6\\eclipse-workspace\\LockedMe\\Files\\" +file); 
		if (file1.delete()) { 
			System.out.println(" Your Have Successfully deleted the file " + file1.getName());
		} else {
			System.out.println("File Not Found -FNF .");

		}
	}
}