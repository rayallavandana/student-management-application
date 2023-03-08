public class NoSuchStudentException extends RuntimeException {
    public NoSuchStudentException(int id) {
        super(String.format("there is no such diary entry with id :" + id));
    }

}
