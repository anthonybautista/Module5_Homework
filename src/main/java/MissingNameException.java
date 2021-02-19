public class MissingNameException extends Exception{
    public MissingNameException(String nameType) {
        super(nameType+" cannot be blank. Program terminating.");
    }
}
