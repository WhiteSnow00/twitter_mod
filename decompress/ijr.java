import com.google.android.exoplayer2.n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ijr
{
    public final dgj a;
    public ewt b;
    public nna c;
    public fgj d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public a j;
    public long k;
    public boolean l;
    public boolean m;
    
    public ijr() {
        this.a = new dgj();
        this.j = new a();
    }
    
    public final long a(final long n) {
        return this.i * n / 1000000L;
    }
    
    public void b(final long g) {
        this.g = g;
    }
    
    public abstract long c(final rwj p0);
    
    @EnsuresNonNullIf(expression = { "#3.format" }, result = false)
    public abstract boolean d(final rwj p0, final long p1, final a p2) throws IOException;
    
    public void e(final boolean b) {
        if (b) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        }
        else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
    
    public static final class a
    {
        public n a;
        public h1b$a b;
    }
}
