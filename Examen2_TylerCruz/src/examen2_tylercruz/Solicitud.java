package examen2_tylercruz;

public class Solicitud {
    private String sender;
    private Usuarios user;

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
