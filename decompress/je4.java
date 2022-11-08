import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class je4
{
    public static final void a(final oth oth, final luh<twk> luh, final Map<ppe, twk> map, final m76 m76, final int n) {
        zzd.f((Object)oth, "interactionSource");
        zzd.f((Object)luh, "pressedInteraction");
        zzd.f((Object)map, "currentKeyPressInteractions");
        final m76 h = m76.h(1297229208);
        final ea6$b a = ea6.a;
        jgw.c((Object)oth, (rtb)new je4$a((luh)luh, (Map)map, oth), h);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new je4$b(oth, (luh)luh, (Map)map, n));
        }
    }
    
    public static final jkh b(final jkh jkh, final oth oth, final fld fld, final boolean b, final String s, final ozm ozm, final otb<oyv> otb) {
        zzd.f((Object)jkh, "$this$clickable");
        zzd.f((Object)oth, "interactionSource");
        zzd.f((Object)otb, "onClick");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new je4$c((otb)otb, b, oth, fld, s, ozm));
    }
    
    public static jkh d(final jkh jkh, boolean b, String s, ozm ozm, final otb otb, final int n) {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            s = null;
        }
        if ((n & 0x4) != 0x0) {
            ozm = null;
        }
        zzd.f((Object)jkh, "$this$clickable");
        zzd.f((Object)otb, "onClick");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new ke4(b, s, ozm, otb));
    }
    
    public static final jkh e(final jkh jkh, final oth oth, final fld fld, final boolean b, final String s, final ozm ozm, final String s2, final otb<oyv> otb, final otb<oyv> otb2, final otb<oyv> otb3) {
        zzd.f((Object)jkh, "$this$combinedClickable");
        zzd.f((Object)oth, "interactionSource");
        zzd.f((Object)otb3, "onClick");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new je4$d((otb)otb3, (otb)otb, (otb)otb2, b, oth, fld, s, ozm, s2));
    }
    
    public static jkh f(final jkh jkh, final otb otb, final otb otb2) {
        zzd.f((Object)jkh, "$this$combinedClickable");
        zzd.f((Object)otb2, "onClick");
        final ssd$a a = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new oe4(true, null, null, null, (otb<oyv>)otb, null, (otb<oyv>)otb2));
    }
    
    public static final jkh g(final jkh jkh, final jkh jkh2, final oth oth, final fld fld, final yy6 yy6, final Map<ppe, twk> map, final q7r<qfj> q7r, final boolean b, final String s, final ozm ozm, final String s2, final otb<oyv> otb, final otb<oyv> otb2) {
        zzd.f((Object)jkh2, "gestureModifiers");
        zzd.f((Object)oth, "interactionSource");
        zzd.f((Object)yy6, "indicationScope");
        zzd.f((Object)map, "currentKeyPressInteractions");
        zzd.f((Object)q7r, "keyClickOffset");
        zzd.f((Object)otb2, "onClick");
        final jkh a = hld.a(fqe.a(x3j.K(jkh, true, (rtb)new we4(ozm, s, (otb)otb, s2, b, (otb)otb2)), (rtb)new ze4(b, map, q7r, yy6, otb2, oth)), (cvd)oth, fld);
        zzd.f((Object)a, "<this>");
        final ssd$a a2 = ssd.a;
        final ssd$a a3 = ssd.a;
        final jkh a4 = l76.a(a, (rtb)a3, (jub)new jrc(oth, b));
        final qsd a5 = ogb.a;
        zzd.f((Object)a4, "<this>");
        return l76.a(a4, (rtb)a3, (jub)new qgb(b, oth)).E(jkh2);
    }
    
    public static final Object h(final qwk qwk, final long n, final oth oth, final luh<twk> luh, final q7r<? extends otb<Boolean>> q7r, final ap6<? super oyv> ap6) {
        final Object q = oyz.q((gub)new je4$e(qwk, n, oth, (luh)luh, (q7r)q7r, (ap6)null), ap6);
        if (q == zy6.C0) {
            return q;
        }
        return oyv.a;
    }
}
