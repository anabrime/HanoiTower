import java.util.ArrayList;

import es.deusto.ingenieria.is.search.formulation.Problem;
import es.deusto.ingenieria.is.search.formulation.State;

/**
 * 
 */

/**
 * @author Jon y Ana
 *
 */
public class HanoiProblema extends Problem {

	private int numSoportes;
	private int numDiscos;




	public int getNumSoportes() {
		return numSoportes;
	}
	public void setNumSoportes(int numSoportes) {
		this.numSoportes = numSoportes;
	}
	public int getNumDiscos() {
		return numDiscos;
	}
	public void setNumDiscos(int numDiscos) {
		this.numDiscos = numDiscos;
	}

	@Override
	public State gatherInitialPercepts() {
		// TODO Auto-generated method stub
		return new HanoiEntorno(this.numSoportes,this.numSoportes);

	}


	public boolean isFinalState(State state) {
		if (state != null && state instanceof HanoiEntorno) {
			HanoiEntorno hanoiEntorno = (HanoiEntorno)state;
			HanoiEntorno hanoiEntornoFinal= new HanoiEntorno(numSoportes, numDiscos);


		} else {
			return false;
		}
	}


}
