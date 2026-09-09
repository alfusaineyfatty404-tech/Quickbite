import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Qickbite
        /*
        itemName: data type for this Array is string
        itemPrices: data type for this Array is double
        itemAvailable: data type for this Array is boolean
         */
        // Initialze your scanner obj
        Scanner in = new scanner(System.in);

        String[] itemName = {"banana", "mango", "orange"};
        double[] itemPrices = {9.5, 2.5, 5.2};
        boolean[] itemAvailable = {true, true, true};

        // addd items to the Array using scanner class/object
        do {
            System.out.println("Are you adding an items?: Y or N"); // hint the user
            String userInput = in.next();

            if (userInput.equalsIgnoreCase( anotherString: "n")) break;
            System.out.println("Enter item name: ");
            String name = in.next();

            System.out.println("Enter item price: ");
            double price = in. nextDouble();

            System.out.println("Enter item status: ");
            boolean status = in.nextBoolean(); // true / false

            System.out.println("Name \t Price \t Status");
            System.out.println(Name+ "\t" +price+ "\t" +status);

            // add new captured items to the store
            itemName = Arrays.copyOf(itemName, newLength itemName.length+1);
             // Array is resized {"banana", "mango", "orange" ""}
            itemName[itemName.length-1] name;
            System.out.println(Arrays.toString(itemName));


        } while (true);

        // Print the items one-by-one
        for (int i = 0; i < itemName.length; i++) {
            // check the availability of an item and print
            // sold out or available
            String check  = null;
            if (itemAvailable[i] == true){
                    check ="Available"
                    }else{
                            check = "Sold out";
        }
            System.out.println(itemName[i])+ " "+itemPrices[i]+ " "+check);

// Linear search by item name
            for (int i = 0; i < itemNam.length; i++) {
                System.out.println("Enter the item:__");
                String searchTerm = in.next();

                if (itemName[i].equalsIgnoreCase(searchTerm)) {
                    System.out.println(itemName[i]+ "\t" +itemPrices[i]+ "\t" +itemAvailable[i]);

                } else {
                    System.out.println(searchTerm+ "not found.");
                }

            }
 /*

  */
        }
    }
}