import java.io.IOException;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v80
{
    public static final die$a a;
    public static final die$a b;
    
    static {
        a = die$a.a(new String[] { "a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa" });
        b = die$a.a(new String[] { "k" });
    }
    
    public static u80 a(final die die, final kdg kdg) throws IOException {
        final boolean b = die.V2() == 3;
        if (b) {
            die.b();
        }
        g80 j0 = null;
        Object o = null;
        w80 b2 = null;
        Object j2 = null;
        Object j3 = null;
        l80 a = null;
        i80 k0 = null;
        g80 j4 = null;
        g80 j5 = null;
        while (die.hasNext()) {
            switch (die.f(v80.a)) {
                default: {
                    die.h();
                    die.h0();
                    continue;
                }
                case 9: {
                    j2 = m0n.j0(die, kdg, false);
                    continue;
                }
                case 8: {
                    j3 = m0n.j0(die, kdg, false);
                    continue;
                }
                case 7: {
                    j5 = m0n.j0(die, kdg, false);
                    continue;
                }
                case 6: {
                    j4 = m0n.j0(die, kdg, false);
                    continue;
                }
                case 5: {
                    k0 = m0n.k0(die, kdg);
                    continue;
                }
                case 3: {
                    kdg.a("Lottie doesn't support 3D layers.");
                }
                case 4: {
                    j0 = m0n.j0(die, kdg, false);
                    if (((List)((r7b)j0).b).isEmpty()) {
                        ((List)((r7b)j0).b).add(new rre(kdg, (Object)0.0f, (Object)0.0f, (Interpolator)null, 0.0f, Float.valueOf(kdg.l)));
                        continue;
                    }
                    final g80 g80 = j0;
                    if (((rre)((List)((r7b)g80).b).get(0)).b == null) {
                        ((List)((r7b)g80).b).set(0, new rre(kdg, (Object)0.0f, (Object)0.0f, (Interpolator)null, 0.0f, Float.valueOf(kdg.l)));
                        continue;
                    }
                    continue;
                }
                case 2: {
                    o = new o80(m0n.h0(die, kdg, (aow)asy.H0));
                    continue;
                }
                case 1: {
                    b2 = m80.b(die, kdg);
                    continue;
                }
                case 0: {
                    die.b();
                    while (die.hasNext()) {
                        if (die.f(v80.b) != 0) {
                            die.h();
                            die.h0();
                        }
                        else {
                            a = m80.a(die, kdg);
                        }
                    }
                    die.d();
                    continue;
                }
            }
        }
        if (b) {
            die.d();
        }
        if (a == null || (a.f() && ((PointF)((rre)a.a.get(0)).b).equals(0.0f, 0.0f))) {
            a = null;
        }
        final boolean b3 = b2 == null || (!(b2 instanceof q80) && b2.f() && ((PointF)b2.h().get(0).b).equals(0.0f, 0.0f));
        w80 w80 = b2;
        if (b3) {
            w80 = null;
        }
        g80 g81;
        if (j0 == null || (((r7b)j0).f() && (float)((rre)((List)((r7b)j0).b).get(0)).b == 0.0f)) {
            g81 = null;
        }
        else {
            g81 = j0;
        }
        boolean b4 = false;
        Label_0677: {
            Label_0675: {
                if (o != null) {
                    if (((r7b)o).f()) {
                        final cuo cuo = (cuo)((List)((r7b)o).b).get(0).b;
                        if (cuo.a == 1.0f && cuo.b == 1.0f) {
                            break Label_0675;
                        }
                    }
                    b4 = false;
                    break Label_0677;
                }
            }
            b4 = true;
        }
        Object o2;
        if (b4) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        if (j3 == null || (((r7b)j3).f() && (float)((rre)((List)((r7b)j3).b).get(0)).b == 0.0f)) {
            j3 = null;
        }
        if (j2 == null || (((r7b)j2).f() && (float)((rre)((List)((r7b)j2).b).get(0)).b == 0.0f)) {
            j2 = null;
        }
        return new u80(a, w80, (o80)o2, g81, k0, j4, j5, (g80)j3, (g80)j2);
    }
}
