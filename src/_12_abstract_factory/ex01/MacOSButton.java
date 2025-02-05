package _12_abstract_factory.ex01;

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style");
    }
}