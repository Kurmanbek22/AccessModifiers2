public class Country {
    private  String countryName;
    private  int population;
    private  int area;
    private String lenguage;

    public Country() {
    }

    public Country(String countryName, int population, int area, String lenguage) {
        this.countryName = countryName;
        this.population = population;
        this.area = area;
        this.lenguage = lenguage;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }
    public  static  void getRezult(Country [] countries){
        int area1 =0;
        int count=0;
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].area>area1){
                area1=countries[i].area;
                count=i;
            }
        }
        System.out.println(countries[count]);

    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", lenguage='" + lenguage + '\'' +
                '}';
    }
}
