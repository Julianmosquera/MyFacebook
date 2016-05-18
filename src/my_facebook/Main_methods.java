
package my_facebook;

import facebook4j.*;

/**
 *
 * @author julian
 */
public class Main_methods {
    Facebook face = new FacebookFactory().getInstance();

    
    /*
    Para añadir un nuevo estado.
    */
    public void Post() throws FacebookException{    
   face.postStatusMessage("Hola");}
    
    /*
    Le damos a me gusta a un post con tal de añadir la ID
    */
    
    public void like(){
        face.likePost(10153464860896846);
    }
    /*
    
    */
    
    public void Comentar(){
        face.commentPhoto(photoId, "LOCO");
    }




}
