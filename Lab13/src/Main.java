public class Main {
    public static void main(String[] args) {
        CourseSystem system = new CourseSystem();
        Course java = new Course("Java", "Иванов", 40, 15000, 2);
        Course sql  = new Course("SQL",  "Петров", 20, 8000, 5);
        system.addCourse(java);
        system.addCourse(sql);
        java.enroll("Анна");
        java.enroll("Борис");
        java.cancelEnrollment("Анна");
        Course found = system.findCourse("SQL");
        found.enroll("Виктор");
        try {
            java.enroll("Борис");
        } catch (EnrollmentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            system.findCourse("Python");
        } catch (CourseNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            new Course("Bad", "X", 0, 100, 10);
        } catch (InvalidCourseDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        for (Course c : system.getAll()) {
            System.out.println(c);
        }
    }
}