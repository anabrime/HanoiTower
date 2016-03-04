import es.deusto.ingenieria.is.search.formulation.Operator;
import es.deusto.ingenieria.is.search.formulation.State;

/**
 * 
 */

/**
 * @author Jon y Ana
 *
 */
public class MoverDisco extends Operator{

	private int idSoporteOrigen;
	private int idSoporteDestion;
	private int tamanoDisco; 
	
	
	
	public int getIdSoporteOrigen() {
		return idSoporteOrigen;
	}

	public void setIdSoporteOrigen(int idSoporteOrigen) {
		this.idSoporteOrigen = idSoporteOrigen;
	}

	public int getIdSoporteDestion() {
		return idSoporteDestion;
	}

	public void setIdSoporteDestion(int idSoporteDestion) {
		this.idSoporteDestion = idSoporteDestion;
	}

	public int getTamanoDisco() {
		return tamanoDisco;
	}

	public void setTamanoDisco(int tamanoDisco) {
		this.tamanoDisco = tamanoDisco;
	}

	@Override
	protected State effect(State arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isApplicable(State arg0) {
		// TODO Auto-generated method stub
		
		
		
		
		return false;
	}

	
	
	
}
