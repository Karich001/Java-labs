public class Classical extends Music{
    boolean orchestra;
    public Classical(String title, int id, int durationH, boolean orchestra)
    {
        super(title,id,durationH);
        this.orchestra = orchestra;
    }
}
