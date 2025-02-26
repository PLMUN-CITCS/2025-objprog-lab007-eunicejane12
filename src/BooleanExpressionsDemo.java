public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;

        // Declare and initialize integer variables
        int a = 15;
        int b = 20;

        // Relational expression (Greater Than)
        boolean isAGreater = a > b;

        // Relational expression (Equal To)
        boolean areEqual = a == b;

        // Logical AND
        boolean bothTrue = isJavaFun && (a < b);

        // Logical OR
        boolean eitherTrue = isJavaFun || isHomeworkTiring;

        // Logical NOT
        boolean notTrue = !isHomeworkTiring;

        // Logical XOR (Exclusive OR)
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;

        // Output results (formatted)
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        System.out.println("Are 'a' and 'b' equal? " + areEqual);
        System.out.println("Both conditions (isJavaFun && a < b): " + bothTrue);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
        System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}
