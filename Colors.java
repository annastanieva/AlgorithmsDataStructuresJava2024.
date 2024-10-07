import java.util.ArrayList;
import java.util.Collections;

public class Colors {
    public static void main(String[] args) {
        // 1.create a new array list, add some colors (string) and print out the collection
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Violet");
        colors.add("Ivory");
        colors.add("Black");
        colors.add("White");
        System.out.println(" Colors: " + colors);

        // 2. iterate through all elements in a array list
        System.out.println("\nIterated elements: ");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. insert an element into the array list at the first position
        colors.addFirst("White");
        System.out.println("\nInsertion at the first position: " + colors);

        // 4.retrieve an element (at a specified index) from a given array list
        String retrievedColor = colors.get(2);
        System.out.println("\nRetrieved element of index 2: " + retrievedColor);

        // 5.update specific array element by given element
        colors.set(2, "Purple");
        System.out.println("\nUpdated: " + colors);

        // 6.remove the third element from a array list
        colors.remove(2);
        System.out.println("\nRemoved third element: " + colors);

        // 7.search an element in a array list
        boolean found = colors.contains("Ivory");
        System.out.println("\nElement is found? " + found);

        // 8.sort a given array list
        Collections.sort(colors);
        System.out.println("\nSorted: " + colors);

        // 9.copy one array list into another
        ArrayList<String> newcolors;
        newcolors = colors;
        System.out.println("\nCopied: " + newcolors);

        // 10. reverse elements in a array list
        Collections.reverse(colors);
        System.out.println("\nReversed: " + colors);

        // 11. compare two array lists
        boolean areEqual = colors.equals(newcolors);
        System.out.println("\nComparing: " + areEqual);

        //14. increase the size of an array list
        colors.ensureCapacity(8);
        System.out.println("\nIncreased: " + colors);

        //15. trim the capacity of an array list the current list size
        colors.trimToSize();
        System.out.println("\nTrimmed: " + colors.size());

        // 12. empty an array list
        colors.clear();
        System.out.println("\nEmptied: " + colors);

        // 13. test an array list is empty or not
        boolean isEmpty = colors.isEmpty();
        System.out.println("\nEmpty? " + isEmpty);
    }
}
