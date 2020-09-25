package examen2_tylercruz;

import java.util.ArrayList;

public class Privado extends Chats{
    private ArrayList <Mensaje> listmsg = new ArrayList();
    private Usuarios usuario;

    public Privado() {
    }

    public Privado(Usuarios usuario) {
        super();
        this.usuario = usuario;
    }

    public ArrayList<Mensaje> getListmsg() {
        return listmsg;
    }

    public void setListmsg(ArrayList<Mensaje> listmsg) {
        this.listmsg = listmsg;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void setMensaje(Mensaje m){
        listmsg.add(m);
    }

    @Override
    public String toString() {
        return "Privado{" + "listmsg=" + listmsg + ", usuario=" + usuario + '}';
    }
    
}
