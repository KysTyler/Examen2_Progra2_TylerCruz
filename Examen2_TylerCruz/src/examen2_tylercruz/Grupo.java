package examen2_tylercruz;

import java.util.ArrayList;

public class Grupo extends Chats{
    private String chatName;
    private ArrayList <Usuarios> listMiembros = new ArrayList();
    private Usuarios admin;
    private ArrayList <Mensaje> listmsg = new ArrayList();

    public Grupo() {
    }

    public Grupo(String chatName, Usuarios admin) {
        super();
        this.chatName = chatName;
        this.admin = admin;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public ArrayList<Usuarios> getListMiembros() {
        return listMiembros;
    }

    public void setListMiembros(ArrayList<Usuarios> listMiembros) {
        this.listMiembros = listMiembros;
    }

    public Usuarios getAdmin() {
        return admin;
    }

    public void setAdmin(Usuarios admin) {
        this.admin = admin;
    }

    public ArrayList<Mensaje> getListmsg() {
        return listmsg;
    }

    public void setListmsg(ArrayList<Mensaje> listmsg) {
        this.listmsg = listmsg;
    }
    
    public void setListMiembros(Usuarios u){
        listMiembros.add(u);
    }
    
    public void setListmsg(Mensaje m){
        listmsg.add(m);
    }
    @Override
    public String toString() {
        return "Grupo{" + "chatName=" + chatName + ", listMiembros=" + listMiembros + ", admin=" + admin + ", listmsg=" + listmsg + '}';
    }
    
    
    
}
