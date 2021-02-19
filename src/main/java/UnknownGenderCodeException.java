public class UnknownGenderCodeException extends Exception{
    public UnknownGenderCodeException(char genderCode) {
        super("Gender code '"+genderCode+"' is invalid. Program terminating.");
    }
}
