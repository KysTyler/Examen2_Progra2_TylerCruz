package examen2_tylercruz;

import java.io.Serializable;

public class Solicitud implements Serializable{
    private String sender;
    private Usuarios user;
    private static final long SerialVersionUID=105L;

    public Solicitud() {
    }

    public Solicitud(String sender, Usuarios user) {
        this.sender = sender;
        this.user = user;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "sender=" + sender + ", user=" + user + '}';
    }
    
    
}
