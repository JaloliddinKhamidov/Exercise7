package vistula.pl.jaloliddin61421;

public class bird extends animal {
    private String featherColorjaloliddin61421;


    public bird() {
        super();
        featherColorjaloliddin61421 = "NN";

    }

    public bird(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421, String featherColorjaloliddin61421) {
        super(namejaloliddin61421, agejaloliddin61421, weightjaloliddin61421);
        this.featherColorjaloliddin61421 = featherColorjaloliddin61421;
    }

    public bird(int agejaloliddin61421, String featherColorjaloliddin61421) {
        super(agejaloliddin61421);
        this.featherColorjaloliddin61421 = featherColorjaloliddin61421;
    }

    public void takingflightjaloliddin61421() {
        System.out.println("Flap flap");
    }

    @Override
    public void getVoicejaloliddin61421() {
        System.out.println("bird is making sounds");
    }

    public String getFeatherColorjaloliddin61421() {
        return featherColorjaloliddin61421;
    }

    public void setFeatherColorjaloliddin61421(String featherjaloliddin61421) {
        this.featherColorjaloliddin61421 = featherColorjaloliddin61421;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorjaloliddin61421='" + featherColorjaloliddin61421 + '\'' +
                '}';
    }
}
