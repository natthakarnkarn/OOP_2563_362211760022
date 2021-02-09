package LAB7;

public class car {


    private String id;
    private String coluor;
    private String brand;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColuor() {
        return coluor;
    }

    public void setColuor(String coluor) {
        this.coluor = coluor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "car{" +
                "id='" + id + '\'' +
                ", coluor='" + coluor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


    }
