import java.util.Stack;

import es.deusto.ingenieria.is.search.formulation.State;

/**
 * 
 */

/**
 * @author Jon y Ana
 *
 */
public class Soporte extends State{

	private Stack<Disco> listaDiscos; //pila
	private int capacidadDiscos;
	private int id;





	public Soporte(Stack<Disco> listaDiscos, int capacidadDiscos, int id) {
		super();
		this.listaDiscos = listaDiscos;
		this.capacidadDiscos = capacidadDiscos;
		this.id = id;
	}
	public Soporte() {
		super();
		// TODO Auto-generated constructor stub
		this.listaDiscos= new Stack<>();
		this.id=0;
		this.capacidadDiscos=0;
	}
	@Override
	public String toString() {
		return "Soporte [Id= "+ id + ", listaDiscos=" + listaDiscos +"]";
	}
	public Stack<Disco> getListaDiscos() {
		return listaDiscos;
	}
	public void setListaDiscos(Stack<Disco> listaDiscos) {
		this.listaDiscos = listaDiscos;
	}
	public int getCapacidadDiscos() {
		return capacidadDiscos;
	}
	public void setCapacidadDiscos(int capacidadDiscos) {
		this.capacidadDiscos = capacidadDiscos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		boolean esIgual=false;
		int contador=0;	//numero de pares de discos iguales, soporte A con soporte B
		if (arg0 != null && arg0 instanceof Soporte) {
			Soporte soporteAux = (Soporte)arg0;

			if (this.listaDiscos.size()==soporteAux.listaDiscos.size()) {

				for (int i = 0; i < this.listaDiscos.size(); i++) {

					Disco disco1=this.listaDiscos.pop();
					Disco disco2=soporteAux.listaDiscos.pop();
					if (disco1.equals(disco2)) {
						contador++;
					}
				}
				if (contador==this.listaDiscos.size()) {
					esIgual=true;
				}
			}else esIgual=false;;
		}		
		return esIgual;

	}
}
