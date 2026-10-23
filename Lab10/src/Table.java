public class Table implements Assemblable,Usable{
    String name;
    String material;
    int legs;
    public Table(String name, String material, int legs){
        this.name = name;
        this.material = material;
        this.legs = legs;
    }
    public void assemble(){
        System.out.println("Идет сборка");
    }
    public void disassemble(){
        System.out.println("Идет разборка");
    }
    public void use(){
        System.out.println("used");
    }
    public void getPurpose(){
        System.out.println("Стоять");
    }
}
