package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancemeantoDeParentes {

    public static boolean solve(String expresion){
        Set<Character> openSymbols = Set.of('(','{', '[');
        Set<Character> closeSymbols = Set.of(')','}', ']');
        Stack<Character> stack = new Stack<>();

        for(char c : expresion.toCharArray()){
            if(openSymbols.contains(c)) stack.push(c);
            if(closeSymbols.contains(c)){
                if(stack.isEmpty()) return false;
                var open = stack.pop();
                if(open == '(' && c != ')') return false;
                if(open == '{' && c != '}') return false;
                if(open == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("480 / { 20 * [ 86 - 12 * (5 + 2 ) ] 2 }"));
    }



}
