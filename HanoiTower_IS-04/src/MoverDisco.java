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

	private Soporte soporteOrigen;
	private Soporte soporteDestion;
	private int tamanoDisco; 








	public MoverDisco() {
		super();
		// TODO Auto-generated constructor stub


	}

	public MoverDisco(Soporte soporteOrigen, Soporte soporteDestion) {
		super();
		this.soporteOrigen = soporteOrigen;
		this.soporteDestion = soporteDestion;

		Disco discoTemp=this.soporteOrigen.getListaDiscos().pop();
		this.soporteDestion.getListaDiscos().push(discoTemp);

	}






	public Soporte getSoporteOrigen() {
		return soporteOrigen;
	}

	public void setSoporteOrigen(Soporte soporteOrigen) {
		this.soporteOrigen = soporteOrigen;
	}

	public Soporte getSoporteDestion() {
		return soporteDestion;
	}

	public void setSoporteDestion(Soporte soporteDestion) {
		this.soporteDestion = soporteDestion;
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
		//creas un disco temporal, el cual es el que coges del soporte origen y lo colocas en el soporte destino
		HanoiEntorno entornoTemp = (HanoiEntorno)arg0;
		Disco discoTemp= new Disco();
		int i=0,  j=0;
		do{
			i++;		
		}while(entornoTemp.getSoportes().get(i).equals(this.soporteOrigen));

		do{
			j++;		
		}while(entornoTemp.getSoportes().get(j).equals(this.soporteDestion));

		
		
		discoTemp=entornoTemp.getSoportes().get(i).getListaDiscos().pop();
		entornoTemp.getSoportes().get(j).getListaDiscos().push(discoTemp);
		return entornoTemp;
	}

	@Override
	protected boolean isApplicable(State arg0) {
		// TODO Auto-generated method stub
		HanoiEntorno entornoTemp = (HanoiEntorno)arg0;

		boolean isApplicable=false;

		int i=0,  j=0;
		do{
			i++;		
		}while(entornoTemp.getSoportes().get(i).equals(this.soporteOrigen));

		do{
			j++;		
		}while(entornoTemp.getSoportes().get(j).equals(this.soporteDestion));



		// si tamanodisco =  al disco que esta mas arriba del soporte origen
		//si tamanodisco < tamano disco del mas arriba del soporte de destino


		if (this.tamanoDisco== entornoTemp.getSoportes().get(i).getListaDiscos().peek().getTamanno()) {
			if (this.tamanoDisco < entornoTemp.getSoportes().get(j).getListaDiscos().peek().getTamanno()) {
				isApplicable=true;
			}
		}
		return isApplicable;		

	}


}
