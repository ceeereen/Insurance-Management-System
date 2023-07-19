import java.util.ArrayList;

public class AddressManager {

    public  static  void addAddresstoUser(User user, Address address){
        if(user.getAddressList()!=null){
            user.getAddressList().add(address);
        }else{
            ArrayList<Address> addressList = new ArrayList<>();
            addressList.add(address);
            user.setAddressList(addressList);
        }
    }

    public  static  void  removeAddressFromUser(User user, Address address){
        if(user.getAddressList()!=null){
            user.getAddressList().remove(address);
        }else{
            System.out.println("There is no address in this list.");
        }
    }
}
