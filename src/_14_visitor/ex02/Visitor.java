package _14_visitor.ex02;

// Visitor interface
interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}