/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vatsalsmacbook
 */
public interface RPSIntf extends java.rmi.Remote{
//    handle global variables and caccept user inputs
    public String play(char handPlayed, int id) throws java.rmi.RemoteException;
    
////  Called after both user have given their input
//    public String result() throws java.rmi.RemoteException;
//    
}
