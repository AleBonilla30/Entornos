import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancoTest {
@Test
public void testRetirar(){
    CuentaBanco cuenta= new CuentaBanco(1500, "abc123");
    int resultado= cuenta.retirar(500, "abc123");
    assertEquals(1000,resultado);
  }

    @Test
    public void testPasswordCorrecta(){
    CuentaBanco cuenta= new CuentaBanco(1500, "abc123");
    boolean resultado= cuenta.passwordCorrecta("abc123");
    assertTrue(resultado);
    }

}

   