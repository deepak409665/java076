public class MynewException {
    public static void main(String[] args) {
        UserDefineException udf = new UserDefineException();
        try {
            udf.validate(20);
        }
        catch (Invalidageexception e){
            System.out.println(e.getMessage());
        }
    }
}
