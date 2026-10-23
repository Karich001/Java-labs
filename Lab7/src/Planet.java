public class Planet {
    private String name;
    private double diameter;
    private int moons;
    static int totalPlanets;
    static int totalMoons;
    Planet(String name, double diameter, int moons) {
        if(moons <0){
            throw new IllegalArgumentException("количество спутников не может быть < 0");
        } else if (diameter <= 0) {
            throw new IllegalArgumentException("диаметр не может быть <= 0");
        }
        this.name = name;
        this.diameter = diameter;
        this.moons = moons;
        totalPlanets++;
        totalMoons += moons;
    }
    public static int getAverageMoons(){
        return totalMoons/totalPlanets;
    }

}
