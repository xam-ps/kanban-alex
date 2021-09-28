import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {



    @Test
    public void testGetStateName(){
        State testState = new State("testStateName");
        String test = testState.getStateName();
        assertEquals("testStateName",test);
    }

    @Test
    public void testAddTask(){
        State testState = new State("testStateName");
        Task testTask = new Task();
        testState.addTask("asgadsgsag");
    }

}