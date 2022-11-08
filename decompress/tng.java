import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tng
{
    public static final void a(ks4 ks4, ymv ymv, final krp krp, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n, final int n2) {
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(-891417079);
        int n4;
        if ((n & 0xE) == 0x0) {
            int n3;
            if ((n2 & 0x1) == 0x0 && h.P((Object)ks4)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        if ((n & 0x70) == 0x0) {
            int n5;
            if ((n2 & 0x2) == 0x0 && h.P((Object)ymv)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
        }
        if ((n & 0x380) == 0x0) {
            int n6;
            if ((n2 & 0x4) == 0x0 && h.P((Object)krp)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        krp krp2 = krp;
        int n7;
        if ((n2 & 0x8) != 0x0) {
            n7 = (n4 | 0xC00);
        }
        else {
            n7 = n4;
            if ((n & 0x1C00) == 0x0) {
                int n8;
                if (h.P((Object)gub)) {
                    n8 = 2048;
                }
                else {
                    n8 = 1024;
                }
                n7 = (n4 | n8);
            }
        }
        ks4 ks5 = null;
        krp krp3;
        if ((n7 & 0x16DB) == 0x492 && h.i()) {
            h.H();
            ks5 = ks4;
            krp3 = krp2;
        }
        else {
            h.C();
            int n11 = 0;
            ymv ymv2 = null;
            krp krp4 = null;
            Label_0490: {
                int n10;
                if ((n & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    int n9 = n7;
                    if ((n2 & 0x1) != 0x0) {
                        n9 = (n7 & 0xFFFFFFF1);
                    }
                    n10 = n9;
                    if ((n2 & 0x2) != 0x0) {
                        n10 = (n9 & 0xFFFFFF8F);
                    }
                    ks5 = ks4;
                    n11 = n10;
                    ymv2 = ymv;
                    krp4 = krp2;
                    if ((n2 & 0x4) == 0x0) {
                        break Label_0490;
                    }
                }
                else {
                    int n12 = n7;
                    if ((n2 & 0x1) != 0x0) {
                        final ea6$b a = ea6.a;
                        ks4 = (ks4)h.m((re6)ls4.a);
                        n12 = (n7 & 0xFFFFFFF1);
                    }
                    n10 = n12;
                    if ((n2 & 0x2) != 0x0) {
                        final ea6$b a2 = ea6.a;
                        ymv = (ymv)h.m((re6)zmv.a);
                        n10 = (n12 & 0xFFFFFF8F);
                    }
                    ks5 = ks4;
                    n11 = n10;
                    ymv2 = ymv;
                    krp4 = krp2;
                    if ((n2 & 0x4) == 0x0) {
                        break Label_0490;
                    }
                    final ea6$b a3 = ea6.a;
                    krp2 = (krp)h.m((re6)lrp.a);
                }
                n11 = (n10 & 0xFFFFFC7F);
                krp4 = krp2;
                ymv2 = ymv;
                ks5 = ks4;
            }
            h.s();
            final ea6$b a4 = ea6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(m76.Companion);
            final m76$a$a b = m76$a.b;
            ks4 ks6;
            if ((ks6 = (ks4)y) == b) {
                ks6 = new ks4(ks5.h(), ks5.i(), ks5.j(), ks5.k(), ks5.a(), ks5.l(), ks5.b(), ks5.e(), ks5.f(), ks5.c(), ks5.g(), ks5.d(), ks5.m());
                h.p((Object)ks6);
            }
            h.O();
            final ks4 ks7 = ks6;
            final n9r a5 = ls4.a;
            zzd.f((Object)ks7, "<this>");
            zzd.f((Object)ks5, "other");
            ((nhq)ks7.a).setValue((Object)new pr4(ks5.h()));
            ((nhq)ks7.b).setValue((Object)new pr4(ks5.i()));
            ((nhq)ks7.c).setValue((Object)new pr4(ks5.j()));
            ((nhq)ks7.d).setValue((Object)new pr4(ks5.k()));
            ((nhq)ks7.e).setValue((Object)new pr4(ks5.a()));
            ((nhq)ks7.f).setValue((Object)new pr4(ks5.l()));
            ((nhq)ks7.g).setValue((Object)new pr4(ks5.b()));
            ((nhq)ks7.h).setValue((Object)new pr4(ks5.e()));
            ((nhq)ks7.i).setValue((Object)new pr4(ks5.f()));
            ((nhq)ks7.j).setValue((Object)new pr4(ks5.c()));
            ((nhq)ks7.k).setValue((Object)new pr4(ks5.g()));
            ((nhq)ks7.l).setValue((Object)new pr4(ks5.d()));
            ((nhq)ks7.m).setValue((Object)ks5.m());
            final fld a6 = jzm.a(false, 0.0f, 0L, h, 0, 7);
            h.x(-721696685);
            final long h2 = ks7.h();
            final long a7 = ks7.a();
            h.x(35572910);
            long n13 = ls4.a(ks7, a7);
            Objects.requireNonNull(pr4.Companion);
            if (n13 == pr4.g) {
                n13 = ((pr4)h.m((re6)ll6.a)).a;
            }
            h.O();
            final long b2 = pr4.b(n13, x3j.F(h));
            final pr4 pr4 = new pr4(h2);
            final pr4 pr5 = new pr4(a7);
            final pr4 pr6 = new pr4(b2);
            h.x(1618982084);
            final boolean p7 = h.P((Object)pr4);
            final boolean p8 = h.P((Object)pr5);
            final boolean p9 = h.P((Object)pr6);
            Object y2 = h.y();
            if ((p7 | p8 | p9) || y2 == b) {
                final long h3 = ks7.h();
                final float b3 = mlw.b(h2, 0.4f, b2, a7);
                final float b4 = mlw.b(h2, 0.2f, b2, a7);
                float n19 = 0.0f;
                Label_1335: {
                    float n14;
                    if (b3 >= 4.5f) {
                        n14 = 0.4f;
                    }
                    else if (b4 < 4.5f) {
                        n14 = 0.2f;
                    }
                    else {
                        float n15 = 0.4f;
                        int n16 = 0;
                        float n17 = 0.2f;
                        float n18 = 0.4f;
                        while (true) {
                            n19 = n15;
                            if (n16 >= 7) {
                                break Label_1335;
                            }
                            final float n20 = mlw.b(h2, n15, b2, a7) / 4.5f - 1.0f;
                            final boolean b5 = 0.0f <= n20 && n20 <= 0.01f;
                            n19 = n15;
                            if (b5) {
                                break Label_1335;
                            }
                            if (n20 < 0.0f) {
                                n18 = n15;
                            }
                            else {
                                n17 = n15;
                            }
                            n15 = (n18 + n17) / 2.0f;
                            ++n16;
                        }
                    }
                    n19 = n14;
                }
                y2 = new sis(h3, pr4.b(h2, n19));
                h.p(y2);
            }
            h.O();
            final sis sis = (sis)y2;
            final ea6$b a8 = ea6.a;
            h.O();
            se6.a(new oll[] { ls4.a.b((Object)ks7), ((mll)kl6.a).b((Object)x3j.C(h)), hld.a.b((Object)a6), lzm.a.b((Object)png.a), lrp.a.b((Object)krp4), ((mll)tis.a).b((Object)sis), zmv.a.b((Object)ymv2) }, (gub)m8y.j(h, -1740102967, new tng$a(ymv2, (gub)gub, n11)), h, 56);
            krp3 = krp4;
            ymv = ymv2;
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new tng$b(ks5, ymv, krp3, (gub)gub, n, n2));
        }
    }
}
