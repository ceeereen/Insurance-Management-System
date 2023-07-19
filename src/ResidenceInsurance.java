import java.util.Date;

public class ResidenceInsurance extends  Insurance{
    public ResidenceInsurance(String insuranceName, double insurancePrice, Date startDate, Date endDate) {
        super(insuranceName, insurancePrice, startDate, endDate);
    }

    @Override
    public double calculate() {
        return  getInsurancePrice()*0.05;
    }
}
