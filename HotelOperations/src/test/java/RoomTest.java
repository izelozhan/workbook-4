import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // Arrange => set up all variables that you will need to execute
    // Act => one method call that you are testing in this scenario
    // Assert => write code to verify that method under test performed as expected

    @org.junit.jupiter.api.Test
    void checkIn_RoomIsNotDirtyOrOccupied_False() {
        //Arrange
        Room room = new Room();
        room.setDirty(false);
        room.setOccupied(true);
        //Act
        boolean expected = room.checkIn();
        //Assert
        assertFalse(expected);
    }

    @org.junit.jupiter.api.Test
    void checkOut_RoomIsOccupied_True() {
        //Arrange
        Room room = new Room();
        room.setOccupied(true);
        //Act
        boolean expected = room.checkOut();
        //Assert
        assertTrue(expected);
    }

    @org.junit.jupiter.api.Test
    void cleanRoom_RoomIsDirty_True() {
        //Arrange
        Room room = new Room();
        room.setDirty(true);
        //Act
        boolean expected = room.cleanRoom();
        //Assert
        assertTrue(expected);
    }
}

//// arrange
//Car car = new Car("Ford", "F150 Raptor");
//int speedChange = 15;
//int expectedSpeed = 15;
//// act
//car.accelerate(speedChange);
//// assert
//int actualSpeed = car.getSpeed();
//assertEquals(expectedSpeed, actualSpeed);
//}

//assertEquals(expected, actual) - compares the value of 2 input arguments for equality
//assertNotEquals(expected, actual) - compares the value of 2 input arguments for equality and fails if they are equal
//- assertArrayEquals(expectedArray, actualArray) -
//compares the size and values of all elements in 2 arrays
//- assertTrue(booleanValue) - checks if an input value is true
//        - assertFalse(booleanValue) - checks if an input value is
//false
