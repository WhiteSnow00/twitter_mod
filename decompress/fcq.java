import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcq
{
    public static final v3r<pr4> a;
    
    static {
        a = lr0.Q(0.0f, (Object)null, 7);
    }
    
    public static final q7r a(final long n, final dc0 dc0, final m76 m76, final int n2) {
        m76.x(-1942442407);
        final ea6$b a = ea6.a;
        final q7r b = b(n, dc0, (rtb)null, m76, (n2 & 0xE) | 0x40 | (n2 << 3 & 0x1C00), 4);
        m76.O();
        return b;
    }
    
    public static final q7r<pr4> b(final long n, dc0<pr4> a, String s, final rtb<? super pr4, oyv> rtb, final m76 m76, int n2, final int n3) {
        ((m76)rtb).x(-451899108);
        if ((n2 & 0x2) != 0x0) {
            a = fcq.a;
        }
        String s2;
        if ((n2 & 0x4) != 0x0) {
            s2 = "ColorAnimation";
        }
        else {
            s2 = null;
        }
        if ((n2 & 0x8) != 0x0) {
            s = null;
        }
        final ea6$b a2 = ea6.a;
        final as4 f = pr4.f(n);
        ((m76)rtb).x(1157296644);
        final boolean p7 = ((m76)rtb).P((Object)f);
        final Object y = ((m76)rtb).y();
        Object o = null;
        Label_0144: {
            if (!p7) {
                Objects.requireNonNull(m76.Companion);
                if ((o = y) != m76$a.b) {
                    break Label_0144;
                }
            }
            js4.b(pr4.Companion);
            o = js4.a.invoke((Object)pr4.f(n));
            ((m76)rtb).p(o);
        }
        ((m76)rtb).O();
        final chv chv = (chv)o;
        final pr4 pr4 = new pr4(n);
        n2 = (int)(m76 << 6);
        final q7r c = x80.c((Object)pr4, chv, (dc0)a, (Object)null, s2, (rtb)s, (m76)rtb, (int)((0x70000 & n2) | ((m76 & 0xE) | 0x240 | (0xE000 & n2))), 8);
        ((m76)rtb).O();
        return (q7r<pr4>)c;
    }
}
