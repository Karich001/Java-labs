void main() {
    Table table1 = new Table("Обеденный стол", "Дерево", 4);
    Table table2 = new Table("Журнальный столик", "Стекло", 3);
    Table table3 = new Table("Письменный стол", "ЛДСП", 4);
    Chair chair1 = new Chair("Офисный стул", "Металл", true);
    Chair chair2 = new Chair("Табурет", "Дерево", false);
    System.out.println("=== СТОЛЫ ===");
    table1.assemble();
    table1.use();
    table1.disassemble();
    System.out.println();
    table2.assemble();
    table2.use();
    table2.disassemble();
    System.out.println();
    table3.assemble();
    table3.use();
    table3.disassemble();
    System.out.println("\n=== СТУЛЬЯ ===");
    chair1.assemble();
    chair1.use();
    chair1.disassemble();
    System.out.println();
    chair2.assemble();
    chair2.use();
    chair2.disassemble();
}
