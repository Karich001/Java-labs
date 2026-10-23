void main() {
    Soup soup1 = new Soup("Борщ", 500, 40, "Свёкла, капуста, мясо");
    Soup soup2 = new Soup("Щи", 400, 40, "Капуста, картофель");

    Pasta pasta1 = new Pasta("Карбонара", 300, 10, "Спагетти");
    Pasta pasta2 = new Pasta("Болоньезе", 350, 10, "Тальятелле");
    Pasta pasta3 = new Pasta("Фетучини", 320, 10, "Фетучини");

    System.out.println(soup1.name + ": " + soup1.getCaloriesPer100g());
    System.out.println(soup2.name + ": " + soup2.getCaloriesPer100g());

    System.out.println(pasta1.name + ": " + pasta1.getCaloriesPer100g());
    System.out.println(pasta2.name + ": " + pasta2.getCaloriesPer100g());
    System.out.println(pasta3.name + ": " + pasta3.getCaloriesPer100g());
    soup1.displayInfo();
}
