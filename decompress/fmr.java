import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmr extends dcu
{
    public static final fmr.fmr$a Companion;
    public final float F0;
    public final float G0;
    public final int H0;
    public final int I0;
    public final f0k J0;
    
    static {
        Companion = new fmr.fmr$a();
        Objects.requireNonNull(gmr.Companion);
        Objects.requireNonNull(imr.Companion);
    }
    
    public fmr(float f0, float g0, int h0, int i0, final int n) {
        if ((n & 0x1) != 0x0) {
            f0 = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            g0 = 4.0f;
        }
        if ((n & 0x4) != 0x0) {
            Objects.requireNonNull(gmr.Companion);
            h0 = 0;
        }
        if ((n & 0x8) != 0x0) {
            Objects.requireNonNull(imr.Companion);
            i0 = 0;
        }
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = null;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fmr)) {
            return false;
        }
        final float f0 = this.F0;
        final fmr fmr = (fmr)o;
        return f0 == fmr.F0 && this.G0 == fmr.G0 && this.H0 == fmr.H0 && this.I0 == fmr.I0 && e0e.a((Object)this.J0, (Object)fmr.J0);
    }
    
    public final int hashCode() {
        final int g = dn.g(this.G0, Float.floatToIntBits(this.F0) * 31, 31);
        final int h0 = this.H0;
        final int i0 = this.I0;
        final f0k j0 = this.J0;
        int hashCode;
        if (j0 != null) {
            hashCode = j0.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((g + h0) * 31 + i0) * 31 + hashCode;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Stroke(width=");
        f.append(this.F0);
        f.append(", miter=");
        f.append(this.G0);
        f.append(", cap=");
        f.append((Object)gmr.a(this.H0));
        f.append(", join=");
        f.append((Object)imr.a(this.I0));
        f.append(", pathEffect=");
        f.append(this.J0);
        f.append(')');
        return f.toString();
    }
}
