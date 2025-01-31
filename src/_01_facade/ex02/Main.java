package _01_facade.ex02;

//파일시스템 파사드를 사용하기위한 코듣
public class Main {

    public static void main(String[] args) {
        FileSystemFacade fs = new FileSystemFacade();

        //파일 쓰기
        boolean writeSuccess = fs.writeFile(
            "test.txt", "Hello, Facade Pattern!"
        );
        System.out.println("File write success: " + writeSuccess);

        //파일 읽기
        String content = fs.readFile("test.txt");
        System.out.println("File content: "  + content);

        //파일 삭제
        boolean deleteSuccess = fs.deleteFile("test.txt");
        System.out.println(
            "File delete success: " + deleteSuccess
        );
    }
}
