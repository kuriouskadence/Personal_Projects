class Solution {
    public int romanToInt(String romanNumeral) {
        int counter = 0;
        for(int i = 0; i < romanNumeral.length(); i++){
            if(i == romanNumeral.length() - 1) {
                counter += romanTable(romanNumeral.charAt(i));
                break;
            }
            if(romanTable(romanNumeral.charAt(i)) < romanTable(romanNumeral.charAt(i + 1))) {
                counter += romanTable(romanNumeral.charAt(i)) * -1;
            } else {
                counter += romanTable(romanNumeral.charAt(i));
            }
        }
        return counter;   
    }

    public int romanTable(char romanLetter) {
        switch(romanLetter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }   
}


