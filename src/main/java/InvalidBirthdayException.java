public class InvalidBirthdayException extends Exception{
    public InvalidBirthdayException(int year, int month, int day) {
        super("Birthday '"+month+"-"+day+"-"+year+"' is invalid. Program Terminating.");
    }
}
