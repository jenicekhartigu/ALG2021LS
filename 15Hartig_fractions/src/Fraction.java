public class Fraction {
    private float citatel;
    private float jmenovatel;

    public Fraction(float aCitatel, float aJmenovatel)
    {
        setCitatel(aCitatel);
        setJmenovatel(aJmenovatel);
    }

    public void setCitatel(float citatel) {
        this.citatel = citatel;
    }
    
    public void setJmenovatel(float jmenovatel) {
        this.jmenovatel = jmenovatel;
    }

    public float getCitatel() {
        return citatel;
    }

    public float getJmenovatel() {
        return jmenovatel;
    }
}
