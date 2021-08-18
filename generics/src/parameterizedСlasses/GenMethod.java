package parameterizedСlasses;

import java.util.ArrayList;

public class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
