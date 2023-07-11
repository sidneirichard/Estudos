import java.util.ArrayList;
import java.util.List;

public class V2Radiator {
    V2Radiator() {
        List<SimUnit> list;
        list = new ArrayList<>();
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2Radiator"));
        }
    }
}
