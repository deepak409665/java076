public class UserDefineException {
    public void validate (int age )throws Invalidageexception{
        if(age<18)
            throw new Invalidageexception("cannot caste vote ,Age is less than 18");
            else
            System.out.println("Eligible to vote ");
        }
    }


