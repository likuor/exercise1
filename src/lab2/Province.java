package lab2;

public class Province {

    private String province;
    private String capital;
    private long population;

    static String[] provinces = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
                                 "Nova Scotia", "New Brunswick","Newfoundland and Labrador", "Prince Edward Island"};
    static String[] capitals = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina",
                                "Halifax", "Fredericton", "St. John's", "Charlottetown"};

    public static final long MINIMUM_POPULATION = 30_000;
    public static final long MAXIMUM_POPULATION = 15_000_000;
    public static final long DEFAULT_POPULATION = 4_648_055;
    public static final String DEFAULT_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";

    /**
     * constructor
     * @param province name of the province
     * @param capital name of the capital
     * @param population the number of the population
     */
    Province(String province, String capital, long population){
        if(isValidPopulation(population) && isValidProvince(province) && isValidCapitalCity(capital)){
            this.province = province;
            this.capital = capital;
            this.population = population;
        }else{
            this.population = DEFAULT_POPULATION;
            this.capital = DEFAULT_CAPITAL;
            this.province = DEFAULT_PROVINCE;
        }
    }

    /**
     * method to check if the input population is valid
     * @param population the number of the population
     * @return true if input number is valid
     */
    private boolean isValidPopulation(long population){
        return population >= MINIMUM_POPULATION && population <= MAXIMUM_POPULATION;
    }

    /**
     * method to check if the input capital is valid
     * @param capital name of the capital
     * @return true if input name is valid
     */
    private boolean isValidCapitalCity(String capital){
        for (String validCapital: capitals){
            if (capital.equals(validCapital)) return true;
        }
        return false;
    }

    /**
     * method to check if input province is valid
     * @param province name of the province
     * @return true if input province is valid
     */
    private boolean isValidProvince(String province){
        for (String validProvince: provinces){
            if (province.equals(validProvince)) return true;
        }
        return false;
    }

    /**
     * method to get details
     * @return the details of the province
     */
    public String getDetails(){
        return String.format("The capital of %s (population. %d) is %s", province, population, capital);
    }

    /**
     * province setter
     * @param province name of the province
     */
    public void setProvince(String province){
        this.province = province;
    }

    /**
     * province getter
     * @return name of the province
     */
    public String getProvince(){
        return  province;
    }

    /**
     * capital setter
     * @param capital name of the capital
     */
    public void setCapital(String capital){
        this.capital = capital;
    }

    /**
     * capital getter
     * @return name of the capital
     */
    public String getCapital(){
        return capital;
    }

    /**
     * population setter
     * @param population the number of the population
     */
    public void setPopulation(long population){
        this.population = population;
    }

    /**
     * population getter
     * @return the number of population
     */
    public long getPopulation(){
        return population;
    }
}
