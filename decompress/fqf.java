import java.util.Objects;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqf
{
    public static final a Companion;
    public final long a;
    public final bxo b;
    public final gqf c;
    public final apf d;
    public final e39 e;
    
    static {
        Companion = new a();
    }
    
    public fqf(final long a, final bxo b, final gqf c, final apf d) {
        e0e.f((Object)b, "scheduler");
        e0e.f((Object)d, "accessibilityUtils");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new e39();
    }
    
    public final t5j<Float> a(final float n) {
        if (this.d.a()) {
            final t5j never = t5j.never();
            e0e.e((Object)never, "never()");
            return (t5j<Float>)never;
        }
        final long millis = TimeUnit.SECONDS.toMillis(this.a);
        final long n2 = (long)(millis * n);
        final long n3 = n2 / 16L;
        final long n4 = (millis - n2) / 16L;
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        final int f0 = fab.F0;
        final bxo a = jxo.a();
        final long n5 = lcmp(n4, 0L);
        if (n5 >= 0) {
            Object o;
            if (n5 == 0) {
                final qab g0 = qab.G0;
                Objects.requireNonNull(milliseconds, "unit is null");
                Objects.requireNonNull(a, "scheduler is null");
                o = new lab(Math.max(0L, 0L), a);
            }
            else {
                final long n6 = n4 - 1L + n3;
                if (n3 > 0L && n6 < 0L) {
                    throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
                }
                Objects.requireNonNull(milliseconds, "unit is null");
                Objects.requireNonNull(a, "scheduler is null");
                o = new zab(n3, n6, Math.max(0L, 0L), Math.max(0L, 16L), a);
            }
            final bbb bbb = new bbb(((fab)o).d(this.b), (rtb)new yj4((stb)new stb<Long, Float>(this) {
                public final Object invoke(final Object o) {
                    return ((Number)o).longValue() / (float)(TimeUnit.SECONDS.toMillis(((fqf)((ea3)this).receiver).a) / 16L);
                }
            }, 4));
            final e39 e = this.e;
            final gbb gbb = new gbb((fab)bbb);
            final rue rue = new rue((rk6)new aoa((stb)new stb<Float, vzv>(this.c) {
                public final Object invoke(final Object o) {
                    ((gqf)((ea3)this).receiver).n(((Number)o).floatValue());
                    return vzv.a;
                }
            }, 6), (rk6)new ug((stb)fqf$c.F0, 6));
            ((fab)gbb).h((ubb)rue);
            e.c((b39)rue);
            final bxo a2 = jxo.a();
            Objects.requireNonNull(milliseconds, "unit is null");
            Objects.requireNonNull(a2, "scheduler is null");
            return (t5j<Float>)new d8j((bol)new pbb((fab)bbb, a2));
        }
        throw new IllegalArgumentException(va.z("count >= 0 required but it was ", n4));
    }
    
    public static final class a
    {
    }
}
