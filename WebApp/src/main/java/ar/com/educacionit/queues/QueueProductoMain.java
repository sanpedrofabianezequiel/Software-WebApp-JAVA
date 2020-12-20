package ar.com.educacionit.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.ProductoServiceImpl;
import ar.com.educacionit.service.exception.ServiceException;

public class QueueProductoMain {

	public static void main(String[] args) throws ServiceException {
		
		ProductoService ps= new ProductoServiceImpl();
		
		Collection<Producto> productos=	ps.obtenerTodosProductos();
		
		//Cola FIFO
		Queue<Producto> idProductos= new PriorityQueue<Producto>();
		//Agregando elementos------------------------------------OFFER
		/*idProductos.offer(10);
		idProductos.offer(5);
		idProductos.offer(20);
		idProductos.offer(1);*/	
		//Recorrer elementos-------------------------------------
	//	idProductos.peek();//-Determinamos si hay un siguiente elemento--PEEK
	//	idProductos.poll();//Obtenemos el siguiente y lo quita de la COLA/PILA------POLL
		
		/*Iterator<Producto> it= idProductos.iterator();
		while(it.hasNext()) {
			System.out.println("El sigiente en la fila es "+ idProductos.peek());
			Integer idAtendido=	idProductos.poll();
			System.out.println("Se atendio: " + idAtendido+ "\n Quedan por atender: "+ idProductos.toString());//Recorremos para determina que queda dentro de la QUEUE
		}*/
		
		
		
		idProductos.addAll(productos);
		Iterator<Producto> it= idProductos.iterator();
		while(it.hasNext()) {
			System.out.println("El sigiente en la fila es "+ idProductos.peek());
			Producto prAtendido=	idProductos.poll();
			System.out.println("Se atendio: " + prAtendido+ "\n Quedan por atender: "+ idProductos.toString());//Recorremos para determina que queda dentro de la QUEUE
		}
		
	}

}
