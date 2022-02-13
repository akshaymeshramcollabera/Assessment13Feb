import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("springtest.xml");
        Employee employee_bean1 = (Employee) classPathXmlApplicationContext.getBean("employee_bean");
        Employee employee_bean2 = (Employee) classPathXmlApplicationContext.getBean("employee_bean_const");

        Laptop laptop_bean1 = (Laptop) classPathXmlApplicationContext.getBean("laptop_bean");
        Laptop laptop_bean2 = (Laptop) classPathXmlApplicationContext.getBean("laptop_bean_const");


        System.out.println(employee_bean1);
        System.out.println(employee_bean2);

        System.out.println(laptop_bean1);
        System.out.println(laptop_bean2);
    }
}
