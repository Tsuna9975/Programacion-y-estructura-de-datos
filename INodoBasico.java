
import java.util.ArrayList;

public interface INodoBasico<E> 
{
	public E darElemento();

	public void agregarElemento(E p1,NodoPelicula<E> p);

	public E extraerElemento();
	
	public void cambiarElemento(E pElem);
	
	public boolean buscarElemento(E epElem);
	
	public NodoPelicula<E> darSiguiente();
	
	public void cambiarSiguiente(NodoPelicula<E> pSiguiente);


	
}
