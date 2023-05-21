package vistula.pl.jaloliddin61421;

public class dog extends mammal {
    private String breedjaloliddin61421;

    dog() {
        super();
        breedjaloliddin61421 = "NN";
    }

    public dog(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421, String rzadjaloliddin61421, String breedjaloliddin61421) {
        super(namejaloliddin61421, agejaloliddin61421, weightjaloliddin61421, rzadjaloliddin61421);
        this.breedjaloliddin61421 = breedjaloliddin61421;
    }

    public dog(int agejaloliddin61421, String rzadjaloliddin61421, String breedjaloliddin61421) {
        super(agejaloliddin61421, rzadjaloliddin61421);
        this.breedjaloliddin61421 = breedjaloliddin61421;
    }

    public void sportjaloliddin61421() {
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkjaloliddin61421() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoicejaloliddin61421() {
        System.out.println("The dog is barking.");
    }

    public String getBreejaloliddin61421() {
        return breedjaloliddin61421;
    }

    public void setBreedjaloliddin61421(String breedjaloliddin61421) {
        this.breedjaloliddin61421 = breedjaloliddin61421;
    }

    @Override
    public String toString() {
        return "dog{" +
                "breedjaloliddin61421='" + breedjaloliddin61421 + '\'' +
                '}';
    }
}
