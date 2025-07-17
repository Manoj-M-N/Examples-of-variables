class Television {

    // Instance variables (declared inside the class, outside any method)
    String name = "SAMSUNG";
    double price = 30000;

    // Non-static method accessing instance variables directly
    void watching() {
        System.out.println("\nInside method:");
        System.out.println(name + " TV is good for watching movies.");
        System.out.println("The price of " + name + " TV is " + price);
    }

    // Constructor accessing instance variables directly
    Television() {
        System.out.println("\nInside constructor:");
        System.out.println(name + " TV is good for watching cricket.");
    }

    // Instance block accessing instance variables
    {
        System.out.println("\nInside instance block:");
        System.out.println(name + " TV has a price of ₹" + price);
    }

    public static void main(String[] args) {
        // Accessing instance variables via object in static context
        Television t = new Television();
        t.watching();

        // Accessing instance variables from another class
        Customer c = new Customer();
        System.out.println("\nAccessing from outside class:");
        System.out.println(c.name + " from " + c.city + " bought a " + t.name + " TV for ₹" + t.price);
    }
}


