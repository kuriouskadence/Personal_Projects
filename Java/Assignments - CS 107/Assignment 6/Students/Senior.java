public class Senior extends Student {
    int numTimesEatOut;

    public Senior() {
        numTimesEatOut = 0;
    }
    public Senior(int numTimesEatOut) {
        this.numTimesEatOut = numTimesEatOut;
    }

    public void setNumTimesEatOut(int numTimesEatOut) {
        this.numTimesEatOut = numTimesEatOut;
    }

    public int getNumTimesEatOut() {
        return numTimesEatOut;
    }

    public String sigh() {
        return "SIGHJHHHHDHHHHSSH";
    }

    // @Override
    // public String toString() {
    //     String str = super.toString();
    // }
}
