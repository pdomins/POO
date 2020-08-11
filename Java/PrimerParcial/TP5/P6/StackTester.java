package ar.itba.edu.POO.PrimerParcial.TP5.P6;

public class StackTester {
    public static void main (String[] args){
        AccessibleStack<Integer> stack = new AccessStack<>();
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.getPush());
        System.out.println(stack.getPop());
    }
}
