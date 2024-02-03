
package persistence;

import java.io.File;

/**
 *
 * @author gabegrosse
 */
public class DeckPersistenceManager {

    public class ApplicationInitializer {

        public static void createDataStorageStructure() {
            // Define the path for the directory
            String directoryPath = "data/cards";

            // Create a File object for the directory
            File directory = new File(directoryPath);

            // Check if the directory already exists
            if (!directory.exists()) {
                // Attempt to create the directory, including any necessary parent directories
                boolean wasSuccessful = directory.mkdirs();

                // Check if the creation was successful
                if (wasSuccessful) {
                    System.out.println("Directory structure created: " + directoryPath);
                } else {
                    System.err.println("Failed to create directory structure: " + directoryPath);
                }
            }
        }

        public static void main(String[] args) {
            // Ensure the directory structure is in place
            createDataStorageStructure();
            // Your application logic here
        }
    }

}
