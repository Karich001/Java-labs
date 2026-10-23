void main() {
    Music rock1 = new Rock("Bohemian Rhapsody", 1, 355, true);
    Music rock2 = new Rock("Stairway to Heaven", 2, 482, false);
    Music rock3 = new Rock("Smells Like Teen Spirit", 3, 301, true);

    Music classical1 = new Classical("Moonlight Sonata", 4, 900, true);
    Music classical2 = new Classical("Symphony No. 5", 5, 1800, false);
    Music classical3 = new Classical("The Four Seasons", 6, 2400, false);

    Music jazz1 = new Jazz("Take Five", 7, 324, true);
    Music jazz2 = new Jazz("So What", 8, 545, true);
Map<String,Music> map = new HashMap<>();
map.put(rock1.title,rock1);
map.put(rock2.title,rock2);
map.put(rock3.title,rock3);

map.put(classical1.title,classical1);
map.put(classical2.title,classical2);
map.put(classical3.title,classical3);

map.put(jazz1.title,jazz1);
map.put(jazz2.title,jazz2);

for(Map.Entry<String,Music> entry: map.entrySet()){
    System.out.println(entry.getKey() + " " +  entry.getValue());
}

    Course java    = new Course(1, "Java Basics",       "Programming", new ArrayList<>(Arrays.asList(5, 4, 5, 3)));
    Course python  = new Course(2, "Python Advanced",   "Programming", new ArrayList<>(Arrays.asList(4, 4, 3, 5)));
    Course sql     = new Course(3, "SQL for Beginners", "Database",    new ArrayList<>(Arrays.asList(2, 2, 3, 1)));
    Course html    = new Course(4, "HTML & CSS",        "Web",         new ArrayList<>(Arrays.asList(5, 5, 4, 5)));
    Course algo    = new Course(5, "Algorithms",        "CS",          new ArrayList<>(Arrays.asList(3, 3, 3, 3)));
    Course design  = new Course(6, "UI/UX Design",      "Design",      new ArrayList<>(Arrays.asList(5, 4, 4, 5)));
    Course english = new Course(7, "English Grammar",   "Language",    new ArrayList<>(Arrays.asList(1, 2, 2, 1)));

    List<Course> courses = new ArrayList<>(Arrays.asList(java, python, sql, html, algo, design, english));

    courses.removeIf(c -> c.getAverageRaiting() < 3);
    System.out.println("После удаления курсов с рейтингом < 3:");
    printCourses(courses, 0);

    for (Course c : courses) {
        if (c.getAverageRaiting() >= 4) {
            List<Integer> ratings = c.getRaiting();
            for (int i = 0; i < ratings.size(); i++) {
                c.setRaiting(i, Math.min(ratings.get(i) + 1, 5));
            }
        }
    }
    System.out.println("\nПосле повышения рейтинга курсов с avg >= 4:");
    printCourses(courses, 0);

    System.out.println("\nКурсы с рейтингом >= 4:");
    printCourses(courses, 4);

    courses.sort((a, b) -> {
        int cmp = Integer.compare(b.getAverageRaiting(), a.getAverageRaiting());
        if (cmp != 0) return cmp;
        return a.title.compareToIgnoreCase(b.title);
    });

    System.out.println("\nОтсортированные курсы (ID | title | avg):");
    for (Course c : courses) {
        System.out.println(c.id + " | " + c.title + " | " + c.getAverageRaiting());
    }
}

static void printCourses(List<Course> courses, int rating) {
    for (Course c : courses) {
        if (c.getAverageRaiting() >= rating) {
            System.out.println(c.id + " | " + c.title + " | avg=" + c.getAverageRaiting());
        }
    }
}
