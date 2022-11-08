import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jb2 implements gqg
{
    public final /* synthetic */ boolean a;
    public final /* synthetic */ dx b;
    
    public jb2(final boolean a, final dx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final hqg b(final jqg jqg, final List<? extends dqg> list, long d) {
        zzd.f((Object)jqg, "$this$MeasurePolicy");
        zzd.f((Object)list, "measurables");
        if (list.isEmpty()) {
            return jqg.J(jj6.j(d), jj6.i(d), (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)jb2$a.C0);
        }
        long a;
        if (this.a) {
            a = d;
        }
        else {
            a = jj6.a(d, 0, 0, 0, 0, 10);
        }
        final int size = list.size();
        final int n = 0;
        if (size == 1) {
            final dqg dqg = list.get(0);
            qgk qgk;
            int n2;
            int n3;
            if (!ib2.b(dqg)) {
                qgk = dqg.W(a);
                n2 = Math.max(jj6.j(d), qgk.C0);
                n3 = Math.max(jj6.i(d), qgk.D0);
            }
            else {
                n2 = jj6.j(d);
                n3 = jj6.i(d);
                qgk = dqg.W(jj6.Companion.c(jj6.j(d), jj6.i(d)));
            }
            return jqg.J(n2, n3, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new jb2$b(qgk, dqg, jqg, n2, n3, this.b));
        }
        final qgk[] array = new qgk[list.size()];
        final z6m z6m = new z6m();
        z6m.C0 = jj6.j(d);
        final z6m z6m2 = new z6m();
        z6m2.C0 = jj6.i(d);
        final int size2 = list.size();
        int i = 0;
        boolean b = false;
        while (i < size2) {
            final dqg dqg2 = list.get(i);
            if (!ib2.b(dqg2)) {
                final qgk w = dqg2.W(a);
                array[i] = w;
                z6m.C0 = Math.max(z6m.C0, w.C0);
                z6m2.C0 = Math.max(z6m2.C0, w.D0);
            }
            else {
                b = true;
            }
            ++i;
        }
        if (b) {
            final int c0 = z6m.C0;
            int n4;
            if (c0 != Integer.MAX_VALUE) {
                n4 = c0;
            }
            else {
                n4 = 0;
            }
            final int c2 = z6m2.C0;
            int n5;
            if (c2 != Integer.MAX_VALUE) {
                n5 = c2;
            }
            else {
                n5 = 0;
            }
            d = fk7.d(n4, c0, n5, c2);
            for (int size3 = list.size(), j = n; j < size3; ++j) {
                final dqg dqg3 = list.get(j);
                if (ib2.b(dqg3)) {
                    array[j] = dqg3.W(d);
                }
            }
        }
        return jqg.J(z6m.C0, z6m2.C0, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new jb2$c(array, (List)list, jqg, z6m, z6m2, this.b));
    }
}
