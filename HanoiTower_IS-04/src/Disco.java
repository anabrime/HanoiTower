import es.deusto.ingenieria.is.search.formulation.State;

/**
 * 
 */

/**
 * @author Jon y Ana
 *
 */
public class Disco extends State{

	private int tamanno; //prioridad
	private int nivel;	//en que nivel del sopote se encuentra







	public Disco(int tamanno, int nivel) {
		super();
		this.tamanno = tamanno;
		this.nivel = nivel;
	}

	public Disco() {
		super();
		// TODO Auto-generated constructor stub
		this.tamanno=0;
		this.nivel=0;
	}

	@Override
	public String toString() {
		return "Disco [tamanno=" + tamanno + ", nivel=" + nivel + "]";
	}

	public int getTamanno() {
		return tamanno;
	}

	public void setTamanno(int tamanno) {
		this.tamanno = tamanno;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}





	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if (arg0 != null && arg0 instanceof Disco) {
			Disco discoAux = (Disco)arg0;

			return this.tamanno == discoAux.tamanno && this.nivel == discoAux.nivel;
		} else {
			return false;
		}

	}


}
