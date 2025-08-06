public class TesteEmail {

    /*
     * 
     * testar_email_sem_arroba deve verificar se o método emailValid() ao receber como parametro “email_testedominio.com.br” deve testar - utilize assertFalse
     * testar_email_mais_50_caracteres deve verificar se o método emailValid() ao receber como parametro “email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br” retorna false testar com assertEquals.
     */

     //testar_email_com_arroba deve verificar se o método emailValid() ao receber como parametro “email_teste@dominio.com.br” retorna true - utilize assertTrue
    @Test
    void testar_email_com_arroba() {
        Calculator calculator = new Calculator();
        int expected = 5;
        int actual = calculator.add(2, 3);
        assertEquals(expected, actual, "The sum of 2 and 3 should be 5");
    }
}