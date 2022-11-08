import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdv
{
    public static s9v<hfv> a(final khe khe) throws IOException {
        final lje e = khe.e();
        int n = 0;
        List list = null;
        List list2;
        Object o = list2 = list;
        int h;
        Object j;
        List g;
        String i;
        for (Object o2 = e; o2 != null && o2 != lje.L0; o2 = khe.i0(), n = h, list = (List)j, list2 = g, o = i) {
            final int ordinal = ((Enum)o2).ordinal();
            if (ordinal != 3) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        if (ordinal != 8) {
                            h = n;
                            j = list;
                            g = list2;
                            i = (String)o;
                        }
                        else {
                            h = n;
                            j = list;
                            g = list2;
                            i = (String)o;
                            if ("total_count".equals(khe.d())) {
                                h = khe.h();
                                j = list;
                                g = list2;
                                i = (String)o;
                            }
                        }
                    }
                    else {
                        h = n;
                        j = list;
                        g = list2;
                        i = (String)o;
                        if ("next_cursor_str".equals(khe.d())) {
                            j = khe.j();
                            h = n;
                            g = list2;
                            i = (String)o;
                        }
                    }
                }
                else {
                    i = khe.j();
                    h = n;
                    j = list;
                    g = list2;
                }
            }
            else if ("users".equals(o)) {
                g = bih.g(khe, (Class)hfv.class);
                h = n;
                j = list;
                i = (String)o;
            }
            else {
                while (true) {
                    h = n;
                    j = list;
                    g = list2;
                    i = (String)o;
                    if (o2 == null) {
                        break;
                    }
                    h = n;
                    j = list;
                    g = list2;
                    i = (String)o;
                    if (o2 == lje.N0) {
                        break;
                    }
                    o2 = khe.i0();
                }
            }
        }
        if (list2 == null) {
            return null;
        }
        return (s9v<hfv>)new s9v((String)list, list2, Integer.valueOf(n));
    }
    
    public static s9v<l8t.a> b(final khe khe) throws IOException {
        final s9v<hfv> a = a(khe);
        if (a != null) {
            final List b = a.b;
            final int size = b.size();
            final ijf$a ijf$a = new ijf$a(size);
            for (int i = 0; i < b.size(); ++i) {
                final hfv p = b.get(i);
                final l8t.a a2 = new l8t.a();
                a2.p = p;
                a2.q = "User";
                a2.c = size - i;
                a2.e = p.b1;
                a2.a = p.e();
                ((ijf)ijf$a).p((Object)a2);
            }
            return (s9v<l8t.a>)new s9v(a.a, (List)((h4j)ijf$a).e(), a.c);
        }
        return null;
    }
}
