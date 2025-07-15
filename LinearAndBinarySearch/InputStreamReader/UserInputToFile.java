import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String input;
        while (!(input = reader.readLine()).equals("exit")) {
            writer.write(input);
            writer.newLine();
        }
        writer.close();
    }
}