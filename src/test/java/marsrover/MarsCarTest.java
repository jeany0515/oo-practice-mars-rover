package marsrover;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void should_return_01N_when_init_mars_car_given_location_00N_and_command_M() {
        //given
        MarsLocation marsLocation = new MarsLocation();
        MarsCar marsCar = new MarsCar(marsLocation);
        List<String> instructions = new ArrayList<>();
        instructions.add("M");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(0,1), "N");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_11S_when_init_mars_car_given_location_12S_and_command_M() {
        //given
        Point point = new Point(1,2);
        String direction = "S";
        MarsLocation marsLocation = new MarsLocation(point, direction);
        MarsCar marsCar = new MarsCar(marsLocation);
        List<String> instructions = new ArrayList<>();
        instructions.add("M");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(1,1), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_02W_when_init_mars_car_given_location_12W_and_command_M() {
        //given
        Point point = new Point(1,2);
        String direction = "W";
        MarsLocation marsLocation = new MarsLocation(point, direction);
        MarsCar marsCar = new MarsCar(marsLocation);
        List<String> instructions = new ArrayList<>();
        instructions.add("M");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(0,2), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_22E_when_init_mars_car_given_location_12E_and_command_M() {
        //given
        Point point = new Point(1,2);
        String direction = "E";
        MarsLocation marsLocation = new MarsLocation(point, direction);
        MarsCar marsCar = new MarsCar(marsLocation);
        List<String> instructions = new ArrayList<>();
        instructions.add("M");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(2,2), direction);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_00W_when_init_mars_car_given_init_location_and_command_L() {
        //given
        MarsCar marsCar = new MarsCar(new MarsLocation());
        List<String> instructions = new ArrayList<>();
        instructions.add("L");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(0,0), "W");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_00E_when_init_mars_car_given_init_location_and_command_R() {
        //given
        MarsCar marsCar = new MarsCar(new MarsLocation());
        List<String> instructions = new ArrayList<>();
        instructions.add("R");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(0,0), "E");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_02S_when_init_mars_car_given_init_location_and_command_MMRR() {
        //given
        MarsCar marsCar = new MarsCar(new MarsLocation());
        List<String> instructions = new ArrayList<>();
        instructions.add("M");
        instructions.add("M");
        instructions.add("R");
        instructions.add("R");

        //when
        MarsLocation actual = marsCar.execute(instructions);
        MarsLocation expected = new MarsLocation(new Point(0,2), "S");

        //then
        assertEquals(expected, actual);
    }
}
