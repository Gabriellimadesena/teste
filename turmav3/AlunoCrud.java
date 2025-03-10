import java.util.HashMap;
import java.util.Map;

public class AlunoCrud implements Crud<Aluno> {
    private Map<Integer, Aluno> alunos = new HashMap<>();

    @Override
    public void criar(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
        System.out.println("Aluno criado: " + aluno.getNome());
    }

    @Override
    public Aluno ler(int id) {
        return alunos.get(id);
    }

    @Override
    public void editar(Aluno aluno) {
        if (alunos.containsKey(aluno.getId())) {
            alunos.put(aluno.getId(), aluno);
            System.out.println("Aluno atualizado: " + aluno.getNome());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    @Override
    public void apagar(int id) {
        if (alunos.containsKey(id)) {
            alunos.remove(id);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
