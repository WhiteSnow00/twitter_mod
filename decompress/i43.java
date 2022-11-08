import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i43
{
    public static final i43 a;
    public static final vrj b;
    public static final float c;
    public static final float d;
    public static final vrj e;
    
    static {
        a = new i43();
        final float n = 16;
        final float n2 = 8;
        b = new vrj(n, n2, n, n2);
        c = 64;
        d = 36;
        e = new vrj(n2, n2, n2, n2);
    }
    
    public final a43 a(long h, final m76 m76, final int n) {
        m76.x(182742216);
        long b = 0L;
        long f;
        if ((n & 0x1) != 0x0) {
            Objects.requireNonNull(pr4.Companion);
            f = pr4.f;
        }
        else {
            f = 0L;
        }
        if ((n & 0x2) != 0x0) {
            final ea6$b a = ea6.a;
            h = ((ks4)m76.m((re6)ls4.a)).h();
        }
        if ((n & 0x4) != 0x0) {
            final ea6$b a2 = ea6.a;
            b = pr4.b(((ks4)m76.m((re6)ls4.a)).g(), x3j.B(m76, 6));
        }
        final ea6$b a3 = ea6.a;
        final nf8 nf8 = new nf8(f, h, f, b);
        m76.O();
        return (a43)nf8;
    }
}
