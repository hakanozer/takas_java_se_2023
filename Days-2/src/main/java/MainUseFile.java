import java.util.UUID;

public class MainUseFile {

    public static void main(String[] args) {

        UseFile useFile = new UseFile();
        //useFile.createFile();
        //useFile.deleteFile();
        String uui = UUID.randomUUID().toString();
        useFile.addLine(uui);

        useFile.read();
    }

}
