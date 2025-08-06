import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteEmail {

     //testar_email_com_arroba deve verificar se o método emailValid() ao receber como parametro “email_teste@dominio.com.br” retorna true - utilize assertTrue
    @Test
    void testar_email_com_arroba() {
         assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    //testar_email_sem_arroba deve verificar se o método emailValid() ao receber como parametro “email_testedominio.com.br” deve testar - utilize assertFalse
    @Test
    void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }


    //testar_email_mais_50_caracteres deve verificar se o método emailValid() ao receber como parametro “email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br” retorna false testar com assertEquals.
    @Test
    void testar_email_mais_50_caracteres() {
        assertEquals(false,Pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }

}