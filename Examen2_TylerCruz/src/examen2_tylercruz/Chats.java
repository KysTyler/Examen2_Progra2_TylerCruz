package examen2_tylercruz;

import java.util.ArrayList;

public class Chats {
    private ArrayList <Mensaje> listmsg = new ArrayList();
    public Chats() {
    }

    public ArrayList<Mensaje> getListmsg() {
        return listmsg;
    }

    public void setListmsg(ArrayList<Mensaje> listmsg) {
        this.listmsg = listmsg;
    }
    
    public void setListmsg(Mensaje m){
        listmsg.add(m);
    }
    @Override
    public String toString() {
        return "Chats{" + "listmsg=" + listmsg + '}';
    }
    
    
}
