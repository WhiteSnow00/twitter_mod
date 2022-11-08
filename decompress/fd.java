import com.twitter.util.forecaster.NetworkForecastChangedEvent;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fd<OBJECT, ERROR> extends ysm<tsc<OBJECT, ERROR>>
{
    public int a;
    public long b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final zau i;
    
    public fd(final int d, final int e, final int f, final int g) {
        this.a = -1;
        this.b = -1L;
        this.c = 0;
        if (d > 0 && e > 0 && f > 0 && g > 0) {
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.i = zau.d();
            this.h = dta.b().b("android_disable_offline_retries", false);
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public final long a(final ism<tsc<OBJECT, ERROR>> ism) {
        int a;
        if (this.h && !xcs.a().j()) {
            a = (int)this.f();
        }
        else {
            a = this.a;
        }
        return a;
    }
    
    public final String b() {
        return String.format(Locale.ENGLISH, "%s_count%d_min%d_max%d_timeout%d", this.getClass().getSimpleName(), this.g, this.d, this.e, this.f);
    }
    
    public final boolean c(final ism<tsc<OBJECT, ERROR>> ism) {
        final tsc tsc = (tsc)ism.e();
        boolean b = false;
        final boolean b2 = false;
        if (tsc != null && zi8.F(tsc)) {
            if (this.a < 0) {
                this.a = this.d;
                this.b = this.i.b();
            }
            else {
                this.a = Math.min(this.e, this.e());
            }
            boolean b3 = b2;
            if (this.c < this.g) {
                b3 = b2;
                if (this.f() > 0L) {
                    b3 = true;
                }
            }
            if (b = b3) {
                ++this.c;
                b = b3;
            }
        }
        return b;
    }
    
    public final boolean d(final jci jci, final ism<tsc<OBJECT, ERROR>> ism) {
        final boolean b = jci instanceof jci;
        boolean f;
        final boolean b2 = f = false;
        if (b) {
            final NetworkForecastChangedEvent a = jci.a;
            final kdi a2 = a.a;
            final kdi d0 = kdi.D0;
            f = b2;
            if (a2 == d0) {
                f = b2;
                if (a.b != d0) {
                    final tsc tsc = (tsc)ism.e();
                    if (tsc == null) {
                        f = b2;
                    }
                    else {
                        f = zi8.F(tsc);
                    }
                }
            }
        }
        return f;
    }
    
    public abstract int e();
    
    public final long f() {
        if (this.b > 0L) {
            return this.f - (this.i.b() - this.b);
        }
        return this.f;
    }
}
