import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yhs
{
    public static final yhs a;
    
    static {
        a = new yhs();
    }
    
    public final void a(final frd frd, final long n, final long n2, final itb<? super frd, ? super x66, ? super Integer, nq4> itb, final boolean b, final otb<? super Float, ? super nq4, ? super nq4, ? super Float, ? super x66, ? super Integer, fzv> otb, final x66 x66, final int n3) {
        czd.f((Object)frd, "inputState");
        czd.f((Object)itb, "contentColor");
        czd.f((Object)otb, "content");
        final x66 h = x66.h(1988729962);
        int n5;
        if ((n3 & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)frd)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n4 | n3);
        }
        else {
            n5 = n3;
        }
        int n6 = n5;
        if ((n3 & 0x70) == 0x0) {
            int n7;
            if (h.e(n)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n5 | n7);
        }
        int n8 = n6;
        if ((n3 & 0x380) == 0x0) {
            int n9;
            if (h.e(n2)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n3 & 0x1C00) == 0x0) {
            int n11;
            if (h.P((Object)itb)) {
                n11 = 2048;
            }
            else {
                n11 = 1024;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((n3 & 0xE000) == 0x0) {
            int n13;
            if (h.a(b)) {
                n13 = 16384;
            }
            else {
                n13 = 8192;
            }
            n12 = (n10 | n13);
        }
        int n14 = n12;
        if ((0x70000 & n3) == 0x0) {
            int n15;
            if (h.P((Object)otb)) {
                n15 = 131072;
            }
            else {
                n15 = 65536;
            }
            n14 = (n12 | n15);
        }
        if ((0x5B6DB & n14) == 0x12492 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final mzt c = e0u.c((Object)frd, "TextFieldInputState", h, (n14 & 0xE) | 0x30, 0);
            final itb<mzt$b<frd>, x66, Integer, uza<Float>> d0 = (itb<mzt$b<frd>, x66, Integer, uza<Float>>)yhs$c.D0;
            h.x(1399891485);
            final aiv a2 = npw.a;
            final aiv a3 = npw.a;
            h.x(1847725064);
            final frd frd2 = (frd)c.b();
            h.x(-1158004136);
            final int ordinal = ((Enum)frd2).ordinal();
            final float n16 = 1.0f;
            float n17 = 0.0f;
            Label_0446: {
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        n17 = 0.0f;
                        break Label_0446;
                    }
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n17 = 1.0f;
            }
            h.O();
            final frd frd3 = (frd)c.f();
            h.x(-1158004136);
            final int ordinal2 = ((Enum)frd3).ordinal();
            float n18 = 0.0f;
            Label_0516: {
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        n18 = 0.0f;
                        break Label_0516;
                    }
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n18 = 1.0f;
            }
            h.O();
            final m8r b2 = e0u.b(c, (Object)n17, (Object)n18, (uza)d0.h0(c.d(), h, 0), (zhv)a3, "LabelProgress", h);
            h.O();
            h.O();
            final itb<mzt$b<frd>, x66, Integer, uza<Float>> d2 = (itb<mzt$b<frd>, x66, Integer, uza<Float>>)yhs$e.D0;
            h.x(1399891485);
            h.x(1847725064);
            final frd frd4 = (frd)c.b();
            h.x(-1376159017);
            final int ordinal3 = ((Enum)frd4).ordinal();
            float n19 = 0.0f;
            Label_0670: {
                Label_0667: {
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            if (ordinal3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        else if (!b) {
                            break Label_0667;
                        }
                        n19 = 0.0f;
                        break Label_0670;
                    }
                }
                n19 = 1.0f;
            }
            h.O();
            final frd frd5 = (frd)c.f();
            h.x(-1376159017);
            final int ordinal4 = ((Enum)frd5).ordinal();
            float n20 = n16;
            Label_0747: {
                if (ordinal4 != 0) {
                    if (ordinal4 != 1) {
                        if (ordinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    else {
                        n20 = n16;
                        if (!b) {
                            break Label_0747;
                        }
                    }
                    n20 = 0.0f;
                }
            }
            h.O();
            final m8r b3 = e0u.b(c, (Object)n19, (Object)n20, (uza)d2.h0(c.d(), h, 0), (zhv)a3, "PlaceholderOpacity", h);
            h.O();
            h.O();
            final itb<mzt$b<frd>, x66, Integer, uza<nq4>> d3 = (itb<mzt$b<frd>, x66, Integer, uza<nq4>>)yhs$d.D0;
            h.x(-1462136984);
            final frd frd6 = (frd)c.f();
            h.x(-1490209928);
            final int[] a4 = f.a;
            long n21;
            if (a4[((Enum)frd6).ordinal()] == 1) {
                n21 = n;
            }
            else {
                n21 = n2;
            }
            h.O();
            final yq4 f = nq4.f(n21);
            h.x(-3686930);
            final boolean p8 = h.P((Object)f);
            final Object y = h.y();
            Object o = null;
            Label_0965: {
                if (!p8) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0965;
                    }
                }
                hr4.b(nq4.Companion);
                o = hr4.a.invoke((Object)f);
                h.p(o);
            }
            h.O();
            final zhv zhv = (zhv)o;
            h.x(1847725064);
            final frd frd7 = (frd)c.b();
            h.x(-1490209928);
            long n22;
            if (a4[((Enum)frd7).ordinal()] == 1) {
                n22 = n;
            }
            else {
                n22 = n2;
            }
            h.O();
            final nq4 nq4 = new nq4(n22);
            final frd frd8 = (frd)c.f();
            h.x(-1490209928);
            long n23;
            if (a4[((Enum)frd8).ordinal()] == 1) {
                n23 = n;
            }
            else {
                n23 = n2;
            }
            h.O();
            final m8r b4 = e0u.b(c, (Object)nq4, (Object)new nq4(n23), (uza)d3.h0(c.d(), h, 0), zhv, "LabelTextStyleColor", h);
            h.O();
            h.O();
            final itb<mzt$b<frd>, x66, Integer, uza<nq4>> d4 = (itb<mzt$b<frd>, x66, Integer, uza<nq4>>)yhs$b.D0;
            final int n24 = (n14 & 0x1C00) | 0x180;
            h.x(-1462136984);
            final yq4 f2 = nq4.f(((nq4)itb.h0(c.f(), (Object)h, (Object)(n24 >> 6 & 0x70))).a);
            h.x(-3686930);
            final boolean p9 = h.P((Object)f2);
            final Object y2 = h.y();
            Object o2 = null;
            Label_1295: {
                if (!p9) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o2 = y2) != x66$a.b) {
                        break Label_1295;
                    }
                }
                hr4.b(nq4.Companion);
                o2 = hr4.a.invoke((Object)f2);
                h.p(o2);
            }
            h.O();
            final zhv zhv2 = (zhv)o2;
            final int n25 = n24 << 3;
            final int n26 = (n24 & 0xE) | 0x40 | (n25 & 0x380) | (n25 & 0x1C00) | (n25 & 0xE000);
            h.x(1847725064);
            final Object b5 = c.b();
            final int n27 = n26 >> 9 & 0x70;
            final m8r b6 = e0u.b(c, itb.h0(b5, (Object)h, (Object)n27), itb.h0(c.f(), (Object)h, (Object)n27), (uza)d4.h0(c.d(), h, n26 >> 3 & 0x70), zhv2, "LabelContentColor", h);
            h.O();
            h.O();
            otb.O((Object)((Number)((mzt$d)b2).getValue()).floatValue(), (Object)new nq4(((nq4)((mzt$d)b4).getValue()).a), (Object)new nq4(((nq4)((mzt$d)b6).getValue()).a), (Object)((Number)((mzt$d)b3).getValue()).floatValue(), (Object)h, (Object)(n14 >> 3 & 0xE000));
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ftb<x66, Integer, fzv>(this, frd, n, n2, itb, b, otb, n3) {
                public final yhs D0;
                public final frd E0;
                public final long F0;
                public final long G0;
                public final itb<frd, x66, Integer, nq4> H0;
                public final boolean I0;
                public final otb<Float, nq4, nq4, Float, x66, Integer, fzv> J0;
                public final int K0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final x66 x66 = (x66)o;
                    ((Number)o2).intValue();
                    this.D0.a(this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, x66, this.K0 | 0x1);
                    return fzv.a;
                }
            });
        }
    }
    
    public final class f
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[frd.values().length];
            a2[0] = 1;
            a2[a2[1] = 2] = 3;
            a = a2;
        }
    }
}
