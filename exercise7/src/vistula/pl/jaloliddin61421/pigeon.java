package vistula.pl.jaloliddin61421;

public class pigeon extends bird {
    private String speciesjaloliddin61421;

    pigeon() {
        super();
        speciesjaloliddin61421 = "NN";
    }

    public pigeon(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421, String featherColorjaloliddin61421, String speciesjaloliddin61421) {
        super(namejaloliddin61421, agejaloliddin61421, weightjaloliddin61421, featherColorjaloliddin61421);
        this.speciesjaloliddin61421 = speciesjaloliddin61421;
    }

    public pigeon(int agejaloliddin61421, String featherColorjaloliddin61421, String speciesjaloliddin61421) {
        super(agejaloliddin61421, featherColorjaloliddin61421);
        this.speciesjaloliddin61421 = speciesjaloliddin61421;
    }

    public void peckingWoodjaloliddin61421() {
        System.out.println("The pigeon is pecking wood");
    }

    @Override
    public void getVoicejaloliddin61421() {
        System.out.println("The pigeon chirps");
    }

    public String getSpeciesjaloliddin61421() {
        return speciesjaloliddin61421;
    }

    public void setSpeciesjaloliddin61421(String speciesjaloliddin61421) {
        this.speciesjaloliddin61421 = speciesjaloliddin61421;
    }

    @Override
    public String toString() {
        return "pigeon{" +
                "speciesjaloliddin61421='" + speciesjaloliddin61421 + '\'' +
                '}';
    }
}
