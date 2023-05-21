package vistula.pl.jaloliddin61421;

public class fish extends animal {
    private String scaleColorjaloliddin61421;

    public fish(Object o) {
        super();
        scaleColorjaloliddin61421 = "NN";
    }

    public fish(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421, String scaleColorjaloliddin61421) {
        super(namejaloliddin61421, agejaloliddin61421, weightjaloliddin61421);
        this.scaleColorjaloliddin61421 = scaleColorjaloliddin61421;
    }

    public fish(int agejaloliddin61421, String scaleColorjaloliddin61421) {
        super(agejaloliddin61421);
        this.scaleColorjaloliddin61421 = scaleColorjaloliddin61421;
    }

    public void drinkWaterjaloliddin61421() {
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoicejaloliddin61421() {
        System.out.println("fish is making sounds");
    }

    public String getScaleColorjaloliddin61421() {
        return scaleColorjaloliddin61421;
    }

    public void setScaleColorjaloliddin61421(String scaleColorjaloliddin61421) {
        this.scaleColorjaloliddin61421 = scaleColorjaloliddin61421;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorjaloliddin61421='" + scaleColorjaloliddin61421 + '\'' +
                '}';
    }
}
