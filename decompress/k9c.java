import java.util.Map;
import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9c extends rrp
{
    public static final nmp<k9c> h;
    public final List<rrp> f;
    public final List<uym> g;
    
    static {
        k9c.h = new k9c.k9c$b();
    }
    
    public k9c(final a a) {
        super((rrp.a)a);
        final List<rrp> e = a.e;
        vmw.g((Object)e);
        this.f = e;
        Object g;
        if ((g = a.f) == null) {
            g = h3a.F0;
        }
        this.g = (List<uym>)g;
    }
    
    public final List<oh0> b() {
        return (List)Collection$_EL.stream((Collection)this.f).flatMap((Function)ie1.c).collect(Collectors.toList());
    }
    
    public final Map<String, fpp> c() {
        return rrp.a((List)this.f);
    }
    
    public static final class a extends rrp.a<k9c, a>
    {
        public List<rrp> e;
        public List<uym> f;
        
        public final Object i() {
            return new k9c(this);
        }
        
        @Override
        public final boolean k() {
            return super.k() && super.a != null && !kr4.t((Collection)this.e);
        }
    }
}
