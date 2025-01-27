
package com.puppycrawl.tools.checkstyle.checks.coding.magicnumber;

import java.util.HashSet;
import java.util.Set;

public class InputMagicNumberTesty {

    private Runnable magicMethodLambda = () -> {
    Set<Person> p1 = new HashSet<Person>(5);
    Object[] values = new Object[3];
    String[] fStrings = new String[3];
    Person p12 = new Person(8);

    double double_var1 = 0D;
    double_var1 = 1.0 + 3.0;
    double double_magic1 = 1.5_0;
    if (1.0 < 3.0);
    double_magic1 *= 1.5;
};
}
