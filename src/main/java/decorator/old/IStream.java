package decorator.old;

public interface IStream {
    void read(int number);
    void seek(int position);
    void write(char data);
}
