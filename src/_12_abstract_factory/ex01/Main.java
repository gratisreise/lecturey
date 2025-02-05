package _12_abstract_factory.ex01;

public class Main {

    public static void main(String[] args) {
        // Create Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.paint();

        System.out.println();

        // Create MacOS GUI
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();
    }

}
