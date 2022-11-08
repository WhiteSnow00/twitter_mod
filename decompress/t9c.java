import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9c
{
    public static znx a(final hj6 hj6, final int n, final ArrayList<znx> list, znx znx) {
        int n2;
        if (n == 0) {
            n2 = hj6.s0;
        }
        else {
            n2 = hj6.t0;
        }
        final int n3 = 0;
        znx znx2;
        if (n2 != -1 && (znx == null || n2 != znx.b)) {
            int n4 = 0;
            while (true) {
                znx2 = znx;
                if (n4 >= list.size()) {
                    break;
                }
                znx2 = list.get(n4);
                if (znx2.b == n2) {
                    if (znx != null) {
                        znx.d(n, znx2);
                        list.remove(znx);
                    }
                    break;
                }
                ++n4;
            }
        }
        else {
            znx2 = znx;
            if (n2 != -1) {
                return znx;
            }
        }
        if ((znx = znx2) == null) {
            znx = znx2;
            Label_0268: {
                if (hj6 instanceof zjc) {
                    final zjc zjc = (zjc)hj6;
                    int i = 0;
                Label_0216:
                    while (true) {
                        while (i < zjc.v0) {
                            final hj6 hj7 = zjc.u0[i];
                            if (n == 0) {
                                final int s0 = hj7.s0;
                                if (s0 != -1) {
                                    final int n5 = s0;
                                    break Label_0216;
                                }
                            }
                            if (n == 1) {
                                final int t0 = hj7.t0;
                                if (t0 != -1) {
                                    final int n5 = t0;
                                    break Label_0216;
                                }
                            }
                            ++i;
                            continue;
                            znx = znx2;
                            int n5 = 0;
                            if (n5 == -1) {
                                break Label_0268;
                            }
                            int n6 = 0;
                            while (true) {
                                znx = znx2;
                                if (n6 >= list.size()) {
                                    break Label_0268;
                                }
                                znx = (znx)list.get(n6);
                                if (znx.b == n5) {
                                    break Label_0268;
                                }
                                ++n6;
                            }
                        }
                        final int n5 = -1;
                        continue Label_0216;
                    }
                }
            }
            znx znx3;
            if ((znx3 = znx) == null) {
                znx3 = new znx(n);
            }
            list.add(znx3);
            znx = znx3;
        }
        if (znx.a(hj6)) {
            if (hj6 instanceof bbc) {
                final bbc bbc = (bbc)hj6;
                final yi6 x0 = bbc.x0;
                int n7 = n3;
                if (bbc.y0 == 0) {
                    n7 = 1;
                }
                x0.c(n7, (ArrayList)list, znx);
            }
            if (n == 0) {
                hj6.s0 = znx.b;
                hj6.J.c(n, (ArrayList)list, znx);
                hj6.L.c(n, (ArrayList)list, znx);
            }
            else {
                hj6.t0 = znx.b;
                hj6.K.c(n, (ArrayList)list, znx);
                hj6.N.c(n, (ArrayList)list, znx);
                hj6.M.c(n, (ArrayList)list, znx);
            }
            hj6.Q.c(n, (ArrayList)list, znx);
        }
        return znx;
    }
    
    public static znx b(final ArrayList<znx> list, final int n) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final znx znx = list.get(i);
            if (n == znx.b) {
                return znx;
            }
        }
        return null;
    }
    
    public static boolean c(final hj6$a hj6$a, final hj6$a hj6$a2, final hj6$a hj6$a3, final hj6$a hj6$a4) {
        final hj6$a f0 = hj6$a.F0;
        final hj6$a d0 = hj6$a.D0;
        final hj6$a c0 = hj6$a.C0;
        final boolean b = hj6$a3 == c0 || hj6$a3 == d0 || (hj6$a3 == f0 && hj6$a != d0);
        final boolean b2 = hj6$a4 == c0 || hj6$a4 == d0 || (hj6$a4 == f0 && hj6$a2 != d0);
        return b || b2;
    }
}
