import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pug extends y6a<dtg>
{
    public static final rlp<pug> F0;
    public static final pug G0;
    
    static {
        pug.F0 = new b();
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        G0 = new pug((List<dtg>)e0);
    }
    
    public pug(final List<dtg> list) {
        super((List)list);
    }
    
    public static pug i(final List<dtg> list) {
        final a a = new a(list.size());
        a.o((Iterable)list);
        return (pug)((n4j)a).e();
    }
    
    public final boolean j(final dtg.c c) {
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (((dtg)iterator.next()).T0 == c) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean l() {
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (((dtg)iterator.next()).a1) {
                return true;
            }
        }
        return false;
    }
    
    public static final class a extends y6a$a<dtg, pug, a>
    {
        public a() {
        }
        
        public a(final int n) {
            super(n);
        }
        
        public a(final pug pug) {
            super((y6a)pug);
        }
        
        public final y6a s(final List list) {
            pug g0;
            if (!fq4.t((Collection)list)) {
                g0 = new pug(list);
            }
            else {
                g0 = pug.G0;
            }
            return g0;
        }
    }
    
    public static final class b extends y4j<pug>
    {
        public final Object d(final vlp vlp, int i) throws IOException, ClassNotFoundException {
            final int x = vlp.x();
            final a a = new a();
            for (i = 0; i < x; ++i) {
                a.p((m6a)((rlp)dtg.p1).b(vlp));
            }
            return a.q();
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final pug pug = (pug)o;
            wlp.x(pug.size());
            final Iterator iterator = pug.iterator();
            while (iterator.hasNext()) {
                ((y4j)dtg.p1).c(wlp, (Object)iterator.next());
            }
        }
    }
}
