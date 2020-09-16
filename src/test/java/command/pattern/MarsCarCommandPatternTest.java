package command.pattern;

import marsrover.MarsCar;
import marsrover.MarsLocation;
import marsrover.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsCarCommandPatternTest {

    @Test
    void should_return_12W_when_init_mars_car_given_init_info_12W() {
        //given
        marsrover.Point point = new marsrover.Point(1,2);
        String direction = "W";
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation(point, direction);
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);

        //when
        marsrover.MarsLocation actual = marsCar.getLocation();

        //then
        assertEquals(marsLocation, actual);
    }

    @Test
    void should_return_00N_when_init_mars_car_given_empty_init_info() {
        //given
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation();
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);

        //when
        marsrover.MarsLocation actual = marsCar.getLocation();

        //then
        assertEquals(marsLocation, actual);
    }

    @Test
    void should_return_01N_when_init_mars_car_given_location_00N_and_command_M() {
        //given
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation();
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);
        String instructions = "M";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(0,1), "N");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_11S_when_init_mars_car_given_location_12S_and_command_M() {
        //given
        marsrover.Point point = new marsrover.Point(1,2);
        String direction = "S";
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation(point, direction);
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);
        String instructions = "M";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(1,1), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_02W_when_init_mars_car_given_location_12W_and_command_M() {
        //given
        marsrover.Point point = new marsrover.Point(1,2);
        String direction = "W";
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation(point, direction);
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);
        String instructions = "M";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(0,2), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_22E_when_init_mars_car_given_location_12E_and_command_M() {
        //given
        marsrover.Point point = new marsrover.Point(1,2);
        String direction = "E";
        marsrover.MarsLocation marsLocation = new marsrover.MarsLocation(point, direction);
        marsrover.MarsCar marsCar = new marsrover.MarsCar(marsLocation);
        String instructions = "M";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(2,2), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_00W_when_init_mars_car_given_init_location_and_command_L() {
        //given
        marsrover.MarsCar marsCar = new marsrover.MarsCar(new marsrover.MarsLocation());
        String instructions = "L";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(0,0), "W");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_00E_when_init_mars_car_given_init_location_and_command_R() {
        //given
        marsrover.MarsCar marsCar = new marsrover.MarsCar(new marsrover.MarsLocation());
        String instructions = "R";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new marsrover.MarsLocation(new marsrover.Point(0,0), "E");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_02S_when_init_mars_car_given_init_location_and_command_MMRR() {
        //given
        marsrover.MarsCar marsCar = new MarsCar(new marsrover.MarsLocation());
        String instructions = "MMRR";

        //when
        marsrover.MarsLocation actual = marsCar.execute(instructions);
        marsrover.MarsLocation expected = new MarsLocation(new Point(0,2), "S");

        //then
        assertEquals(expected, actual);
    }
}
