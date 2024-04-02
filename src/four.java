public class four {
    public static void main(String[] args) {
        String name1 = "Jack";
        String name2 = "Mike";


        boolean  names = name1.equalsIgnoreCase(name2);


        if ( names) {
            System.out.println("Імена ідентичні ");
        } else {
            System.out.println("Імена не ідентичні ");
        }

    }
}
