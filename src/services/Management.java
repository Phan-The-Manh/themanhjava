package services;

public interface Management<T> {

    T findByID(long iD);

    void printList();

    void updateByID(long iD, T t);

    void add(T t);

    void delete(long id);
}
