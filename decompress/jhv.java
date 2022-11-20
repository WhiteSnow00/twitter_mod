import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhv
{
    public static final boolean a(final c6m c6m, final c6m c6m2, final c6m c6m3, int n) {
        final boolean b = b(c6m3, n, c6m);
        final boolean b2 = true;
        if (!b) {
            if (b(c6m2, n, c6m)) {
                Objects.requireNonNull(rdb.Companion);
                boolean b3 = false;
                Label_0178: {
                    Label_0175: {
                        if (n == 3) {
                            if (c6m.a < c6m3.c) {
                                break Label_0175;
                            }
                        }
                        else if (n == 4) {
                            if (c6m.c > c6m3.a) {
                                break Label_0175;
                            }
                        }
                        else if (n == 5) {
                            if (c6m.b < c6m3.d) {
                                break Label_0175;
                            }
                        }
                        else {
                            if (n != 6) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            if (c6m.d > c6m3.b) {
                                break Label_0175;
                            }
                        }
                        b3 = true;
                        break Label_0178;
                    }
                    b3 = false;
                }
                if (!b3) {
                    return b2;
                }
                final boolean b5 = n == 3;
                boolean b4 = b2;
                if (b5) {
                    return b4;
                }
                if (n == 4) {
                    b4 = b2;
                    return b4;
                }
                float n6 = 0.0f;
                Label_0387: {
                    float n4 = 0.0f;
                    float n5 = 0.0f;
                    Label_0338: {
                        if (n != 3) {
                            float n2;
                            float n3;
                            if (n == 4) {
                                n2 = c6m2.a;
                                n3 = c6m.c;
                            }
                            else {
                                if (n == 5) {
                                    n4 = c6m.b;
                                    n5 = c6m2.d;
                                    break Label_0338;
                                }
                                if (n != 6) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                n2 = c6m2.b;
                                n3 = c6m.d;
                            }
                            n6 = n2 - n3;
                            break Label_0387;
                        }
                        n4 = c6m.a;
                        n5 = c6m2.c;
                    }
                    n6 = n4 - n5;
                }
                final float max = Math.max(0.0f, n6);
                float n11 = 0.0f;
                Label_0540: {
                    float n9 = 0.0f;
                    float n10 = 0.0f;
                    Label_0494: {
                        if (n != 3) {
                            float n7;
                            float n8;
                            if (n == 4) {
                                n7 = c6m3.c;
                                n8 = c6m.c;
                            }
                            else {
                                if (n == 5) {
                                    n9 = c6m.b;
                                    n10 = c6m3.b;
                                    break Label_0494;
                                }
                                if (n == 6) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                if (n == 0) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                n7 = c6m3.d;
                                n8 = c6m.d;
                            }
                            n11 = n7 - n8;
                            break Label_0540;
                        }
                        n9 = c6m.a;
                        n10 = c6m3.a;
                    }
                    n11 = n9 - n10;
                }
                if (max < Math.max(1.0f, n11)) {
                    b4 = b2;
                    return b4;
                }
            }
        }
        return false;
    }
    
    public static final boolean b(final c6m c6m, int n, final c6m c6m2) {
        Objects.requireNonNull(rdb.Companion);
        boolean b = true;
        boolean b2 = false;
        Label_0041: {
            if (n != 3) {
                if (n != 4) {
                    b2 = false;
                    break Label_0041;
                }
            }
            b2 = true;
        }
        if (b2) {
            if (c6m.d > c6m2.b && c6m.b < c6m2.d) {
                return b;
            }
        }
        else {
            Label_0104: {
                if (n != 5) {
                    if (n != 6) {
                        n = 0;
                        break Label_0104;
                    }
                }
                n = 1;
            }
            if (n == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (c6m.c > c6m2.a && c6m.a < c6m2.c) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final ceb c(final suh<ceb> suh, final c6m c6m, final int n) {
        Objects.requireNonNull(rdb.Companion);
        c6m c6m2;
        if (n == 3) {
            c6m2 = c6m.f(c6m.c - c6m.a + 1, 0.0f);
        }
        else if (n == 4) {
            c6m2 = c6m.f(-(c6m.c - c6m.a + 1), 0.0f);
        }
        else if (n == 5) {
            c6m2 = c6m.f(0.0f, c6m.d - c6m.b + 1);
        }
        else {
            if (n != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            c6m2 = c6m.f(0.0f, -(c6m.d - c6m.b + 1));
        }
        ceb ceb = null;
        final ceb ceb2 = null;
        final int f0 = suh.F0;
        if (f0 > 0) {
            final Object[] d0 = suh.D0;
            czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            ceb ceb3 = ceb2;
            c6m c6m3 = c6m2;
            int n3;
            ceb ceb5;
            do {
                final ceb ceb4 = (ceb)d0[n2];
                c6m c6m4 = c6m3;
                ceb5 = ceb3;
                if (jee.a0(ceb4)) {
                    final c6m t = jee.t(ceb4);
                    boolean b = false;
                    Label_0313: {
                        Label_0310: {
                            if (f(t, n, c6m)) {
                                if (f(c6m3, n, c6m)) {
                                    if (!a(c6m, t, c6m3, n)) {
                                        if (a(c6m, c6m3, t, n)) {
                                            break Label_0310;
                                        }
                                        if (g(n, c6m, t) >= g(n, c6m, c6m3)) {
                                            break Label_0310;
                                        }
                                    }
                                }
                                b = true;
                                break Label_0313;
                            }
                        }
                        b = false;
                    }
                    c6m4 = c6m3;
                    ceb5 = ceb3;
                    if (b) {
                        ceb5 = ceb4;
                        c6m4 = t;
                    }
                }
                n3 = n2 + 1;
                c6m3 = c6m4;
                ceb3 = ceb5;
            } while ((n2 = n3) < f0);
            ceb = ceb5;
        }
        return ceb;
    }
    
    public static final boolean d(ceb c, int n, final qsb<? super ceb, Boolean> qsb) {
        czd.f((Object)c, "$this$findChildCorrespondingToFocusEnter");
        czd.f((Object)qsb, "onFound");
        final Boolean a = ((peb)c.N0.j.invoke((Object)new rdb(n))).a((qsb)qsb);
        if (a != null) {
            return a;
        }
        final suh h = jee.h(c);
        final int f0 = h.F0;
        final boolean b = true;
        final boolean b2 = false;
        boolean booleanValue = false;
        if (f0 <= 1) {
            Object o;
            if (h.l()) {
                o = null;
            }
            else {
                o = h.D0[0];
            }
            c = (ceb)o;
            if (c != null) {
                booleanValue = (boolean)qsb.invoke((Object)c);
            }
            return booleanValue;
        }
        Objects.requireNonNull(rdb.Companion);
        if (n == 7) {
            n = 3;
        }
        boolean b3 = false;
        Label_0194: {
            if (n != 4) {
                if (n != 6) {
                    b3 = false;
                    break Label_0194;
                }
            }
            b3 = true;
        }
        c6m c6m;
        if (b3) {
            final c6m t = jee.t(c);
            final float a2 = t.a;
            final float b4 = t.b;
            c6m = new c6m(a2, b4, a2, b4);
        }
        else {
            int n2;
            if (n == 3) {
                n2 = (b ? 1 : 0);
            }
            else if (n == 5) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            final c6m t2 = jee.t(c);
            final float c2 = t2.c;
            final float d = t2.d;
            c6m = new c6m(c2, d, c2, d);
        }
        c = c((suh<ceb>)h, c6m, n);
        boolean booleanValue2 = b2;
        if (c != null) {
            booleanValue2 = (boolean)qsb.invoke((Object)c);
        }
        return booleanValue2;
    }
    
    public static final boolean e(final ceb ceb, final ceb ceb2, final int n, final qsb<? super ceb, Boolean> qsb) {
        if (h(ceb, ceb2, n, qsb)) {
            return true;
        }
        final Boolean b = (Boolean)af8.M(ceb, n, (qsb)new jhv$a(ceb, ceb2, n, (qsb)qsb));
        return b != null && b;
    }
    
    public static final boolean f(final c6m c6m, int n, final c6m c6m2) {
        Objects.requireNonNull(rdb.Companion);
        final boolean b = false;
        if (n == 3) {
            final float c = c6m2.c;
            final float c2 = c6m.c;
            if (c <= c2) {
                final boolean b2 = b;
                if (c6m2.a < c2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (c6m2.a <= c6m.a) {
                return b2;
            }
        }
        else if (n == 4) {
            final float a = c6m2.a;
            final float a2 = c6m.a;
            if (a >= a2) {
                final boolean b2 = b;
                if (c6m2.c > a2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (c6m2.c >= c6m.c) {
                return b2;
            }
        }
        else if (n == 5) {
            final float d = c6m2.d;
            final float d2 = c6m.d;
            if (d <= d2) {
                final boolean b2 = b;
                if (c6m2.b < d2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (c6m2.b <= c6m.b) {
                return b2;
            }
        }
        else {
            if (n == 6) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            final float b3 = c6m2.b;
            final float b4 = c6m.b;
            if (b3 >= b4) {
                final boolean b2 = b;
                if (c6m2.d > b4) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (c6m2.d >= c6m.d) {
                return b2;
            }
        }
        return true;
    }
    
    public static final long g(int n, final c6m c6m, final c6m c6m2) {
        Objects.requireNonNull(rdb.Companion);
        final int n2 = 0;
        final int n3 = 1;
        float n4;
        float n5;
        if (n == 3) {
            n4 = c6m.a;
            n5 = c6m2.c;
        }
        else if (n == 4) {
            n4 = c6m2.a;
            n5 = c6m.c;
        }
        else if (n == 5) {
            n4 = c6m.b;
            n5 = c6m2.d;
        }
        else {
            if (n != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            n4 = c6m2.b;
            n5 = c6m.d;
        }
        final long n6 = (long)Math.abs(Math.max(0.0f, n4 - n5));
        boolean b = false;
        Label_0193: {
            if (n != 3) {
                if (n != 4) {
                    b = false;
                    break Label_0193;
                }
            }
            b = true;
        }
        float n7;
        float n8;
        float n9;
        float n10;
        if (b) {
            final float b2 = c6m.b;
            final float d = c6m.d;
            n7 = 2;
            n8 = (d - b2) / n7 + b2;
            n9 = c6m2.b;
            n10 = c6m2.d;
        }
        else {
            if (n == 5) {
                n = n3;
            }
            else {
                int n11 = n2;
                if (n == 6) {
                    n11 = 1;
                }
                n = n11;
            }
            if (n == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            final float a = c6m.a;
            final float c = c6m.c;
            n7 = 2;
            n8 = (c - a) / n7 + a;
            n9 = c6m2.a;
            n10 = c6m2.c;
        }
        final long n12 = (long)Math.abs(n8 - ((n10 - n9) / n7 + n9));
        return n12 * n12 + 13 * n6 * n6;
    }
    
    public static final boolean h(final ceb ceb, final ceb ceb2, final int n, final qsb<? super ceb, Boolean> qsb) {
        final suh f0 = ceb.F0;
        final suh suh = new suh((Object[])new ceb[f0.F0]);
        suh.e(suh.F0, f0);
        while (suh.m()) {
            final ceb c = c((suh<ceb>)suh, jee.t(ceb2), n);
            if (c == null) {
                return false;
            }
            if (!c.G0.e()) {
                return (boolean)qsb.invoke((Object)c);
            }
            final Boolean a = ((peb)c.N0.j.invoke((Object)new rdb(n))).a((qsb)qsb);
            if (a != null) {
                return a;
            }
            if (e(c, ceb2, n, qsb)) {
                return true;
            }
            suh.n((Object)c);
        }
        return false;
    }
    
    public static final boolean i(final ceb ceb, final int n, final qsb<? super ceb, Boolean> qsb) {
        final int ordinal = ((Enum)ceb.G0).ordinal();
        if (ordinal != 0) {
            boolean b = false;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return d(ceb, n, qsb);
                }
                if (ordinal == 3) {
                    return false;
                }
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return (boolean)((beb$a)qsb).invoke((Object)ceb);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            final ceb h0 = ceb.H0;
            if (h0 != null) {
                final int ordinal2 = ((Enum)h0.G0).ordinal();
                if (ordinal2 != 0) {
                    Label_0148: {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 == 4) {
                                        break Label_0148;
                                    }
                                    if (ordinal2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            return e(ceb, h0, n, qsb);
                        }
                    }
                    if (i(h0, n, qsb)) {
                        return true;
                    }
                    final Boolean a = ((peb)h0.N0.k.invoke((Object)new rdb(n))).a((qsb)qsb);
                    if (a != null) {
                        return a;
                    }
                    final ueb g0 = h0.G0;
                    if (g0 == ueb.E0 || g0 == ueb.H0) {
                        b = true;
                    }
                    if (!b) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    final ceb q = jee.q(h0);
                    if (q != null) {
                        return e(ceb, q, n, qsb);
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return e(ceb, h0, n, qsb);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return d(ceb, n, qsb);
    }
}
