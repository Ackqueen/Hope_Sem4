public class typesOfParameters {

    void show(int a, String name) { 
        a = a + 10;
        name = "Changed";

        System.out.println("Inside method:");
        System.out.println("a = " + a);
        System.out.println("name = " + name);
    }

    void sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        System.out.println("Sum = " + total);
    }

    public static void main(String[] args) {
        typesOfParameters obj = new typesOfParameters();

        int x = 5;
        String str = "Original";

        obj.show(x, str);

        System.out.println("Outside method:");
        System.out.println("x = " + x);
        System.out.println("str = " + str);

        obj.sum(1, 2, 3, 4);
    }
}