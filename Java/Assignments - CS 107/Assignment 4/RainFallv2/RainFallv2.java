public class RainFallv2 {
    
    private double[] rainFall = new double[12];
    private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public RainFallv2(double[] rainFall) {
        this.rainFall = rainFall;
    }

    public double totalRainFallAnnually() {
        double sum = 0;
        for(int i = 0; i < rainFall.length; i++) {
            sum += rainFall[i];
        }
        return sum;
    }

    public double averageMonthlyRainFall() {
        return totalRainFallAnnually() / rainFall.length;
    }
    
    public String monthWithHighestRainFall() {
        int indexHighest = 0;
        for (int i = 1; i < rainFall.length; i++) {
            if (rainFall[indexHighest] < rainFall[i]) {
                indexHighest = i;
            }
        }
        return months[indexHighest];
    }

    public String monthWithLowestRainFall() {
        int indexLowest = 0;
        for (int i = 1; i < rainFall.length; i++) {
            if (rainFall[i] < rainFall[indexLowest]) {
                indexLowest = i;
            }
        }
        return months[indexLowest];
    }



}