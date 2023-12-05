package stel.mania;


public class Main {
    public static void main(String[] args) {

        System.out.println(2 / 3);
        System.out.println(2 % 3);

        byte a = 30;
        byte b = 50;

        System.out.println(a + b);
        System.out.println(b / a * 3);

        float c = 3.4f;
        double d = 4.89;

        System.out.println(d * a);
        System.out.println(b % c);

        double orderTotal = 45;

        if (orderTotal > 100) {
            System.out.println("10% discount. Order total: "+ (orderTotal - orderTotal*0.1));
        } else {
            System.out.println("No discount");
        }

        orderTotal = (orderTotal > 500)
                ? (orderTotal - orderTotal * 0.25)
                : (orderTotal - orderTotal * 0.05);

        System.out.println(orderTotal);

        int aInt = Integer.MAX_VALUE;
        System.out.println(aInt);
        int overridedInt = aInt + 1;
        System.out.println("Переполнение " + overridedInt);


    }

}