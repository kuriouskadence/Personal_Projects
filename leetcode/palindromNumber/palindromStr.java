public class palindromStr {
    public boolean checkPalStr1(int startIndex, String str){
        str = str.toLowerCase();
        int endIndex = str.length() - 1 - startIndex;
        if (startIndex >= endIndex){
            return true;
        }
        if (str.charAt(startIndex) == str.charAt(endIndex)){
            return checkPalStr1(startIndex + 1, str);
        }
        return false;

    }
    public boolean checkPalStr2(String str){
        str = str.toLowerCase();
        int firstIndex = 0;
        int lastIndex = str.length() - 1;

        if (str.length() <= 1){
            return true;
        }

        if (str.charAt(firstIndex) == str.charAt(lastIndex)){
            return checkPalStr2((str.substring(firstIndex + 1, lastIndex)));
        }
        return false;
    }

    public boolean checkPalStr3(String str) {
        str = str.toLowerCase();
        return str.equals(reverseString(str, ""));
    }

    public String reverseString(String origStr, String revStr){
        if (origStr.length() == 0){
            return revStr;
        }
        revStr += origStr.charAt(origStr.length() - 1);
        return reverseString(origStr.substring(0, origStr.length() - 1), revStr);
    }

    public static void main(String[] args) {
        palindromStr pal = new palindromStr();
        // int num = 1321;
        // System.out.println(pal.checkPalStr2(String.valueOf(num)));
        System.out.println(pal.checkPalStr3("Racecar"));
    }
}
