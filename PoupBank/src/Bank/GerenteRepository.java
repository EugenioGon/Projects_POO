package Bank;

import java.util.ArrayList;

public class GerenteRepository {
    
    java.util.ArrayList<Gerente> gerente = new ArrayList<>();
    
    public ArrayList<Gerente> addGerente() {
	
	gerente.add(new Gerente("eugeniogon","12345", "Eugenio", "12345", "Goncalves"));
	gerente.add(new Gerente("test","123", "", "", ""));
	
	return gerente;
    }

}
