public interface Crud<T> {
    void criar(T entidade);
    T ler(int id);
    void editar(T entidade);
    void apagar(int id);
}


