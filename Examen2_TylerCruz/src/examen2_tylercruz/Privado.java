package examen2_tylercruz;

import java.io.Serializable;
import java.util.ArrayList;

public class Privado extends Chats implements Serializable{
    private Usuarios usuario;
    private static final long SerialVersionUID=104L;

    public Privado() {
    }

    public Privado(Usuarios usuario) {
        super();
        this.usuario = usuario;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Privado{" + "usuario=" + usuario + '}';
    }
    
    
}
