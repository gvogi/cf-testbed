package gr.aueb.gr.ch14;

public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight KILL_THE_DRAGON = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {}

    public static SaintGeorgeKnight getInstance() {
        return KILL_THE_DRAGON;
    }

    public void embarkOnMission() {
        System.out.println("Lets kill the dragon!");
    }
}
