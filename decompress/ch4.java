import java.net.URI;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ch4
{
    public static yg4 a(final xrc xrc, final asc asc) {
        final vdi d0 = vdi.D0;
        final vdi f0 = vdi.F0;
        final vdi e0 = vdi.E0;
        final yg4$a yg4$a = new yg4$a();
        final xsc n = xrc.n;
        yg4$a.a(yg4.B1, (Object)((Enum)xrc.b).name());
        yg4$a.a(yg4.G1, (Object)n.a);
        yg4$a.a(yg4.E1, (Object)n.v);
        yg4$a.a(yg4.H1, (Object)n.p);
        yg4$a.a(yg4.R1, (Object)po6.b((Map)xrc.k));
        yg4$a.a(yg4.C1, (Object)n.t.C0);
        String s;
        if (n.A) {
            if (n.c == null) {
                s = "RequestWasCancelled";
            }
            else {
                final StringBuilder g = w48.g("RequestWasCancelled: ");
                g.append(n.c.getClass().getName());
                s = g.toString();
            }
        }
        else {
            final Exception c = n.c;
            if (c != null) {
                s = c.getClass().getName();
            }
            else {
                s = null;
            }
        }
        yg4$a.a(yg4.I1, (Object)s);
        final URI c2 = xrc.c;
        final String host = c2.getHost();
        final String s2 = "";
        String s3 = host;
        if (host == null) {
            s3 = "";
        }
        yg4$a.a(yg4.z1, (Object)s3);
        final yg4$b a1 = yg4.A1;
        String path;
        if ((path = c2.getPath()) == null) {
            path = "";
        }
        yg4$a.a(a1, (Object)path);
        final yg4$b y1 = yg4.y1;
        String scheme;
        if ((scheme = c2.getScheme()) == null) {
            scheme = "";
        }
        yg4$a.a(y1, (Object)scheme);
        yg4$a.a(yg4.M1, (Object)c2.getQuery());
        if (pjr.g((CharSequence)s3)) {
            final yg4$b f2 = yg4.F1;
            final reg a2 = cgj.a;
            String s4 = (String)cgj.b.get((Object)s3);
            if (s4 == null) {
                s4 = s2;
            }
            yg4$a.a(f2, (Object)s4);
        }
        final ah4$a ah4$a = new ah4$a();
        ah4$a.a(ah4.p1, (Object)xrc.g());
        final xsc n2 = xrc.n;
        ah4$a.a(ah4.m1, (Object)n2.e);
        ah4$a.a(ah4.n1, (Object)(-1));
        ah4$a.a(ah4.q1, (Object)n2.j);
        ah4$a.a(ah4.s1, (Object)(long)n2.q);
        final int k = n2.k;
        if (k != -1) {
            ah4$a.a(ah4.t1, (Object)k);
        }
        final int l = n2.l;
        if (l != -1) {
            ah4$a.a(ah4.u1, (Object)l);
        }
        final int m = n2.m;
        if (m != -1) {
            ah4$a.a(ah4.v1, (Object)m);
        }
        final int n3 = n2.n;
        if (n3 != -1) {
            ah4$a.a(ah4.w1, (Object)n3);
        }
        final int o = n2.o;
        if (o != -1) {
            ah4$a.a(ah4.x1, (Object)o);
        }
        ah4$a.a(ah4.o1, (Object)(long)((pyv)mci.d().g()).C0);
        final Long r = rqu.r(xrc);
        if (r != null) {
            ah4$a.a(ah4.r1, (Object)r);
        }
        if (ah4$a.a == null) {
            final StringBuilder g2 = w48.g("Required field 'duration_ms' was not present! Struct: ");
            g2.append(ah4$a.toString());
            throw new IllegalArgumentException(g2.toString());
        }
        final Long a3 = ah4$a.a;
        final Integer b = ah4$a.b;
        final Long c3 = ah4$a.c;
        final Long d2 = ah4$a.d;
        final Long e2 = ah4$a.e;
        final Long f3 = ah4$a.f;
        final Long g3 = ah4$a.g;
        final Long h = ah4$a.h;
        final Long i = ah4$a.i;
        final Long j = ah4$a.j;
        final Long k2 = ah4$a.k;
        final Integer l2 = ah4$a.l;
        final Integer m2 = ah4$a.m;
        final Integer n4 = ah4$a.n;
        final Integer o2 = ah4$a.o;
        final Integer p2 = ah4$a.p;
        final Integer q = ah4$a.q;
        final ah4 ah4 = new ah4();
        if (a3 != null) {
            ah4.C0 = a3;
            ah4.T0.set(0, true);
        }
        if (b != null) {
            ah4.D0 = b;
            ah4.T0.set(1, true);
        }
        if (c3 != null) {
            ah4.E0 = c3;
            ah4.T0.set(2, true);
        }
        if (d2 != null) {
            ah4.F0 = d2;
            ah4.T0.set(3, true);
        }
        if (e2 != null) {
            ah4.G0 = e2;
            ah4.T0.set(4, true);
        }
        if (f3 != null) {
            ah4.H0 = f3;
            ah4.T0.set(5, true);
        }
        if (g3 != null) {
            ah4.I0 = g3;
            ah4.T0.set(6, true);
        }
        if (h != null) {
            ah4.J0 = h;
            ah4.T0.set(7, true);
        }
        if (i != null) {
            ah4.K0 = i;
            ah4.T0.set(8, true);
        }
        if (j != null) {
            ah4.L0 = j;
            ah4.T0.set(9, true);
        }
        if (k2 != null) {
            ah4.M0 = k2;
            ah4.T0.set(10, true);
        }
        if (l2 != null) {
            ah4.N0 = l2;
            ah4.T0.set(11, true);
        }
        if (m2 != null) {
            ah4.O0 = m2;
            ah4.T0.set(12, true);
        }
        if (n4 != null) {
            ah4.P0 = n4;
            ah4.T0.set(13, true);
        }
        if (o2 != null) {
            ah4.Q0 = o2;
            ah4.T0.set(14, true);
        }
        if (p2 != null) {
            ah4.R0 = p2;
            ah4.T0.set(15, true);
        }
        if (q != null) {
            ah4.S0 = q;
            ah4.T0.set(16, true);
        }
        yg4$a.a(yg4.K1, (Object)ah4);
        final String j2 = xrc.j("x-cache");
        dh4 dh4;
        if (j2 != null) {
            if (j2.contains("HIT")) {
                dh4 = dh4.E0;
            }
            else {
                dh4 = dh4.F0;
            }
        }
        else {
            dh4 = dh4.D0;
        }
        yg4$a.a(yg4.J1, (Object)dh4);
        yvl yvl = yvl.F0;
        yvl d3 = yvl.D0;
        final int c4 = wh6.f().c;
        vdi vdi = null;
        while (true) {
            switch (nb0.D(c4)) {
                default: {
                    if (xcs.a().l())
                    vdi = d0;
                    break;
                }
                case 19: {
                    vdi = e0;
                    break;
                }
                case 3:
                case 17: {
                    d3 = yvl;
                    vdi = f0;
                    break;
                }
                case 18: {
                    yvl = d3;
                    continue;
                }
                case 16: {
                    yvl = yvl.S0;
                    continue;
                }
                case 15: {
                    yvl = yvl.R0;
                    continue;
                }
                case 14: {
                    yvl = yvl.Q0;
                    continue;
                }
                case 13: {
                    yvl = yvl.N0;
                    continue;
                }
                case 12: {
                    yvl = yvl.P0;
                    continue;
                }
                case 11: {
                    yvl = yvl.J0;
                    continue;
                }
                case 10: {
                    yvl = yvl.I0;
                    continue;
                }
                case 9: {
                    yvl = yvl.H0;
                    continue;
                }
                case 8: {
                    yvl = yvl.O0;
                    continue;
                }
                case 7: {
                    yvl = yvl.M0;
                    continue;
                }
                case 6: {
                    yvl = yvl.L0;
                    continue;
                }
                case 5: {
                    yvl = yvl.K0;
                    continue;
                }
                case 4: {
                    yvl = yvl.G0;
                    continue;
                }
                case 2: {
                    yvl = yvl.E0;
                    continue;
                }
            }
            break;
        }
        final kdi f4 = mci.d().f();
        final String e3 = xcs.a().e();
        final String f5 = xcs.a().f();
        final String g4 = xcs.a().g();
        final String a4 = w48.b().a();
        final String e4 = w48.b().e();
        final String d4 = w48.b().d();
        Boolean value;
        try {
            final lq a5 = mp.a();
            value = (a5 != null && a5.b);
        }
        catch (final Exception ex) {
            value = null;
        }
        hoj hoj;
        if (t4s.l == 2) {
            hoj = hoj.E0;
        }
        else {
            hoj = hoj.D0;
        }
        final int a6 = mci.d().d.a();
        final eh4$a eh4$a = new eh4$a();
        eh4$a.a(eh4.T0, (Object)vdi);
        eh4$a.a(eh4.V0, (Object)d3);
        eh4$a.a(eh4.W0, (Object)t4a.o(c4));
        if (f4 == kdi.D0) {
            eh4$a.a(eh4.U0, (Object)d0);
        }
        else if (vdi == e0) {
            eh4$a.a(eh4.U0, (Object)e0);
        }
        else if (vdi == f0) {
            eh4$a.a(eh4.U0, (Object)f0);
        }
        final rgh$a rgh$a = new rgh$a();
        rgh$a.a(rgh.g1, (Object)value);
        rgh$a.a(rgh.h1, (Object)e3);
        rgh$a.a(rgh.i1, (Object)f5);
        rgh$a.a(rgh.j1, (Object)g4);
        rgh$a.a(rgh.l1, (Object)a4);
        rgh$a.a(rgh.k1, (Object)e4);
        rgh$a.a(rgh.m1, (Object)d4);
        rgh$a.a(rgh.e1, (Object)hoj);
        rgh$a.a(rgh.n1, (Object)d3);
        rgh$a.a(rgh.f1, (Object)a6);
        final String a7 = rgh$a.a;
        final hoj b2 = rgh$a.b;
        final Integer c5 = rgh$a.c;
        final Boolean d5 = rgh$a.d;
        final String e5 = rgh$a.e;
        final String f6 = rgh$a.f;
        final String g5 = rgh$a.g;
        final String h2 = rgh$a.h;
        final String i2 = rgh$a.i;
        final String j3 = rgh$a.j;
        final String k3 = rgh$a.k;
        final yvl l3 = rgh$a.l;
        final Boolean m3 = rgh$a.m;
        final rgh rgh = new rgh();
        if (a7 != null) {
            rgh.C0 = a7;
        }
        if (b2 != null) {
            rgh.D0 = b2;
        }
        if (c5 != null) {
            rgh.E0 = c5;
            rgh.P0.set(0, true);
        }
        if (d5 != null) {
            rgh.F0 = d5;
            rgh.P0.set(1, true);
        }
        if (e5 != null) {
            rgh.G0 = e5;
        }
        if (f6 != null) {
            rgh.H0 = f6;
        }
        if (g5 != null) {
            rgh.I0 = g5;
        }
        if (h2 != null) {
            rgh.J0 = h2;
        }
        if (i2 != null) {
            rgh.K0 = i2;
        }
        if (j3 != null) {
            rgh.L0 = j3;
        }
        if (k3 != null) {
            rgh.M0 = k3;
        }
        if (l3 != null) {
            rgh.N0 = l3;
        }
        if (m3 != null) {
            rgh.O0 = m3;
            rgh.P0.set(2, true);
        }
        eh4$a.a(eh4.X0, (Object)rgh);
        yg4$a.a(yg4.D1, (Object)new eh4(eh4$a.a, eh4$a.b, eh4$a.c, eh4$a.d, eh4$a.e, eh4$a.f, eh4$a.g, eh4$a.h));
        final jsc a8 = asc.a;
        yg4$a.a(yg4.L1, (Object)(a8 != null && a8.a));
        yg4$a.a(yg4.N1, (Object)xrc.i("X-B3-TraceId"));
        yg4$a.a(yg4.O1, (Object)xrc.y);
        yg4$a.a(yg4.Q1, (Object)xrc.j("x-cache"));
        yg4$a.a(yg4.P1, (Object)xrc.j("x-served-by"));
        final String i3 = xrc.i("Geolocation");
        if (i3 != null) {
            yg4$a.a(yg4.S1, (Object)(i3.equals("0") ^ true));
        }
        if (yg4$a.a == null) {
            final StringBuilder g6 = w48.g("Required field 'uri_scheme' was not present! Struct: ");
            g6.append(yg4$a.toString());
            throw new IllegalArgumentException(g6.toString());
        }
        if (yg4$a.b == null) {
            final StringBuilder g7 = w48.g("Required field 'uri_host_name' was not present! Struct: ");
            g7.append(yg4$a.toString());
            throw new IllegalArgumentException(g7.toString());
        }
        if (yg4$a.c == null) {
            final StringBuilder g8 = w48.g("Required field 'uri_path' was not present! Struct: ");
            g8.append(yg4$a.toString());
            throw new IllegalArgumentException(g8.toString());
        }
        if (yg4$a.d == null) {
            final StringBuilder g9 = w48.g("Required field 'http_method' was not present! Struct: ");
            g9.append(yg4$a.toString());
            throw new IllegalArgumentException(g9.toString());
        }
        if (yg4$a.n != null) {
            final String a9 = yg4$a.a;
            final String b3 = yg4$a.b;
            final String c6 = yg4$a.c;
            final String d6 = yg4$a.d;
            final String e6 = yg4$a.e;
            final eh4 f7 = yg4$a.f;
            final eh4 g10 = yg4$a.g;
            final String h3 = yg4$a.h;
            final String i4 = yg4$a.i;
            final Integer j4 = yg4$a.j;
            final Integer k4 = yg4$a.k;
            final String l4 = yg4$a.l;
            final dh4 m4 = yg4$a.m;
            final ah4 n5 = yg4$a.n;
            final xg4 o3 = yg4$a.o;
            final Boolean p3 = yg4$a.p;
            final String q2 = yg4$a.q;
            final String r2 = yg4$a.r;
            final Long s5 = yg4$a.s;
            final String t = yg4$a.t;
            final String u = yg4$a.u;
            final String v = yg4$a.v;
            final Boolean w = yg4$a.w;
            final yg4 yg4 = new yg4();
            if (a9 != null) {
                yg4.C0 = a9;
            }
            if (b3 != null) {
                yg4.D0 = b3;
            }
            if (c6 != null) {
                yg4.E0 = c6;
            }
            if (d6 != null) {
                yg4.F0 = d6;
            }
            if (e6 != null) {
                yg4.G0 = e6;
            }
            if (f7 != null) {
                yg4.H0 = f7;
            }
            if (g10 != null) {
                yg4.I0 = g10;
            }
            if (h3 != null) {
                yg4.J0 = h3;
            }
            if (i4 != null) {
                yg4.K0 = i4;
            }
            if (j4 != null) {
                yg4.L0 = j4;
                yg4.Z0.set(0, true);
            }
            if (k4 != null) {
                yg4.M0 = k4;
                yg4.Z0.set(1, true);
            }
            if (l4 != null) {
                yg4.N0 = l4;
            }
            if (m4 != null) {
                yg4.O0 = m4;
            }
            if (n5 != null) {
                yg4.P0 = n5;
            }
            if (o3 != null) {
                yg4.Q0 = o3;
            }
            if (p3 != null) {
                yg4.R0 = p3;
                yg4.Z0.set(2, true);
            }
            if (q2 != null) {
                yg4.S0 = q2;
            }
            if (r2 != null) {
                yg4.T0 = r2;
            }
            if (s5 != null) {
                yg4.U0 = s5;
                yg4.Z0.set(3, true);
            }
            if (t != null) {
                yg4.V0 = t;
            }
            if (u != null) {
                yg4.W0 = u;
            }
            if (v != null) {
                yg4.X0 = v;
            }
            if (w != null) {
                yg4.Y0 = w;
                yg4.Z0.set(4, true);
            }
            return yg4;
        }
        final StringBuilder g11 = w48.g("Required field 'request_details' was not present! Struct: ");
        g11.append(yg4$a.toString());
        throw new IllegalArgumentException(g11.toString());
    }
}
