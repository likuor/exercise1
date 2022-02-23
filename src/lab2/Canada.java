package lab2;

public class Canada {

    private final Province[] provinces;

    /**
     * default constructor
     */
    Canada(){
        this.provinces = new Province[10];
        provinces[0] = new Province("Ontario", "Toronto", 14_223_942);
        provinces[1] = new Province("Quebec", "Quebec City", 8_501_833);
        provinces[2] = new Province("British Columbia", "Victoria", 5_000_879);
        provinces[3] = new Province("Alberta", "Edmonton", 4_262_635);
        provinces[4] = new Province("Manitoba", "Winnipeg", 1_342_153);
        provinces[5] = new Province("Saskatchewan", "Regina", 	1_132_505);
        provinces[6] = new Province("Nova Scotia", "Halifax", 969_383);
        provinces[7] = new Province("New Brunswick", "Fredericton", 775_610);
        provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 510_550);
        provinces[9] = new Province("Prince Edward Island", "Charlottetown", 154_331);
    }

    /**
     * method to display all provinces' details
     */
    public void displayAllProvinces(){
        for (Province province: provinces) {
            System.out.println(province.getDetails());
        }
    }

    /**
     * method to return the number of province which has a certain population
     * @param min minimum number of population
     * @param max maximum number of population
     * @return the number of provinces which meets the condition
     */
    public int getNumOfProvincesBetween(int min, int max){
        int count = 0;
        min *= 1_000_000;
        max *= 1_000_000;
        for (int i = 0; i < 10; i++){
            if (provinces[i].getPopulation() >= min && provinces[i].getPopulation() <= max){
                count ++;
            }
        }
        return count;
    }
}
