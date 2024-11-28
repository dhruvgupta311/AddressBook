import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdressBook a1=new AdressBook();
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Welcome");
        do{
            System.out.println("Enter 1 to create contact");
            int input=sc.nextInt();
            switch(input){
                case 1-> a1.createContact(a1);
                default -> System.out.println("Wrong");
            }
            System.out.println("Enter 0 to exit");
            i=sc.nextInt();
        }while(i==0);
        System.out.println("Thank you");
        sc.close();
    }


}