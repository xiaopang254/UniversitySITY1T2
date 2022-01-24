public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, I am Lau Jun Xiang!");

        String module = "CSC1009";
        switch (module) {
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC2902":
                System.out.println("Career and Professional Development");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }
        System.out.println("After switch");

        for (int x = 102; x >= 66; x--) {
            if (x % 2 == 1) {
                System.out.print("value of x: " + x);
                System.out.print("\n");
            }
        }
    }
}