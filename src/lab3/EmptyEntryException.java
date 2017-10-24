
package lab3;

public class EmptyEntryException extends IllegalArgumentException{
    public static String errorMsg = "Name field cannot be empty or blank.";

    public EmptyEntryException() {
        super(errorMsg);
    }

    public EmptyEntryException(String s) {
        super(errorMsg);
    }

    public EmptyEntryException(String message, Throwable cause) {
        super(errorMsg, cause);
    }

    public EmptyEntryException(Throwable cause) {
        super(errorMsg, cause);
    }
    
}
