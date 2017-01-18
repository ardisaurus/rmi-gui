/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.gui;

import java.rmi.*;
import java.util.*;

public interface Chatting extends Remote
{
	public void sendPublicMessage(String keyword, String username, String message) throws RemoteException;
	public ArrayList getClientList() throws RemoteException;
	public void connect(String username) throws RemoteException;
	public void disconnect(String username) throws RemoteException;
}
