import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yc0
{
    public static final xc0 a;
    
    static {
        a = new xc0("", (List)null, 6);
    }
    
    public static final List a(final List list, final int n, final int n2) {
        final int n3 = 0;
        if (n <= n2) {
            final ArrayList<xc0$b> list2 = new ArrayList<xc0$b>(list.size());
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Object value = list.get(i);
                final xc0$b xc0$b = (xc0$b)value;
                if (c(n, n2, xc0$b.b, xc0$b.c)) {
                    list2.add((xc0$b)value);
                }
            }
            final ArrayList list3 = new ArrayList<xc0$b>(list2.size());
            for (int size2 = list2.size(), j = n3; j < size2; ++j) {
                final xc0$b xc0$b2 = list2.get(j);
                list3.add(new xc0$b(xc0$b2.a, Math.max(n, xc0$b2.b) - n, Math.min(n2, xc0$b2.c) - n, xc0$b2.d));
            }
            return list3;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("start (");
        sb.append(n);
        sb.append(") should be less than or equal to end (");
        sb.append(n2);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public static final boolean b(int n, final int n2, int n3, final int n4) {
        final boolean b = true;
        if (n <= n3 && n4 <= n2) {
            boolean b2 = b;
            if (n2 != n4) {
                return b2;
            }
            if (n3 == n4) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            if (n == n2) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n3 == n) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public static final boolean c(final int n, final int n2, final int n3, final int n4) {
        return Math.max(n, n3) < Math.min(n2, n4) || b(n, n2, n3, n4) || b(n3, n4, n, n2);
    }
}
