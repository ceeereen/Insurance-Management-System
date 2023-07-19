import java.util.ArrayList;

public abstract class Account {

    private  String accountNumber;
    private  User user;

    private AuthenticationStatus authenticationStatus;

    private ArrayList<Insurance> insuranceList;

    public Account(String accountNumber, User user) {
        this.accountNumber = accountNumber;
        this.user = user;
    }

    public  void  login(String email, String password){
        if(email.equals(user.getEmail()) && password.equalsIgnoreCase(user.getPassword())){
            System.out.println("Successfull login: " + user.getName());
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else{
            System.out.println("Can not loggin.");
            this.authenticationStatus = AuthenticationStatus.FAIL;
        }
    }

    public abstract void addInsurancePolicy(Insurance insurance);

    public final  void  showUserInfo(){
        System.out.println("Name: " + user.getName() +
        "Surname: " + user.getSurname() +
        "Age: " + user.getAge() +
        "Address: " + user.getAddressList());
    }


}
