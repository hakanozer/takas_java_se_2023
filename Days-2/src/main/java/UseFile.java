import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UseFile {

    File file = null;
    public UseFile() {
        LocalDateTime local = LocalDateTime.now();
        String stDate = local.getDayOfMonth()+"_"+local.getMonthValue()+"_"+local.getYear();
        file = new File(stDate+".txt");
    }


    public UseFile( String fileName ) {
        fileName = fileName + ".txt";
        file = new File(fileName);
    }


    public void createFile() {
        try {
            if ( !file.exists() ) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteFile() {
        file.delete();
    }

    public void addLine( String line ) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(line);
            fileWriter.append(System.lineSeparator());
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("File Write Error: " + ex);
        }
    }


    public void read() {
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception ex) {
            System.err.println("File Read Error : " + ex);
        }
    }

}
