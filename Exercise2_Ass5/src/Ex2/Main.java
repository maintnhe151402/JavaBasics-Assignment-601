package Ex2;

public class Main {

    public static void main(String[] args) throws Exception {
	
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        int i;
        do {
        	System.out.println("=====MENU=====");
            System.out.println("1. Enter the information for 11 countries in Southeast Asia.");
            System.out.println("2. Display the information of country you've just input.");
            System.out.println("3. Search the information of country by user-entered name.");
            System.out.println("4. Display the information of countries sorted namw in ascending order.");
            System.out.println("5. Exit.");
            i = Utility.GetInt("Please choice one option: " , 1 , 5);
            switch (i){
                case 1:
                	if (mn.getListAsiaCountry().size()==11) {
                		System.out.println("Asia has only 11 countries");
                	}
                	else {
                		String code = Utility.GetString("Enter country code: ", false);
            			if (mn.SearchByID(mn.getListAsiaCountry(), code) >= 0) {
            				System.out.println("This country is exist");
            				break;}
            			String name = Utility.GetString("Enter country name: ", false);
            			float area = (float) Utility.GetDouble("Enter total area:  ", 0, Double.POSITIVE_INFINITY);
            			String terrain = Utility.GetString("Enter terrain of country: ", false);
            			EastAsiaCountries country=new EastAsiaCountries(code, name, area, terrain);
            			mn.addCountryInformation(country);                           
					}
                    break;
                case 2:
                    mn.getRecentlyEnteredInformation();
                    break;
                case 3:
            		String name = Utility.GetString("Enter the name you want to search for: ", false);
                    mn.searchInformationByName(name);
                    break;
                case 4:
                	mn.sortInformationByAscendingOrder();
                    break;
                case 5:
                    break;
            }
        }while (i != 5);
    }
}
