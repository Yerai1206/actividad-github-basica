public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.printf("Uso: java Calculator [sum|sub] num1 num2%n");
            return;
        }

        String operation = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int result;

        if (operation.equals("sum")) {
            result = add(a, b);
        } else if (operation.equals("sub")) {
            result = sub(a, b);
        } else {
            System.out.printf("Operacion invalida. Usa sum o sub.%n");
            return;
        }

        System.out.printf("Resultado: %d%n", result);
    }
}
