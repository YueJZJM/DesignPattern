package decorator.old;

public class NetworkStream implements IStream {
    public void read(int number) {
        System.out.println("NetworkStream.read:" + number);
    }

    public void seek(int position) {
        System.out.println("NetworkStream.seek:" + position);
    }

    public void write(char data) {
        System.out.println("NetworkStream.write:" + data);
    }
}
