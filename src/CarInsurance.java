import java.util.Date;

public class CarInsurance extends  Insurance{
    public CarInsurance(String insuranceName, double insurancePrice, Date startDate, Date endDate) {
        super(insuranceName, insurancePrice, startDate, endDate);
    }

    @Override
    public double calculate() {

        return  getInsurancePrice()*0.05;
    }
}
