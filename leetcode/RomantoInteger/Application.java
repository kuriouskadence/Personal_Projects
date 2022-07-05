import javax.management.modelmbean.RequiredModelMBean;

public class Application{

    public static void main(String[] args) {
        Solution converter = new Solution();
        System.out.println(converter.romanToInt(""));
    }
}