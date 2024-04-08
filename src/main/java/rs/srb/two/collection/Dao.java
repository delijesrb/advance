package rs.srb.two.collection;

import java.util.List;
/*DAO Data Aces Object*/
public interface Dao <E>{
    String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "Zoran2005";

    List<E> selectAll();

    E selectWhere(Long id);
}
