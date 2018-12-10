package cs;

public interface CS {
	
	void transfert(PortFourniClient port, String message);
	void transfert(PortFourniServeur port, String message);
	void transfert(RoleFourniRPC role, String message);

}
