package JsonMaker;

import java.io.FileWriter;
import java.util.ArrayList;

public class File {
    public static File file;

    public static File getInstance(){
        return file = new File();
    }

    public void makeJsonFile(String fileName, ArrayList<String> jsonList){
        try{
            FileWriter fileWriter = new FileWriter(fileName + ".json");
            fileWriter.write(jsonList.toString());
            fileWriter.flush();
            System.out.println("Created Json file: "+ fileName);
        }catch (Exception error){
            error.printStackTrace();
        }

    }
}
