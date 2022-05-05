package Test0505;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final String filePath = "src/main/java/Test0505/Users.json";
    private List<User> vartotojai=new ArrayList<>();


    public static void main(String[] args) throws IOException {
        Main m = new Main();
        List<User> vartotojai = m.readUserFile(m.filePath);

        Scanner sc = new Scanner(System.in);

        m.writeUserFile(m.vartotojai, m.filePath);

      //  m.menu(sc);
    }

        private List<User> readUserFile(String filePath) throws IOException {
            ObjectMapper om = new ObjectMapper();
            File file = new File(filePath);
            List<User> vartotojai = om.readValue(file,new TypeReference<List<User>>(){} );
            return vartotojai;
        }

    private void menu(Scanner sc) {

    }

    private void writeUserFile(List<User> vartotojai, String filePath) throws IOException {
        ObjectMapper om = new ObjectMapper();
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(om.writeValueAsString(vartotojai));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
