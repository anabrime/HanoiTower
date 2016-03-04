import java.util.ArrayList;
import java.util.Stack;

import es.deusto.ingenieria.is.nqueens.formulation.MoveQueen;
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
		boolean isFinal=true;
		if (state != null && state instanceof HanoiEntorno) {
			HanoiEntorno hanoiEntorno = (HanoiEntorno)state;
			for (int i = 0; i < hanoiEntorno.getSoportes().size(); i++) {

				if (hanoiEntorno.getSoportes().get(i).getListaDiscos().size()==hanoiEntorno.getNumDiscos()) {
					//si un soporte tiene el mismo numero de discos que el numero total de discos
					Stack<Disco> listaDiscosTemp= new Stack<>();
					for (int j = 0; j < hanoiEntorno.getNumDiscos(); j++) {
						Disco discoTemp= new Disco(j, j);
						listaDiscosTemp.push(discoTemp);
					}
					Soporte soporteFinalIdeal= new Soporte(listaDiscosTemp, hanoiEntorno.getNumDiscos(), 25);
					if (soporteFinalIdeal.equals(hanoiEntorno.getSoportes().get(i))) {
						isFinal=true;
					}
				}
			}
		}
		return isFinal;
	}

	protected void createOperators() {
		for (int i=0; i<(this.numDiscos*this.numSoportes); i++) {
			this.addOperator(new MoverDisco()); //a medias
		}
	}
}
}
