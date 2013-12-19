package configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by thytran on 12/18/13.
 */
public class NotificationConfiguration extends Configuration {
   @Valid
   @NotNull
   @JsonProperty
   private DatabaseConfiguration database = new DatabaseConfiguration();
   public  DatabaseConfiguration getDatabaseConfiguration(){
       return database;
   }

}
