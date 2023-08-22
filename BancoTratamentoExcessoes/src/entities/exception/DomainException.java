package entities.exception;

public class DomainException extends RuntimeException {

    private static final long serialVerstionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
