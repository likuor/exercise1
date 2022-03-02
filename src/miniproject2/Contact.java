package miniproject2;

/**
 * @author Kaiya Takahashi
 */

public class Contact {

    private String name;
    private String mobile;
    private String work;
    private String home;
    private String city;

    /**
     * Default constructor
     */
    Contact(){
    }

    /**
     * Constructor 2
     * @param name name of the person
     */
    Contact(String name){
        this.name = name;
    }

    /**
     * Constructor 3
     * @param name name of the person
     * @param mobile number of the person
     */
    Contact(String name, String mobile){
        this.name = name;
        this.mobile = mobile;
    }

    /**
     * Constructor 4
     * @param name name of the person
     * @param mobile number of the person
     * @param work number of the person
     */
    Contact(String name,String mobile, String work){
        this.name = name;
        this.mobile = mobile;
        this.work = work;
    }

    /**
     * Constructor 5
     * @param name name of the person
     * @param mobile number of the person
     * @param work number of the person
     * @param home number of the person
     */
    Contact(String name, String mobile, String work, String home){
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
    }

    /**
     * Constructor 6
     * @param name name of the person
     * @param mobile number of the person
     * @param work number of the person
     * @param home number of the person
     * @param city name of the city
     */
    Contact(String name, String mobile, String work, String home, String city){
        this.name = name;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
        this.city = city;
    }

    /**
     * name mutator
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * name accessor
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * home mutator
     * @param home
     */
    public void setHome(String home) {
        this.home = home;
    }

    /**
     * home accessor
     * @return
     */
    public String getHome() {
        return home;
    }

    /**
     * mobile mutator
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * mobile accessor
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * work mutator
     * @param work
     */
    public void setWork(String work) {
        this.work = work;
    }

    /**
     * work accessor
     * @return
     */
    public String getWork() {
        return work;
    }

    /**
     * city mutator
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * city accessor
     * @return
     */
    public String getCity() {
        return city;
    }
}
