public class Polymorphism {
    public class Employee {
        public void workHours() {
            System.out.println("20 hours");
        }
    }

    public class FullTimeEmployee extends Employee {
        public void workHours() {
            System.out.println("42 hours");
        }
    }

    public class PartTimeEmployee extends Employee {
        public void workHours() {
            System.out.println("12 hours");
        }
    }
}


