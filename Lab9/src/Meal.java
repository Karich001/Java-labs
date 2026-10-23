abstract class Meal {
    String name;
    double weight;
    int time;
    public Meal(String name, double weight, int time){
        this.name = name;
        this.weight = weight;
        this.time = time;
    }
    abstract void cook();
    abstract String getCaloriesPer100g();
    public void displayInfo(){
        System.out.println("Name: " +name + " Weight: " + weight + " CookingTime: " + time);
    }
}
