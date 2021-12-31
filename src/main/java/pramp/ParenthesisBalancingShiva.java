package pramp;

public class ParenthesisBalancingShiva {

    static boolean parentheses(String s) {

        if (s == null || ((s.length() % 2) != 0)){
            System.out.println("odd length");
            return false;
        }
        else {
            char[] ch = s.toCharArray();
            for (char c : ch) {
                if (!(c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']')){
                    System.out.println("not bracket");
                    return false;
                }

            }
        }

        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("\\(\\)", "")
                    .replace("\\{\\}", "")
                    .replace("\\[\\]", "");
        }

        return (s.length() == 0);

    }


    public static void main(String[] args) {

        String s = "([])";
        System.out.println(parentheses(s));


    }

}
