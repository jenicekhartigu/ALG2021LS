package Hartig_fraction;

public class Fraction {
    public float citatel;
    public float jmenovatel;

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
