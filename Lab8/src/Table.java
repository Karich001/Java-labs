public class Table extends Furniture{
    private int legs;
    public Table(String name,String material,double price,int legs) {
        super(name,material,price);
        this.legs = legs;
    }
    public void getPurpose(){
        System.out.println("Служит поверхностью");
    }
    public void fold(){
        System.out.println(name + " сложен");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println( " legs: " + legs);
    }
}
