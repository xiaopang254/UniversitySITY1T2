package PrepFileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        File file = new File(
                "C:\\Users\\Jun Xiang\\Desktop\\SIT\\GitHub_self\\UniversitySITY1T2\\OOP\\ExamPrep\\PrepFileIO\\someFile.csv");
        file.createNewFile();
        BufferedReader input = new BufferedReader(new FileReader(file));
        FileWriter filein = new FileWriter(file, true);
        ArrayList list = new ArrayList();
        String line = input.readLine();
        while (line != null) {
            // list.add(line.split(","));
            String[] data = line.split(",");
            System.out.println(data[1]);
            line = input.readLine();
        }
        input.close();
        // System.out.print(list.get(0));

        // ArrayList<String[]> listContent = new ArrayList<>();
        // try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        // String line = "";
        // while ((line = br.readLine()) != null) {
        // listContent.add(line.split(","));
        // }
        // }

        // BufferedReader input = new BufferedReader(new FileReader(file));
        // FileWriter filein = new FileWriter(file, true);
        // ArrayList list = new ArrayList();
        // String line = input.readLine();
        // while(line != null){
        // list.add(line.split(","));
        // line = input.readLine();
        // }
        // input.close();
        // System.out.print(list.get(0));

        // System.out.println(list.get(1));

    }

}
