import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.LinkedHashSet;
import androidx.work.b;
import androidx.work.c;
import java.util.Set;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class xrx
{
    public static final b Companion;
    public final UUID a;
    public final bsx b;
    public final Set<String> c;
    
    static {
        Companion = new b();
    }
    
    public xrx(final UUID a, final bsx b, final Set<String> c) {
        zzd.f((Object)a, "id");
        zzd.f((Object)b, "workSpec");
        zzd.f((Object)c, "tags");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        final String string = this.a.toString();
        zzd.e((Object)string, "id.toString()");
        return string;
    }
    
    public abstract static class a<B extends a<B, ?>, W extends xrx>
    {
        public boolean a;
        public UUID b;
        public bsx c;
        public final Set<String> d;
        
        public a(final Class<? extends c> clazz) {
            final UUID randomUUID = UUID.randomUUID();
            zzd.e((Object)randomUUID, "randomUUID()");
            this.b = randomUUID;
            final String string = this.b.toString();
            zzd.e((Object)string, "id.toString()");
            this.c = new bsx(string, (xqx.a)null, clazz.getName(), (String)null, (androidx.work.b)null, (androidx.work.b)null, 0L, 0L, 0L, (kj6)null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0, 1048570, (hg8)null);
            final String name = clazz.getName();
            final LinkedHashSet d = new LinkedHashSet(kq9.W0(1));
            jt0.R0((Object[])new String[] { name }, (Collection)d);
            this.d = d;
        }
        
        public final B a(final String s) {
            zzd.f((Object)s, "tag");
            this.d.add(s);
            return this.d();
        }
        
        public final W b() {
            final xrx c = this.c();
            final kj6 j = this.c.j;
            final int sdk_INT = Build$VERSION.SDK_INT;
            final int n = 0;
            final boolean b = (sdk_INT >= 24 && j.a()) || j.d || j.b || (sdk_INT >= 23 && j.c);
            final bsx c2 = this.c;
            if (c2.q) {
                if (!(b ^ true)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                int n2 = n;
                if (c2.g <= 0L) {
                    n2 = 1;
                }
                if (n2 == 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            final UUID randomUUID = UUID.randomUUID();
            zzd.e((Object)randomUUID, "randomUUID()");
            this.b = randomUUID;
            final String string = randomUUID.toString();
            zzd.e((Object)string, "id.toString()");
            final bsx c3 = this.c;
            zzd.f((Object)c3, "other");
            final String c4 = c3.c;
            final xqx.a b2 = c3.b;
            final String d = c3.d;
            final androidx.work.b b3 = new androidx.work.b(c3.e);
            final androidx.work.b b4 = new androidx.work.b(c3.f);
            final long g = c3.g;
            final long h = c3.h;
            final long i = c3.i;
            final kj6 k = c3.j;
            zzd.f((Object)k, "other");
            this.c = new bsx(string, b2, c4, d, b3, b4, g, h, i, new kj6(k.a, k.b, k.c, k.d, k.e, k.f, k.g, k.h), c3.k, c3.l, c3.m, c3.n, c3.o, c3.p, c3.q, c3.r, c3.s, 0, 524288, (hg8)null);
            this.d();
            return (W)c;
        }
        
        public abstract W c();
        
        public abstract B d();
        
        public final B e(final Object l, long millis, TimeUnit milliseconds) {
            milliseconds = TimeUnit.MILLISECONDS;
            k1b.i((int)l, "backoffPolicy");
            zzd.f((Object)milliseconds, "timeUnit");
            this.a = true;
            final bsx c = this.c;
            c.l = (int)l;
            millis = milliseconds.toMillis(millis);
            if (millis > 18000000L) {
                y9g.e().h(bsx.u, "Backoff delay duration exceeds maximum value");
            }
            if (millis < 10000L) {
                y9g.e().h(bsx.u, "Backoff delay duration less than minimum value");
            }
            c.m = pf8.x(millis, 10000L, 18000000L);
            return this.d();
        }
        
        @SuppressLint({ "MissingGetterMatchingBuilder" })
        public final B f(final Object o) {
            k1b.i(1, "policy");
            final bsx c = this.c;
            c.q = true;
            c.r = 1;
            return this.d();
        }
        
        public final B g(final long n, final TimeUnit timeUnit) {
            zzd.f((Object)timeUnit, "timeUnit");
            this.c.g = timeUnit.toMillis(n);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return this.d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
        
        public final B h(final androidx.work.b e) {
            this.c.e = e;
            return this.d();
        }
    }
    
    public static final class b
    {
    }
}
