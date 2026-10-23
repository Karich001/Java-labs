public class Chair extends Furniture{
    private boolean backrest;
    public Chair(String name,String material,double price,boolean backrest) {
        super(name,material,price);
        this.backrest = backrest;
    }
    public void getPurpose(){
        System.out.println("Для сидения");
    }
    public void adjustHeight(){
        System.out.println("Высота " + name +  " отрегулирована");
    }
}
