import java.util.Date;

public class TravelInsurance extends  Insurance{
    public TravelInsurance(String insuranceName, double insurancePrice, Date startDate, Date endDate) {
        super(insuranceName, insurancePrice, startDate, endDate);
    }

    @Override
    public double calculate() {

        return  getInsurancePrice()*0.05;
    }
}
