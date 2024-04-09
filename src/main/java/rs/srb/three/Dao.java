package rs.srb.three;

import java.util.List;

public interface Dao <E>{

    String URL = "jdbc:mysql://localhost:3306/store";
    String USERNAME = "root";
    String PASSWORD = "Zoran2005";
    void save(E t);
    E select(long id);

    List<E> selectAll();



    void update(E t);

    void  delete (E t);





}
