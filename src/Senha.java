
import java.util.Scanner;

public class Senha { // a estratégia usada foi dividir o código em duas partes: a lógica e a interação. onde a lógica é todo o sistema que tem por trás do código e a interação é tudo que o usuário vai interagir.
    public static void main(String[] args) { // método principal: cuida do fluxo de interação com o usuário (I/O)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha para avaliação: "); // solicita ao usuário a inserção da senha
        String senhaDigitada = scanner.nextLine();

        String resultado = avaliarSenha(senhaDigitada);
        System.out.println(resultado); 

        scanner.close();

    }

    public static String avaliarSenha(String senha) { // método responsável unicamente pela lógica de validação das regras de segurança
        if (senha.length() < 8) { // validação de comprimento mínimo (pelo menos 8 caracteres)
            
            return "DICA: A senha deve ter no minimo 8 caracteres."; // mensagem mostrada caso não haja 8 caracteres
        }
           boolean temNumero = false; // validação de inclusão de pelo menos um caractere numérico
           for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit (senha.charAt(i))) { // Character.isDigit verifica se o caractere atual é um dígito (0-9)
                temNumero = true;
                break; // encerra o laço assim que encontra o primeiro número
            }
        }
        if (!temNumero) {
            return "DICA: Adicione pelo menos um número à sua senha.";
        }
        String [] senhasObvias = {"12345678", "senha123", "admin123"}; // validação contra senhas comuns/óbvias (blacklist)
        for (int i = 0; i < senhasObvias.length; i++) {
            if(senha.equals(senhasObvias[i])) { // equals compara o conteúdo das duas Strings
                return "ALERTA: Esta senha é muito comum ou óbvia.";
            }
        }
        boolean temMaiuscula = false; // validação de inclusão de pelo menos uma letra maiúscula
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isUpperCase (senha.charAt(i))) { // Character.isUpperCase verifica se o caractere é uma letra maiúscula (A-Z)
                temMaiuscula = true;
                break;
            }
        }
        if (!temMaiuscula) {
            return "DICA: Adicione pelo menos uma letra maiúscula à sua senha.";
        }
            return "SUCESSO: Sua senha passou nos critérios básicos!";  // se a senha passar por todas as validações anteriores sem dar return, é aprovada            

    }
            
}
        
    

