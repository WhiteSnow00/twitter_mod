import java.net.URI;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dg4
{
    public static zf4 a(final arc arc, final drc drc) {
        final ydi e0 = ydi.E0;
        final ydi g0 = ydi.G0;
        final ydi f0 = ydi.F0;
        final zf4$a zf4$a = new zf4$a();
        final bsc n = arc.n;
        zf4$a.a(zf4.C1, (Object)((Enum)arc.b).name());
        zf4$a.a(zf4.H1, (Object)n.a);
        zf4$a.a(zf4.F1, (Object)n.v);
        zf4$a.a(zf4.I1, (Object)n.p);
        zf4$a.a(zf4.S1, (Object)vn6.b((Map)arc.k));
        zf4$a.a(zf4.D1, (Object)n.t.D0);
        String s;
        if (n.A) {
            if (n.c == null) {
                s = "RequestWasCancelled";
            }
            else {
                final StringBuilder j = fu8.j("RequestWasCancelled: ");
                j.append(n.c.getClass().getName());
                s = j.toString();
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
        zf4$a.a(zf4.J1, (Object)s);
        final URI c2 = arc.c;
        final String host = c2.getHost();
        final String s2 = "";
        String s3 = host;
        if (host == null) {
            s3 = "";
        }
        zf4$a.a(zf4.A1, (Object)s3);
        final zf4$b b1 = zf4.B1;
        String path;
        if ((path = c2.getPath()) == null) {
            path = "";
        }
        zf4$a.a(b1, (Object)path);
        final zf4$b z1 = zf4.z1;
        String scheme;
        if ((scheme = c2.getScheme()) == null) {
            scheme = "";
        }
        zf4$a.a(z1, (Object)scheme);
        zf4$a.a(zf4.N1, (Object)c2.getQuery());
        if (ikr.g((CharSequence)s3)) {
            final zf4$b g2 = zf4.G1;
            final heg<String, String> a = igj.a;
            String s4 = (String)igj.b.get((Object)s3);
            if (s4 == null) {
                s4 = s2;
            }
            zf4$a.a(g2, (Object)s4);
        }
        final bg4$a bg4$a = new bg4$a();
        bg4$a.a(bg4.q1, (Object)arc.g());
        final bsc n2 = arc.n;
        bg4$a.a(bg4.n1, (Object)n2.e);
        bg4$a.a(bg4.o1, (Object)(-1));
        bg4$a.a(bg4.r1, (Object)n2.j);
        bg4$a.a(bg4.t1, (Object)(long)n2.q);
        final int k = n2.k;
        if (k != -1) {
            bg4$a.a(bg4.u1, (Object)k);
        }
        final int l = n2.l;
        if (l != -1) {
            bg4$a.a(bg4.v1, (Object)l);
        }
        final int m = n2.m;
        if (m != -1) {
            bg4$a.a(bg4.w1, (Object)m);
        }
        final int n3 = n2.n;
        if (n3 != -1) {
            bg4$a.a(bg4.x1, (Object)n3);
        }
        final int o = n2.o;
        if (o != -1) {
            bg4$a.a(bg4.y1, (Object)o);
        }
        bg4$a.a(bg4.p1, (Object)(long)((gzv)oci.d().g()).D0);
        final Long z2 = ii8.z(arc);
        if (z2 != null) {
            bg4$a.a(bg4.s1, (Object)z2);
        }
        if (bg4$a.a == null) {
            final StringBuilder i = fu8.j("Required field 'duration_ms' was not present! Struct: ");
            i.append(bg4$a.toString());
            throw new IllegalArgumentException(i.toString());
        }
        final Long a2 = bg4$a.a;
        final Integer b2 = bg4$a.b;
        final Long c3 = bg4$a.c;
        final Long d = bg4$a.d;
        final Long e2 = bg4$a.e;
        final Long f2 = bg4$a.f;
        final Long g3 = bg4$a.g;
        final Long h = bg4$a.h;
        final Long i2 = bg4$a.i;
        final Long j2 = bg4$a.j;
        final Long k2 = bg4$a.k;
        final Integer l2 = bg4$a.l;
        final Integer m2 = bg4$a.m;
        final Integer n4 = bg4$a.n;
        final Integer o2 = bg4$a.o;
        final Integer p2 = bg4$a.p;
        final Integer q = bg4$a.q;
        final bg4 bg4 = new bg4();
        if (a2 != null) {
            bg4.D0 = a2;
            bg4.U0.set(0, true);
        }
        if (b2 != null) {
            bg4.E0 = b2;
            bg4.U0.set(1, true);
        }
        if (c3 != null) {
            bg4.F0 = c3;
            bg4.U0.set(2, true);
        }
        if (d != null) {
            bg4.G0 = d;
            bg4.U0.set(3, true);
        }
        if (e2 != null) {
            bg4.H0 = e2;
            bg4.U0.set(4, true);
        }
        if (f2 != null) {
            bg4.I0 = f2;
            bg4.U0.set(5, true);
        }
        if (g3 != null) {
            bg4.J0 = g3;
            bg4.U0.set(6, true);
        }
        if (h != null) {
            bg4.K0 = h;
            bg4.U0.set(7, true);
        }
        if (i2 != null) {
            bg4.L0 = i2;
            bg4.U0.set(8, true);
        }
        if (j2 != null) {
            bg4.M0 = j2;
            bg4.U0.set(9, true);
        }
        if (k2 != null) {
            bg4.N0 = k2;
            bg4.U0.set(10, true);
        }
        if (l2 != null) {
            bg4.O0 = l2;
            bg4.U0.set(11, true);
        }
        if (m2 != null) {
            bg4.P0 = m2;
            bg4.U0.set(12, true);
        }
        if (n4 != null) {
            bg4.Q0 = n4;
            bg4.U0.set(13, true);
        }
        if (o2 != null) {
            bg4.R0 = o2;
            bg4.U0.set(14, true);
        }
        if (p2 != null) {
            bg4.S0 = p2;
            bg4.U0.set(15, true);
        }
        if (q != null) {
            bg4.T0 = q;
            bg4.U0.set(16, true);
        }
        zf4$a.a(zf4.L1, (Object)bg4);
        final String j3 = arc.j("x-cache");
        eg4 eg4;
        if (j3 != null) {
            if (j3.contains("HIT")) {
                eg4 = eg4.F0;
            }
            else {
                eg4 = eg4.G0;
            }
        }
        else {
            eg4 = eg4.E0;
        }
        zf4$a.a(zf4.K1, (Object)eg4);
        pwl pwl = pwl.G0;
        pwl e3 = pwl.E0;
        final int c4 = ch6.f().c;
        ydi ydi = null;
        while (true) {
            switch (ib0.E(c4)) {
                default: {
                    if (sds.a().l())
                    ydi = e0;
                    break;
                }
                case 19: {
                    ydi = f0;
                    break;
                }
                case 3:
                case 17: {
                    e3 = pwl;
                    ydi = g0;
                    break;
                }
                case 18: {
                    pwl = e3;
                    continue;
                }
                case 16: {
                    pwl = pwl.T0;
                    continue;
                }
                case 15: {
                    pwl = pwl.S0;
                    continue;
                }
                case 14: {
                    pwl = pwl.R0;
                    continue;
                }
                case 13: {
                    pwl = pwl.O0;
                    continue;
                }
                case 12: {
                    pwl = pwl.Q0;
                    continue;
                }
                case 11: {
                    pwl = pwl.K0;
                    continue;
                }
                case 10: {
                    pwl = pwl.J0;
                    continue;
                }
                case 9: {
                    pwl = pwl.I0;
                    continue;
                }
                case 8: {
                    pwl = pwl.P0;
                    continue;
                }
                case 7: {
                    pwl = pwl.N0;
                    continue;
                }
                case 6: {
                    pwl = pwl.M0;
                    continue;
                }
                case 5: {
                    pwl = pwl.L0;
                    continue;
                }
                case 4: {
                    pwl = pwl.H0;
                    continue;
                }
                case 2: {
                    pwl = pwl.F0;
                    continue;
                }
            }
            break;
        }
        final ndi f3 = oci.d().f();
        final String e4 = sds.a().e();
        final String f4 = sds.a().f();
        final String g4 = sds.a().g();
        final String a3 = x1b.c().a();
        final String e5 = x1b.c().e();
        final String d2 = x1b.c().d();
        Boolean value;
        try {
            final lq a4 = np.a();
            value = (a4 != null && a4.b);
        }
        catch (final Exception ex) {
            value = null;
        }
        noj noj;
        if (m5s.l == 2) {
            noj = noj.F0;
        }
        else {
            noj = noj.E0;
        }
        final int a5 = oci.d().d.a();
        final fg4$a fg4$a = new fg4$a();
        fg4$a.a(fg4.U0, (Object)ydi);
        fg4$a.a(fg4.W0, (Object)e3);
        fg4$a.a(fg4.X0, (Object)gw8.q(c4));
        if (f3 == ndi.E0) {
            fg4$a.a(fg4.V0, (Object)e0);
        }
        else if (ydi == f0) {
            fg4$a.a(fg4.V0, (Object)f0);
        }
        else if (ydi == g0) {
            fg4$a.a(fg4.V0, (Object)g0);
        }
        final ugh$a ugh$a = new ugh$a();
        ugh$a.a(ugh.h1, (Object)value);
        ugh$a.a(ugh.i1, (Object)e4);
        ugh$a.a(ugh.j1, (Object)f4);
        ugh$a.a(ugh.k1, (Object)g4);
        ugh$a.a(ugh.m1, (Object)a3);
        ugh$a.a(ugh.l1, (Object)e5);
        ugh$a.a(ugh.n1, (Object)d2);
        ugh$a.a(ugh.f1, (Object)noj);
        ugh$a.a(ugh.o1, (Object)e3);
        ugh$a.a(ugh.g1, (Object)a5);
        final String a6 = ugh$a.a;
        final noj b3 = ugh$a.b;
        final Integer c5 = ugh$a.c;
        final Boolean d3 = ugh$a.d;
        final String e6 = ugh$a.e;
        final String f5 = ugh$a.f;
        final String g5 = ugh$a.g;
        final String h2 = ugh$a.h;
        final String i3 = ugh$a.i;
        final String j4 = ugh$a.j;
        final String k3 = ugh$a.k;
        final pwl l3 = ugh$a.l;
        final Boolean m3 = ugh$a.m;
        final ugh ugh = new ugh();
        if (a6 != null) {
            ugh.D0 = a6;
        }
        if (b3 != null) {
            ugh.E0 = b3;
        }
        if (c5 != null) {
            ugh.F0 = c5;
            ugh.Q0.set(0, true);
        }
        if (d3 != null) {
            ugh.G0 = d3;
            ugh.Q0.set(1, true);
        }
        if (e6 != null) {
            ugh.H0 = e6;
        }
        if (f5 != null) {
            ugh.I0 = f5;
        }
        if (g5 != null) {
            ugh.J0 = g5;
        }
        if (h2 != null) {
            ugh.K0 = h2;
        }
        if (i3 != null) {
            ugh.L0 = i3;
        }
        if (j4 != null) {
            ugh.M0 = j4;
        }
        if (k3 != null) {
            ugh.N0 = k3;
        }
        if (l3 != null) {
            ugh.O0 = l3;
        }
        if (m3 != null) {
            ugh.P0 = m3;
            ugh.Q0.set(2, true);
        }
        fg4$a.a(fg4.Y0, (Object)ugh);
        zf4$a.a(zf4.E1, (Object)new fg4(fg4$a.a, fg4$a.b, fg4$a.c, fg4$a.d, fg4$a.e, fg4$a.f, fg4$a.g, fg4$a.h));
        final nrc a7 = drc.a;
        zf4$a.a(zf4.M1, (Object)(a7 != null && a7.a));
        zf4$a.a(zf4.O1, (Object)arc.i("X-B3-TraceId"));
        zf4$a.a(zf4.P1, (Object)arc.y);
        zf4$a.a(zf4.R1, (Object)arc.j("x-cache"));
        zf4$a.a(zf4.Q1, (Object)arc.j("x-served-by"));
        final String i4 = arc.i("Geolocation");
        if (i4 != null) {
            zf4$a.a(zf4.T1, (Object)(i4.equals("0") ^ true));
        }
        if (zf4$a.a == null) {
            final StringBuilder j5 = fu8.j("Required field 'uri_scheme' was not present! Struct: ");
            j5.append(zf4$a.toString());
            throw new IllegalArgumentException(j5.toString());
        }
        if (zf4$a.b == null) {
            final StringBuilder j6 = fu8.j("Required field 'uri_host_name' was not present! Struct: ");
            j6.append(zf4$a.toString());
            throw new IllegalArgumentException(j6.toString());
        }
        if (zf4$a.c == null) {
            final StringBuilder j7 = fu8.j("Required field 'uri_path' was not present! Struct: ");
            j7.append(zf4$a.toString());
            throw new IllegalArgumentException(j7.toString());
        }
        if (zf4$a.d == null) {
            final StringBuilder j8 = fu8.j("Required field 'http_method' was not present! Struct: ");
            j8.append(zf4$a.toString());
            throw new IllegalArgumentException(j8.toString());
        }
        if (zf4$a.n != null) {
            final String a8 = zf4$a.a;
            final String b4 = zf4$a.b;
            final String c6 = zf4$a.c;
            final String d4 = zf4$a.d;
            final String e7 = zf4$a.e;
            final fg4 f6 = zf4$a.f;
            final fg4 g6 = zf4$a.g;
            final String h3 = zf4$a.h;
            final String i5 = zf4$a.i;
            final Integer j9 = zf4$a.j;
            final Integer k4 = zf4$a.k;
            final String l4 = zf4$a.l;
            final eg4 m4 = zf4$a.m;
            final bg4 n5 = zf4$a.n;
            final yf4 o3 = zf4$a.o;
            final Boolean p3 = zf4$a.p;
            final String q2 = zf4$a.q;
            final String r = zf4$a.r;
            final Long s5 = zf4$a.s;
            final String t = zf4$a.t;
            final String u = zf4$a.u;
            final String v = zf4$a.v;
            final Boolean w = zf4$a.w;
            final zf4 zf4 = new zf4();
            if (a8 != null) {
                zf4.D0 = a8;
            }
            if (b4 != null) {
                zf4.E0 = b4;
            }
            if (c6 != null) {
                zf4.F0 = c6;
            }
            if (d4 != null) {
                zf4.G0 = d4;
            }
            if (e7 != null) {
                zf4.H0 = e7;
            }
            if (f6 != null) {
                zf4.I0 = f6;
            }
            if (g6 != null) {
                zf4.J0 = g6;
            }
            if (h3 != null) {
                zf4.K0 = h3;
            }
            if (i5 != null) {
                zf4.L0 = i5;
            }
            if (j9 != null) {
                zf4.M0 = j9;
                zf4.a1.set(0, true);
            }
            if (k4 != null) {
                zf4.N0 = k4;
                zf4.a1.set(1, true);
            }
            if (l4 != null) {
                zf4.O0 = l4;
            }
            if (m4 != null) {
                zf4.P0 = m4;
            }
            if (n5 != null) {
                zf4.Q0 = n5;
            }
            if (o3 != null) {
                zf4.R0 = o3;
            }
            if (p3 != null) {
                zf4.S0 = p3;
                zf4.a1.set(2, true);
            }
            if (q2 != null) {
                zf4.T0 = q2;
            }
            if (r != null) {
                zf4.U0 = r;
            }
            if (s5 != null) {
                zf4.V0 = s5;
                zf4.a1.set(3, true);
            }
            if (t != null) {
                zf4.W0 = t;
            }
            if (u != null) {
                zf4.X0 = u;
            }
            if (v != null) {
                zf4.Y0 = v;
            }
            if (w != null) {
                zf4.Z0 = w;
                zf4.a1.set(4, true);
            }
            return zf4;
        }
        final StringBuilder j10 = fu8.j("Required field 'request_details' was not present! Struct: ");
        j10.append(zf4$a.toString());
        throw new IllegalArgumentException(j10.toString());
    }
}
