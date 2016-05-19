
package my_facebook;

import facebook4j.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author julian
 */
public class Main_methods {
    /**
     * Creamos un obj de la clase facebook 
     */
    Facebook face = new FacebookFactory().getInstance();

    
    /**
     * Para poner un nuevo estado
     * @throws FacebookException 
     */
    public void Post() throws FacebookException{    
   face.postStatusMessage("Hola");}
    
  
    /**
     * Para postear una imagen
     * @throws MalformedURLException
     * @throws FacebookException 
     */
    public void Postimg() throws MalformedURLException, FacebookException{
     face.postLink(new URL("https://www.facebook.com/julian.mosquera.31/posts/864374793666574"));
    }
    
    /**
     * Metodo para darle like a mi post
     * @throws FacebookException 
     */
    
    public void like() throws FacebookException{
        face.likePost("864374793666574");
    }
   
    /**
     * comentar una foto
     * @throws FacebookException 
     */
   public void Comentar() throws FacebookException{
        face.commentPhoto("851466124957441","probando cliente");
    }

    /**
     * Metodo para coger la feed de los ultimos estados de tus amigos
     * @throws FacebookException 
     */
    
    
    public void feed() throws FacebookException{
        ResponseList<Post> feed = face.getHome();
    }

   /**
    * Buscamos un tema en concreto
    * @throws FacebookException 
    */
    public void tema() throws FacebookException{
        ResponseList<User> results = face.searchUsers("Rubn Srz");
    }

}
