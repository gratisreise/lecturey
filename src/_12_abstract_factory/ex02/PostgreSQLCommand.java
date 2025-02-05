package _12_abstract_factory.ex02;

class PostgreSQLCommand implements Command {
    public void execute(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}