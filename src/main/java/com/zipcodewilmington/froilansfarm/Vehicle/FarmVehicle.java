package com.zipcodewilmington.froilansfarm.Vehicle;

public class FarmVehicle implements Vehicle{
    String onFarm;
    String offFarm;
    String location;

    public FarmVehicle(){
        onFarm="On Farm";
        offFarm= "Off Farm";
        location ="";
    }
    public void setLocation(String expected){ this.location=location;
    }

    public String getLocation() {
        return this.location;
    }

    public Boolean operation(String location){
        boolean canOperate;
        if(location==onFarm){
            return canOperate=true;
        }return canOperate=false;
    }

    @Override
    public String noiseMaker() {
        return null;
    }

    @Override
    public boolean hasBeenRiden() {
        return false;
    }
}