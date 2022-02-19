package lab1;

/**
 * @author Kaiya Takahashi
 */
public class Model {

    private String firstName;
    private String lastName;
    private int height; // Unit: inches
    private double weight; // Unit: pounds
    private boolean canTravel;
    private boolean canSmoke;

    public static final  int INCHES_PER_FOOT = 12;
    public static final  double POUNDS_PER_KG = 2.2046;
    public static final  int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final  int TALL_INCHES = 67;
    public static final  double THIN_POUNDS = 140.0;
    public static final  int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final  int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final  int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    /**
     * Constructor1
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    Model() throws IllegalAccessException {
        this("   ", "   ", 50, 150, true, false);
    }

    /**
     * Constructor2
     * @param firstName first name of the model
     * @param lastName last name of the model
     * @param height height of the model
     * @param weight weight of the model
     * @param canTravel whether the model can travel
     * @param canSmoke whether the model smokes
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean canSmoke) throws IllegalAccessException {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setCanSmoke(canSmoke);
    }

    /**
     * Constructor3
     * @param firstName first name of the model
     * @param lastName last name of the model
     * @param height height of the model
     * @param weight weight of the model
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    Model(String firstName, String lastName, int height, double weight) throws IllegalAccessException{
        this(firstName, lastName, height, weight, true, false);
    }

    /**
     * first name setter
     * @param firstName first name of the model
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setFirstName(String firstName) throws IllegalAccessException {
        if (firstName.length() > 2 && firstName.length() < 21) {
            this.firstName = firstName;
        }else{
            throw new IllegalAccessException("First Name must be 3-21 characters");
        }
    }

    /**
     * first name accessor
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * last name setter
     * @param lastName last name of the model
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setLastName(String lastName) throws IllegalAccessException{
        if (lastName.length() > 2 && lastName.length() < 21) {
            this.lastName = lastName;
        }else{
            throw new IllegalAccessException("Last Name must be 3-21 characters");
        }
    }

    /**
     * last name accessor
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * height setter
     * @param inches height of the model in inches
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setHeight(int inches) throws IllegalAccessException{
        if (inches >= 24 && inches <= 84) {
            this.height = inches;
        }else{
            throw new IllegalAccessException("Height must be 24 to 84 inches");
        }
    }

    /**
     * height setter
     * @param feet height of the model in feet
     * @param inches height of the model in inches
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setHeight(int feet, int inches) throws IllegalAccessException {
        int totalInches = feet * 12 + inches;
        setHeight(totalInches);
    }

    /**
     * height accessor
     * @return height
     */
    public int getHeight(){
        return height;
    }

    /**
     * weight setter
     * @param pounds weight of the model in pounds
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setWeight(double pounds) throws IllegalAccessException{
        if (pounds >= 80 && pounds <= 280) {
            this.weight = pounds;
        }else{
            throw new IllegalAccessException("Weight must be 80 to 280 pounds");
        }
    }

    double weightKg;
    /**
     * weight setter
     * @param kilograms wight of the model in kilograms
     * @throws IllegalAccessException exception thrown when invalid input is taken
     */
    public void setWeight(long kilograms) throws IllegalAccessException {
        this.weight = kilograms * POUNDS_PER_KG;
        weightKg = this.weight;
        setWeight(this.weight);
    }

    /**
     * weight accessor
     * @return weight in kilograms
     */
    public long getWeightKg() {
        weightKg = this.weight / POUNDS_PER_KG;
        return Math.round(weightKg);
    }
    /**
     * weight accessor
     * @return weight
     */
    public double getWeight(){
        return weight;
    }

    /**
     * can travel setter
     * @param canTravel whether the model can travel
     */
    public void setCanTravel(boolean canTravel){
        this.canTravel = canTravel;
    }

    /**
     * can travel accessor
     * @return canTravel
     */
    public boolean getCanTravel(){
        return canTravel;
    }

    /**
     * can smoke setter
     * @param canSmoke whether the model smokes
     */
    public void setCanSmoke(boolean canSmoke){
        this.canSmoke = canSmoke;
    }

    /**
     * can smoke accessor
     * @return canSmoke
     */
    public boolean getCanSmoke(){
        return canSmoke;
    }

    /**
     * feet and inches getter
     * @return feet and inches of the model
     */
    public String getHeightInFeetAndInches(){
        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;
        return String.format("%d feet %d inches", feet, inches);
    }

    /**
     * hourly rate calculator
     * @return hourly rage
     */
    public int calculatePayDollarsPerHour(){
        int hourlyRate = BASE_RATE_DOLLARS_PER_HOUR;
        if (height > TALL_INCHES || (int) weight < THIN_POUNDS)
            hourlyRate += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        if (canTravel)
            hourlyRate += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        if (canSmoke)
            hourlyRate -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        return hourlyRate;
    }

    /**
     * print details method
     * print(  Name: firstName lastName
     *         Height: height inches
     *         Weight: weight pounds
     *         "Does not travel" or "Does travel"
     *         "Does not smoke" or "Does smoke"
     *       )
     */
    public void printDetails(){
        String travelYepNope = (getCanTravel()) ? "Does travel": "Does not travel";
        String smokeYepNope = (getCanSmoke()) ? "Does smoke": "Does not smoke";
        String details = String.format("Name: %s %s\n" +
                                        "Height: %d inches\n" +
                                        "Weight: %.0f pounds\n" +
                                        travelYepNope + "\n" +
                                        smokeYepNope,
                                        firstName, lastName, height, weight);
        System.out.println(details);
    }

    /**
     * display models details method
     * @return "Name: firstName lastName
     *          Height: number feet number inches
     *          Weight: weight pounds
     *          Travel: "yep" or "nope"
     *          Smokes: "yep" or "nope"
     *          Hourly rate: $hourly rate"
     */
    public String displayModelsDetails(){
        String travelYepNope = (getCanTravel()) ? "yep": "nope";
        String smokeYepNope = (getCanSmoke()) ? "yep": "nope";
        return String.format("Name: %s %s\n" +
                             "Height: " + getHeightInFeetAndInches() + "\n" +
                             "Weight: %.1f pounds\n" +
                             "Travel: %s\n" +
                             "Smokes: %s\n" +
                             "Hourly rate: $" + calculatePayDollarsPerHour(),
                             firstName, lastName, weight, travelYepNope, smokeYepNope);
    }
}
