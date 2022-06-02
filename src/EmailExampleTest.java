public class EmailExampleTest {
    private static final String[] validEmail = new String[]{"biendz2000@gmail.com"};
    private static final String[] invalidEmail = new String[]{"#@gmail.com"};

    public static void main(String[] args) {
    EmailExample emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " +email+ " is valid ->" +  isvalid);
        }
        for (String email: invalidEmail) {
            boolean isvslid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid -> " +  isvslid );
        }
    }
}