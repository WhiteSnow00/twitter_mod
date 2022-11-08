import java.util.List;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.narrowcast.communitypicker.NarrowcastBottomSheetCommunityPickerViewModel;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i7i
{
    public static final void a(final ded<x8i$a> ded, jkh companion, final rtb<? super g9i, oyv> rtb, m76 h, final int n, final int n2) {
        h = h.h(1103469527);
        if ((n2 & 0x2) != 0x0) {
            companion = jkh.Companion;
        }
        final ea6$b a = ea6.a;
        qxe.a(tbi.a(companion, lr0.L(h), null), (i2f)null, (urj)null, false, (ks0$l)null, (dx$b)null, (z6b)null, false, (rtb)new i7i$a((ded)ded, (rtb)rtb, n), h, 0, 254);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new i7i$b((ded)ded, companion, (rtb)rtb, n, n2));
        }
    }
    
    public static final void b(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(-133171835);
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
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final fzq a2 = fzq.a;
            final jkh i = tcq.i(oyz.U(companion, 0.0f, 0.0f, 0.0f, fzq.g, 7));
            Objects.requireNonNull(dx.Companion);
            final gqg q = b8b.q(h, 733328855, dx$a.f, false, h, -1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a3 = cwe.a(i);
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
            r9x.v(h, (Object)q, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a3).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            chl.b((jkh)null, 0L, 0.0f, h, 0, 7);
            dia.u(h);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new i7i$c(companion, n, n2));
        }
    }
    
    public static final void c(final b7i b7i, jkh companion, NarrowcastBottomSheetCommunityPickerViewModel narrowcastBottomSheetCommunityPickerViewModel, final m76 m76, final int n, final int n2) {
        zzd.f((Object)b7i, "effectHandler");
        final m76 h = m76.h(-158104501);
        if ((n2 & 0x2) != 0x0) {
            companion = jkh.Companion;
        }
        int n3;
        if ((n2 & 0x4) != 0x0) {
            narrowcastBottomSheetCommunityPickerViewModel = (NarrowcastBottomSheetCommunityPickerViewModel)((n8x)h.m((re6)skx.a)).a.c((a9x)new a9x$b(new r8x((Class)NarrowcastBottomSheetCommunityPickerViewModel.class, "")));
            n3 = (n & 0xFFFFFC7F);
        }
        else {
            n3 = n;
        }
        final ea6$b a = ea6.a;
        final q7r a2 = k3j.A((MviViewModel)narrowcastBottomSheetCommunityPickerViewModel, (voe)i7i$h.C0, h, 72);
        h.x(-2088733469);
        final i7i$d i7i$d = new i7i$d((Object)b7i);
        h.x(1941511575);
        h.x(-301010798);
        final Object y = af.y(h, 773894976, -492369756);
        Objects.requireNonNull(m76.Companion);
        Object d = y;
        if (y == m76$a.b) {
            d = rb0.d(jgw.A(h), h);
        }
        h.O();
        final yy6 c0 = ((ue6)d).C0;
        h.O();
        jgw.g((Object)narrowcastBottomSheetCommunityPickerViewModel, (Object)c0, (gub)new i7i$e((MviViewModel)narrowcastBottomSheetCommunityPickerViewModel, c0, nkz.v((Object)i7i$d, h), (ap6)null), h);
        h.O();
        h.O();
        h.O();
        if (((List)a2.getValue()).isEmpty()) {
            h.x(-1351474859);
            b(null, h, 0, 1);
            h.O();
        }
        else {
            h.x(-1351474812);
            a((ded<x8i$a>)a2.getValue(), companion, (rtb<? super g9i, oyv>)new i7i$f((Object)narrowcastBottomSheetCommunityPickerViewModel), h, (n3 & 0x70) | 0x8, 0);
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new i7i$g(b7i, companion, narrowcastBottomSheetCommunityPickerViewModel, n, n2));
        }
    }
}
