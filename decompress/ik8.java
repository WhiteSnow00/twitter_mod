import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ik8<OBJECT, ERROR> extends ctc<OBJECT, ERROR>
{
    public static final Collection<asc$b> i;
    public static final Collection<Integer> j;
    public final int d;
    public final long e;
    public int f;
    public long g;
    public long h;
    
    static {
        ik8.i = Arrays.asList(asc$b.H0, asc$b.I0);
        ik8.j = Arrays.asList(401, 503);
    }
    
    public ik8() {
        super((Collection)ik8.i, (Collection)ik8.j);
        this.e = TimeUnit.SECONDS.toMillis(30L);
        this.d = 1;
    }
    
    public ik8(final int d) {
        super((Collection)ik8.i, (Collection)ik8.j);
        this.e = TimeUnit.SECONDS.toMillis(30L);
        this.d = d;
    }
    
    public final long a(final ptm<xsc<OBJECT, ERROR>> ptm) {
        return this.g;
    }
    
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d_timeout%d", ik8.class.getSimpleName(), this.d, this.e);
    }
    
    public final boolean f(final asc asc, final btc btc) {
        final int f = this.f;
        boolean b = true;
        final boolean b2 = true;
        final int f2 = f + 1;
        this.f = f2;
        final int a = btc.a;
        if (a == 401) {
            this.g = 0L;
            if (f2 > this.d) {
                b = false;
            }
            return b;
        }
        if (a != 503) {
            return false;
        }
        if (f2 > this.d || asc$b.H0 != asc.b) {
            return false;
        }
        final long e = ctc.e(asc);
        if (e == 0L) {
            this.g = 0L;
            return this.f <= this.d && b2;
        }
        this.g = e;
        final long h = e + this.h;
        if (h <= this.e) {
            this.h = h;
            return true;
        }
        return false;
    }
}
