import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxv
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final ft1 a(final gt1$a gt1$a) {
            final ft1 ft1 = new ft1(null, null, 3, null);
            final Boolean a = gt1$a.a;
            if (a == null && gt1$a.b == null) {
                return ft1;
            }
            if (a != null) {
                String b;
                if (a) {
                    b = "charging";
                }
                else {
                    b = "unplugged";
                }
                ft1.b = b;
            }
            final Double b2 = gt1$a.b;
            if (b2 != null) {
                ft1.a = (int)(b2.doubleValue() * 1000);
            }
            return ft1;
        }
        
        public final tu8 b(final List<uu8$a> list) {
            final Iterator<uu8$a> iterator = list.iterator();
            Integer value = null;
            Integer value2 = null;
            Integer value4;
            Integer value3 = value4 = value2;
            while (iterator.hasNext()) {
                final uu8$a uu8$a = iterator.next();
                final long a = uu8$a.a;
                final long b = uu8$a.b;
                final int c = uu8$a.c;
                if (c == 1) {
                    value = (int)(a / 1000000L);
                    value2 = (int)(b / 1000000L);
                }
                else {
                    if (c != 2) {
                        continue;
                    }
                    final int n = (int)(a / 1000000L);
                    final int n2 = 0;
                    int intValue;
                    if (value3 != null) {
                        intValue = value3;
                    }
                    else {
                        intValue = 0;
                    }
                    value3 = n + intValue;
                    final int n3 = (int)(b / 1000000L);
                    int intValue2 = n2;
                    if (value4 != null) {
                        intValue2 = value4;
                    }
                    value4 = n3 + intValue2;
                }
            }
            return new tu8(value, value2, value3, value4);
        }
    }
}
