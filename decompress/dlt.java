import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlt
{
    public static final rlp<dlt> d;
    public final String a;
    public final cej b;
    public final List<elt> c;
    
    static {
        dlt.d = new b();
    }
    
    public dlt(final dlt$a dlt$a) {
        final String a = dlt$a.a;
        jee.l((Object)a);
        this.a = a;
        final cej b = dlt$a.b;
        final cej l0 = cej.L0;
        cej b2 = b;
        if (b == null) {
            b2 = l0;
        }
        this.b = b2;
        Object c;
        if ((c = dlt$a.c) == null) {
            c = f2a.D0;
        }
        this.c = (List<elt>)c;
    }
    
    public static final class b extends zr2<dlt, dlt$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final dlt dlt = (dlt)o;
            wlp.E(dlt.a);
            wlp.A((Object)dlt.b, (rlp)cej.K0);
            ((y4j)new vp4$a((rlp)elt.c)).c(wlp, (Object)dlt.c);
            final int a = c5j.a;
        }
        
        public final n4j g() {
            return (n4j)new dlt$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final dlt$a dlt$a = (dlt$a)n4j;
            dlt$a.a = vlp.A();
            dlt$a.b = (cej)vlp.z((rlp)cej.K0);
            dlt$a.c = (List)((y4j)new vp4$a((rlp)elt.c)).a(vlp);
        }
    }
}
