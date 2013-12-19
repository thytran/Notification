package resources;
/**
 * Created by thytran on 12/18/13.
 */
import com.yammer.dropwizard.jersey.params.IntParam;
import core.Inbox;
import core.Notification;
import database.NotificationDAO;
import database.dbDAO;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.util.List;


@Path("/Inbox")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InboxResource {
    private final Inbox inbox;

    public InboxResource(dbDAO dao,Inbox inbox){

        this.inbox = inbox;
    }

    @GET
    public int getNumberOfNotifications() {
        return inbox.getCount();

    }

    @DELETE
    public Response remove(@PathParam("notifier") String notifier){

    }

}
