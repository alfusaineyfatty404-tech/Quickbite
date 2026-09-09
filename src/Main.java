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
        }
    }
}