import java.util.ArrayList;
import java.util.List;

public class CourseSystem {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String name) {
        for (Course c : courses) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        throw new CourseNotFoundException("Курс не найден: " + name);
    }

    public List<Course> getAll() {
        return courses;
    }
}