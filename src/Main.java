public class Main {
    public static void main(String[] args) {
         Country country =new Country("Kyrgyzstan",7000000,199900,"Кыргыз тили");
         Country country1 =new Country("Rossia",144200000,17100000,"Русский язык");
         Country country2 = new Country("USA",333300000,9834000,"English");
         Country [] countries=new Country[]{country,country1,country2};
         Country.getRezult(countries);
    }
}