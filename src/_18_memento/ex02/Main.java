package _18_memento.ex02;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Hello, ");
        editor.write("this is Memento pattern. ");
        System.out.println(editor.getContent());

        editor.undo();
        System.out.println(editor.getContent());

        editor.write("This is an example implemented in Java.");
        System.out.println(editor.getContent());
    }

}
