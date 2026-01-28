public class main {
    public static void main(String[] args) {

        Escola escolaNovoAprendizado = new Escola();

        Aluno aluno1 = new Aluno("Berg", 33, 9.0);
        Aluno aluno2 = new Aluno("Nathália", 35, 9.0);
        Aluno aluno3 = new Aluno("Silva", 40, 8.0);

        Professor professor1 = new Professor("Júnior", 50, "Matemática");
        Professor professor2 = new Professor("Maria", 48, "Inglês");

        escolaNovoAprendizado.adicionarPessoa(aluno1);
        escolaNovoAprendizado.adicionarPessoa(aluno2);
        escolaNovoAprendizado.adicionarPessoa(aluno3);

        escolaNovoAprendizado.adicionarPessoa(professor1);
        escolaNovoAprendizado.adicionarPessoa(professor2);

    escolaNovoAprendizado.listarPessoas();


    }
}
