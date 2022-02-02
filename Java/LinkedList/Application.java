public class Application {
    public static void main(String [] args){
        StackLinkedList<Integer> stack1 = new StackLinkedList<>();
        stack1.push(7);
        stack1.push(10);
        System.out.println("Pop Val: " + stack1.pop());
        stack1.push(21);
        stack1.push(2022);
        System.out.println("Peek Val: " + stack1.peek());
        System.out.println("Peek Val: " + stack1.peek());
        System.out.println("Peek Val: " + stack1.peek());
        System.out.println("Pop Val: " + stack1.pop());
        System.out.println("Pop Val: " + stack1.pop());
        System.out.println("Pop Val: " + stack1.pop());
        
        StackLinkedList<Integer> stack2 = new StackLinkedList<>(5);
        stack2.push(3);
        stack2.push(4);
        System.out.println("Pop Val: " + stack2.pop());
        stack2.push(4);
        System.out.println("Peek Val: " + stack2.peek());
        System.out.println("Peek Val: " + stack2.peek());
        System.out.println("Pop Val: " + stack2.pop());
        System.out.println("Pop Val: " + stack2.pop());
        System.out.println("Pop Val: " + stack2.pop());
        
    }
}
