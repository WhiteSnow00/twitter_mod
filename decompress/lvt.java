import java.util.Arrays;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.f$a;
import com.google.android.exoplayer2.f;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvt implements f
{
    public static final f$a<lvt> G0;
    public final int C0;
    public final String D0;
    public final n[] E0;
    public int F0;
    
    static {
        lvt.G0 = asx.I0;
    }
    
    public lvt(String d0, n... e0) {
        final int length = e0.length;
        int n = 1;
        ri4.k(length > 0);
        this.D0 = d0;
        this.E0 = e0;
        this.C0 = e0.length;
        final String e2 = e0[0].E0;
        Label_0073: {
            if (e2 != null) {
                d0 = e2;
                if (!e2.equals("und")) {
                    break Label_0073;
                }
            }
            d0 = "";
        }
        final int g0 = e0[0].G0;
        while (true) {
            e0 = this.E0;
            if (n >= e0.length) {
                break;
            }
            final String e3 = e0[n].E0;
            String s = null;
            Label_0122: {
                if (e3 != null) {
                    s = e3;
                    if (!e3.equals("und")) {
                        break Label_0122;
                    }
                }
                s = "";
            }
            if (!d0.equals(s)) {
                final n[] e4 = this.E0;
                b("languages", e4[0].E0, e4[n].E0, n);
                break;
            }
            e0 = this.E0;
            if ((g0 | 0x4000) != (e0[n].G0 | 0x4000)) {
                b("role flags", Integer.toBinaryString(e0[0].G0), Integer.toBinaryString(this.E0[n].G0), n);
                break;
            }
            ++n;
        }
    }
    
    public static void b(final String s, final String s2, final String s3, final int n) {
        final StringBuilder n2 = xpa.n(dia.o(s3, dia.o(s2, s.length() + 78)), "Different ", s, " combined in one TrackGroup: '", s2);
        n2.append("' (track 0) and '");
        n2.append(s3);
        n2.append("' (track ");
        n2.append(n);
        n2.append(")");
        dml.s("TrackGroup", "", (Throwable)new IllegalStateException(n2.toString()));
    }
    
    public final int a(final n n) {
        int n2 = 0;
        while (true) {
            final n[] e0 = this.E0;
            if (n2 >= e0.length) {
                return -1;
            }
            if (n == e0[n2]) {
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
        if (o != null && lvt.class == o.getClass()) {
            final lvt lvt = (lvt)o;
            if (this.C0 != lvt.C0 || !this.D0.equals(lvt.D0) || !Arrays.equals(this.E0, lvt.E0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.F0 == 0) {
            this.F0 = l7k.a(this.D0, 527, 31) + Arrays.hashCode(this.E0);
        }
        return this.F0;
    }
}
