import java.util.Arrays;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwt implements f
{
    public static final f$a<bwt> H0;
    public final int D0;
    public final String E0;
    public final n[] F0;
    public int G0;
    
    static {
        bwt.H0 = mt8.L0;
    }
    
    public bwt(String e0, n... f0) {
        final int length = f0.length;
        int n = 1;
        omy.g(length > 0);
        this.E0 = e0;
        this.F0 = f0;
        this.D0 = f0.length;
        final String f2 = f0[0].F0;
        Label_0074: {
            if (f2 != null) {
                e0 = f2;
                if (!f2.equals("und")) {
                    break Label_0074;
                }
            }
            e0 = "";
        }
        final int h0 = f0[0].H0;
        while (true) {
            f0 = this.F0;
            if (n >= f0.length) {
                break;
            }
            final String f3 = f0[n].F0;
            String s = null;
            Label_0122: {
                if (f3 != null) {
                    s = f3;
                    if (!f3.equals("und")) {
                        break Label_0122;
                    }
                }
                s = "";
            }
            if (!e0.equals(s)) {
                final n[] f4 = this.F0;
                b("languages", f4[0].F0, f4[n].F0, n);
                break;
            }
            f0 = this.F0;
            if ((h0 | 0x4000) != (f0[n].H0 | 0x4000)) {
                b("role flags", Integer.toBinaryString(f0[0].H0), Integer.toBinaryString(this.F0[n].H0), n);
                break;
            }
            ++n;
        }
    }
    
    public static void b(final String s, final String s2, final String s3, final int n) {
        final StringBuilder d = x70.D(wnj.f(s3, wnj.f(s2, s.length() + 78)), "Different ", s, " combined in one TrackGroup: '", s2);
        d.append("' (track 0) and '");
        d.append(s3);
        d.append("' (track ");
        d.append(n);
        d.append(")");
        g63.s("TrackGroup", "", (Throwable)new IllegalStateException(d.toString()));
    }
    
    public final int a(final n n) {
        int n2 = 0;
        while (true) {
            final n[] f0 = this.F0;
            if (n2 >= f0.length) {
                return -1;
            }
            if (n == f0[n2]) {
                return n2;
            }
            ++n2;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bwt.class == o.getClass()) {
            final bwt bwt = (bwt)o;
            if (this.D0 != bwt.D0 || !this.E0.equals(bwt.E0) || !Arrays.equals(this.F0, bwt.F0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.G0 == 0) {
            this.G0 = hmg.f(this.E0, 527, 31) + Arrays.hashCode(this.F0);
        }
        return this.G0;
    }
}
