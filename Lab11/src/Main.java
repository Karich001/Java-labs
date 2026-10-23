void main() {
    Food food = new Food("Овощи", 80, 300);
    System.out.println("=== Перегрузка cook() ===");
    food.cook();
    food.cook(30);
    food.cook("варка");
    food.cook(15);
    food.cook("жарка");
    System.out.println();
    Pizza pizza = new Pizza("Пепперони", 270, 500);
    Soup soup = new Soup("Борщ", 50, 400);
    System.out.println("=== Переопределение getTaste() ===");
    System.out.println(food.name + ": " + food.getTaste());
    System.out.println(pizza.name + ": " + pizza.getTaste());
    System.out.println(soup.name + ": " + soup.getTaste());
    System.out.println();
    Food[] meals = { food, pizza, soup };
    for (Food meal : meals) {
        System.out.println(meal.name + " — " + meal.getTaste());
    }
}
