import java.util.HashMap;
import java.util.Map;

public class TurmaCrud implements Crud<Turma> {
    private Map<Integer, Turma> turmas = new HashMap<>();

    @Override
    public void criar(Turma turma) {
        turmas.put(turma.getId(), turma);
        System.out.println("Turma criada: " + turma.getNome());
    }

    @Override
    public Turma ler(int id) {
        return turmas.get(id);
    }

    @Override
    public void editar(Turma turma) {
        if (turmas.containsKey(turma.getId())) {
            turmas.put(turma.getId(), turma);
            System.out.println("Turma atualizada: " + turma.getNome());
        } else {
            System.out.println("Turma não encontrada.");
        }
    }

    @Override
    public void apagar(int id) {
        if (turmas.containsKey(id)) {
            turmas.remove(id);
            System.out.println("Turma removida.");
        } else {
            System.out.println("Turma não encontrada.");
        }
    }
}

