public class personaje {
    private String name;
    private String birth_year;
    private String height;

    public String getName() { return name; }
    public String getBirth_year() { return birth_year; }
    public String getHeight() { return height; }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Birth Year: " + birth_year +
                ", Height: " + height;
    }
}
