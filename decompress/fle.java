import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import java.io.IOException;
import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fle
{
    public static final die$a a;
    
    static {
        a = die$a.a(new String[] { "x", "y" });
    }
    
    public static int a(final die die) throws IOException {
        die.a();
        final int n = (int)(die.n2() * 255.0);
        final int n2 = (int)(die.n2() * 255.0);
        final int n3 = (int)(die.n2() * 255.0);
        while (die.hasNext()) {
            die.h0();
        }
        die.c();
        return Color.argb(255, n, n2, n3);
    }
    
    public static PointF b(final die die, final float n) throws IOException {
        final int d = nb0.D(die.V2());
        if (d == 0) {
            die.a();
            final float n2 = (float)die.n2();
            final float n3 = (float)die.n2();
            while (die.V2() != 2) {
                die.h0();
            }
            die.c();
            return new PointF(n2 * n, n3 * n);
        }
        if (d == 2) {
            die.b();
            float d2 = 0.0f;
            float d3 = 0.0f;
            while (die.hasNext()) {
                final int f = die.f(fle.a);
                if (f != 0) {
                    if (f != 1) {
                        die.h();
                        die.h0();
                    }
                    else {
                        d3 = d(die);
                    }
                }
                else {
                    d2 = d(die);
                }
            }
            die.d();
            return new PointF(d2 * n, d3 * n);
        }
        if (d == 6) {
            final float n4 = (float)die.n2();
            final float n5 = (float)die.n2();
            while (die.hasNext()) {
                die.h0();
            }
            return new PointF(n4 * n, n5 * n);
        }
        final StringBuilder g = w48.g("Unknown point starts with ");
        g.append(t4a.y(die.V2()));
        throw new IllegalArgumentException(g.toString());
    }
    
    public static List<PointF> c(final die die, final float n) throws IOException {
        final ArrayList list = new ArrayList();
        die.a();
        while (die.V2() == 1) {
            die.a();
            list.add(b(die, n));
            die.c();
        }
        die.c();
        return list;
    }
    
    public static float d(final die die) throws IOException {
        final int v2 = die.V2();
        final int d = nb0.D(v2);
        if (d == 0) {
            die.a();
            final float n = (float)die.n2();
            while (die.hasNext()) {
                die.h0();
            }
            die.c();
            return n;
        }
        if (d == 6) {
            return (float)die.n2();
        }
        final StringBuilder g = w48.g("Unknown value for token of type ");
        g.append(t4a.y(v2));
        throw new IllegalArgumentException(g.toString());
    }
}
