package Day36;

public class Employee {

    private int baseSalary ;                // private sonradan yazdik. neden? eger user negatif rakam yazarsa kod karismasin diye.
    private int hourlyRate ;



    public int calculateWage (int extraHours){          //int extraHours line 7 deydi. degisikllik yaptik
        return baseSalary + (hourlyRate * extraHours);
    }

    public int getBaseSalary(){
        return baseSalary;
    }


    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Base salary can not be equal or less than 0 ");
        }
        this.baseSalary= baseSalary;
    }
    public int getHourlyRate(){

        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate){

        if(hourlyRate <= 0){
            throw new IllegalArgumentException("Hourly rate cannot be equal or less than 0");
        }
        this.hourlyRate = hourlyRate;
    }
}
// using getter and setter metotlari private olan siniflarda ayarlandiginda,
// sinif disindan cagirirken bize yardimci olurlar. ama o sinifta olusturduktan sonra