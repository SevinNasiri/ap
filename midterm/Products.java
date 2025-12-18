package midterm;

public class Products {

    private String name;
    private String brand;
    private String memory;
    private String hard;
    private String cpu;
    private String price;

    public Products(String name , String brand , String memory , String hard , String cpu , String price){
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.hard = hard;
        this.cpu = cpu;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getBrand(){
        return brand;
    }

    public String getMemory(){
        return memory;
    }

    public String getHard(){
        return hard;
    }

    public String getCpu(){
        return cpu;
    }

    public String getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setMemory(String memory){
        this.memory = memory;
    }

    public void setHard(String hard){
        this.hard = hard;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public Products laptopInfo(String name, String brand, String memory, String hard, String cpu, String price){
        Products p = new Products("samsung" , "AS2" , "64" , "SSD" , "dfg" , "500");
        return p;
    }


}
