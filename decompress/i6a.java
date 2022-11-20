import java.util.Objects;
import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i6a extends dtr
{
    public final String j;
    public final List<cej> k;
    
    public i6a(final a a) {
        super((dtr$a)a);
        String k;
        if ((k = a.k) == null) {
            k = "";
        }
        this.j = k;
        Object i;
        if ((i = a.l) == null) {
            i = f2a.D0;
        }
        this.k = (List<cej>)i;
    }
    
    public final ssr b(final String s) {
        return (ssr)new g6a(s, this);
    }
    
    public static final class a extends dtr$a<i6a, a>
    {
        public String k;
        public List<cej> l;
        
        public final Object i() {
            return new i6a(this);
        }
    }
    
    public static final class b extends dtr$b<i6a, a>
    {
        public final n4j g() {
            return (n4j)new a();
        }
        
        public final void i(final vlp vlp, final dtr$a dtr$a, int a) throws IOException, ClassNotFoundException {
            final a a2 = (a)dtr$a;
            super.i(vlp, (dtr$a)a2, a);
            a2.k = vlp.G();
            final Object a3 = ((y4j)new vp4$a((rlp)cej.K0)).a(vlp);
            jee.l(a3);
            a = c5j.a;
            a2.l = (List<cej>)a3;
        }
        
        public final void j(wlp e, final dtr dtr) throws IOException {
            final i6a i6a = (i6a)dtr;
            super.j(e, (dtr)i6a);
            e = e.E(i6a.j);
            final List<cej> k = i6a.k;
            final vp4$a vp4$a = new vp4$a((rlp)cej.K0);
            Objects.requireNonNull(e);
            ((y4j)vp4$a).c(e, (Object)k);
            final int a = c5j.a;
        }
    }
}
