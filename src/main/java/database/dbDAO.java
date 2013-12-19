package database;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 * Created by thytran on 12/18/13.
 */
public interface dbDAO
{
    @SqlUpdate
    void createTable();

    @SqlUpdate
    void insert(@Bind("sender") String sender, @Bind("message") String message);

    @SqlQuery
    void delete(@Bind("sender") String sender);

    @SqlQuery
     String select(@Bind("sender") String sender);

    @SqlUpdate
     void update(@Bind("sender") String sender);

    @SqlQuery
     int size();


    void close();
}
