import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class LambdaFunctions {
    public static String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
    public static String REGEX_EMAIL = "^[a-zA-Z0-9]+([.#_$+-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";
    public static String REGEX_MOBILENUM = "^(91)?\\s{0,2}[0-9]{10}$";
    public static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";

    public static Predicate<String> validateUserName = name -> Pattern.matches(FIRST_NAME, name);
    public static Predicate<String> validateEmail = email -> Pattern.matches(REGEX_EMAIL, email);
    public static Predicate<String> validatePnNo = phNo -> Pattern.matches(REGEX_MOBILENUM, phNo);
    public static Predicate<String> validatePassword = password -> Pattern.matches(REGEX_PASSWORD, password);
    Scanner sc = new Scanner(System.in);

    public void validateFirstName() {
        System.out.println("Enter Name Start with Capital :");
        String Name = sc.nextLine();
        if (validateUserName.test(Name))
            System.out.println("Name is Vaild");
        else
            System.out.println("Name is Not Vaild");
    }

    public void validateLastName() {
        validateFirstName();
    }

    public void validateEmail() {
        System.out.println("Enter email :");
        String email = sc.nextLine();
        if (validateEmail.test(email))
            System.out.println("email is Vaild");
        else
            System.out.println("email is Not Vaild");
    }

    public void validatePhnNum() {
        System.out.println("Enter Pho No :");
        String phoneNo = sc.nextLine();
        if (validatePnNo.test(phoneNo))
            System.out.println("Phone number is Vaild");
        else
            System.out.println("Phone number is Not Vaild");
    }

    public void validatePassword() {
        System.out.println("Enter Password :");
        String phoneNo = sc.nextLine();
        if (validatePassword.test(phoneNo))
            System.out.println("Password is Vaild");
        else
            System.out.println("Password is Not Vaild");
    }
}
