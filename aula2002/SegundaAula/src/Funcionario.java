public class Funcionario {

    public static void main(String[] args) {
        Aluno aluno1, aluno2;
        
        // Instância do aluno
        aluno1 = new Aluno();

        // Atribuição valores a essa instância
        aluno1.ra = 123;
        aluno1.nome = "Lucas";
        aluno1.login = "lucas";
        aluno1.senha = "1234";

        // Invocar (chamar) o método matricular
        aluno1.matricular();

        // Criando uma nova instância de aluno
        aluno2 = new Aluno();

        // Atribuiu valores a essa nova instância
        aluno2.ra = 456;
        aluno2.nome = "Luiggi";
        aluno2.login = "luiggi";
        aluno2.senha = "5678";

        // Invocando o método matricular
        aluno2.matricular();

        // Invocando o método cancelar matrícula
        aluno1.cancelarMatricula();
    }
}
