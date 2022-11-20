// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import java.io.IOException;
import java.util.ArrayList;
import com.twitter.model.stratostore.MediaColorData;
import java.util.Map;
import java.text.SimpleDateFormat;

public final class b extends ywj<cgv$b>
{
    public static cgv$b a(RestJsonTwitterUser h0) {
        final cgv$b cgv$b = new cgv$b();
        ((cgv$a)cgv$b).a = h0.a;
        final int a = c5j.a;
        ((cgv$a)cgv$b).b = h0.b;
        ((cgv$a)cgv$b).i = h0.c;
        ((cgv$a)cgv$b).z(h0.d);
        ((cgv$a)cgv$b).x(h0.e);
        final String g = h0.g;
        final String h2 = h0.h;
        String s = g;
        if (g == null) {
            s = h2;
        }
        ((cgv$a)cgv$b).A(s);
        ((cgv$a)cgv$b).t(h0.i);
        ((cgv$a)cgv$b).s = h0.n;
        ((cgv$a)cgv$b).t = h0.o;
        ((cgv$a)cgv$b).u = h0.p;
        ((cgv$a)cgv$b).w = h0.q;
        ((cgv$a)cgv$b).x = h0.r;
        ((cgv$a)cgv$b).A = h0.s;
        ((cgv$a)cgv$b).k = h0.t;
        ((cgv$a)cgv$b).y = h0.u;
        final boolean w = h0.w;
        boolean d0 = true;
        ((cgv$a)cgv$b).q = (w ^ true);
        ((cgv$a)cgv$b).l = h0.z;
        ((cgv$a)cgv$b).m = h0.A;
        ((cgv$a)cgv$b).j = h0.B;
        ((cgv$a)cgv$b).I = h0.I;
        ((cgv$a)cgv$b).J = h0.L;
        ((cgv$a)cgv$b).B = h0.N;
        final Boolean v = h0.V;
        final int k = ((cgv$a)cgv$b).K;
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
        ((cgv$a)cgv$b).K = i;
        ((cgv$a)cgv$b).f0 = h0.f0;
        ((cgv$a)cgv$b).h0 = h0.g0;
        final ArrayList r = h0.R;
        if (r != null) {
            if (!r.isEmpty()) {
                ((cgv$a)cgv$b).N = (long)r.get(0);
            }
            else {
                ((cgv$a)cgv$b).N = 0L;
            }
        }
        else {
            ((cgv$a)cgv$b).N = -1L;
        }
        ((cgv$a)cgv$b).H = chw.G(h0.v, h0.x, h0.y, h0.C, h0.D, h0.E, h0.F, h0.G, h0.H, h0.J, h0.K, h0.M);
        final RestJsonTwitterUser$JsonUserEntities o = h0.O;
        if (o != null) {
            final eku b = o.b;
            final eku h3 = eku.h;
            eku d2;
            if ((d2 = b) == null) {
                d2 = h3;
            }
            ((cgv$a)cgv$b).D = d2;
        }
        final String j = h0.j;
        try {
            ((cgv$a)cgv$b).v = Long.parseLong(j);
        }
        catch (final NumberFormatException ex) {
            ((cgv$a)cgv$b).v = hq1.h((SimpleDateFormat)hq1.b, j);
            final int a2 = c5j.a;
        }
        final String l = h0.k;
        while (true) {
            try {
                ((cgv$a)cgv$b).g = (Integer.parseInt(l, 16) | 0xFF000000);
                final int a3 = c5j.a;
                final String m = h0.l;
                try {
                    ((cgv$a)cgv$b).h = (Integer.parseInt(m, 16) | 0xFF000000);
                }
                catch (final NumberFormatException ex2) {}
                final int a4 = c5j.a;
                final RestJsonTwitterUser$JsonActionsArray p = h0.P;
                if (p != null) {
                    final int k2 = ((cgv$a)cgv$b).K;
                    int n4;
                    if (!fq4.v((Object[])p.a)) {
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
                    ((cgv$a)cgv$b).K = (n4 | k2);
                    final int a6 = c5j.a;
                }
                ((cgv$a)cgv$b).p = ynj.b((Object)h0.Q);
                ((cgv$a)cgv$b).r = h0.S;
                final String f = h0.f;
                final RestJsonTwitterUser$JsonUserEntities o2 = h0.O;
                final eku eku = null;
                eku eku2;
                if (o2 != null) {
                    final eku a7 = o2.a;
                    final eku h4 = eku.h;
                    if ((eku2 = a7) == null) {
                        eku2 = h4;
                    }
                }
                else {
                    eku2 = null;
                }
                ((cgv$a)cgv$b).w(ii8.q(new cfu(f, eku2, (Map)null), true));
                final xv m2 = h0.m;
                final xv e0 = xv.E0;
                xv l2;
                if ((l2 = m2) == null) {
                    l2 = e0;
                }
                ((cgv$a)cgv$b).L = l2;
                if (h0.T != h10.E0) {
                    d0 = false;
                }
                ((cgv$a)cgv$b).O = d0;
                final a1u u = h0.U;
                final a1u e2 = a1u.E0;
                a1u p2 = u;
                if (u == null) {
                    p2 = e2;
                }
                ((cgv$a)cgv$b).P = p2;
                ((cgv$a)cgv$b).Q = h0.W;
                ((cgv$a)cgv$b).R = h0.X;
                final bjr y = h0.Y;
                if (y != null) {
                    final MediaColorData mediaColorData = (MediaColorData)y.a((Class)MediaColorData.class);
                    if (mediaColorData != null) {
                        ((cgv$a)cgv$b).y(mediaColorData.a);
                    }
                }
                final bjr z = h0.Z;
                if (z != null) {
                    final MediaColorData mediaColorData2 = (MediaColorData)z.a((Class)MediaColorData.class);
                    if (mediaColorData2 != null) {
                        ((cgv$a)cgv$b).v(mediaColorData2.a);
                    }
                }
                final bjr a8 = h0.a0;
                if (a8 != null) {
                    ((cgv$a)cgv$b).V = (xdw)a8.a((Class)xdw.class);
                    final uvr uvr = (uvr)a8.a((Class)uvr.class);
                    final mmq mmq = (mmq)a8.a((Class)mmq.class);
                    if (uvr != null) {
                        ((cgv$a)cgv$b).Y = uvr.a;
                        ((cgv$a)cgv$b).o(Boolean.valueOf(uvr.c), Boolean.valueOf(uvr.b), Boolean.valueOf(uvr.d), Boolean.valueOf(uvr.e), (Boolean)null);
                    }
                    if (mmq != null) {
                        int h5 = ((cgv$a)cgv$b).H;
                        if (mmq.a) {
                            h5 = chw.F0(h5, 2097152);
                        }
                        ((cgv$a)cgv$b).H = h5;
                    }
                }
                if (h0.b0 != null) {
                    final int a9 = h0.b0.a;
                    d0 = h0.d0;
                    final String c0 = h0.c0;
                    final RestJsonTwitterUser$JsonUserEntities e3 = h0.e0;
                    eku eku3 = eku;
                    if (e3 != null) {
                        final eku a10 = e3.a;
                        final eku h6 = eku.h;
                        if ((eku3 = a10) == null) {
                            eku3 = h6;
                        }
                    }
                    ((cgv$a)cgv$b).U = new qqx(a9, d0, c0, eku3);
                }
                h0 = (RestJsonTwitterUser)h0.h0;
                if (h0 != null) {
                    ((cgv$a)cgv$b).u((e4l)h0);
                }
                return cgv$b;
            }
            catch (final NumberFormatException ex3) {
                continue;
            }
            break;
        }
    }
    
    public final Object parse(final tge tge) throws IOException {
        final GraphqlJsonTwitterUser graphqlJsonTwitterUser = (GraphqlJsonTwitterUser)gih.c(tge, (Class)GraphqlJsonTwitterUser.class, false);
        cgv$b cgv$b;
        if (graphqlJsonTwitterUser != null) {
            final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m0 = graphqlJsonTwitterUser.m0;
            if (m0 != null) {
                cgv$b = a(m0);
                ((cgv$a)cgv$b).V = graphqlJsonTwitterUser.k0;
                final int a = c5j.a;
                ((cgv$a)cgv$b).n = graphqlJsonTwitterUser.l0;
                final Boolean n0 = graphqlJsonTwitterUser.n0;
                if (n0 != null) {
                    ((cgv$a)cgv$b).W = n0;
                }
                ((cgv$a)cgv$b).C(graphqlJsonTwitterUser.t0);
                final Boolean o0 = graphqlJsonTwitterUser.o0;
                if (o0 != null) {
                    ((cgv$a)cgv$b).Y = o0;
                }
                ((cgv$a)cgv$b).o(graphqlJsonTwitterUser.q0, graphqlJsonTwitterUser.p0, graphqlJsonTwitterUser.r0, graphqlJsonTwitterUser.s0, graphqlJsonTwitterUser.x0);
                final int h0 = chw.H0(((cgv$a)cgv$b).H, 524288, 131072, graphqlJsonTwitterUser.u0);
                ((cgv$a)cgv$b).H = h0;
                ((cgv$a)cgv$b).H = chw.H0(h0, 262144, 65536, graphqlJsonTwitterUser.v0);
                ((cgv$a)cgv$b).B(graphqlJsonTwitterUser.w0);
                ((cgv$a)cgv$b).u(graphqlJsonTwitterUser.A0);
                ((cgv$a)cgv$b).p(graphqlJsonTwitterUser.B0);
                ((cgv$a)cgv$b).q(graphqlJsonTwitterUser.z0);
                ((cgv$a)cgv$b).r(graphqlJsonTwitterUser.C0);
            }
            else {
                cgv$b = a(graphqlJsonTwitterUser);
            }
            if (asa.b().b("subscriptions_android_is_blue_verified_field_enabled", false)) {
                final Boolean d0 = graphqlJsonTwitterUser.D0;
                if (d0 == null) {
                    final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m2 = graphqlJsonTwitterUser.m0;
                    if (m2 != null) {
                        ((cgv$a)cgv$b).s(m2.i0);
                        return cgv$b;
                    }
                }
                ((cgv$a)cgv$b).s(d0);
            }
            else {
                ((cgv$a)cgv$b).s((Boolean)null);
            }
        }
        else {
            cgv$b = new cgv$b();
        }
        return cgv$b;
    }
}
