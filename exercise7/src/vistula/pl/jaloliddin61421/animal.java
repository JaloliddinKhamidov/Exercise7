package vistula.pl.jaloliddin61421;

abstract class animal {
    private static String namejaloliddin61421;
    private static int agejaloliddin61421;
    private static int weightjaloliddin61421;

    public animal(String namejaloliddin61421, int agejaloliddin61421, int weightjaloliddin61421) {
        vistula.pl.jaloliddin61421.animal.namejaloliddin61421 = namejaloliddin61421;
        vistula.pl.jaloliddin61421.animal.agejaloliddin61421 = agejaloliddin61421;
        vistula.pl.jaloliddin61421.animal.weightjaloliddin61421 = weightjaloliddin61421;
    }

    public animal(int agejaloliddin61421) {
        vistula.pl.jaloliddin61421.animal.agejaloliddin61421 = agejaloliddin61421;
    }

    public animal() {
    }

    public abstract void getVoicejaloliddin61421();

    public String getNamejaloliddin61421() {
        return namejaloliddin61421;
    }

    public void setNamejaloliddin61421(String namejaloliddin61421) {
        this.namejaloliddin61421 = namejaloliddin61421;
    }

    public int getagejaloliddin61421() {
        return agejaloliddin61421;
    }

    public void setagejaloliddin61421(int agejaloliddin61421) {
        this.agejaloliddin61421 = agejaloliddin61421;
    }

    public int getWeightjaloliddin61421() {
        return weightjaloliddin61421;
    }

    public void setWeightjaloliddin61421(int weightjaloliddin61421) {
        this.weightjaloliddin61421 = weightjaloliddin61421;
    }
}
