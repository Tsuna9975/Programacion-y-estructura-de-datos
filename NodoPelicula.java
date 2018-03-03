
public class NodoPelicula<Pelicula> implements INodoBasico<Pelicula> {
	
	private Pelicula actual;
	private NodoPelicula<Pelicula> siguiente;
	
	public NodoPelicula(Pelicula p){
		actual=p;
		siguiente=null;
	}


	@Override
	public Pelicula darElemento() {
		return actual;
	}

	@Override
	public void agregarElemento(Pelicula p1,NodoPelicula<Pelicula> p) {
		actual=p1;
		siguiente=p;
	}

	@Override
	public Pelicula extraerElemento() {
		Pelicula a=actual;
		actual=null;
		return a;
	}

	@Override
	public void cambiarElemento(Pelicula pElem) {
		actual=pElem;
		
	}

	@Override
	public boolean buscarElemento(Pelicula epElem) {
		return false;
	}

	@Override
	public NodoPelicula<Pelicula> darSiguiente() {
		return siguiente;
	}

	@Override
	public void cambiarSiguiente(NodoPelicula<Pelicula> pSiguiente) {
		siguiente=pSiguiente;
	}



}
