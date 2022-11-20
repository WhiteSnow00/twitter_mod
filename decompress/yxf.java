import java.util.Objects;
import java.util.List;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yxf
{
    public a a;
    public final iwf b;
    public final nvf c;
    public final f6t d;
    public final w19 e;
    public final LiveEventConfiguration f;
    public List<wxf> g;
    
    public yxf(final iwf b, final nvf c, final f6t d, final LiveEventConfiguration f, final xbm xbm) {
        this.a = (a)yxf.a.U;
        this.e = new w19();
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        xbm.i((oj)new ii4((Object)this, 3));
    }
    
    public final boolean a(final jsj jsj) {
        final f6t d = this.d;
        Objects.requireNonNull(d);
        boolean b = false;
        if (jsj != null) {
            final hd7 a = d.a(jsj);
            if (a != null) {
                b = d.b(a, jsj.c);
            }
        }
        return b;
    }
    
    public interface a
    {
        public static final yxf$a$a U = new yxf$a$a();
        
        void H0(final boolean p0);
        
        void Y0(final boolean p0);
        
        void l0();
        
        void n0(final int p0);
        
        void o1(final List<jsj> p0, final String p1);
    }
}
