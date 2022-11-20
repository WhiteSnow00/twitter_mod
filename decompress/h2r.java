import java.util.Objects;
import android.view.ViewConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h2r
{
    public static final float a;
    
    static {
        a = ViewConfiguration.getScrollFriction();
    }
    
    public static final <T> bb8<T> a(final x66 x66, final int n) {
        x66.x(904445851);
        final n96$b a = n96.a;
        final lo8 lo8 = (lo8)x66.m((wd6)yd6.e);
        final float density = lo8.getDensity();
        x66.x(1157296644);
        final boolean p2 = x66.P((Object)density);
        final Object y = x66.y();
        Object o = null;
        Label_0107: {
            if (!p2) {
                Objects.requireNonNull(x66.Companion);
                if ((o = y) != x66$a.b) {
                    break Label_0107;
                }
            }
            o = new cb8((l6b)new g2r(lo8));
            x66.p(o);
        }
        x66.O();
        final bb8 bb8 = (bb8)o;
        x66.O();
        return (bb8<T>)bb8;
    }
}
