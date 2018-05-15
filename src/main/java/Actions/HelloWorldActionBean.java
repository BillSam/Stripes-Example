package Actions;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/hello")
public class HelloWorldActionBean extends BaseAction {

    private String message;


    @DefaultHandler
    public Resolution sayHello(){
        message = "Hello Stripes";

        return new ForwardResolution("hello.jsp");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
