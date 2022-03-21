public class Application {
    public static void main(String[] args) {
        int[][] correct = {{4,9,2}, {3,5,7}, {8,1,6}};
        int[][] incorrect = {{4,9,17}, {3,5,7}, {8,1,6}};
        LoShuMagic loShu = new LoShuMagic(correct);
        System.out.println(loShu);

        LoShuMagic wrongloShu = new LoShuMagic(incorrect);
        System.out.println(wrongloShu);
    }
}
