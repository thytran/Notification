package services;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.jdbi.DBIFactory;
import configuration.NotificationConfiguration;
import core.Inbox;
import database.NotificationDAO;
import database.dbDAO;
import health.DatabaseHealthCheck;
import org.skife.jdbi.v2.DBI;
import resources.InboxResource;
import resources.SenderResource;

/**
 * Created by thytran on 12/18/13.
 */
public class NotificationService extends Service<NotificationConfiguration> {
    public static void main(String[] args) throws Exception {
        new NotificationService().run(args);
    }
    @Override
    public void initialize(Bootstrap<NotificationConfiguration> bootstrap) {

    }

    @Override
    public void run(NotificationConfiguration conf, Environment env) throws Exception {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(env, conf.getDatabaseConfiguration(), "mysql");
        final dbDAO dao = jdbi.onDemand(dbDAO.class);
        Inbox inbox = new Inbox();
        env.addResource(new InboxResource(dao,inbox ));
        env.addResource(new SenderResource(inbox));
        env.addResource(new DatabaseHealthCheck(database)); // Needs work

    }
}
