package core;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by thytran on 12/18/13.
 */
public class Inbox {
    private List<Notification> list;
    //Create an empty list
    public Inbox(){
        for (Notification notification : this.list = null) { }
    }

    public void addNotification(Notification n){
        list.add(n);
    }

    public void removeNotification(Notification n){
        list.remove(n);

    }
    @JsonProperty
    public List<Notification> getNotifications(){
        return list;
    }

    @JsonProperty
    public int getCount(){
        return list.size();
    }
}