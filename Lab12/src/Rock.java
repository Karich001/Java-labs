public class Rock extends Music{
    public boolean guitarSolo;
    public Rock(String title, int id, int durationH, boolean guitarSolo) {
        super(title, id, durationH);
        this.guitarSolo = guitarSolo;
    }
}
