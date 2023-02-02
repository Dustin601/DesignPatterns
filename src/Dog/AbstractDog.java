package Dog;

public abstract class AbstractDog implements Dog{
    private String name;
    protected BarkStrategy bark;
    public AbstractDog (String name, BarkStrategy bark){
        this.name = name;
        this.bark = bark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
