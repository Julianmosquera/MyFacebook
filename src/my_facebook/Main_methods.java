
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
    
    public void Postimg() throws MalformedURLException{
        PostUpdate post = .picture(new URL())
    }
    
    /*
    Le damos a me gusta a un post con tal de añadir la ID
    */
    
    public void like(){
        face.likePost(10153464860896846);
    }
    /*
    
    */
    
    public void Comentar(){
        face.commentPhoto(id, "LOCO");
    }

    /*
    Metodo para coger la feed de los ultimos estados de tus amigos
    */
    public void feed() throws FacebookException{
        ResponseList<Post> feed = face.getHome();
    }

    public void team() throws FacebookException{
        ResponseList<Post> results = face.searchPosts("LOL");
    }

}
