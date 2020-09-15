package ar.itba.edu.TP5.P5;

public class StackTester {
    public static void main(String[] args){
        AccessNumber<Integer> stack = new AccessStack<>();
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        //System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
       // System.out.println(stack.pop());
        System.out.println(stack.getPop());
        System.out.println(stack.getPush());



    }
}
