import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ylh extends gue implements otb<List<? extends eoh>>
{
    public final /* synthetic */ wlh C0;
    public final /* synthetic */ z8w D0;
    
    public ylh(final wlh c0, final z8w d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final wlh c0 = this.C0;
        final z8w d0 = this.D0;
        Objects.requireNonNull(c0);
        final List b = d0.b;
        final ArrayList list = new ArrayList();
        for (final x8w x8w : b) {
            final koh a = x8w.a;
            final y8w d2 = x8w.d;
            String a2 = null;
            ual b2;
            if (d2 != null) {
                b2 = d2.b;
            }
            else {
                b2 = null;
            }
            final boolean v = dcs.v(a, b2);
            final ArrayList<eoh$j> list2 = new ArrayList<eoh$j>();
            final y8w d3 = x8w.d;
            if (d3 != null || v) {
                String a3;
                if (d3 != null) {
                    a3 = d3.a;
                }
                else {
                    a3 = null;
                }
                final boolean a4 = c0.a(a3, d0);
                final String b3 = x8w.b;
                final String c2 = x8w.c;
                final koh a5 = x8w.a;
                final y8w d4 = x8w.d;
                String a6;
                if (d4 != null) {
                    a6 = d4.a;
                }
                else {
                    a6 = null;
                }
                list2.add(new eoh$j(b3, c2, a4, a5, a6));
                if (v) {
                    final y8w d5 = x8w.d;
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
                    final koh a8 = x8w.a;
                    ual b4;
                    if (d5 != null) {
                        b4 = d5.b;
                    }
                    else {
                        b4 = null;
                    }
                    if (d5 != null) {
                        a2 = d5.a;
                    }
                    list2.add((eoh$j)new eoh$b(n, a8, b4, a2));
                }
            }
            mr4.n1((Collection)list, (Iterable)list2);
        }
        return list;
    }
}
