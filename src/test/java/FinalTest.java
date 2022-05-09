
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class FinalTest {
        @Test
        @DisplayName("Should drop two requests and split load")
        public void loads(){
            int[] arr ={1,3,4,2,2,2,1,1,2};
            assertEquals(true, Final.getMax(arr));

        }


        @Test
        @DisplayName("Should drop two requests and split unload")
        public void Noloads(){
            int[] arr ={1,1,1,1,1,1};
            assertEquals(true, Final.getMax(arr));

        }
    }


