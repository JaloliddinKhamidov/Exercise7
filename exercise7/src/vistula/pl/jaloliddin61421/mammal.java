package vistula.pl.jaloliddin61421;

public class mammal extends animal {
    private String orderjaloliddin61421;

    public mammal() {
        super();
        orderjaloliddin61421 = "NN";
    }

    public mammal(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421, String orderjaloliddin61421) {
        super(namejaloliddin61421, agejaloliddin61421, weightjaloliddin61421);
        this.orderjaloliddin61421 = orderjaloliddin61421;
    }

    public mammal(int agejaloliddin61421, String orderjaloliddin61421) {
        super(agejaloliddin61421);
        this.orderjaloliddin61421 = orderjaloliddin61421;
    }

    public void drinkMilkjaloliddin61421() {
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoicejaloliddin61421() {
        System.out.println("Mammal is making sounds");
    }

    public String getOrderjaloliddin61421() {
        return orderjaloliddin61421;
    }

    public void setOrderjaloliddin61421(String orderjaloliddin61421) {
        this.orderjaloliddin61421 = orderjaloliddin61421;
    }

    @Override
    public String toString() {
        return "mammal{" +
                "orderjaloliddin61421='" + orderjaloliddin61421 + '\'' +
                '}';
    }
}
