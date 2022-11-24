import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.app.posttweetactions.ui.contacts.PostTweetActionsModalViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtk
{
    public static final void a(final ctk ctk, dlh companion, PostTweetActionsModalViewModel postTweetActionsModalViewModel, final d86 d86, final int n, final int n2) {
        e0e.f((Object)ctk, "effectHandler");
        final d86 h = d86.h(-1875705183);
        if ((n2 & 0x2) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        if ((n2 & 0x4) != 0x0) {
            postTweetActionsModalViewModel = (PostTweetActionsModalViewModel)((z9x)h.m((df6)bmx.a)).a.c((oax)new oax$b(new fax((Class)PostTweetActionsModalViewModel.class, "")));
        }
        final sa6$b a = sa6.a;
        h.x(-2088733469);
        final dtk$a dtk$a = new dtk$a((Object)ctk);
        h.x(1941511575);
        h.x(-301010798);
        final Object z = af.z(h, 773894976, -492369756);
        Objects.requireNonNull(d86.Companion);
        gf6 c;
        if ((c = (gf6)z) == d86$a.b) {
            c = j00.c(shw.y(h), h);
        }
        h.O();
        final iz6 f0 = c.F0;
        h.O();
        shw.i((Object)postTweetActionsModalViewModel, (Object)f0, (hub)new dtk$b((MviViewModel)postTweetActionsModalViewModel, f0, zzz.h0((Object)dtk$a, h), (mp6)null), h);
        h.O();
        h.O();
        h.O();
        final dlh i = heq.i(companion);
        final v0r a2 = v0r.a;
        final dlh b0 = zzz.b0(i, v0r.k, 0.0f, 2);
        h.x(-483455358);
        final gs0 a3 = gs0.a;
        final gs0$l d87 = (gs0$l)gs0.d;
        Objects.requireNonNull(ex.Companion);
        final zqg a4 = ts4.a((gs0$l)d87, (ex$b)ex$a.n, h);
        h.x(-1323940314);
        final rp8 rp8 = (rp8)h.m((df6)ff6.e);
        final cwe cwe = (cwe)h.m((df6)ff6.k);
        final l7x l7x = (l7x)h.m((df6)ff6.o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b2 = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(b0);
        if (h.j() instanceof tr0) {
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a4, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a5).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-1163856341);
            cpc.b(new y53(d63.F0, (h5f)h5f$f.I0), heq.j(heq.i((dlh)dlh.Companion), (float)52), kqe.r0(2131955825, h), (u53)new u53$b(false), (Icon)null, (String)null, false, (ptb)new dtk$c(postTweetActionsModalViewModel), h, 4144, 112);
            w0r.i(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final gyo k = h.k();
            if (k != null) {
                k.a((hub)new dtk$d(ctk, companion, postTweetActionsModalViewModel, n, n2));
            }
            return;
        }
        kqe.W();
        throw null;
    }
    
    public static final void b(dlh companion, d86 h, final int n, final int n2) {
        h = h.h(-1437912358);
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
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            final dlh i = heq.i(companion);
            final v0r a2 = v0r.a;
            final dlh b0 = zzz.b0(i, v0r.k, 0.0f, 2);
            h.x(-483455358);
            final gs0 a3 = gs0.a;
            final gs0$l d = (gs0$l)gs0.d;
            Objects.requireNonNull(ex.Companion);
            final zqg a4 = ts4.a((gs0$l)d, (ex$b)ex$a.n, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b2 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(b0);
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a4, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a5).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)0);
            final String d2 = d1.D(h, 2058660585, -1163856341, 2131955832, h);
            final kqc$a companion2 = kqc.Companion;
            kjs.a(d2, (dlh)null, 0L, 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 0, companion2.a(h).d, false, h, 0, 0, 49150);
            w0r.l(h, 0);
            kjs.a(kqe.r0(2131955831, h), (dlh)null, 0L, 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 0, false, 0, companion2.a(h).h, false, h, 0, 0, 49150);
            w0r.i(h, 0);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dtk$e(companion, n, n2));
        }
    }
    
    public static final void c(dlh i, d86 h, final int n, final int n2) {
        h = h.h(-1247296686);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)i)) {
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
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                i = heq.i((dlh)dlh.Companion);
            }
            final sa6$b a = sa6.a;
            final wvj e0 = zzz.e0(2131232783, h);
            Objects.requireNonNull(kn6.Companion);
            s7d.a(e0, (String)null, i, (ex)null, (kn6)kn6$a.d, 0.0f, (vr4)null, h, (n4 << 6 & 0x380) | 0x6038, 104);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new dtk$f(i, n, n2));
        }
    }
}
