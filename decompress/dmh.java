import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmh extends ste implements nsb<List<? extends joh>>
{
    public final bmh D0;
    public final h9w E0;
    
    public dmh(final bmh d0, final h9w e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final bmh d0 = this.D0;
        final h9w e0 = this.E0;
        Objects.requireNonNull(d0);
        final List b = e0.b;
        final ArrayList list = new ArrayList();
        for (final f9w f9w : b) {
            final poh a = f9w.a;
            final g9w d2 = f9w.d;
            String a2 = null;
            gbl b2;
            if (d2 != null) {
                b2 = d2.b;
            }
            else {
                b2 = null;
            }
            final boolean j = z6q.j(a, b2);
            final ArrayList<joh.j> list2 = new ArrayList<joh.j>();
            final g9w d3 = f9w.d;
            if (d3 != null || j) {
                String a3;
                if (d3 != null) {
                    a3 = d3.a;
                }
                else {
                    a3 = null;
                }
                final boolean a4 = d0.a(a3, e0);
                final String b3 = f9w.b;
                final String c = f9w.c;
                final poh a5 = f9w.a;
                final g9w d4 = f9w.d;
                String a6;
                if (d4 != null) {
                    a6 = d4.a;
                }
                else {
                    a6 = null;
                }
                list2.add(new joh.j(b3, c, a4, a5, a6));
                if (j) {
                    final g9w d5 = f9w.d;
                    String a7;
                    if (d5 != null) {
                        a7 = d5.a;
                    }
                    else {
                        a7 = null;
                    }
                    int n;
                    if (a7 == null) {
                        n = 2131952909;
                    }
                    else {
                        n = 2131953710;
                    }
                    final poh a8 = f9w.a;
                    gbl b4;
                    if (d5 != null) {
                        b4 = d5.b;
                    }
                    else {
                        b4 = null;
                    }
                    if (d5 != null) {
                        a2 = d5.a;
                    }
                    list2.add((joh.j)new joh.b(n, a8, b4, a2));
                }
            }
            kq4.N((Collection)list, (Iterable)list2);
        }
        return list;
    }
}
