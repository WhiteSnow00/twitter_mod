import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyv
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final it1 a(final kt1$a kt1$a) {
            final it1 it1 = new it1((Integer)null, (String)null, 3, (wg8)null);
            final Boolean a = kt1$a.a;
            if (a == null && kt1$a.b == null) {
                return it1;
            }
            if (a != null) {
                String b;
                if (a) {
                    b = "charging";
                }
                else {
                    b = "unplugged";
                }
                it1.b = b;
            }
            final Double b2 = kt1$a.b;
            if (b2 != null) {
                it1.a = (int)(b2.doubleValue() * 1000);
            }
            return it1;
        }
        
        public final jv8 b(final List<kv8$a> list) {
            final Iterator<kv8$a> iterator = list.iterator();
            Integer value = null;
            Integer value2 = null;
            Integer value4;
            Integer value3 = value4 = null;
            while (iterator.hasNext()) {
                final kv8$a kv8$a = iterator.next();
                final long a = kv8$a.a;
                final long b = kv8$a.b;
                final int c = kv8$a.c;
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
            return new jv8(value, value2, value3, value4);
        }
    }
}
