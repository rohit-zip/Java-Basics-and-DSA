package recursion;

import java.util.ArrayList;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - recursion
 * Created_on - 13 January-2024
 * Created_at - 21 : 47
 */

public class MazePaths {

    public static ArrayList<String> getPaths(int sourceRow, int sourceColumn, int destinationRow, int destinationColumn) {

        if (sourceRow == destinationRow && sourceColumn == destinationColumn) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }

        ArrayList<String> horizontalPath = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();

        if (sourceColumn < destinationColumn) {
            horizontalPath = getPaths(sourceRow, sourceColumn + 1, destinationRow, destinationColumn);
        }

        if (sourceRow < destinationRow) {
            verticalPaths = getPaths(sourceRow + 1, sourceColumn, destinationRow, destinationColumn);
        }

        ArrayList<String> ar = new ArrayList<>();

        for (String path : horizontalPath) {
            ar.add("h" + path);
        }

        for (String path : verticalPaths) {
            ar.add("v" + path);
        }

        return ar;
    }

    public static void main(String[] args) {
        System.out.println(getPaths(1, 1, 2, 3));
    }
}
