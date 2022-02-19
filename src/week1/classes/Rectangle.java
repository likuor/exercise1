package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String colour;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final int MAXIMUM_ACCEPTABLE_NUMBER = 20;
    public static final int MINIMUM_ACCEPTABLE_NUMBER = 2;

    Rectangle(int width, int height){
        setHeight(height);
        setWidth(width);
        setColour("Blue");
    }

    Rectangle(int width, int height, String colour){
        setWidth(width);
        setHeight(height);
        setColour(colour);
    }

    void draw(){
        char initialLetter = colour.charAt(0);
        for(int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                if (colour.equals("Red")) System.out.print(ANSI_RED + initialLetter + ANSI_RESET);
                else if (colour.equals("Black")) System.out.print(ANSI_BLACK + initialLetter + ANSI_RESET);
                else if (colour.equals("Green")) System.out.print(ANSI_GREEN + initialLetter + ANSI_RESET);
                else if (colour.equals("Yellow")) System.out.print(ANSI_YELLOW + initialLetter + ANSI_RESET);
                else if (colour.equals("Blue")) System.out.print(ANSI_BLUE + initialLetter + ANSI_RESET);
                else if (colour.equals("Purple")) System.out.print(ANSI_PURPLE + initialLetter + ANSI_RESET);
                else if (colour.equals("Cyan")) System.out.print(ANSI_CYAN + initialLetter + ANSI_RESET);
                else if (colour.equals("White")) System.out.print(ANSI_WHITE + initialLetter + ANSI_RESET);
            }
            System.out.println();
        }
    }

    public void setColour(String colour){
        if (colour.length() > MAXIMUM_ACCEPTABLE_NUMBER || colour.length() < MINIMUM_ACCEPTABLE_NUMBER ||
                colour.charAt(0) < 'A' || colour.charAt(0) > 'Z'){
                System.out.println("Invalid input. Set the colour to default \"Blue\"");
                this.colour = "Blue";
        }else {
            this.colour = colour;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }else{
            this.height = 1;
        }
    }
    public void setWidth(int width){
        if (width > 0) {
            this.width = width;
        }else{
            this.width = 1;
        }
    }
}
