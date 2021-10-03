public class Application {
    public static void main(String[] args) {
        ClubMembers newClub = new ClubMembers();
        String [][] names = {{"(Smith, Jane)"}, {"(Fox,Steve)"}, {"(Xin, Micheal)"}, {"(Garcia, Maria)"}};
        int [] years = {2019, 2018, 2017, 2020};
        for(int i = 0; i < names.length; i++) {
            newClub.addMembers(names[i], years[i]);
            newClub.getMember(i).setHasGoodStanding(i % 2 != 0);
            // if( i % 2 == 0){
            //     newClub.getMember(i).setHasGoodStanding(false);
            // } else {
            //     newClub.getMember(i).setHasGoodStanding(true);
            // }
        }
        System.out.println(newClub);
        System.out.println(newClub.removeMembers(2018));
        System.out.println(newClub);
    }
}






// public static void main(String[] args) {
    //     ArrayList <Integer> numsArrList = new ArrayList<>();
    //     int [] numsArr = new int[5];
    //     numsArr[0] = 1;
    //     for (int i = 1; i < numsArr.length; i++){
    //         numsArr[i] = 5 * i - 1;
    //     }
    //     numsArrList.add(1);
    //     for (int i = 1; i < 5; i++){
    //         numsArrList.add(5 * i - 1);
    //     }
    //     int num = 5;
    //     Integer num1 = 6;
    //     num1 = 7;