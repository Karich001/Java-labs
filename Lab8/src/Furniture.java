public class Furniture {
    String name;
    private String material;
    private double price;
    public Furniture(String name, String material, double price){
        this.name = name;
        this.material = material;
        this.price = price;
    }
    public void getPurpose(){}
    public void displayInfo(){
        System.out.println("Name: " + name + " Material: " + material + " Price: " + price);
    }
}
