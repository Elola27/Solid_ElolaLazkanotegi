package SRP;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		calculoVAT b=new calculoVAT();
		calculoDeduction c=new calculoDeduction();
// Dedukzioa kalkulatu
		billDeduction=c.calcDeduction(billAmount, deductionPercentage);
// VAT kalkulatzen dugu
		VAT =b.calcVAT(billAmount,(float)0.18);
// Totala kalkulatzen dugu
		if (code.compareTo("0")==0) {
			billTotal = (billAmount - billDeduction) + VAT;
		}else {
			billTotal= (billAmount-billDeduction);
		}
			
	}
}