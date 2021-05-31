import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Manage manage = new Manage();
        // add
        manage.add("test1.txt",new Product("123","P1","Gucci","1000"));
        // display
        List<Product> list = manage.display("test1.txt");
        for (Product product:list){
            System.out.println(product);
        }
        System.out.println("///");
        // search
        list = manage.search("test2.txt","P1");
        for (Product product1:list){
            System.out.println(product1);
        }
        System.out.println("///");

    }

}
