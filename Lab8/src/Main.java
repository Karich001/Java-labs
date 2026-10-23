void main() {
    Table table = new Table("Обеденный стол", "Дерево", 250.0, 4);
    Chair chair = new Chair("Офисный стул", "Металл", 120.0, true);

    table.displayInfo();
    table.fold();

    System.out.println();

    chair.displayInfo();
    chair.adjustHeight();
    table.displayInfo();
}
