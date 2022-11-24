import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqb implements vsi<hqi>
{
    public static final wqb.wqb$a Companion;
    public final Resources a;
    public final kcm b;
    public final xsi c;
    public final hb7 d;
    
    static {
        Companion = new wqb.wqb$a();
    }
    
    public wqb(final Resources a, final kcm b, final xsi c, final hb7 d) {
        e0e.f((Object)a, "resources");
        e0e.f((Object)b, "releaseCompletable");
        e0e.f((Object)c, "notificationImageRequestFactory");
        e0e.f((Object)d, "customViewArbiter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final void b(final wqb wqb, final bti bti) {
        Objects.requireNonNull(wqb);
        final nda a = nda.a();
        final UserIdentifier b = bti.B;
        final fg4 fg4 = new fg4(new dda("notification", "status_bar", "big_picture_images", bti.h, "expanded_image_failure"));
        ((o1p)fg4).A();
        a.b(b, (tlm)fg4);
    }
    
    public final epg a(final gri gri, final bti bti, final ati ati) {
        final hqi hqi = (hqi)ati;
        e0e.f((Object)gri, "notificationBuilder");
        final nda a = nda.a();
        final UserIdentifier b = bti.B;
        final fg4 fg4 = new fg4(new dda("notification", "status_bar", "big_picture_images", bti.h, "request"));
        ((o1p)fg4).A();
        a.b(b, (tlm)fg4);
        final boolean d = dsi.Companion.d(bti.B, bti);
        final usi a2 = hqi.a;
        final UserIdentifier b2 = bti.B;
        Object o;
        if (a2 != null && a2.a != null) {
            final boolean b3 = d || a2.c;
            final int dimensionPixelSize = this.a.getDimensionPixelSize(17104902);
            o = ((epg)((fra)this.c).a((Object)1, (Object)a2.a, (Object)beq.Companion.b(dimensionPixelSize, dimensionPixelSize), (Object)b3, (Object)b2)).n();
        }
        else {
            o = rpg.F0;
        }
        final usi b4 = hqi.b;
        final UserIdentifier b5 = bti.B;
        Object o2;
        if (b4 != null && b4.a != null) {
            final int dimensionPixelSize2 = this.a.getDimensionPixelSize(17104902);
            o2 = ((epg)((fra)this.c).a((Object)2, (Object)b4.a, (Object)beq.Companion.b(dimensionPixelSize2, dimensionPixelSize2), (Object)b4.c, (Object)b5)).n();
        }
        else {
            o2 = rpg.F0;
        }
        final usi c = hqi.c;
        final UserIdentifier b6 = bti.B;
        Object o3;
        if (c != null && c.a != null) {
            o3 = ((epg)((fra)this.c).a((Object)3, (Object)c.a, (Object)beq.Companion.b(416, 284), (Object)c.c, (Object)b6)).n();
        }
        else {
            o3 = rpg.F0;
        }
        final List y0 = shw.y0((Object[])new epg[] { (epg)o, (epg)o2, (epg)o3 });
        final int f0 = fab.F0;
        final vab vab = new vab((Iterable)y0);
        e5j.b(Integer.MAX_VALUE, "maxConcurrency");
        final zbb zbb = new zbb((fab)new sab((bol)vab, (rtb)qqg.F0, 1));
        final y06 g0 = this.b.G0;
        Objects.requireNonNull(g0, "other is null");
        final epg o4 = ((bbq)new zbq((idq)new ldq((idq)zbb, (bol)new c16((x06)g0)), (rk6)new y5m((stb)new xqb(this, bti), 27))).w((rtb)new m7k((stb)new yqb(this, gri, bti), 27)).O();
        e0e.e((Object)o4, "@SuppressLint(\"CheckResu\u2026        }.toMaybe()\n    }");
        return o4;
    }
}
