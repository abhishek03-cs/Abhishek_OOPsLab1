import java.util.Random;

public class CredentialService {
    private String email;
    private String password;
    private Employee employee;

    CredentialService(Employee employee){
        this.employee= employee;
    }


    public  void generateEmail(){
        email = employee.getFirstName()+employee.getLastName()+"@"+employee.getDepartment()+".tataelxsi.com";
    }

    public void generatePassword(){
        String upperLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetter= "abcdefghijklmnopqrst";
        String numbers =  "0123456789";
        String specialChar = "!@#$%^&*()?";
        Random random = new Random();
        String root=upperLetter+numbers+specialChar+lowerLetter;
        char[] passwordArray = new char[15];
        for(int i=0;i<15;i++){
            passwordArray[i]=root.charAt(random.nextInt(root.length()));
        }
        password=new String(passwordArray);


    }

    public void showCredential(){
        System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
        System.out.println("Email --->"+ " "+email);
        System.out.println("Password --->"+ " "+password);
    }
}
