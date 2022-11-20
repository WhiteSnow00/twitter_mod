import android.os.Build$VERSION;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifg
{
    public static final a Companion;
    public static final ifg g;
    public static final ifg h;
    public final boolean a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    
    static {
        Companion = new a();
        final ifg ifg = g = new ifg();
        h = new ifg(ifg.b, ifg.c, ifg.d, ifg.e, false);
    }
    
    public ifg() {
        Objects.requireNonNull(p89.Companion);
        final long c = p89.c;
        final m89$a companion = m89.Companion;
        Objects.requireNonNull(companion);
        Objects.requireNonNull(companion);
        this.a = false;
        this.b = c;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = true;
        this.f = false;
    }
    
    public ifg(final long b, final float c, final float d, final boolean e, final boolean f) {
        this.a = true;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean a() {
        final a companion = ifg.Companion;
        final int sdk_INT = Build$VERSION.SDK_INT;
        Objects.requireNonNull(companion);
        final ehp<nsb<wfj>> a = hfg.a;
        final boolean b = true;
        if (sdk_INT >= 28) {
            if (!this.f) {
                boolean b2 = b;
                if (this.a) {
                    return b2;
                }
                if (czd.a((Object)this, (Object)ifg.g)) {
                    b2 = b;
                    return b2;
                }
                if (sdk_INT >= 29) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ifg)) {
            return false;
        }
        final boolean a = this.a;
        final ifg ifg = (ifg)o;
        if (a != ifg.a) {
            return false;
        }
        final long b = this.b;
        final long b2 = ifg.b;
        final p89$a companion = p89.Companion;
        return b == b2 && m89.b(this.c, ifg.c) && m89.b(this.d, ifg.d) && this.e == ifg.e && this.f == ifg.f;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1231;
        int n2;
        if (a) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int g = c0.g(this.d, c0.g(this.c, (p89.c(this.b) + n2 * 31) * 31, 31), 31);
        int n3;
        if (this.e) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        if (!this.f) {
            n = 1237;
        }
        return (g + n3) * 31 + n;
    }
    
    @Override
    public final String toString() {
        String h;
        if (this.a) {
            h = "MagnifierStyle.TextDefault";
        }
        else {
            final StringBuilder j = fu8.j("MagnifierStyle(size=");
            j.append((Object)p89.d(this.b));
            j.append(", cornerRadius=");
            j.append((Object)m89.e(this.c));
            j.append(", elevation=");
            j.append((Object)m89.e(this.d));
            j.append(", clippingEnabled=");
            j.append(this.e);
            j.append(", fishEyeEnabled=");
            h = zc.H(j, this.f, ')');
        }
        return h;
    }
    
    public static final class a
    {
    }
}
