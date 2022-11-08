import java.util.Objects;
import java.util.UUID;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k30
{
    public static final void a(final otb<oyv> otb, xw8 xw8, final gub<? super m76, ? super Integer, oyv> gub, final m76 m76, final int n, final int n2) {
        zzd.f((Object)otb, "onDismissRequest");
        zzd.f((Object)gub, "content");
        final m76 h = m76.h(-2032877254);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)otb)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        if ((n & 0x70) == 0x0) {
            int n5;
            if ((n2 & 0x2) == 0x0 && h.P((Object)xw8)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n3 |= n5;
        }
        int n6;
        if ((n2 & 0x4) != 0x0) {
            n6 = (n3 | 0x180);
        }
        else {
            n6 = n3;
            if ((n & 0x380) == 0x0) {
                int n7;
                if (h.P((Object)gub)) {
                    n7 = 256;
                }
                else {
                    n7 = 128;
                }
                n6 = (n3 | n7);
            }
        }
        if ((n6 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                if ((n2 & 0x2) != 0x0) {}
            }
            else if ((n2 & 0x2) != 0x0) {
                xw8 = new xw8(false, 7);
            }
            h.s();
            final ea6$b a = ea6.a;
            final View view = (View)h.m((re6)a30.f);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final le6 o0 = ukg.O0(h);
            final q7r v = nkz.v((Object)gub, h);
            final UUID uuid = (UUID)rez.E(new Object[0], (dto)null, (String)null, (otb)k30$e.C0, h, 6);
            h.x(511388516);
            final boolean p6 = h.P((Object)view);
            final boolean p7 = h.P((Object)dp8);
            final Object y = h.y();
            cx8 cx8 = null;
            Label_0547: {
                if (!(p6 | p7)) {
                    Objects.requireNonNull(m76.Companion);
                    if ((cx8 = (cx8)y) != m76$a.b) {
                        break Label_0547;
                    }
                }
                zzd.e((Object)uuid, "dialogId");
                cx8 = new cx8(otb, xw8, view, tve, dp8, uuid);
                final i36 k = m8y.k(488261145, true, new k30$d(v));
                zzd.f((Object)o0, "parentComposition");
                final iw8 h2 = cx8.H0;
                Objects.requireNonNull(h2);
                h2.setParentCompositionContext(o0);
                ((nhq)h2.K0).setValue((Object)k);
                h2.M0 = true;
                h2.c();
                h.p((Object)cx8);
            }
            h.O();
            final cx8 cx9 = cx8;
            jgw.c((Object)cx9, (rtb)new k30$a(cx9), h);
            jgw.k((otb)new k30$b(cx9, (otb)otb, xw8, tve), h);
        }
        final vwo i = h.k();
        if (i != null) {
            i.a((gub)new k30$c((otb)otb, xw8, (gub)gub, n, n2));
        }
    }
    
    public static final void b(jkh companion, final gub gub, m76 h, final int n, final int n2) {
        h = h.h(-1177876616);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)gub)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final n30 a2 = n30.a;
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a3 = cwe.a(companion);
            final int n8 = (((n6 << 3 & 0x70) | (n6 >> 3 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a2, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a3).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            gub.invoke((Object)h, (Object)(n8 >> 9 & 0xE));
            h.O();
            h.r();
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new o30(companion, (gub<? super m76, ? super Integer, oyv>)gub, n, n2));
        }
    }
}
