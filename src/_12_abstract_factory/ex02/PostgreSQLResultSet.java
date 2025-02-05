package _12_abstract_factory.ex02;

class PostgreSQLResultSet implements ResultSet {
    public void getResults() {
        System.out.println("Getting results from PostgreSQL database");
    }
}