package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarsCarTest {
    @Test
    void should_return_12W_when_init_mars_car_given_init_info_12W() {
        //given
        Point point = new Point(1,2);
        String direction = "W";
        MarsLocation marsLocation = new MarsLocation(point, direction);
        MarsCar marsCar = new MarsCar(marsLocation);

        //when
        MarsLocation actual = marsCar.getLocation();

        //then
        assertEquals(marsLocation, actual);
    }

    @Test
    void should_return_00N_when_init_mars_car_given_empty_init_info() {
        //given
        MarsLocation marsLocation = new MarsLocation();
        MarsCar marsCar = new MarsCar(marsLocation);

        //when
        MarsLocation actual = marsCar.getLocation();

        //then
        assertEquals(marsLocation, actual);
    }
}
