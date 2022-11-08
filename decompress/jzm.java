import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzm
{
    public static final abu<Float> a;
    
    static {
        a = new abu<Float>(15, (cq9)eq9.d, 2);
    }
    
    public static final fld a(boolean b, float n, long g, final m76 m76, final int n2, final int n3) {
        m76.x(1635163520);
        if ((n3 & 0x1) != 0x0) {
            b = true;
        }
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(e99.Companion);
            n = Float.NaN;
        }
        if ((n3 & 0x4) != 0x0) {
            Objects.requireNonNull(pr4.Companion);
            g = pr4.g;
        }
        final q7r v = nkz.v((Object)new pr4(g), m76);
        final e99 e99 = new e99(n);
        m76.x(-3686552);
        final boolean p6 = m76.P((Object)b);
        final boolean p7 = m76.P((Object)e99);
        final Object y = m76.y();
        thk thk = null;
        Label_0170: {
            if (!(p6 | p7)) {
                Objects.requireNonNull(m76.Companion);
                if ((thk = (thk)y) != m76$a.b) {
                    break Label_0170;
                }
            }
            thk = new thk(b, n, v, (hg8)null);
            m76.p((Object)thk);
        }
        m76.O();
        final thk thk2 = thk;
        m76.O();
        return (fld)thk2;
    }
}
