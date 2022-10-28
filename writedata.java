import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writedata {
    public static void main(String[] args) {
        String[] sentences = { "Hey!", "My name is Bruno.", "I am a software developer.",
                "I enjoy programming with Java." };

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String sentence : sentences) {
                writer.write("\n" + sentence);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
