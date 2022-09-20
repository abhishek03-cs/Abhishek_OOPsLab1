import java.util.Scanner;

public class CredentialGeneratorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int a =scanner.nextInt();
        Employee employee = new Employee("abhishek","tiwari");

        switch (a){
            case 1:
                employee.setDepartMent("tech");
                break;
            case 2:
                employee.setDepartMent("admin");
                break;
            case 3:
                employee.setDepartMent("hr");
                break;
            case 4:
                employee.setDepartMent("legal");
                break;
            default:
                break;

        }

        CredentialService credentialService = new CredentialService(employee);
        credentialService.generateEmail();
        credentialService.generatePassword();
        credentialService.showCredential();


    }
}
