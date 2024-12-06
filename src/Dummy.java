import java.util.HashSet;
import java.util.Set;

public class Dummy {
    public static void main(String[] args) {
        // labda function to rduce code behind the scene compielr is reading it as Printable p1=new Printable()
        // thne piblic static void print(int b) like this but to reduce code we removed that art this also works in same way
        Printable p1 = (b)->{
            System.out.println("Hey");
            System.out.println("Somebody Founds good");
            System.out.println(b);
        };
        Dummy d = new Dummy();
        d.display(p1);
    }
    public void display(Printable p){
        p.print(50);
    }
}