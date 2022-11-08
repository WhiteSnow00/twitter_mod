import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w02 extends cvj
{
    public final h6d H0;
    public final long I0;
    public final long J0;
    public int K0;
    public final long L0;
    public float M0;
    public sr4 N0;
    
    public w02(final h6d h0) {
        Objects.requireNonNull(cud.Companion);
        final long b = cud.b;
        final long b2 = lr0.b(h0.getWidth(), h0.getHeight());
        this.H0 = h0;
        this.I0 = b;
        this.J0 = b2;
        Objects.requireNonNull(i0b.Companion);
        boolean b3 = true;
        this.K0 = 1;
        final cud$a companion = cud.Companion;
        Label_0135: {
            if ((int)(b >> 32) >= 0 && cud.c(b) >= 0) {
                final int n = (int)(b2 >> 32);
                if (n >= 0 && iud.b(b2) >= 0 && n <= h0.getWidth() && iud.b(b2) <= h0.getHeight()) {
                    break Label_0135;
                }
            }
            b3 = false;
        }
        if (b3) {
            this.L0 = b2;
            this.M0 = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final boolean b(final float m0) {
        this.M0 = m0;
        return true;
    }
    
    public final boolean e(final sr4 n0) {
        this.N0 = n0;
        return true;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w02)) {
            return false;
        }
        final h6d h0 = this.H0;
        final w02 w02 = (w02)o;
        return zzd.a((Object)h0, (Object)w02.H0) && cud.b(this.I0, w02.I0) && iud.a(this.J0, w02.J0) && this.K0 == w02.K0;
    }
    
    public final long h() {
        return lr0.T(this.L0);
    }
    
    public final int hashCode() {
        final int hashCode = this.H0.hashCode();
        final long i0 = this.I0;
        final cud$a companion = cud.Companion;
        return (iud.c(this.J0) + (hashCode * 31 + (int)(i0 ^ i0 >>> 32)) * 31) * 31 + this.K0;
    }
    
    public final void j(final ld9 ld9) {
        zzd.f((Object)ld9, "<this>");
        kd9.d(ld9, this.H0, this.I0, this.J0, 0L, lr0.b(q0b.p(mcq.d(ld9.c())), q0b.p(mcq.b(ld9.c()))), this.M0, (uau)null, this.N0, 0, this.K0, 328, (Object)null);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("BitmapPainter(image=");
        g.append(this.H0);
        g.append(", srcOffset=");
        g.append((Object)cud.d(this.I0));
        g.append(", srcSize=");
        g.append((Object)iud.d(this.J0));
        g.append(", filterQuality=");
        final int k0 = this.K0;
        final int n = 0;
        String s;
        if (k0 == 0) {
            s = "None";
        }
        else if (k0 == 1) {
            s = "Low";
        }
        else if (k0 == 2) {
            s = "Medium";
        }
        else {
            int n2 = n;
            if (k0 == 3) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "High";
            }
            else {
                s = "Unknown";
            }
        }
        g.append((Object)s);
        g.append(')');
        return g.toString();
    }
}
