import java.util.Objects;
import java.util.List;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myf
{
    public a a;
    public final xwf b;
    public final cwf c;
    public final o5t d;
    public final m29 e;
    public final LiveEventConfiguration f;
    public List<kyf> g;
    
    public myf(final xwf b, final cwf c, final o5t d, final LiveEventConfiguration f, final ibm ibm) {
        this.a = (a)myf.a.T;
        this.e = new m29();
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        ibm.i((rj)new hj4((Object)this, 3));
    }
    
    public final boolean a(final esj esj) {
        final o5t d = this.d;
        Objects.requireNonNull(d);
        boolean b = false;
        if (esj != null) {
            final ae7 a = d.a(esj);
            if (a != null) {
                b = d.b(a, esj.c);
            }
        }
        return b;
    }
    
    public interface a
    {
        public static final myf$a$a T = new myf$a$a();
        
        void H0(final boolean p0);
        
        void Y0(final boolean p0);
        
        void k0();
        
        void n0(final int p0);
        
        void o1(final List<esj> p0, final String p1);
    }
}
