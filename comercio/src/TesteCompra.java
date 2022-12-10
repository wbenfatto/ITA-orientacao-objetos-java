import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCompra {

    @Test
    public void compraAVista(){
        Compra c = new Compra(500);
        assertEquals(1, c.getNumeroParcelas());
        assertEquals(500, c.getValorTotal());
        assertEquals(500, c.getValorParcela());
    }

    @Test
    public void compraParcelada(){
        Compra c = new Compra(4, 1000);
        assertEquals(4, c.getNumeroParcelas());
        assertEquals(4000, c.getValorTotal());
        assertEquals(1000, c.getValorParcela());
    }
}
