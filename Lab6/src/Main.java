void main() {
Person p = new Person("Сергей", "Дражин",2080,12);
try {
    System.out.println(p.getAge());
}
catch (IllegalArgumentException e){
    System.out.println(e.toString());
}
}
