public class ifElseMethod {
    public static void main(String[] args) {

        System.out.println("Erdbewohner betritt den Raum");
        sayHelloToEarthPeople(true, 18);
        System.out.println("Ein weiterer Erdbewohner betritt den Raum");
        sayHelloToEarthPeople(false, 17);
        int number = getInteger();
        System.out.println(number);
        String message = getMessage();
        System.out.println(message);
        System.out.println(add(5,10));
        System.out.println(addDouble(5.5,3.7));
        System.out.println(sub(10,5));
        System.out.println(makePositive(-28));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double addDouble(double a, double b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int makePositive (int a) {
        return Math.abs(a);

    }

    public static int getInteger() {
        return 5;
    }

    public static String getMessage() {
        return "This is a message";
    }

    public static void sayHelloToEarthPeople(boolean livingOnEarth, int age) {

        // If & else


        System.out.println("Hello");



        if (livingOnEarth) {
            System.out.println("Earth");
            if (age >= 18) {
                System.out.println("welcome to the club");
            }
            else {
                System.out.println("bring your parent");
            }
        }
        else {
            System.out.println("Mars");
        }
    }





}
