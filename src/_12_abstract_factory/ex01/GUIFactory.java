package _12_abstract_factory.ex01;

// Abstract factory interface
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}