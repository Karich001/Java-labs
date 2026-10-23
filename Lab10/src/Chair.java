public class Chair {
    String name;
    String material;
    boolean backrest;
    public Chair(String name, String material, boolean backrest){
        this.name = name;
        this.material = material;
        this.backrest = backrest;
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
        System.out.println("Сидеть");
    }
}
