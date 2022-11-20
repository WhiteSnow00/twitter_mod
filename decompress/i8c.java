import java.io.IOException;
import java.util.Map;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8c extends wqp
{
    public static final rlp<i8c> h;
    public final List<wqp> f;
    public final List<dym> g;
    
    static {
        i8c.h = new b();
    }
    
    public i8c(final a a) {
        super((wqp$a)a);
        final List<wqp> e = a.e;
        jee.l((Object)e);
        this.f = e;
        Object g;
        if ((g = a.f) == null) {
            g = f2a.D0;
        }
        this.g = (List<dym>)g;
    }
    
    public final List<nh0> b() {
        return (List)Collection$_EL.stream((Collection)this.f).flatMap((Function)fe1.c).collect(Collectors.toList());
    }
    
    public final Map<String, iop> c() {
        return wqp.a((List)this.f);
    }
    
    public static final class a extends wqp$a<i8c, a>
    {
        public List<wqp> e;
        public List<dym> f;
        
        public final Object i() {
            return new i8c(this);
        }
        
        public final boolean l() {
            return super.l() && super.a != null && !fq4.t((Collection)this.e);
        }
    }
    
    public static final class b extends wqp$b<i8c, a>
    {
        public final n4j g() {
            return (n4j)new a();
        }
        
        public final void i(final vlp vlp, final wqp$a wqp$a, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)wqp$a;
            super.i(vlp, (wqp$a)a, n);
            final Object a2 = ((y4j)new vp4$a((rlp)wqp.e)).a(vlp);
            jee.l(a2);
            a.e = (List<wqp>)a2;
            a.f = (List)((y4j)new vp4$a((rlp)dym.c)).a(vlp);
        }
        
        public final void j(final wlp wlp, final wqp wqp) throws IOException {
            final i8c i8c = (i8c)wqp;
            super.j(wlp, (wqp)i8c);
            fu8.n(wqp.e, wlp, (List)i8c.f);
            final int a = c5j.a;
            ((y4j)new vp4$a((rlp)dym.c)).c(wlp, (Object)i8c.g);
        }
    }
}
