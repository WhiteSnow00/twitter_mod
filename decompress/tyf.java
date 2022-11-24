import java.util.Objects;
import java.util.List;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tyf
{
    public a a;
    public final dxf b;
    public final iwf c;
    public final z6t d;
    public final e39 e;
    public final LiveEventConfiguration f;
    public List<ryf> g;
    
    public tyf(final dxf b, final iwf c, final z6t d, final LiveEventConfiguration f, final kcm kcm) {
        this.a = (a)tyf.a.W;
        this.e = new e39();
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        kcm.i((sj)new nj4((Object)this, 3));
    }
    
    public final boolean a(final ysj ysj) {
        final z6t d = this.d;
        Objects.requireNonNull(d);
        boolean b = false;
        if (ysj != null) {
            final ke7 a = d.a(ysj);
            if (a != null) {
                b = d.b(a, ysj.c);
            }
        }
        return b;
    }
    
    public interface a
    {
        public static final tyf$a$a W = new tyf$a$a();
        
        void H0(final boolean p0);
        
        void Y0(final boolean p0);
        
        void l0();
        
        void n0(final int p0);
        
        void o1(final List<ysj> p0, final String p1);
    }
}
