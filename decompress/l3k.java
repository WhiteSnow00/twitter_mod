import android.os.Build$VERSION;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import androidx.work.c;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3k extends xrx
{
    public static final l3k.l3k$b Companion;
    
    static {
        Companion = new l3k.l3k$b();
    }
    
    public l3k(final a a) {
        zzd.f((Object)a, "builder");
        super(a.b, a.c, a.d);
    }
    
    public static final class a extends xrx.a<a, l3k>
    {
        public a(final Class<? extends c> clazz, long n, final TimeUnit timeUnit) {
            zzd.f((Object)timeUnit, "repeatIntervalTimeUnit");
            super(clazz);
            final bsx c = super.c;
            long millis = timeUnit.toMillis(n);
            Objects.requireNonNull(c);
            long h = 900000L;
            final long n2 = lcmp(millis, 900000L);
            if (n2 < 0) {
                y9g.e().h(bsx.u, "Interval duration lesser than minimum allowed value; Changed to 900000");
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
                y9g.e().h(bsx.u, "Interval duration lesser than minimum allowed value; Changed to 900000");
            }
            if (n3 >= 0) {
                h = n;
            }
            c.h = h;
            if (millis < 300000L) {
                y9g.e().h(bsx.u, "Flex duration lesser than minimum allowed value; Changed to 300000");
            }
            if (millis > c.h) {
                final y9g e = y9g.e();
                final String u = bsx.u;
                final StringBuilder sb = new StringBuilder();
                sb.append("Flex duration greater than interval duration; Changed to ");
                sb.append(n);
                e.h(u, sb.toString());
            }
            c.i = pf8.x(millis, 300000L, c.h);
        }
        
        @Override
        public final xrx c() {
            if (super.a && Build$VERSION.SDK_INT >= 23 && super.c.j.c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (super.c.q ^ true) {
                return new l3k(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }
        
        @Override
        public final xrx.a d() {
            return this;
        }
    }
}
