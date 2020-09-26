package examen2_tylercruz;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupo extends Chats implements Serializable{
    private String chatName;
    private ArrayList <Usuarios> listMiembros = new ArrayList();
    private Usuarios admin;
    private static final long SerialVersionUID=101L;

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

    public void setListMiembros(Usuarios u){
        listMiembros.add(u);
    }

    @Override
    public String toString() {
        return "Grupo{" + "chatName=" + chatName + ", listMiembros=" + listMiembros + ", admin=" + admin + '}';
    }
    
    
    
    
    
}
