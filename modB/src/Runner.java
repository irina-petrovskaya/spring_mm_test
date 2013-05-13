import a.b.c.B1;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AbstractApplicationContext parent = new ClassPathXmlApplicationContext("classpath:/A1.xml");
        AbstractApplicationContext child = new ClassPathXmlApplicationContext(new String[]{"classpath:/B1.xml"},parent);
        child.getBean(B1.class).displayTxt();
    }
}
