public class Pessoa {
    public static boolean emailValid(String email) {
        //Deve-se verificar se existe o “@” no valor de entrada.
        //Deve-se verificar se o email possui no máximo 50 caracteres.
        boolean ok = email.indexOf("@") >=0 && email.length() <=50;
        return ok;
    }
}