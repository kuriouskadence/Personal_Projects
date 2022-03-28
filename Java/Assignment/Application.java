public class Application {
    
    public static void main(String[] args) {
        int [] a = {0, 1, 2, 3, 4};
        IntArrayList newArrayList = new IntArrayList(a);
        Stack stk = new Stack(a);

        // Test 1: Print
        System.out.println("Test 1: Print");
        System.out.println(newArrayList);
        System.out.println();

        // // Test 2.1: Add
        // System.out.println("Test 2.1: Add 1");
        // newArrayList.add(5);
        // System.out.println(newArrayList);
        // System.out.println();

        // Test 2.2: Add - X
        System.out.println("Test 2.2: Add 2");
        newArrayList.add(6, 3);
        System.out.println(newArrayList);
        System.out.println();

        // // Test 3: Get
        // System.out.println("Test 3: Get");
        // System.out.println(newArrayList.get(3));
        // System.out.println(newArrayList);
        // System.out.println();

        // Test 4: Remove - X
        // System.out.println("Test 4: Remove - X");
        // newArrayList.remove(2);
        // System.out.println(newArrayList);
        // System.out.println();

        // // Test 5: Clear
        // System.out.println("Test 5: Clear");
        // newArrayList.clear();
        // System.out.println(newArrayList);
        // System.out.println();

        // newArrayList = new IntArrayList(a);
        // System.out.println("Test 6: Contains");
        // System.out.println(newArrayList.contains(4));
        // System.out.println(newArrayList);
        // System.out.println();

        // System.out.println("Test 7: Search");
        // System.out.println(newArrayList.search(2));
        // System.out.println();

        // System.out.println("Test 8: Is Empty?");
        // System.out.println(newArrayList.isEmpty());
        // System.out.println();

        // System.out.println("Test 9: Set");
        // System.out.println(newArrayList.set(3, 2));
        // System.out.println(newArrayList);
        // System.out.println();

        // System.out.println("Test 10: Get Size");
        // System.out.println(newArrayList.getSize());
        // System.out.println();

        // System.out.println("Test 11: Get Sum");
        // System.out.println(newArrayList.getSum(2));
        // System.out.println();

        // System.out.println("Test 12: Get Product");
        // System.out.println(newArrayList.getProduct(2));
        // System.out.println();

        System.out.println("Test: Peek");
        System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println();

        System.out.println("Test: Push");
        stk.push(2);
        System.out.println(stk);
        System.out.println();




        


    }
}
