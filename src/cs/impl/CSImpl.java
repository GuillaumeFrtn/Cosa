package cs.impl;

import java.util.HashMap;

import cs.AttachClientrpc;
import cs.AttachServeurrpc;
import cs.Client;
import cs.PortFourniClient;
import cs.PortFourniServeur;
import cs.RPC;
import cs.RoleFourniRPC;
import cs.Serveur;

public class CSImpl implements cs.CS {
	
	Client client;
	AttachClientrpc attachClientRPC;
	RPC rpc;
	AttachServeurrpc attachServeurRPC;
	Serveur serveur;
	
	HashMap<RoleFourniRPC, AttachClientrpc> rolesCorrespondanceClient;
	HashMap<RoleFourniRPC, AttachServeurrpc> rolesCorrespondanceServeur;
	
	public CSImpl()
	{
		client = new ClientImpl(this);
		rpc = new RPCImpl(this);
		serveur = new ServeurImpl(this);
		attachClientRPC = new AttachClientrpcImpl(rpc.getRolefourniclient(), client.getPortrequisclient(), client.getPortfournisclient(), rpc.getRolerequisclient());
		attachServeurRPC = new AttachServeurrpcImpl(serveur.getPortrequisserveur(), rpc.getRolefourniserveur(), rpc.getRolerequisserveur(), serveur.getPortfourniserveur());
		
		rolesCorrespondanceClient = new HashMap<RoleFourniRPC, AttachClientrpc>();
		rolesCorrespondanceServeur = new HashMap<RoleFourniRPC, AttachServeurrpc>();
		
		rolesCorrespondanceClient.put(rpc.getRolefourniclient(), attachClientRPC);
		rolesCorrespondanceServeur.put(rpc.getRolefourniserveur(), attachServeurRPC);
		
	}
	
	public void transfert(PortFourniClient port, String message)
	{
		attachClientRPC.getCorrespondance(port).notifyRPC(message);
	}
	
	public void transfert(PortFourniServeur port, String message)
	{
		attachServeurRPC.getCorrespondance(port).notifyRPC(message);
	}
	
	public void transfert(RoleFourniRPC role, String message)
	{
		if(rolesCorrespondanceClient.containsKey(role))
		{
			attachClientRPC.getCorrespondance(role).notifyClient(message);
		}
		else if (rolesCorrespondanceServeur.containsKey(role))
		{
			attachServeurRPC.getCorrespondance(role).notifyServeur(message);
		}
	}

}
