public class Soup extends Meal{
    String ingridients;
    public Soup(String name, double weight, int time, String ingridients){
        super(name,weight,time);
        this.ingridients = ingridients;
    }
    public void cook(){
        System.out.println("Варится " + time + " минут");
    }
    public String getCaloriesPer100g(){
        return "50 ккал";
    }
}
