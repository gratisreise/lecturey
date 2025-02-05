package _12_abstract_factory.ex02;

class MySQLResultSet implements ResultSet {
    public void getResults() {
        System.out.println("Getting results from MySQL database");
    }
}