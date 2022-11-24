import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ty0 implements f
{
    public static final ty0 L0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public AudioAttributes K0;
    
    static {
        L0 = new ty0(0, 0, 1, 1, 0);
    }
    
    public ty0(final int f0, final int g0, final int h0, final int i0, final int j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public static String b(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final AudioAttributes a() {
        if (this.K0 == null) {
            final AudioAttributes$Builder setUsage = new AudioAttributes$Builder().setContentType(this.F0).setFlags(this.G0).setUsage(this.H0);
            final int a = rnw.a;
            if (a >= 29) {
                ty0.ty0$a.a(setUsage, this.I0);
            }
            if (a >= 32) {
                ty0.ty0$b.a(setUsage, this.J0);
            }
            this.K0 = setUsage.build();
        }
        return this.K0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ty0.class == o.getClass()) {
            final ty0 ty0 = (ty0)o;
            if (this.F0 != ty0.F0 || this.G0 != ty0.G0 || this.H0 != ty0.H0 || this.I0 != ty0.I0 || this.J0 != ty0.J0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((527 + this.F0) * 31 + this.G0) * 31 + this.H0) * 31 + this.I0) * 31 + this.J0;
    }
}
