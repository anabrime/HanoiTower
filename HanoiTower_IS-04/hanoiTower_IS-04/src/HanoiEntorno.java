import java.util.ArrayList;

import es.deusto.ingenieria.is.search.formulation.State;

/**
 * 
 */

/**
 * @author Jon y Ana
 *
 */
public class HanoiEntorno extends State  {

	private ArrayList<Soporte> soportes;
	private int numDiscos;



	public HanoiEntorno(int numSoportes, int numDiscos) {
		super();
		this.soportes = new ArrayList<>(numSoportes);
		this.numDiscos=numDiscos;
	}
	@Override
	public String toString() {
		return "Hanoi [soportes=" + soportes + "]";
	}
	public ArrayList<Soporte> getSoportes() {
		return soportes;
	}
	public void setSoportes(ArrayList<Soporte> soportes) {
		this.soportes = soportes;
	}
	public int getNumDiscos() {
		return numDiscos;
	}
	public void setNumDiscos(int numDiscos) {
		this.numDiscos = numDiscos;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		boolean esIgual=false;
		int contador=0;
		if (arg0 != null && arg0 instanceof HanoiEntorno) {
			HanoiEntorno hanoiEntornoAux = (HanoiEntorno)arg0;

			for (int i = 0; i < soportes.size(); i++) {

				Soporte soporte1= this.soportes.get(i);
				Soporte soporte2= hanoiEntornoAux.soportes.get(i);

				if (soporte1.equals(soporte2)) {
					contador++;
				}
			}
			if (contador==soportes.size()) {
				esIgual=true;
			}else esIgual=false;

		}
		return esIgual;


	}


}
