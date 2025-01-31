package _01_facade.ex02;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileReader{
    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}

class FileWriter{
    public void writeFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}

class FileDeleter{
    public void deleteFile(String filePath) throws IOException {
        Files.delete(Paths.get(filePath));
    }
}

public class FileSystemFacade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileDeleter fileDeleter;

    public FileSystemFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileDeleter = new FileDeleter();
    }

    //파일읽기
    public String readFile(String filePath){
        try{
            return fileReader.readFile(filePath);
        } catch (IOException e){
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    public boolean writeFile(String filePath, String content){
        try{
            fileWriter.writeFile(filePath, content);
            return true;
        } catch(IOException e){
            System.err.println("Error writing file: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteFile(String filePath){
        try{
           fileDeleter.deleteFile(filePath);
           return true;
        } catch(IOException e){
            System.err.println("Error deleting file: " + e.getMessage());
            return false;
        }
    }
}
