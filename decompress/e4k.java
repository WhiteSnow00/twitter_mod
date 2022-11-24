import android.os.Build$VERSION;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import androidx.work.c;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4k extends gtx
{
    public static final e4k.e4k$b Companion;
    
    static {
        Companion = new e4k.e4k$b();
    }
    
    public e4k(final a a) {
        e0e.f((Object)a, "builder");
        super(a.b, a.c, (Set)a.d);
    }
    
    public static final class a extends gtx$a<a, e4k>
    {
        public a(final Class<? extends c> clazz, long n, final TimeUnit timeUnit) {
            e0e.f((Object)timeUnit, "repeatIntervalTimeUnit");
            super((Class)clazz);
            final ktx c = super.c;
            long millis = timeUnit.toMillis(n);
            Objects.requireNonNull(c);
            long h = 900000L;
            final long n2 = lcmp(millis, 900000L);
            if (n2 < 0) {
                jag.e().h(ktx.u, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (n2 < 0) {
                n = 900000L;
            }
            else {
                n = millis;
            }
            if (n2 < 0) {
                millis = 900000L;
            }
            final long n3 = lcmp(n, 900000L);
            if (n3 < 0) {
                jag.e().h(ktx.u, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (n3 >= 0) {
                h = n;
            }
            c.h = h;
            if (millis < 300000L) {
                jag.e().h(ktx.u, "Flex duration lesser than minimum allowed value; Changed to 300000");
            }
            if (millis > c.h) {
                final jag e = jag.e();
                final String u = ktx.u;
                final StringBuilder sb = new StringBuilder();
                sb.append("Flex duration greater than interval duration; Changed to ");
                sb.append(n);
                e.h(u, sb.toString());
            }
            c.i = jb2.H(millis, 300000L, c.h);
        }
        
        public final gtx c() {
            if (super.a && Build$VERSION.SDK_INT >= 23 && super.c.j.c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (super.c.q ^ true) {
                return new e4k(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
        
        public final gtx$a d() {
            return this;
        }
    }
}
