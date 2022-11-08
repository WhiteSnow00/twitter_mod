import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgv
{
    public static final boolean a(final n5m n5m, final n5m n5m2, final n5m n5m3, int n) {
        final boolean b = b(n5m3, n, n5m);
        final boolean b2 = true;
        if (!b) {
            if (b(n5m2, n, n5m)) {
                Objects.requireNonNull(teb.Companion);
                boolean b3 = false;
                Label_0178: {
                    Label_0175: {
                        if (n == 3) {
                            if (n5m.a < n5m3.c) {
                                break Label_0175;
                            }
                        }
                        else if (n == 4) {
                            if (n5m.c > n5m3.a) {
                                break Label_0175;
                            }
                        }
                        else if (n == 5) {
                            if (n5m.b < n5m3.d) {
                                break Label_0175;
                            }
                        }
                        else {
                            if (n != 6) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            if (n5m.d > n5m3.b) {
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
                                n2 = n5m2.a;
                                n3 = n5m.c;
                            }
                            else {
                                if (n == 5) {
                                    n4 = n5m.b;
                                    n5 = n5m2.d;
                                    break Label_0338;
                                }
                                if (n != 6) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                n2 = n5m2.b;
                                n3 = n5m.d;
                            }
                            n6 = n2 - n3;
                            break Label_0387;
                        }
                        n4 = n5m.a;
                        n5 = n5m2.c;
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
                                n7 = n5m3.c;
                                n8 = n5m.c;
                            }
                            else {
                                if (n == 5) {
                                    n9 = n5m.b;
                                    n10 = n5m3.b;
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
                                n7 = n5m3.d;
                                n8 = n5m.d;
                            }
                            n11 = n7 - n8;
                            break Label_0540;
                        }
                        n9 = n5m.a;
                        n10 = n5m3.a;
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
    
    public static final boolean b(final n5m n5m, int n, final n5m n5m2) {
        Objects.requireNonNull(teb.Companion);
        boolean b = true;
        boolean b2 = false;
        Label_0045: {
            if (n != 3) {
                if (n != 4) {
                    b2 = false;
                    break Label_0045;
                }
            }
            b2 = true;
        }
        if (b2) {
            if (n5m.d > n5m2.b && n5m.b < n5m2.d) {
                return b;
            }
        }
        else {
            Label_0112: {
                if (n != 5) {
                    if (n != 6) {
                        n = 0;
                        break Label_0112;
                    }
                }
                n = 1;
            }
            if (n == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (n5m.c > n5m2.a && n5m.a < n5m2.c) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final efb c(final ouh<efb> ouh, final n5m n5m, final int n) {
        Objects.requireNonNull(teb.Companion);
        n5m n5m2;
        if (n == 3) {
            n5m2 = n5m.f(n5m.c - n5m.a + 1, 0.0f);
        }
        else if (n == 4) {
            n5m2 = n5m.f(-(n5m.c - n5m.a + 1), 0.0f);
        }
        else if (n == 5) {
            n5m2 = n5m.f(0.0f, n5m.d - n5m.b + 1);
        }
        else {
            if (n != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            n5m2 = n5m.f(0.0f, -(n5m.d - n5m.b + 1));
        }
        efb efb = null;
        final efb efb2 = null;
        final int e0 = ouh.E0;
        if (e0 > 0) {
            final Object[] c0 = ouh.C0;
            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            efb efb3 = efb2;
            n5m n5m3 = n5m2;
            int n3;
            efb efb5;
            do {
                final efb efb4 = (efb)c0[n2];
                n5m n5m4 = n5m3;
                efb5 = efb3;
                if (kq9.U0(efb4)) {
                    final n5m l0 = kq9.L0(efb4);
                    boolean b = false;
                    Label_0313: {
                        Label_0310: {
                            if (f(l0, n, n5m)) {
                                if (f(n5m3, n, n5m)) {
                                    if (!a(n5m, l0, n5m3, n)) {
                                        if (a(n5m, n5m3, l0, n)) {
                                            break Label_0310;
                                        }
                                        if (g(n, n5m, l0) >= g(n, n5m, n5m3)) {
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
                    n5m4 = n5m3;
                    efb5 = efb3;
                    if (b) {
                        efb5 = efb4;
                        n5m4 = l0;
                    }
                }
                n3 = n2 + 1;
                n5m3 = n5m4;
                efb3 = efb5;
            } while ((n2 = n3) < e0);
            efb = efb5;
        }
        return efb;
    }
    
    public static final boolean d(efb c, int n, final rtb<? super efb, Boolean> rtb) {
        zzd.f((Object)c, "$this$findChildCorrespondingToFocusEnter");
        zzd.f((Object)rtb, "onFound");
        final Boolean a = ((rfb)c.M0.j.invoke((Object)new teb(n))).a((rtb)rtb);
        if (a != null) {
            return a;
        }
        final ouh c2 = kq9.C0(c);
        final int e0 = c2.E0;
        final boolean b = true;
        final boolean b2 = false;
        boolean booleanValue = false;
        if (e0 <= 1) {
            Object o;
            if (c2.l()) {
                o = null;
            }
            else {
                o = c2.C0[0];
            }
            c = (efb)o;
            if (c != null) {
                booleanValue = (boolean)rtb.invoke((Object)c);
            }
            return booleanValue;
        }
        Objects.requireNonNull(teb.Companion);
        if (n == 7) {
            n = 3;
        }
        boolean b3 = false;
        Label_0187: {
            if (n != 4) {
                if (n != 6) {
                    b3 = false;
                    break Label_0187;
                }
            }
            b3 = true;
        }
        n5m n5m;
        if (b3) {
            final n5m l0 = kq9.L0(c);
            final float a2 = l0.a;
            final float b4 = l0.b;
            n5m = new n5m(a2, b4, a2, b4);
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
            final n5m l2 = kq9.L0(c);
            final float c3 = l2.c;
            final float d = l2.d;
            n5m = new n5m(c3, d, c3, d);
        }
        c = c((ouh<efb>)c2, n5m, n);
        boolean booleanValue2 = b2;
        if (c != null) {
            booleanValue2 = (boolean)rtb.invoke((Object)c);
        }
        return booleanValue2;
    }
    
    public static final boolean e(final efb efb, final efb efb2, final int n, final rtb<? super efb, Boolean> rtb) {
        if (h(efb, efb2, n, rtb)) {
            return true;
        }
        final Boolean b = (Boolean)h6q.V(efb, n, (rtb)new mgv$a(efb, efb2, n, (rtb)rtb));
        return b != null && b;
    }
    
    public static final boolean f(final n5m n5m, int n, final n5m n5m2) {
        Objects.requireNonNull(teb.Companion);
        final boolean b = false;
        if (n == 3) {
            final float c = n5m2.c;
            final float c2 = n5m.c;
            if (c <= c2) {
                final boolean b2 = b;
                if (n5m2.a < c2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (n5m2.a <= n5m.a) {
                return b2;
            }
        }
        else if (n == 4) {
            final float a = n5m2.a;
            final float a2 = n5m.a;
            if (a >= a2) {
                final boolean b2 = b;
                if (n5m2.c > a2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (n5m2.c >= n5m.c) {
                return b2;
            }
        }
        else if (n == 5) {
            final float d = n5m2.d;
            final float d2 = n5m.d;
            if (d <= d2) {
                final boolean b2 = b;
                if (n5m2.b < d2) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (n5m2.b <= n5m.b) {
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
            final float b3 = n5m2.b;
            final float b4 = n5m.b;
            if (b3 >= b4) {
                final boolean b2 = b;
                if (n5m2.d > b4) {
                    return b2;
                }
            }
            final boolean b2 = b;
            if (n5m2.d >= n5m.d) {
                return b2;
            }
        }
        return true;
    }
    
    public static final long g(final int n, final n5m n5m, final n5m n5m2) {
        Objects.requireNonNull(teb.Companion);
        final int n2 = 0;
        final int n3 = 1;
        float n4;
        float n5;
        if (n == 3) {
            n4 = n5m.a;
            n5 = n5m2.c;
        }
        else if (n == 4) {
            n4 = n5m2.a;
            n5 = n5m.c;
        }
        else if (n == 5) {
            n4 = n5m.b;
            n5 = n5m2.d;
        }
        else {
            if (n != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            n4 = n5m2.b;
            n5 = n5m.d;
        }
        final long n6 = (long)Math.abs(Math.max(0.0f, n4 - n5));
        boolean b = false;
        Label_0197: {
            if (n != 3) {
                if (n != 4) {
                    b = false;
                    break Label_0197;
                }
            }
            b = true;
        }
        float n7;
        float n8;
        float n9;
        float n10;
        if (b) {
            final float b2 = n5m.b;
            final float d = n5m.d;
            n7 = 2;
            n8 = (d - b2) / n7 + b2;
            n9 = n5m2.b;
            n10 = n5m2.d;
        }
        else {
            int n11;
            if (n == 5) {
                n11 = n3;
            }
            else {
                n11 = n2;
                if (n == 6) {
                    n11 = 1;
                }
            }
            if (n11 == 0) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            final float a = n5m.a;
            final float c = n5m.c;
            n7 = 2;
            n8 = (c - a) / n7 + a;
            n9 = n5m2.a;
            n10 = n5m2.c;
        }
        final long n12 = (long)Math.abs(n8 - ((n10 - n9) / n7 + n9));
        return n12 * n12 + 13 * n6 * n6;
    }
    
    public static final boolean h(final efb efb, final efb efb2, final int n, final rtb<? super efb, Boolean> rtb) {
        final ouh e0 = efb.E0;
        final ouh ouh = new ouh((Object[])new efb[e0.E0]);
        ouh.e(ouh.E0, e0);
        while (ouh.m()) {
            final efb c = c((ouh<efb>)ouh, kq9.L0(efb2), n);
            if (c == null) {
                return false;
            }
            if (!c.F0.e()) {
                return (boolean)rtb.invoke((Object)c);
            }
            final Boolean a = ((rfb)c.M0.j.invoke((Object)new teb(n))).a((rtb)rtb);
            if (a != null) {
                return a;
            }
            if (e(c, efb2, n, rtb)) {
                return true;
            }
            ouh.n((Object)c);
        }
        return false;
    }
    
    public static final boolean i(final efb efb, final int n, final rtb<? super efb, Boolean> rtb) {
        final int ordinal = efb.F0.ordinal();
        if (ordinal != 0) {
            boolean b = false;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return d(efb, n, rtb);
                }
                if (ordinal == 3) {
                    return false;
                }
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return (boolean)((dfb.dfb$a)rtb).invoke(efb);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            final efb g0 = efb.G0;
            if (g0 != null) {
                final int ordinal2 = g0.F0.ordinal();
                if (ordinal2 != 0) {
                    Label_0135: {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 == 4) {
                                        break Label_0135;
                                    }
                                    if (ordinal2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            return e(efb, g0, n, rtb);
                        }
                    }
                    if (i(g0, n, rtb)) {
                        return true;
                    }
                    final Boolean a = ((rfb)g0.M0.k.invoke((Object)new teb(n))).a((rtb)rtb);
                    if (a != null) {
                        return a;
                    }
                    final wfb f0 = g0.F0;
                    if (f0 == wfb.D0 || f0 == wfb.G0) {
                        b = true;
                    }
                    if (!b) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    final efb j0 = kq9.J0(g0);
                    if (j0 != null) {
                        return e(efb, j0, n, rtb);
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                return e(efb, g0, n, rtb);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        return d(efb, n, rtb);
    }
}
