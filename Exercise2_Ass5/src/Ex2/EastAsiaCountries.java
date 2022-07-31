package Ex2;
public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-20s%-20s%-20.0f%-20s\n",super.getCountryCode(),super.getCountryName(),super.getTotalArea(),this.countryTerrain);
    }

    @Override
    public int compareTo(EastAsiaCountries o) {
        return this.getCountryName().compareToIgnoreCase(o.getCountryName());
    }
}
