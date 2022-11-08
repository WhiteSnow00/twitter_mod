// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.io.IOException;
import java.util.ArrayList;
import com.twitter.model.stratostore.MediaColorData;
import java.util.Map;
import java.text.SimpleDateFormat;

public final class b extends twj<hfv$b>
{
    public static hfv$b a(RestJsonTwitterUser h0) {
        final hfv$b hfv$b = new hfv$b();
        ((hfv$a)hfv$b).a = h0.a;
        final int a = w4j.a;
        ((hfv$a)hfv$b).b = h0.b;
        ((hfv$a)hfv$b).i = h0.c;
        ((hfv$a)hfv$b).z(h0.d);
        ((hfv$a)hfv$b).x(h0.e);
        final String g = h0.g;
        final String h2 = h0.h;
        String s = g;
        if (g == null) {
            s = h2;
        }
        ((hfv$a)hfv$b).A(s);
        ((hfv$a)hfv$b).t(h0.i);
        ((hfv$a)hfv$b).s = h0.n;
        ((hfv$a)hfv$b).t = h0.o;
        ((hfv$a)hfv$b).u = h0.p;
        ((hfv$a)hfv$b).w = h0.q;
        ((hfv$a)hfv$b).x = h0.r;
        ((hfv$a)hfv$b).A = h0.s;
        ((hfv$a)hfv$b).k = h0.t;
        ((hfv$a)hfv$b).y = h0.u;
        final boolean w = h0.w;
        boolean d0 = true;
        ((hfv$a)hfv$b).q = (w ^ true);
        ((hfv$a)hfv$b).l = h0.z;
        ((hfv$a)hfv$b).m = h0.A;
        ((hfv$a)hfv$b).j = h0.B;
        ((hfv$a)hfv$b).I = h0.I;
        ((hfv$a)hfv$b).J = h0.L;
        ((hfv$a)hfv$b).B = h0.N;
        final Boolean v = h0.V;
        final int k = ((hfv$a)hfv$b).K;
        int i;
        if (v == null) {
            i = (k & 0xFFFFEFFF);
        }
        else {
            final int n = k | 0x1000;
            if (v) {
                i = (n | 0x2000);
            }
            else {
                i = (n & 0xFFFFDFFF);
            }
        }
        ((hfv$a)hfv$b).K = i;
        ((hfv$a)hfv$b).f0 = h0.f0;
        ((hfv$a)hfv$b).h0 = h0.g0;
        final ArrayList r = h0.R;
        if (r != null) {
            if (!r.isEmpty()) {
                ((hfv$a)hfv$b).N = (long)r.get(0);
            }
            else {
                ((hfv$a)hfv$b).N = 0L;
            }
        }
        else {
            ((hfv$a)hfv$b).N = -1L;
        }
        ((hfv$a)hfv$b).H = tdy.D(h0.v, h0.x, h0.y, h0.C, h0.D, h0.E, h0.F, h0.G, h0.H, h0.J, h0.K, h0.M);
        final RestJsonTwitterUser.JsonUserEntities o = h0.O;
        if (o != null) {
            final kju b = o.b;
            final kju h3 = kju.h;
            kju d2;
            if ((d2 = b) == null) {
                d2 = h3;
            }
            ((hfv$a)hfv$b).D = d2;
        }
        final String j = h0.j;
        try {
            ((hfv$a)hfv$b).v = Long.parseLong(j);
        }
        catch (final NumberFormatException ex) {
            ((hfv$a)hfv$b).v = mq1.h((SimpleDateFormat)mq1.b, j);
            final int a2 = w4j.a;
        }
        final String l = h0.k;
        while (true) {
            try {
                ((hfv$a)hfv$b).g = (Integer.parseInt(l, 16) | 0xFF000000);
                final int a3 = w4j.a;
                final String m = h0.l;
                try {
                    ((hfv$a)hfv$b).h = (Integer.parseInt(m, 16) | 0xFF000000);
                }
                catch (final NumberFormatException ex2) {}
                final int a4 = w4j.a;
                final RestJsonTwitterUser.JsonActionsArray p = h0.P;
                if (p != null) {
                    final int k2 = ((hfv$a)hfv$b).K;
                    int n4;
                    if (!hr4.v((Object[])p.a)) {
                        final String[] a5 = p.a;
                        final int length = a5.length;
                        int n2 = 0;
                        int n3 = 0;
                        while (true) {
                            n4 = n3;
                            if (n2 >= length) {
                                break;
                            }
                            final Integer n5 = RestJsonTwitterUser.j0.get(a5[n2]);
                            int n6 = n3;
                            if (n5 != null) {
                                n6 = (n3 | n5);
                            }
                            ++n2;
                            n3 = n6;
                        }
                    }
                    else {
                        n4 = 0;
                    }
                    ((hfv$a)hfv$b).K = (n4 | k2);
                    final int a6 = w4j.a;
                }
                ((hfv$a)hfv$b).p = snj.b((Object)h0.Q);
                ((hfv$a)hfv$b).r = h0.S;
                final String f = h0.f;
                final RestJsonTwitterUser.JsonUserEntities o2 = h0.O;
                final kju kju = null;
                kju kju2;
                if (o2 != null) {
                    final kju a7 = o2.a;
                    final kju h4 = kju.h;
                    if ((kju2 = a7) == null) {
                        kju2 = h4;
                    }
                }
                else {
                    kju2 = null;
                }
                ((hfv$a)hfv$b).w(goz.s(new jeu(f, kju2, (Map)null), true));
                final xv m2 = h0.m;
                final xv d3 = xv.D0;
                xv l2;
                if ((l2 = m2) == null) {
                    l2 = d3;
                }
                ((hfv$a)hfv$b).L = l2;
                if (h0.T != g10.D0) {
                    d0 = false;
                }
                ((hfv$a)hfv$b).O = d0;
                final k0u u = h0.U;
                final k0u d4 = k0u.D0;
                k0u p2 = u;
                if (u == null) {
                    p2 = d4;
                }
                ((hfv$a)hfv$b).P = p2;
                ((hfv$a)hfv$b).Q = h0.W;
                ((hfv$a)hfv$b).R = h0.X;
                final hir y = h0.Y;
                if (y != null) {
                    final MediaColorData mediaColorData = (MediaColorData)y.a((Class)MediaColorData.class);
                    if (mediaColorData != null) {
                        ((hfv$a)hfv$b).y(mediaColorData.a);
                    }
                }
                final hir z = h0.Z;
                if (z != null) {
                    final MediaColorData mediaColorData2 = (MediaColorData)z.a((Class)MediaColorData.class);
                    if (mediaColorData2 != null) {
                        ((hfv$a)hfv$b).v(mediaColorData2.a);
                    }
                }
                final hir a8 = h0.a0;
                if (a8 != null) {
                    ((hfv$a)hfv$b).V = (kdw)a8.a((Class)kdw.class);
                    final dvr dvr = (dvr)a8.a((Class)dvr.class);
                    final slq slq = (slq)a8.a((Class)slq.class);
                    if (dvr != null) {
                        ((hfv$a)hfv$b).Y = dvr.a;
                        ((hfv$a)hfv$b).o(Boolean.valueOf(dvr.c), Boolean.valueOf(dvr.b), Boolean.valueOf(dvr.d), Boolean.valueOf(dvr.e), (Boolean)null);
                    }
                    if (slq != null) {
                        int h5 = ((hfv$a)hfv$b).H;
                        if (slq.a) {
                            h5 = tdy.L0(h5, 2097152);
                        }
                        ((hfv$a)hfv$b).H = h5;
                    }
                }
                if (h0.b0 != null) {
                    final int a9 = h0.b0.a;
                    d0 = h0.d0;
                    final String c0 = h0.c0;
                    final RestJsonTwitterUser.JsonUserEntities e0 = h0.e0;
                    kju kju3 = kju;
                    if (e0 != null) {
                        final kju a10 = e0.a;
                        final kju h6 = kju.h;
                        if ((kju3 = a10) == null) {
                            kju3 = h6;
                        }
                    }
                    ((hfv$a)hfv$b).U = new xpx(a9, d0, c0, kju3);
                }
                h0 = (RestJsonTwitterUser)h0.h0;
                if (h0 != null) {
                    ((hfv$a)hfv$b).u((v3l)h0);
                }
                return hfv$b;
            }
            catch (final NumberFormatException ex3) {
                continue;
            }
            break;
        }
    }
    
    public final Object parse(final khe khe) throws IOException {
        final GraphqlJsonTwitterUser graphqlJsonTwitterUser = (GraphqlJsonTwitterUser)bih.c(khe, (Class)GraphqlJsonTwitterUser.class, false);
        hfv$b hfv$b;
        if (graphqlJsonTwitterUser != null) {
            final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m0 = graphqlJsonTwitterUser.m0;
            if (m0 != null) {
                hfv$b = a(m0);
                ((hfv$a)hfv$b).V = graphqlJsonTwitterUser.k0;
                final int a = w4j.a;
                ((hfv$a)hfv$b).n = graphqlJsonTwitterUser.l0;
                final Boolean n0 = graphqlJsonTwitterUser.n0;
                if (n0 != null) {
                    ((hfv$a)hfv$b).W = n0;
                }
                ((hfv$a)hfv$b).C(graphqlJsonTwitterUser.t0);
                final Boolean o0 = graphqlJsonTwitterUser.o0;
                if (o0 != null) {
                    ((hfv$a)hfv$b).Y = o0;
                }
                ((hfv$a)hfv$b).o(graphqlJsonTwitterUser.q0, graphqlJsonTwitterUser.p0, graphqlJsonTwitterUser.r0, graphqlJsonTwitterUser.s0, graphqlJsonTwitterUser.x0);
                final int m2 = tdy.M0(((hfv$a)hfv$b).H, 524288, 131072, graphqlJsonTwitterUser.u0);
                ((hfv$a)hfv$b).H = m2;
                ((hfv$a)hfv$b).H = tdy.M0(m2, 262144, 65536, graphqlJsonTwitterUser.v0);
                ((hfv$a)hfv$b).B(graphqlJsonTwitterUser.w0);
                ((hfv$a)hfv$b).u(graphqlJsonTwitterUser.A0);
                ((hfv$a)hfv$b).p(graphqlJsonTwitterUser.B0);
                ((hfv$a)hfv$b).q(graphqlJsonTwitterUser.z0);
                ((hfv$a)hfv$b).r(graphqlJsonTwitterUser.C0);
            }
            else {
                hfv$b = a(graphqlJsonTwitterUser);
            }
            if (dta.b().b("subscriptions_android_is_blue_verified_field_enabled", false)) {
                final Boolean d0 = graphqlJsonTwitterUser.D0;
                if (d0 == null) {
                    final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m3 = graphqlJsonTwitterUser.m0;
                    if (m3 != null) {
                        ((hfv$a)hfv$b).s(m3.i0);
                        return hfv$b;
                    }
                }
                ((hfv$a)hfv$b).s(d0);
            }
            else {
                ((hfv$a)hfv$b).s((Boolean)null);
            }
        }
        else {
            hfv$b = new hfv$b();
        }
        return hfv$b;
    }
}
