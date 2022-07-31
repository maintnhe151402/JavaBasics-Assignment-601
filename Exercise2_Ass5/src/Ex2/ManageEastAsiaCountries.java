package Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class ManageEastAsiaCountries {
	private ArrayList<EastAsiaCountries> listAsiaCountry = new ArrayList<>();
	
	public ArrayList<EastAsiaCountries> getListAsiaCountry() {
		return listAsiaCountry;
	}
	public void setListAsiaCountry(ArrayList<EastAsiaCountries> listAsiaCountry) {
		this.listAsiaCountry = listAsiaCountry;
	}
	boolean check() {
		if (listAsiaCountry.size()!=0) return true;
		System.out.println("No country in list Asia country.");
		return false;
	}
	public int SearchByID(ArrayList<EastAsiaCountries> asiaC, String code) {
		for (int i = 0; i < asiaC.size(); i++) {
			if (asiaC.get(i).getCountryCode().equalsIgnoreCase(code)) {
				return i;
			}
		}
		return -1;
	}

	public void addCountryInformation(EastAsiaCountries country) throws Exception {
			listAsiaCountry.add(country);
	}

	public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
		if(!check()) return null;
		System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Area", "Terrain");
		listAsiaCountry.get(listAsiaCountry.size() - 1).display();
		return listAsiaCountry.get(listAsiaCountry.size() - 1);
	}

	public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
		EastAsiaCountries[] searchedList = new EastAsiaCountries[11];
		int i = 0;
		for (EastAsiaCountries entry : listAsiaCountry) {
			if (entry.getCountryName().toLowerCase().contains(name.toLowerCase())) {
				searchedList[i] = entry;
				i++;
			}
		}
		return searchedList;
	}

	public EastAsiaCountries[]sortInformationByAscendingOrder() throws Exception{
		System.out.printf("%-20s%-20s%-20s%-20s\n", "ID", "Name", "Area", "Terrain");
		ArrayList<EastAsiaCountries> temp = new ArrayList<>(listAsiaCountry);
		EastAsiaCountries[] sortedList= new EastAsiaCountries[listAsiaCountry.size()];
		Collections.sort(temp);
		for (int i=0;i<temp.size();i++) {
			sortedList[i]=temp.get(i);
			sortedList[i].display();
		}
		return sortedList;
	}
}
