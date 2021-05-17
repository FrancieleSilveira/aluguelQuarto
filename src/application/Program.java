package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.println("How many rooms will be rented? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			System.out.printf("%nRent #%d:%n", i+1);
			System.out.println("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Room(name, email, roomNumber);
		}
		
		System.out.println("\nBusy rooms:\n");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				//System.out.printf("%d: %s, %s%n", vect[i].getRoomNumber(), vect[i].getName(), vect[i].getEmail());
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
