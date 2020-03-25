package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );
        List<Snow> snow2 = new ArrayList<Snow>();
        Collections.addAll(snow2, new Light(), new Heavy());
        List<Snow> snow3 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
