//package conditionCheck;
//
//
//import org.springframework.util.StringUtils;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class ConditionCheck {
//
//    private boolean checkCondition(String condition){
//        boolean isValid =  isValidBracketString(condition);
//        if(isValid){
//            handleCondition(condition);
//        }
//
//        return false;
//    }
//
//    private void handleCondition(String condition) {
//        getSubCondition(condition);
//
//
//    }
//
//    private void getSubCondition(String string) {
//        Deque<BracketObj> stack = new LinkedList<>();
//        for(int i=0; i< string.length(); i++){
//            if(string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '('){
//                stack.push(new BracketObj(string.charAt(i),i));
//            } else if(string.charAt(i) == '}' || string.charAt(i) == ']' || string.charAt(i) == ')') {
//                if(stack.isEmpty())
//                    return ;
//                switch(stack.pop().getBracket()){
//                    case '(':
//                        if(string.charAt(i) != ')')
//                            return false;
//                        break;
//                    case '[':
//                        if(string.charAt(i) != ']')
//                            return false;
//                        break;
//                    case '{':
//                        if(string.charAt(i) != '}')
//                            return false;
//                        break;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//
//
//    static boolean isValidBracketString(String string) {
//        Deque<Character> stack = new LinkedList<>();
//        for(int i=0; i< string.length(); i++){
//            if(string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '('){
//                stack.push(string.charAt(i));
//            } else if(string.charAt(i) == '}' || string.charAt(i) == ']' || string.charAt(i) == ')') {
//                if(stack.isEmpty())
//                    return false;
//                switch(stack.pop()){
//                    case '(':
//                        if(string.charAt(i) != ')')
//                            return false;
//                        break;
//                    case '[':
//                        if(string.charAt(i) != ']')
//                            return false;
//                        break;
//                    case '{':
//                        if(string.charAt(i) != '}')
//                            return false;
//                        break;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//
//}
