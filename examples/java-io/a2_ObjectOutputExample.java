package a3_java.io;

import java.io.*;
import java.net.*;
import java.util.*;

// Network and File Serialization Example  
public class a2_ObjectOutputExample {

    private static final String FILE_PATH = "serialized_data.bin";
    private static final int SERVER_PORT = 8000;

    // Serializable class  
    static class NetworkData implements Serializable {
        private static final long serialVersionUID = 1L;
        private String message;
        private List<Integer> data;

        public NetworkData(String message) {
            this.message = message;
            this.data = new ArrayList<>();
            // Sample data generation  
            for (int i = 1; i <= 5; i++) {
                data.add(i * message.length());
            }
        }

        @Override
        public String toString() {
            return "NetworkData{message='" + message + "', data=" + data + "}";
        }
    }

    // File Serialization Method  
    public static void serializeToFile(NetworkData data) {
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            // 6. writeObject: Serialize object  
            objectOutput.writeObject(data);

            // 2. flush: Clear buffer  
            objectOutput.flush();

            // 3. write(byte[]): Write byte array  
            byte[] byteArray = {10, 20, 30, 40, 50};
            objectOutput.write(byteArray);

            // 4. write(byte[], int, int): Write subarray  
            objectOutput.write(byteArray, 1, 3);

            // 5. write(int): Write single byte  
            objectOutput.write(42);

            System.out.println("Serialization to file completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Network Serialization Method  
    public static void serializeOverNetwork(NetworkData data) {
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Server started. Waiting for connection...");
            try (Socket socket = serverSocket.accept();
                 ObjectOutput networkOutput = new ObjectOutputStream(socket.getOutputStream())) {
                
                // 6. writeObject: Serialize object over network  
                networkOutput.writeObject(data);

                // 2. flush: Clear network stream  
                networkOutput.flush();

                System.out.println("Data sent over network.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize from File  
    public static void deserializeFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            NetworkData deserializedData = (NetworkData) ois.readObject();
            System.out.println("Deserialized data from file: " + deserializedData);

            // Read additional byte data  
            byte[] readByteArray = new byte[5];
            ois.read(readByteArray);
            System.out.println("Read Byte Array: " + Arrays.toString(readByteArray));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NetworkData networkData = new NetworkData("Hello, World!");

        // Serialize to file  
        serializeToFile(networkData);

        // Deserialize from file  
        deserializeFromFile();

        // Serialize over network (can be run in a separate thread or application)  
        // serializeOverNetwork(networkData);  
    }
}
