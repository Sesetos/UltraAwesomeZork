/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraawesomezork.view;

import ultraawesomezork.model.ILocation;
import ultraawesomezork.model.Location;

/**
 *
 * @author Giannis
 */
public class UltraAwesomeZork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ILocation loc1 = new Location("Main Entrance", "This is the main entrance. There is a big door going north");
        ILocation loc2 = new Location("Living room", "You are in the living room. The room is full of old furniture and dust. There is a door at the east side.");
        ILocation loc3 = new Location("Playroom", "This is the Playroom. There are a couple of wild dogs in here. They look really hungry. All of a sudden, the door closes behind you. Bye-bye!");
    }
    
}
