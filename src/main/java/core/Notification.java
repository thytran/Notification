package core;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by thytran on 12/18/13.
 */
public class Notification {
    @Valid
    @NotNull
    @JsonProperty
    private String sender;

    @Valid
    @NotNull
    @JsonProperty
    String message;
    public Notification(String sender, String message){
        this.sender = sender;
        this.message = message;
    }

    public String getSender(){
        return sender;
    }
    public String getMessage(){
        return message;
    }

}
