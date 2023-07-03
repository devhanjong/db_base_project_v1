package hello.jdbc.repository.ex;

public class MyDuplicatekeyException extends MyDbException{

    public MyDuplicatekeyException() {
    }

    public MyDuplicatekeyException(String message) {
        super(message);
    }

    public MyDuplicatekeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicatekeyException(Throwable cause) {
        super(cause);
    }
}
