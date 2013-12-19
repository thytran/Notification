package health;

import com.yammer.dropwizard.db.Database;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.metrics.core.HealthCheck;

/**
 * Created by thytran on 12/18/13.
 */
public class DatabaseHealthCheck extends HealthCheck{
    private final Database database;

    public DatabaseHealthCheck(Database database) {
        super("database");
        this.database = database;
    }

    @Override
    protected Result check() throws Exception {
        if () {
            return Result.healthy();
        } else {
            return Result.unhealthy("Cannot connect to " + database);
        }
    }
}
