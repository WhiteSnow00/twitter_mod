import java.util.List;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbh
{
    public static PointF a;
    
    static {
        jbh.a = new PointF();
    }
    
    public static PointF a(final PointF pointF, final PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }
    
    public static float b(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n3, n));
    }
    
    public static int c(final int n) {
        return Math.max(0, Math.min(255, n));
    }
    
    public static int d(final float n, final float n2) {
        final int n3 = (int)n;
        final int n4 = (int)n2;
        final int n5 = n3 / n4;
        final boolean b = (n3 ^ n4) >= 0;
        int n6 = n5;
        if (!b) {
            n6 = n5;
            if (n3 % n4 != 0) {
                n6 = n5 - 1;
            }
        }
        return n3 - n4 * n6;
    }
    
    public static void e(final oqe oqe, final int n, final List<oqe> list, final oqe oqe2, final qqe qqe) {
        if (oqe.c(((jl6)qqe).getName(), n)) {
            list.add(oqe2.a(((jl6)qqe).getName()).g((pqe)qqe));
        }
    }
}
