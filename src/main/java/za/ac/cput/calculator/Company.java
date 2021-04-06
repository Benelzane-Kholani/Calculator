/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.calculator;

/**
 *
 * @author HP
 */
public class Company {
    private String BuildName;
    private String RoomName;
    private String NumberSeat;

    public String getBuildName() {
        return BuildName;
    }

    public void setBuildName(String BuildName) {
        this.BuildName = BuildName;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public String getNumberSeat() {
        return NumberSeat;
    }

    public void setNumberSeat(String NumberSeat) {
        this.NumberSeat = NumberSeat;
    }
    
   @Override
    public String toString() {
        return "Company{" + "BuildName=" + BuildName + ", RoomName=" + RoomName + ", NumberSeat=" + NumberSeat + '}';
    }
    
}
