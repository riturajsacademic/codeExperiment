package codeExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Workdsds");
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			Scanner in = new Scanner(System.in);
			System.out.println("Enter type of sorting");
			String s= in.nextLine();
			System.out.println("The String is: "+s);
			try {
				System.out.println(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
