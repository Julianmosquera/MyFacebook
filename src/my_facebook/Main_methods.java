
package my_facebook;

import facebook4j.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author julian
 */
public class Main_methods {
    /*
    Creamos objeto de clase facebook
    */
    Facebook face = new FacebookFactory().getInstance();

    
    /*
    Para añadir un nuevo estado.
    */
    public void Post() throws FacebookException{    
   face.postStatusMessage("Hola");}
    
   /*
    Para postear una imagen 
    */
    
    public void Postimg() throws MalformedURLException, FacebookException{
     face.postLink(new URL("https://www.facebook.com/julian.mosquera.31/posts/864374793666574"));
    }
    
    /*
    Le damos a me gusta a un post con tal de añadir la ID
    */
    
    public void like() throws FacebookException{
        face.likePost("864374793666574");
    }
    /*
    Comenta una un post
    */
    
   public void Comentar() throws FacebookException{
        face.commentPhoto("851466124957441","probando cliente");
    }

    /*
    Metodo para coger la feed de los ultimos estados de tus amigos
    */
    public void feed() throws FacebookException{
        ResponseList<Post> feed = face.getHome();
    }

    /*
    Buscamos un usuario
    */
    public void tema() throws FacebookException{
        ResponseList<User> results = face.searchUsers("Rubn Srz");
    }

}
