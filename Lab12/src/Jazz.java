public class Jazz extends Music{
    public boolean improvisation;
    public Jazz(String title, int id, int durationH, boolean improvisation){
        super(title,id,durationH);
        this.improvisation = improvisation;
    }
}
