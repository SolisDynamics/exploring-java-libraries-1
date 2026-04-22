package a4_java.nio;

import java.nio.file.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class b10_PathExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file path  
        System.out.print("Enter a file path (e.g., C:/Users/Example/Documents/sample.txt): ");
        String userInput = scanner.nextLine();

        Path path = Paths.get(userInput); // Create a Path object from the user-provided path  

        // Check and display path information  
        checkFilePath(path);

        // Check if the file exists  
        if (Files.exists(path)) {
            System.out.println("The file already exists.");
            readFileContent(path);
        } else {
            System.out.println("The file does not exist. Creating file...");
            createFile(path);
        }

        // Ask the user if they want to append content  
        System.out.print("Do you want to append content to the file? (yes/no): ");
        if ("yes".equalsIgnoreCase(scanner.nextLine())) {
            System.out.print("Enter the content to append: ");
            String contentToAppend = scanner.nextLine();
            appendToFile(path, contentToAppend);
        }

        // Ask the user if they want to delete the file  
        System.out.print("Do you want to delete the file? (yes/no): ");
        if ("yes".equalsIgnoreCase(scanner.nextLine())) {
            deleteFile(path);
        }

        scanner.close(); // Clean up resources  
    }

    // Check file path information  
    private static void checkFilePath(Path path) {
        System.out.println("File path: " + path.toString()); // Method 23  

        // 1. Check if the path is absolute  
        System.out.println("Is absolute path: " + path.isAbsolute()); // Method 1    

        // 2. Get file name  
        System.out.println("File name: " + path.getFileName()); // Method 2  

        // 3. Get parent directory  
        System.out.println("Parent directory: " + path.getParent()); // Method 3   

        // 4. Get root component  
        System.out.println("Root component: " + path.getRoot()); // Method 4  

        // 5. Get number of components in the path  
        System.out.println("Number of components: " + path.getNameCount()); // Method 5  

        // 6. Get last name in the path  
        if (path.getNameCount() > 0) {
            System.out.println("Last name in path: " + path.getName(path.getNameCount() - 1)); // Method 6  
        }

        // 7. Get subpath  
        if (path.getNameCount() > 1) {
            System.out.println("Subpath from index 1 to end: " + path.subpath(1, path.getNameCount() - 1)); // Method 7  
        }

        // 8. Check if it starts with a specific prefix  
        System.out.println("Starts with 'C:/Users': " + path.startsWith("C:/Users")); // Method 8  

        // 9. Check if it ends with a specific suffix  
        System.out.println("Ends with 'sample.txt': " + path.endsWith("sample.txt")); // Method 10  

        // 10. Normalize the path  
        System.out.println("Normalized path: " + path.normalize()); // Method 14  

        // 11. Convert to URI  
        System.out.println("Path URI: " + path.toUri()); // Method 16  

        // 12. Convert to URL  
        try {
            System.out.println("Path URL: " + path.toUri().toURL()); // Method 17  
        } catch (Exception e) {
            System.err.println("Error during URL conversion: " + e.getMessage());
        }

        // 13. Get absolute path  
        System.out.println("Absolute path: " + path.toAbsolutePath()); // Method 18  

        // 14. Convert Path object to File object  
        File fileObject = path.toFile(); // Method 20  
        System.out.println("File object path: " + fileObject.getPath());

        // 15. Check if the file exists  
        System.out.println("Does the file exist? " + fileObject.exists());
    }

    // Create a file  
    private static void createFile(Path path) {
        try {
            Files.createFile(path);
            System.out.println("File created successfully: " + path.toString());
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    // Read file content  
    private static void readFileContent(Path path) {
        try {
            String content = new String(Files.readAllBytes(path)); // Method 15  
            System.out.println("Current file content:\n" + content);
        } catch (IOException e) {
            System.err.println("Failed to read file content: " + e.getMessage());
        }
    }

    // Append content to a file  
    private static void appendToFile(Path path, String content) {
        try {
            Files.write(path, (content + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND); // Method 15  
            System.out.println("Content appended successfully");
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }

    // Delete a file  
    private static void deleteFile(Path path) {
        try {
            Files.delete(path);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }
}
