package a.b.c;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 5/8/13
 * Time: 2:29 PM
 */
public class B1 {
    private final String txt;

    public B1(A1 a1) {
        this.txt = "initialized with "+a1.getId();
    }
    public void displayTxt(){
        System.out.println("bean b1 " + txt);

    }
}
