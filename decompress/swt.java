import java.util.Arrays;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class swt implements f
{
    public static final f$a<swt> J0;
    public final int F0;
    public final String G0;
    public final n[] H0;
    public int I0;
    
    static {
        swt.J0 = jtx.L0;
    }
    
    public swt(String g0, n... h0) {
        final int length = h0.length;
        int n = 1;
        omi.m(length > 0);
        this.G0 = g0;
        this.H0 = h0;
        this.F0 = h0.length;
        final String h2 = h0[0].H0;
        Label_0074: {
            if (h2 != null) {
                g0 = h2;
                if (!h2.equals("und")) {
                    break Label_0074;
                }
            }
            g0 = "";
        }
        final int j0 = h0[0].J0;
        while (true) {
            h0 = this.H0;
            if (n >= h0.length) {
                break;
            }
            final String h3 = h0[n].H0;
            String s = null;
            Label_0122: {
                if (h3 != null) {
                    s = h3;
                    if (!h3.equals("und")) {
                        break Label_0122;
                    }
                }
                s = "";
            }
            if (!g0.equals(s)) {
                final n[] h4 = this.H0;
                b("languages", h4[0].H0, h4[n].H0, n);
                break;
            }
            h0 = this.H0;
            if ((j0 | 0x4000) != (h0[n].J0 | 0x4000)) {
                b("role flags", Integer.toBinaryString(h0[0].J0), Integer.toBinaryString(this.H0[n].J0), n);
                break;
            }
            ++n;
        }
    }
    
    public static void b(final String s, final String s2, final String s3, final int n) {
        final StringBuilder k = tf8.k(l58.g(s3, l58.g(s2, s.length() + 78)), "Different ", s, " combined in one TrackGroup: '", s2);
        k.append("' (track 0) and '");
        k.append(s3);
        k.append("' (track ");
        k.append(n);
        k.append(")");
        tqb.y("TrackGroup", "", new IllegalStateException(k.toString()));
    }
    
    public final int a(final n n) {
        int n2 = 0;
        while (true) {
            final n[] h0 = this.H0;
            if (n2 >= h0.length) {
                return -1;
            }
            if (n == h0[n2]) {
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
        if (o != null && swt.class == o.getClass()) {
            final swt swt = (swt)o;
            if (this.F0 != swt.F0 || !this.G0.equals(swt.G0) || !Arrays.equals(this.H0, swt.H0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.I0 == 0) {
            this.I0 = brg.d(this.G0, 527, 31) + Arrays.hashCode(this.H0);
        }
        return this.I0;
    }
}
