package examen2_tylercruz;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios extends Persona implements Serializable{
    private String username;
    private String password;
    private ArrayList <Chats> listchat =  new ArrayList();
    private ArrayList <Usuarios> listamigos = new ArrayList();
    private ArrayList <Usuarios> listsolicitudes = new ArrayList();
    private int wifiquality;
    private static final long SerialVersionUID=106L;

    public Usuarios() {
    }

    public Usuarios(String username, String password, int wifiquality, String nombre, String apellido, String numeroCel) {
        super(nombre, apellido, numeroCel);
        this.username = username;
        this.password = password;
        this.wifiquality = wifiquality;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Chats> getListchat() {
        return listchat;
    }

    public void setListchat(ArrayList<Chats> listchat) {
        this.listchat = listchat;
    }

    public ArrayList<Usuarios> getListamigos() {
        return listamigos;
    }

//    public void setListamigos(ArrayList<Usuarios> listamigos) {
//        this.listamigos = listamigos;
//    }

    public int getWifiquality() {
        return wifiquality;
    }

    public void setWifiquality(int wifiquality) {
        this.wifiquality = wifiquality;
    }
    
    public void setListamigos(Usuarios u){
        listamigos.add(u);
    }

    public ArrayList getListsolicitudes() {
        return listsolicitudes;
    }

//    public void setListsolicitudes(ArrayList listsolicitudes) {
//        this.listsolicitudes = listsolicitudes;
//    }
    
    public void setListsolicitudes(Usuarios s){
        listsolicitudes.add(s);
    }
    
    @Override
    public int Enviar(int calidad){
        return ((int) ((calidad * 0.6) + (this.wifiquality * 0.9)));
    }

    @Override
    public String toString() {
        return "Usuarios{" + "username=" + username + ", password=" + password + ", listchat=" + listchat + ", listamigos=" + listamigos + ", listsolicitudes=" + listsolicitudes + ", wifiquality=" + wifiquality + '}';
    }

    
    
    
    
    
}
