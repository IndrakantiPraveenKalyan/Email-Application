package Assignment1;

import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity=999;
	private String email;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
    System.out.println("Email Created:"+this.firstName+" "+this.lastName);
		
		this.department=setDepartment();
    System.out.println("Department: "+this.department);
		
		this.password=randomPassword(defaultPasswordLength);
   System.out.println("Your password is: "+this.password+"\n\n");
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companySuffix;
     System.out.println("Your email is:"+email);
	}
	
	private String setDepartment() {
		System.out.print("New Worker: "+firstName + "\nDEPARTMENT CODES:\n1 sales\n2 development\n3 accounting\n0 none\n  Enter the department code: ");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1) {
			return "sales";
		}
		else if(depchoice==2) {
			return "development";
		}
		else if(depchoice==3) {
			return "accounting";
		}
		else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	

	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() { return mailboxcapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showinfo() {
		return "DISPLAY NAME: "+firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxcapacity+"mb"+"\n";
	}

}

