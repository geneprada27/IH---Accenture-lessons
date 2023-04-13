package d3;

public class HorrorMovie extends Movie{
    private boolean isReallyScary;

    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
    }

    public boolean isReallyScary() {
        return isReallyScary;
    }

    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }
    @Override
    public String toString() {
        return "HorrorMovie{" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() +
                ", is scary? = " + isReallyScary() +
                '}';
    }
    public void play() {
        System.out.println("Playing a horror movie");
    }
}
