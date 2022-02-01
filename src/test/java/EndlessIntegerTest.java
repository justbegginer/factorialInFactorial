import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndlessIntegerTest {

    @Test
    void sum() {
        EndlessInteger integer = new EndlessInteger("10");
        integer.sum(new EndlessInteger("147"));
        integer.sum(new EndlessInteger("143"));
        integer.sum(new EndlessInteger("1000"));
        System.out.println(integer.getInteger());
    }

    @Test
    void multiply() {
    }
}