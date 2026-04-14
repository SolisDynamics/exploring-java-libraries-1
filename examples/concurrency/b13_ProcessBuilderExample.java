package a1_java.lang;  
import java.io.*;  
import java.nio.file.*;  
import java.util.*;  
public class b13_ProcessBuilderExample {  
    public static void main(String[] args) {  
        try {  
            // Create the input.txt file if it doesn't exist  
            createFileIfNotExists("input.txt");  
            // Method 1: ProcessBuilder() - Creates a process without parameters  
            ProcessBuilder defaultProcessBuilder = new ProcessBuilder("cmd.exe", "/c", "echo Default ProcessBuilder created");  
            defaultProcessBuilder.start(); // Start the process to show its usage  
            System.out.println("1. Default ProcessBuilder created and process started.");  
      // Method 2: ProcessBuilder(List<String> command) - Creates a process with a command list  
    List<String> commandList = Arrays.asList("cmd.exe", "/c", "echo Hello from command list");  
            ProcessBuilder listProcessBuilder = new ProcessBuilder(commandList);  
            listProcessBuilder.start(); // Start the process to show its usage  
      System.out.println("2. ProcessBuilder created with command list and process started.");  
      // Method 3: ProcessBuilder(String... command) - Creates a process with a specified command array  
            ProcessBuilder arrayProcessBuilder = new ProcessBuilder("cmd.exe", "/c", "echo Hello from command array");  
            arrayProcessBuilder.start(); // Start the process to show its usage  
      System.out.println("3. ProcessBuilder created with command array and process started.");  
            // Method 4 & 5: command() methods - Setting commands  
            ProcessBuilder commandProcessBuilder = new ProcessBuilder("cmd.exe", "/c", "dir");  
            System.out.println("4. Commands set using String array.");  
            List<String> newCommandList = Arrays.asList("cmd.exe", "/c", "cd");  
    commandProcessBuilder.command(newCommandList);  // Method 5: command(List<String> command)   
            System.out.println("5. Commands updated using command list.");  
            // Method 6: directory() - Setting the working directory  
            File workingDirectory = new File(System.getProperty("user.home"));  
            commandProcessBuilder.directory(workingDirectory);  
            System.out.println("6. Working directory set to: " + workingDirectory);  
            // Method 7: environment() - Accessing and modifying environment variables  
            Map<String, String> env = commandProcessBuilder.environment();  
            env.put("CUSTOM_VAR", "ProcessBuilder Example");  
            System.out.println("7. Environment variable added: CUSTOM_VAR=" + env.get("CUSTOM_VAR"));  
            // Method 8: redirectErrorStream() - Redirecting error stream to standard output  
            commandProcessBuilder.redirectErrorStream(true);  
            System.out.println("8. Error stream redirected to standard output.");  
            // Method 11: inheritIO() - Inheriting IO streams from the main process  
            commandProcessBuilder.inheritIO();  
            System.out.println("11. Inherited IO streams from the parent process.");  
            // Method 12-14: Redirecting streams to files  
            File outputFile = new File("output.txt");  
            File errorFile = new File("error.txt");  
            File inputFile = new File("input.txt"); // This file should now exist  
            commandProcessBuilder  
           .redirectInput(inputFile)       // Method 12: Redirect input from the specified file  
           .redirectOutput(outputFile)     // Method 13: Redirect output to the specified file  
           .redirectError(errorFile);      // Method 14: Redirect error to the specified file  
            System.out.println("12-14. Stream redirections configured.");  
            // Method 9: start() - Starting the process  
            Process process = commandProcessBuilder.start();  
            System.out.println("9. Process started successfully.");  
            // Wait for the processes to complete  
            int exitCode = process.waitFor();  
            System.out.println("Process completed with exit code: " + exitCode);  
        } catch (IOException | InterruptedException e) {  
            // Handling potential exceptions  
            System.err.println("An error occurred: " + e.getMessage());  
            e.printStackTrace(); } }  
    // Create a file if it doesn't exist  
    private static void createFileIfNotExists(String fileName) throws IOException {  
        if (!Files.exists(Paths.get(fileName))) {  
            Files.createFile(Paths.get(fileName));  
            System.out.println("Created file: " + fileName); 
        } 
    } 
}
