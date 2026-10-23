void main() {
    try {
        Planet earth = new Planet("Earth", 12742, 1);
        Planet mars = new Planet("Mars", 6779, 2);
        Planet jupiter = new Planet("Jupiter", 139820, 79);
        Planet saturn = new Planet("Saturn", 116460, 82);
        System.out.println("Average count of moons: " + Planet.getAverageMoons());
    }
    catch (IllegalArgumentException e){
        System.out.println(e.toString());
    }
}
