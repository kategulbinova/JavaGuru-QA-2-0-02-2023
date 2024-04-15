package lessons.lesson4;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I like JavaGuru!");
        System.out.println("It is the best teaching ");

        System.out.printf("\n%s\n%s\n%s\n\n",
                "Hello, World!",
                "I Like Java Guru!",
                "It is the best teaching community in the world");

        var string = """
                Hello, World!
                I like JavaGuru!
                It is the best teaching community in the world!
                """;
        System.out.println(string);
        System.out.println("""
                Hello, World!
                I like JavaGuru!
                It is the best teaching community in the world!
                """);
        variables();
        System.out.println();
        mathMethod();
    }

    public static void variables() {
        float age;
        age = 25.55f;
        System.out.println("My age is = " + age);
    }

    public static void mathMethod() {
        int x = 5, y = 10, z = 7, w = 6;
        var result1 = 0;
        var result2 = 0;
        result1 = (x - y) + y * y;
        System.out.println("(x-z)+(y*y)= " + result1);
        result2 = w / y + (x * z);
        System.out.println("(w/y) +(x*z)= " + result2);

    }
}
