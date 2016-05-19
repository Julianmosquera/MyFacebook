
package my_facebook;

import facebook4j.FacebookException;
import java.net.MalformedURLException;

/**
 *
 * @author julian
 * @version 1.0
 */
public class My_facebook {

    
    public static void main(String[] args) throws FacebookException, MalformedURLException {
        
        Main_methods m=new Main_methods();
        
        
        m.Post();
        m.feed();
        m.tema();
        m.like();
        m.Postimg();
        m.Comentar();
    }
    
}
