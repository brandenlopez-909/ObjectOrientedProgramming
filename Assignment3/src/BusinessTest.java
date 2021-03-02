//package businessadmin;

/**
 * Tests all leaf classes with two instances. 
 *
 */
public class BusinessTest {
	public static void main(String[] args) {
		//I need to create two instances of each leaf class 
		//To make this easier we will make arrays that will feed information into new constructors.
		
		
		Address myAddress = new Address(506, "Storke Rd" , "Goleta" , "Ca", "93107");
		Address trigoAddress = new Address(105, "Trigo Rd" , "Goleta" , "Ca", "93107");	
		
		//Full time salaried
		FullTimeSalaried branden = new FullTimeSalaried("Branden", "Lopez", myAddress , 31022678, 140000.0);
		branden.setSSN("123-45-6789");
		branden.introduce(true);
		System.out.println(branden.computePay(2));
		System.out.println();
		
		
		FullTimeSalaried talent = new FullTimeSalaried("Talent", "Wang", trigoAddress , 31022679, 90000.0);
		talent.setSSN("321-54-6789");
		talent.introduce(true);
		System.out.println(talent.computePay(2));
		System.out.println("***********************");
		System.out.println();
		
		
		//Full time hourly 
		FullTimeHourly fullHourlybranden = new FullTimeHourly("Branden", "Lopez", myAddress , 31022678, 45.0, 90);
		fullHourlybranden.setSSN("123-45-6789");
		fullHourlybranden.introduce(true);
		System.out.println(fullHourlybranden.computePay(42));
		System.out.println();
		
		
		FullTimeHourly fullHourlytalent = new FullTimeHourly("Talent", "Wang", trigoAddress , 31022679, 55.0, 110);
		fullHourlytalent.setSSN("321-54-6789");
		fullHourlytalent.introduce(true);
		System.out.println(fullHourlytalent.computePay(42));
		System.out.println("***********************");
		System.out.println();
		
		
		//Contractor 
		Contractor brandenContractor = new Contractor("Branden", "Lopez", myAddress , 31022678, 45.0);
		brandenContractor.setSSN("123-45-6789");
		brandenContractor.introduce(true);
		System.out.println(brandenContractor.computePay(42));
		System.out.println();
		
		
		Contractor talentContractor = new Contractor("Talent", "Wang", trigoAddress , 31022679, 55.0);
		talentContractor.setSSN("321-54-6789");
		talentContractor.introduce(true);
		System.out.println(talentContractor.computePay(42));
		System.out.println("***********************");
		System.out.println();
		
		//Part Time Hourly
		PartTimeHourly brandenPartTimeHourly = new PartTimeHourly("Branden", "Lopez", myAddress , 31022678, 45.0);
		brandenPartTimeHourly.setSSN("123-45-6789");
		brandenPartTimeHourly.introduce(true);
		System.out.println(brandenPartTimeHourly.computePay(39));
		System.out.println();
		
		
		PartTimeHourly talentPartTimeHourly = new PartTimeHourly("Talent", "Wang", trigoAddress , 31022679, 55.0);
		talentPartTimeHourly.setSSN("321-54-6789");
		talentPartTimeHourly.introduce(true);
		System.out.println(talentPartTimeHourly.computePay(42));
		System.out.println("***********************");
		System.out.println();
		
		
		//Executive
		Executive brandenExecutive = new Executive("Branden", "Lopez", myAddress , 31022678, 140000, 50000);
		brandenExecutive.setSSN("123-45-6789");
		brandenExecutive.introduce(true);
		System.out.println(brandenExecutive.computePay());
		System.out.println();
		
		
		Executive talentExecutive = new Executive("Talent", "Wang", trigoAddress , 31022679, 90000,30000);
		talentExecutive.setSSN("321-54-6789");
		talentExecutive.introduce(true);
		System.out.println(talentExecutive.computePay());
		System.out.println("***********************");
		System.out.println();

		
		//Customer
		Customer brandenCustomer = new Customer("Branden", "Lopez", myAddress , 31022678);
		brandenCustomer.setSSN("123-45-6789");
		brandenCustomer.introduce();
		brandenCustomer.setPayPreference("Tap");
		brandenCustomer.makePayment();
		System.out.println();
		
		
		Customer talentCustomer = new Customer("Talent", "Wang", trigoAddress , 31022679);
		talentCustomer.setSSN("321-54-6789");
		talentCustomer.introduce();
		talentCustomer.setPayPreference("Cash");
		talentCustomer.makePayment();
		System.out.println("***********************");
		System.out.println();
		


		
		

		
	}
}
