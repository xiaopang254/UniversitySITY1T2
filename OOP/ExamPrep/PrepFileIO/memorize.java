package PrepFileIO;

import java.io.*;

public class memorize {

    public static void main(String[] args) throws IOException {
        InputOutputBuffered();
    }

    public static void InputOutputBuffered() throws IOException {
        String filePath = "C:\\Users\\Jun Xiang\\Desktop\\SIT\\GitHub_self\\UniversitySITY1T2\\OOP\\ExamPrep\\PrepFileIO\\someFile2.txt";
        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line = br.readLine();

        while (line != null) {
            String[] data = line.split(" ");
            System.out.println(data[0]);
            line = br.readLine();
        }
        br.close();

    }

    public static void inputOutputWriter() {

    }

}
