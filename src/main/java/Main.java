import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        if (!file.exists()) file.createNewFile();

        FileReader fileReader=new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        int count = 0;
        while(reader.readLine()!=null) count++;
        reader.close();
        

        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.append(String.valueOf(count)).append("  :   ").append(new Date().toString()).append("\n");
        printWriter.flush();
        printWriter.close();
        
    }
}

