import java.util.Locale;
import java.util.Collections;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nzg<OBJECT, ERROR> extends ysc<OBJECT, ERROR>
{
    public static final Collection<xrc$b> f;
    public static final Collection<Integer> g;
    public final int d;
    public int e;
    
    static {
        nzg.f = Collections.singletonList(xrc$b.F0);
        nzg.g = Collections.singletonList(500);
    }
    
    public nzg() {
        super(nzg.f, nzg.g);
        this.d = 1;
    }
    
    @Override
    public final long a(final ism<tsc<OBJECT, ERROR>> ism) {
        return (long)(Math.random() * 100.0) + 1000L;
    }
    
    @Override
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d", nzg.class.getSimpleName(), this.d);
    }
    
    @Override
    public final boolean f(final xrc xrc, final xsc xsc) {
        int e = this.e;
        boolean b = true;
        ++e;
        this.e = e;
        if (xsc.a != 500 || e > this.d) {
            b = false;
        }
        return b;
    }
}
