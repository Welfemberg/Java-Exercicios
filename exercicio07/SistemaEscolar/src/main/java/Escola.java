import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Pessoa> pessoas;

    public Escola() {
        pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);

    }

    public void listarPessoas() {

        for (Pessoa individuo : pessoas) {
            System.out.println(individuo.getTipo());
            individuo.apresentar();

        }
    }

}
