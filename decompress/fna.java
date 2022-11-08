import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fna<OBJECT, ERROR> extends ysc<OBJECT, ERROR>
{
    public static final Collection<xrc$b> j;
    public static final Collection<Integer> k;
    public final long d;
    public final long e;
    public final int f;
    public int g;
    public long h;
    public long i;
    
    static {
        fna.j = Collections.singleton(xrc$b.E0);
        fna.k = Collections.singleton(503);
    }
    
    public fna(final int f, final long n, final long n2, final TimeUnit timeUnit, final Collection<xrc$b> collection, final Collection<Integer> collection2) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        super((Collection)timeUnit, collection);
        this.f = f;
        this.d = seconds.toMillis(n);
        this.e = seconds.toMillis(n2);
    }
    
    @Override
    public final long a(final ism<tsc<OBJECT, ERROR>> ism) {
        return this.i;
    }
    
    @Override
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d_wait%d_timeout%d", fna.class.getSimpleName(), this.f, this.d, this.e);
    }
    
    @Override
    public final boolean f(final xrc xrc, final xsc xsc) {
        final int f = this.f;
        boolean b = false;
        if (f > 0 && this.g >= f) {
            return false;
        }
        final int g = this.g;
        if (g > 0) {
            this.i = (long)(Math.pow(2.0, g - 1) * this.d);
        }
        else {
            this.i = 0L;
        }
        ++this.g;
        final long h = this.h;
        final long i = this.i;
        final long h2 = h + i;
        this.h = h2;
        if (i + h2 <= this.e) {
            b = true;
        }
        return b;
    }
}
