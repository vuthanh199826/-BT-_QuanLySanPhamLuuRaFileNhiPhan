import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage {
        private List<Product> products;

        public Manage() {
                products = new ArrayList<>();
        }

        public void add(String path, Product product) throws IOException {
                products.add(product);
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(products);
                objectOutputStream.close();
                fileOutputStream.close();
        }

        public List<Product> display(String path) throws IOException, ClassNotFoundException {
                List<Product> list = new ArrayList<>();
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<Product>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return list;
        }
        public List<Product>search(String path,String name) throws IOException, ClassNotFoundException {
                List<Product> list = new ArrayList<>();
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                for (Product product1: products){
                        if(product1.getName().equals(name)){
                                list.add(product1);
                        }
                }
                objectOutputStream.writeObject(list);
                objectOutputStream.close();
                fileOutputStream.close();

                List<Product> copyList = new ArrayList<>();
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                copyList = (List<Product>) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return copyList;
        }
}
