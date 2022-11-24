import java.lang.invoke.StringConcatFactory;
import java.util.*;


public class ParenthesesChecker {
    static String testString (String checker){

        return checker;
    }

    public boolean checkParentheses(String testString) {
        Character open = '(';
        Character close = ')';





        if (testString.equals(""))
            return true;

        Stack<Character> characterStack = new Stack<>();
        if (characterStack.contains(open) || characterStack.contains(close)){
            characterStack.pop();
        } else {
            return false;
        }

        for (int i = 0; i < testString.length(); i++) {
            char x = testString.charAt(i);
            if (characterStack.isEmpty()) {
                    return characterStack.indexOf(i) == 0;
            } else {
                if (x == '(') {
                    characterStack.push(x);
                    if (characterStack.isEmpty()) {
                        return false;
                    }
                    if ((x == ')' && characterStack.peek() != '(')) {
                        characterStack.pop();
                    } else if (!testString.isEmpty() && (
                            (testString.charAt(i) == ')' && characterStack.peek() == '('))) {
                        characterStack.pop();
                    }
                    if (testString.charAt(i) == '(') {
                        characterStack.push(testString.charAt(i));
                    }
                    if (x== '(' || x== '{' || x == '[');
                    characterStack.push(testString.charAt(i));
                }


            }
        }

        return false;
    }
}



// write a checkParentheses method
//takes in a string and returns a boolean
//return true if the parentheses are correct(in pairs)
//false if not

//situations to return false
//more opening or closing brackets, match each other
//closing bracket at start

// stack only dealing with one thing at a time
// use a for loop
