package resources;

import core.Notification;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import core.Inbox;
/**
 * Created by thytran on 12/18/13.
 */
@Path("/sender")
public class SenderResource {
    private Inbox inbox;
    public SenderResource(Inbox inbox){
        this.inbox = inbox;
    }

    @PUT
    public Response.ResponseBuilder replace(@PathParam("notifier") String notifier, @PathParam("content") String content,
                                            @Valid Notification notification){

           return Response.created(UriBuilder.fromResource(InboxResource.class).build());
    }

    @POST
    public Response add(@PathParam("notifier") String notifier,@PathParam("content") String content ,
                        @Valid Notification notification) {
        inbox.addNotification(notification);
        return Response.created(UriBuilder.fromResource(InboxResource.class).build();
    }
}
