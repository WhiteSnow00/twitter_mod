import android.view.ViewManager;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import java.util.UUID;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m50
{
    public static final lml<String> a;
    
    static {
        m50.a = (jp9)ef6.c((ptb)m50$a.F0);
    }
    
    public static final void a(final fsk fsk, ptb<vzv> ptb, gsk gsk, final hub<? super d86, ? super Integer, vzv> hub, final d86 d86, final int n, final int n2) {
        e0e.f((Object)fsk, "popupPositionProvider");
        e0e.f((Object)hub, "content");
        final d86 h = d86.h(-830247068);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)fsk)) {
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
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0151: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)ptb)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0151;
                }
            }
            n8 = n6;
        }
        if ((n & 0x380) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && h.P((Object)gsk)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n8 |= n9;
        }
        int n10;
        if ((n2 & 0x8) != 0x0) {
            n10 = (n8 | 0xC00);
        }
        else {
            n10 = n8;
            if ((n & 0x1C00) == 0x0) {
                int n11;
                if (h.P((Object)hub)) {
                    n11 = 2048;
                }
                else {
                    n11 = 1024;
                }
                n10 = (n8 | n11);
            }
        }
        if ((n10 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            h.C();
            ptb<vzv> ptb3 = null;
            gsk gsk3 = null;
            Label_0385: {
                ptb<vzv> ptb2;
                if ((n & 0x1) != 0x0 && !h.K()) {
                    h.H();
                    ptb2 = ptb;
                }
                else {
                    if (n5 != 0) {
                        ptb = null;
                    }
                    ptb2 = ptb;
                    if ((n2 & 0x4) != 0x0) {
                        final gsk gsk2 = new gsk(false, false, 63);
                        ptb3 = ptb;
                        gsk3 = gsk2;
                        break Label_0385;
                    }
                }
                gsk3 = gsk;
                ptb3 = ptb2;
            }
            h.s();
            final sa6$b a = sa6.a;
            final View view = (View)h.m((df6)z20.f);
            final gbr e = ff6.e;
            final rp8 rp8 = (rp8)h.m((df6)e);
            final String s = (String)h.m((df6)m50.a);
            final gbr k = ff6.k;
            final cwe cwe = (cwe)h.m((df6)k);
            final xe6 i0 = kqe.i0(h);
            final l9r h2 = zzz.h0((Object)hub, h);
            final UUID uuid = (UUID)bs4.c0(new Object[0], null, null, (ptb)m50$i.F0, h, 6);
            h.x(-492369756);
            Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            if (y == d86$a.b) {
                e0e.e((Object)uuid, "popupId");
                y = new yrk(ptb3, gsk3, s, view, rp8, fsk, uuid);
                ((yrk)y).l(i0, (hub<? super d86, ? super Integer, vzv>)w9y.j(1302892335, true, new m50$j((yrk)y, h2)));
                h.p(y);
            }
            h.O();
            final yrk yrk = (yrk)y;
            shw.b((Object)yrk, (stb)new stb<h39, g39>(yrk, ptb3, gsk3, s, cwe) {
                public final yrk F0;
                public final ptb<vzv> G0;
                public final gsk H0;
                public final String I0;
                public final cwe J0;
                
                public final Object invoke(final Object o) {
                    e0e.f((Object)o, "$this$DisposableEffect");
                    final yrk f0 = this.F0;
                    ((ViewManager)f0.R0).addView((View)f0, (ViewGroup$LayoutParams)f0.S0);
                    this.F0.m(this.G0, this.H0, this.I0, this.J0);
                    return new n50(this.F0);
                }
            }, h);
            shw.n((ptb)new ptb<vzv>(yrk, ptb3, gsk3, s, cwe) {
                public final yrk F0;
                public final ptb<vzv> G0;
                public final gsk H0;
                public final String I0;
                public final cwe J0;
                
                public final Object invoke() {
                    this.F0.m(this.G0, this.H0, this.I0, this.J0);
                    return vzv.a;
                }
            }, h);
            shw.b((Object)fsk, (stb)new m50$d(yrk, fsk), h);
            shw.h((Object)yrk, (hub)new m50$e(yrk, (mp6)null), h);
            final dlh p7 = d4j.p0((dlh)dlh.Companion, (stb)new m50$f(yrk));
            final m50$g m50$g = new m50$g(yrk, cwe);
            h.x(-1323940314);
            final rp8 rp9 = (rp8)h.m((df6)e);
            final cwe cwe2 = (cwe)h.m((df6)k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(p7);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, m50$g, (hub)w76.a.e);
            jty.X(h, rp9, (hub)w76.a.d);
            jty.X(h, cwe2, (hub)w76.a.f);
            ((z36)a2).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(2085825549);
            h.O();
            h.O();
            h.r();
            h.O();
            final ptb<vzv> ptb4 = ptb3;
            gsk = gsk3;
            ptb = ptb4;
        }
        final gyo j = h.k();
        if (j != null) {
            j.a((hub)new m50$h(fsk, (ptb)ptb, gsk, (hub)hub, n, n2));
        }
    }
    
    public static final boolean b(final View view) {
        e0e.f((Object)view, "<this>");
        final ViewGroup$LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager$LayoutParams windowManager$LayoutParams;
        if (layoutParams instanceof WindowManager$LayoutParams) {
            windowManager$LayoutParams = (WindowManager$LayoutParams)layoutParams;
        }
        else {
            windowManager$LayoutParams = null;
        }
        boolean b = false;
        if (windowManager$LayoutParams != null) {
            b = b;
            if ((windowManager$LayoutParams.flags & 0x2000) != 0x0) {
                b = true;
            }
        }
        return b;
    }
}
