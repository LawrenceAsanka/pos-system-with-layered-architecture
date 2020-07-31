package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class CrudUtilTest {

  public static void main(String[] args) throws SQLException {
  /*  List<String> params = new ArrayList<>();
    params.add("C001");
    params.add("Kasun");*/
 /*   ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM Customer WHERE id=?","C001");
    System.out.println(resultSet.next());*/

    /*boolean resultset = CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?)","C012","Asanka","Pandura");
    System.out.println(resultset);*/

    boolean resultset = CrudUtil.execute("INSERT INTO Customer VALUES(?,?,?)","C013","Asanka","Pandura");
    System.out.println(resultset);

    ResultSet resultSet = CrudUtil.execute("SELECT * FROM Customer WHERE id=?","C001");
    System.out.println(resultSet.next());
  }

}