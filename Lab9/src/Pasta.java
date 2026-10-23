public class Pasta extends Meal{
    String type;
    public Pasta(String name, double weight, int time, String type){
        super(name,weight,time);
        this.type = type;
    }
    public void cook(){
        System.out.println("Варится " + time + " минут");
    }
    public String getCaloriesPer100g(){
        return "130 ккал";
    }
}
