import java.util.List;

public class Course {
    public int id;
    public String title;
    public String category;
    public int raiting;
    private List<Integer> studentRaitings;
    public int getAverageRaiting(){
        int avg = 0;
        for(int i : studentRaitings){
           avg += i;
        }
        return  avg/studentRaitings.toArray().length;
    }
    public Course(int id, String title, String category, List<Integer> studentRaitings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.studentRaitings = studentRaitings;
    }
    public List<Integer> getRaiting(){
        return studentRaitings;
    }
    public void setRaiting(int indexF, int value){
        studentRaitings.set(indexF,value);
    }
}
