

import java.util.Stack;
public class IT20B_Stack {

 
    public static void main(String[] args) {
        Stack<String> McDonalds = new Stack<>();
        
        McDonalds.push("Burger");
        McDonalds.push("Fries");
        McDonalds.push("Coke");
        
        System.out.println("McDonalds:"+ McDonalds);
        
        String topElement = McDonalds.pop();
        System.out.println("poped:" + topElement);
        
        
        
        
        
        
        String peekedElement = McDonalds.peek();
        System.out.println("Peeked: "+ peekedElement);
        
        boolean isEmpty = McDonalds.isEmpty();
        System.out.println("Empty: "+ isEmpty);
       
        
    }
    
}