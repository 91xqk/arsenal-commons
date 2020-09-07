package org.sunny.arsenal;

import org.apache.commons.collections4.MultiMap;
import org.junit.Test;
import org.sunny.arsenal.order.ArsenalOrder;
import org.sunny.arsenal.order.CustomType;
import org.sunny.arsenal.util.CommonUtils;


public class OrderTest {

    @Test
    public void genorate() {
        ArsenalOrder order = new ArsenalOrder();
        order.put(CustomType.CUSTOM, "FSY-");
        order.put(CustomType.DATE, "yyyyMMddHHmmss");
        order.put(CustomType.CUSTOM, "-");
        order.put(CustomType.RANDOMNO, "4");
        String a = order.generate();
        CommonUtils.print(a);
    }
}
