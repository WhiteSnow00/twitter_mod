import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpx extends gue implements jub<jkh, m76, Integer, jkh>
{
    public gpx() {
        super(3);
    }
    
    public final Object h0(Object o, Object y, final Object o2) {
        final jkh jkh = (jkh)o;
        final m76 m76 = (m76)y;
        lf.x((Number)o2, jkh, "$this$composed", m76, 359872873);
        final ea6$b a = ea6.a;
        final epx c = epx.Companion.c(m76);
        m76.x(1157296644);
        final boolean p3 = m76.P((Object)c);
        y = m76.y();
        Label_0106: {
            if (!p3) {
                Objects.requireNonNull(m76.Companion);
                if ((o = y) != m76$a.b) {
                    break Label_0106;
                }
            }
            o = new hsd((tox)c.c);
            m76.p(o);
        }
        m76.O();
        final hsd hsd = (hsd)o;
        m76.O();
        return hsd;
    }
}
