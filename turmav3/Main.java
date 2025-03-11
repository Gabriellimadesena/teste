public class Main {
    public static void main(String[] args) {
        AlunoCrud alunoCrud = new AlunoCrud();
        alunoCrud.criar(new Aluno(1, "João"));
        System.out.println("Aluno lido: " + alunoCrud.ler(1).getNome());

       
        Aluno alunoEditado = new Aluno(1, "João Silva");
        alunoCrud.editar(alunoEditado);
        System.out.println("Aluno atualizado: " + alunoCrud.ler(1).getNome());

        alunoCrud.apagar(1);
        System.out.println("Tentando ler aluno apagado: " + alunoCrud.ler(1));

        TurmaCrud turmaCrud = new TurmaCrud();
        turmaCrud.criar(new Turma(101, "Turma A"));
        System.out.println("Turma lida: " + turmaCrud.ler(101).getNome());

        
        Turma turmaEditada = new Turma(101, "Turma Avançada");
        turmaCrud.editar(turmaEditada);
        System.out.println("Turma atualizada: " + turmaCrud.ler(101).getNome());

       
        turmaCrud.apagar(101);
        System.out.println("Tentando ler turma apagada: " + turmaCrud.ler(101));
    }

    //Sacanagem
}

