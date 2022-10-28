# 📂 input-output-file

This Java program writes and reads input from a file.

## ⚙️ Codebase

1. In order to use the tools we need to input and output data to a file, we need to import the packages from java.io

```
import java.io.BufferedReader; // read data from file
import java.io.BufferedWriter; // write data to file
import java.io.FileReader; // read file
import java.io.FileWriter; // write file
import java.io.IOException; // throw an exception
```

2. Write the main class

```
public class writedata {}
```

3. Create an array (for example) to store the data we want to input to the file

```
String[] sentences = { "Hey!", "My name is Bruno.", "I am a software developer.", "I enjoy programming with Java." };
```

4.  Create try and catch exceptions to write the data to file and read it afterwards

```
try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String sentence : sentences) { // loop through the sentences array 
                writer.write("\n" + sentence); // output the elements of the array
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) { // loop while line is not equal to null, when it is, stop looping
                System.out.println(line); // logs all the content from the file
            }
            reader.close(); // ends the reading of the file
        } catch (IOException e) {
            e.printStackTrace();
        }
```

5. This should create a file called output.txt and then read it, logging all the lines written in it in the console/terminal.

<img width="237" alt="Screenshot 2022-10-28 at 11 49 39 1" src="https://user-images.githubusercontent.com/72168158/198570273-9cebaf5a-991d-43ae-9289-f8ec525fc010.png">

🎉🎉🎉

## 📚 Useful resources

- java.io: https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html
- BufferedWriter: https://docs.oracle.com/javase/7/docs/api/java/io/BufferedWriter.html
- BufferedReader: https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html
- FileReader: https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html
- FileWriter: https://docs.oracle.com/javase/7/docs/api/java/io/FileReader.html
- https://docs.oracle.com/javase/7/docs/api/java/io/IOException.html

