import java.util.Scanner;
//import java.util.Random;
import pack1.Email;

public class EmailApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first name and last name of the employee::");
		String fname = s.next();
		String lname = s.next();
		Email em1 = new Email(fname, lname);

		int choice = -1;
		do {
			System.out.println("\n**************************\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
					+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Add contatc\n6 Display contacts \n7.Exit");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					em1.getInfo();
					break;
				case 2:
					em1.set_password();
					break;
				case 3:
					em1.set_mailCap();
					break;
				case 4:
					em1.alternate_email();
					break;
				case 5:
					em1.addContacts();
					break;
				case 6:
					em1.displayContacts();
					break;
				case 7:
					System.out.println("\nTHANKS!!!");
					break;
				default:
					System.out.println("INVALID CHOICE! ENTER AGAIN!");
			}

		} while (choice != 7);

		s.close();

	}

}
