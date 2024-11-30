import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBook<T> {
    List<T> adBook=new ArrayList<T>();

    public void display(){
        System.out.println(adBook);
    }
    public void addContact(T c1){
        adBook.add((T) c1);
    }

}
