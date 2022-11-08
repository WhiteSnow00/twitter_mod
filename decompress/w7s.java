import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7s implements gqg
{
    public final /* synthetic */ gub<m76, Integer, oyv> a;
    public final /* synthetic */ gub<m76, Integer, oyv> b;
    
    public w7s(final gub<? super m76, ? super Integer, oyv> a, final gub<? super m76, ? super Integer, oyv> b) {
        this.a = (gub<m76, Integer, oyv>)a;
        this.b = (gub<m76, Integer, oyv>)b;
    }
    
    @Override
    public final hqg b(final jqg jqg, final List<? extends dqg> list, final long n) {
        zzd.f((Object)jqg, "$this$Layout");
        zzd.f((Object)list, "measurables");
        qgk w = null;
        Label_0097: {
            if (this.a != null) {
                for (final dqg dqg : list) {
                    if (zzd.a(rqu.o(dqg), (Object)"text")) {
                        w = dqg.W(jj6.a(n, 0, 0, 0, 0, 11));
                        break Label_0097;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            w = null;
        }
        qgk w2 = null;
        Label_0171: {
            if (this.b != null) {
                for (final dqg dqg2 : list) {
                    if (zzd.a(rqu.o(dqg2), (Object)"icon")) {
                        w2 = dqg2.W(n);
                        break Label_0171;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            w2 = null;
        }
        int c0 = 0;
        int c2;
        if (w != null) {
            c2 = w.C0;
        }
        else {
            c2 = 0;
        }
        if (w2 != null) {
            c0 = w2.C0;
        }
        final int max = Math.max(c2, c0);
        float n2;
        if (w != null && w2 != null) {
            final float a = v7s.a;
            n2 = v7s.b;
        }
        else {
            final float a2 = v7s.a;
            n2 = v7s.a;
        }
        final int s = ((dp8)jqg).S(n2);
        Integer value;
        if (w != null) {
            value = ((kqg)w).i0((ex)gx.a);
        }
        else {
            value = null;
        }
        Integer value2;
        if (w != null) {
            value2 = ((kqg)w).i0((ex)gx.b);
        }
        else {
            value2 = null;
        }
        return jqg.J(max, s, (Map<ex, Integer>)a3a.C0, (rtb<? super qgk$a, oyv>)new w7s$a(w, w2, jqg, max, s, value, value2));
    }
}
