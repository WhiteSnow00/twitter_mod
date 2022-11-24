import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v9c
{
    public static ipx a(final tj6 tj6, final int n, final ArrayList<ipx> list, ipx ipx) {
        int n2;
        if (n == 0) {
            n2 = tj6.s0;
        }
        else {
            n2 = tj6.t0;
        }
        final int n3 = 0;
        ipx ipx2;
        if (n2 != -1 && (ipx == null || n2 != ipx.b)) {
            int n4 = 0;
            while (true) {
                ipx2 = ipx;
                if (n4 >= list.size()) {
                    break;
                }
                ipx2 = list.get(n4);
                if (ipx2.b == n2) {
                    if (ipx != null) {
                        ipx.d(n, ipx2);
                        list.remove(ipx);
                    }
                    break;
                }
                ++n4;
            }
        }
        else {
            ipx2 = ipx;
            if (n2 != -1) {
                return ipx;
            }
        }
        if ((ipx = ipx2) == null) {
            ipx = ipx2;
            Label_0268: {
                if (tj6 instanceof bkc) {
                    final bkc bkc = (bkc)tj6;
                    int i = 0;
                Label_0216:
                    while (true) {
                        while (i < bkc.v0) {
                            final tj6 tj7 = bkc.u0[i];
                            if (n == 0) {
                                final int s0 = tj7.s0;
                                if (s0 != -1) {
                                    final int n5 = s0;
                                    break Label_0216;
                                }
                            }
                            if (n == 1) {
                                final int t0 = tj7.t0;
                                if (t0 != -1) {
                                    final int n5 = t0;
                                    break Label_0216;
                                }
                            }
                            ++i;
                            continue;
                            ipx = ipx2;
                            int n5 = 0;
                            if (n5 == -1) {
                                break Label_0268;
                            }
                            int n6 = 0;
                            while (true) {
                                ipx = ipx2;
                                if (n6 >= list.size()) {
                                    break Label_0268;
                                }
                                ipx = (ipx)list.get(n6);
                                if (ipx.b == n5) {
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
            ipx ipx3;
            if ((ipx3 = ipx) == null) {
                ipx3 = new ipx(n);
            }
            list.add(ipx3);
            ipx = ipx3;
        }
        if (ipx.a(tj6)) {
            if (tj6 instanceof dbc) {
                final dbc dbc = (dbc)tj6;
                final kj6 x0 = dbc.x0;
                int n7 = n3;
                if (dbc.y0 == 0) {
                    n7 = 1;
                }
                x0.c(n7, (ArrayList)list, ipx);
            }
            if (n == 0) {
                tj6.s0 = ipx.b;
                tj6.J.c(n, (ArrayList)list, ipx);
                tj6.L.c(n, (ArrayList)list, ipx);
            }
            else {
                tj6.t0 = ipx.b;
                tj6.K.c(n, (ArrayList)list, ipx);
                tj6.N.c(n, (ArrayList)list, ipx);
                tj6.M.c(n, (ArrayList)list, ipx);
            }
            tj6.Q.c(n, (ArrayList)list, ipx);
        }
        return ipx;
    }
    
    public static ipx b(final ArrayList<ipx> list, final int n) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ipx ipx = list.get(i);
            if (n == ipx.b) {
                return ipx;
            }
        }
        return null;
    }
    
    public static boolean c(final tj6.a a, final tj6.a a2, final tj6.a a3, final tj6.a a4) {
        final tj6.a i0 = tj6.a.I0;
        final tj6.a g0 = tj6.a.G0;
        final tj6.a f0 = tj6.a.F0;
        final boolean b = a3 == f0 || a3 == g0 || (a3 == i0 && a != g0);
        final boolean b2 = a4 == f0 || a4 == g0 || (a4 == i0 && a2 != g0);
        return b || b2;
    }
}
