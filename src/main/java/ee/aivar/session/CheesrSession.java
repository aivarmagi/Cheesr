package ee.aivar.session;

import ee.aivar.Cart;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.request.Request;

/**
 * Created by magiiaiv on 18.11.2014.
 */
public class CheesrSession extends WebSession {
    private Cart cart = new Cart();

    protected CheesrSession(Request request){
        super(request);
    }

    public Cart getCart(){
        return cart;
    }
}
