public class IndividualAccount extends  Account{
    public IndividualAccount(String accountNumber, User user) {
        super(accountNumber, user);
    }

    @Override
    public  void addInsurancePolicy(Insurance insurance) {

        // Bireysel müşteri için sigorta eklemek ve fiyatı hesaplamak için gerekli işlemleri yapın.
        // Burada belirli bir formül kullanarak kar marjını uygulayabilirsiniz.
        // Örnek olarak sigorta ücretine %5 kar marjı ekleyin.
        double finalInsurancePrice = insurance.getInsurancePrice() + (insurance.getInsurancePrice() * 0.05);
        // Sigortayı listenize veya yapınıza ekleyin.
    }
}

