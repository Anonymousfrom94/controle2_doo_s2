package modele;

import modele.Transport.Transport;

import java.util.ArrayList;

public class Ligne {

    private ArrayList<Station> stations;
    private Transport transport;

    public Ligne(ArrayList<Station> s, Transport t){
        stations = s;
        transport = t;
    }

    public int estPresent(Station s){
        for(int i = 0; i < stations.size(); i++){
            if (stations.get(i).getNom().equals(s.getNom())){
                return i;
            }
        }
        return -1;
    }

    public int tempsTrajet(Station s1, Station s2, int h){
        int indiceS1 = estPresent(s1);
        int indiceS2 = estPresent(s2);
        if (indiceS1 == -1 || indiceS2 == -1){
            return -1;
        }
        else {
            return transport.deplacement(indiceS1, indiceS2, h);
        }
    }
}
