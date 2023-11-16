package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy gh;

    @BeforeEach
    public void initialize() {this.gh = new GHappy();}

    @Test
    public void trueOccurence(){
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void falseOccurence(){
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }


    @Test
    public void flaseMultiOccurence(){
        boolean result = gh.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
