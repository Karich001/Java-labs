import java.io.ObjectStreamException;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int quantity;
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int a){
        if(a < 0){
            throw new IllegalArgumentException("Не может быть меньше 0");
        }
        this.quantity = a;
    }
   public Person(String firstName, String lastName, int birthYear, int quantity){
       this(firstName,lastName,birthYear);
        this.quantity = quantity;
   }




























    public Person(String first_name, String last_name, int birth_year) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.birthYear = birth_year;
    }

    public String get_First_name() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int get_birth_year() {
        return birthYear;
    }

    public int getAge() {
            if (birthYear > 2026 || birthYear < 1940) {
                throw new IllegalArgumentException("Год рождения должен быть не менее 1940 и не более текущего года");
            }
            return 2026 - birthYear;
    }
    }
