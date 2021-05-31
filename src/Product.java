import java.io.Serializable;

public class Product implements Serializable {
    private String code;
    private String name;
    private String branch;
    private String cost;

    public Product(String code, String name, String branch, String cost) {
        this.code = code;
        this.name = name;
        this.branch = branch;
        this.cost = cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
