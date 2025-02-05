package _12_abstract_factory.ex02;

class MySQLCommand implements Command {
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}