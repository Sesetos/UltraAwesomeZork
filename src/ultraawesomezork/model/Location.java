/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraawesomezork.model;

/**
 *
 * @author Giannis
 */
public class Location implements ILocation {
    
    private String locationName;
    private String locationDescr; // The description of the location
    
    public Location (){
        
    }
    
    /**
     * Full constructor
     * @param locationName
     * @param locationDescr
     */
    public Location(String locationName, String locationDescr){
        
        this.locationName = locationName;
        this.locationDescr = locationDescr;
    }
    
    /**
     * sets the name of the location
     * @param locationName
     */
    @Override
    public void setLocationName(String locationName){
        this.locationName = locationName;
    }
    
    /**
     * returns the name of the location
     * @return
     */
    @Override
    public String getLocationName(){
        return locationName;
    }
    
    /**
     * sets the description of the location
     * @param locationDescr
     */
    @Override
    public void setLocationDescr(String locationDescr){
        this.locationDescr = locationDescr;
    }
    
    /**
     * Returns the description of the location
     * @return
     */
    @Override
    public String getLocationDescr(){
        return locationDescr;
    }
}
