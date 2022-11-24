import java.util.Locale;
import java.util.Collections;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0h<OBJECT, ERROR> extends ctc<OBJECT, ERROR>
{
    public static final Collection<asc$b> f;
    public static final Collection<Integer> g;
    public final int d;
    public int e;
    
    static {
        g0h.f = Collections.singletonList(asc$b.I0);
        g0h.g = Collections.singletonList(500);
    }
    
    public g0h() {
        super((Collection)g0h.f, (Collection)g0h.g);
        this.d = 1;
    }
    
    public final long a(final ptm<xsc<OBJECT, ERROR>> ptm) {
        return (long)(Math.random() * 100.0) + 1000L;
    }
    
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d", g0h.class.getSimpleName(), this.d);
    }
    
    public final boolean f(final asc asc, final btc btc) {
        int e = this.e;
        boolean b = true;
        ++e;
        this.e = e;
        if (btc.a != 500 || e > this.d) {
            b = false;
        }
        return b;
    }
}
