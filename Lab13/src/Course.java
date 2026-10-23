import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private int duration;
    private double price;
    private int maxStudents;
    private List<String> students = new ArrayList<>();

    public Course(String name, String teacher, int duration, double price, int maxStudents) {
        setName(name);
        setTeacher(teacher);
        setDuration(duration);
        setPrice(price);
        setMaxStudents(maxStudents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCourseDataException("Имя курса пустое");
        }
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new InvalidCourseDataException("Длительность должна быть > 0");
        }
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new InvalidCourseDataException("Цена должна быть >= 0");
        }
        this.price = price;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents <= 0) {
            throw new InvalidCourseDataException("maxStudents должно быть > 0");
        }
        this.maxStudents = maxStudents;
    }

    public List<String> getStudents() {
        return students;
    }

    public void enroll(String student) {
        if (students.contains(student)) {
            throw new EnrollmentException("Студент уже записан: " + student);
        }
        if (students.size() >= maxStudents) {
            throw new EnrollmentException("Нет свободных мест на курсе " + name);
        }
        students.add(student);
    }

    public void cancelEnrollment(String student) {
        if (!students.contains(student)) {
            throw new EnrollmentException("Студент не записан: " + student);
        }
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', teacher='" + teacher +
                "', duration=" + duration + ", price=" + price +
                ", students=" + students.size() + "/" + maxStudents + "}";
    }
}