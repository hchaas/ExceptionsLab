
package lab3;


public class InvalidNameEntryException extends IllegalArgumentException{
    public static String errorMsg = "Name must be two words and not contain a comma.";

    public InvalidNameEntryException() {
        super(errorMsg);
    }

    public InvalidNameEntryException(String s) {
        super(errorMsg);
    }

    public InvalidNameEntryException(String message, Throwable cause) {
        super(errorMsg, cause);
    }

    public InvalidNameEntryException(Throwable cause) {
        super(errorMsg, cause);
    }
    
}
