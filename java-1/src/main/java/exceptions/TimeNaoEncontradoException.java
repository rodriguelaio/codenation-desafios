package exceptions;

public class TimeNaoEncontradoException extends RuntimeException {
    public TimeNaoEncontradoException(String msg){
        super(msg);
    }
}
