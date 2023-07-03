package hello.jdbc.exception;

public class CheckedTest {


    static class MyCheckedException extends Exception {
        public MyCheckedException(String message) {
            super(message);
        }
    }


    static class Service {
        Repository repository = new Repository();


        public void callCatch(){

        }

    }

    static class Repository{
        public void call() throws MyCheckedException {
            throw new MyCheckedException("ex");
        }
    }
}
