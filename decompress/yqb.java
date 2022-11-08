import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqb implements dsi<lpi>
{
    public static final yqb.yqb$a Companion;
    public final Resources a;
    public final ibm b;
    public final fsi c;
    public final xa7 d;
    
    static {
        Companion = new yqb.yqb$a();
    }
    
    public yqb(final Resources a, final ibm b, final fsi c, final xa7 d) {
        zzd.f((Object)a, "resources");
        zzd.f((Object)b, "releaseCompletable");
        zzd.f((Object)c, "notificationImageRequestFactory");
        zzd.f((Object)d, "customViewArbiter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final void b(final yqb yqb, final jsi jsi) {
        Objects.requireNonNull(yqb);
        final xca a = xca.a();
        final UserIdentifier b = jsi.B;
        final zf4 zf4 = new zf4(new nca("notification", "status_bar", "big_picture_images", jsi.h, "expanded_image_failure"));
        zf4.A();
        a.b(b, (okm)zf4);
    }
    
    public final log a(final mqi mqi, final jsi jsi, final isi isi) {
        final lpi lpi = (lpi)isi;
        zzd.f((Object)mqi, "notificationBuilder");
        final xca a = xca.a();
        final UserIdentifier b = jsi.B;
        final zf4 zf4 = new zf4(new nca("notification", "status_bar", "big_picture_images", jsi.h, "request"));
        zf4.A();
        a.b(b, (okm)zf4);
        final boolean d = lri.Companion.d(jsi.B, jsi);
        final csi a2 = lpi.a;
        final UserIdentifier b2 = jsi.B;
        Object o;
        if (a2 != null && a2.a != null) {
            final boolean b3 = d || a2.c;
            final int dimensionPixelSize = this.a.getDimensionPixelSize(17104902);
            o = ((log)((ara)this.c).a((Object)1, (Object)a2.a, (Object)ncq.Companion.b(dimensionPixelSize, dimensionPixelSize), (Object)b3, (Object)b2)).o();
        }
        else {
            o = yog.C0;
        }
        final csi b4 = lpi.b;
        final UserIdentifier b5 = jsi.B;
        Object o2;
        if (b4 != null && b4.a != null) {
            final int dimensionPixelSize2 = this.a.getDimensionPixelSize(17104902);
            o2 = ((log)((ara)this.c).a((Object)2, (Object)b4.a, (Object)ncq.Companion.b(dimensionPixelSize2, dimensionPixelSize2), (Object)b4.c, (Object)b5)).o();
        }
        else {
            o2 = yog.C0;
        }
        final csi c = lpi.c;
        final UserIdentifier b6 = jsi.B;
        Object o3;
        if (c != null && c.a != null) {
            o3 = ((log)((ara)this.c).a((Object)3, (Object)c.a, (Object)ncq.Companion.b(416, 284), (Object)c.c, (Object)b6)).o();
        }
        else {
            o3 = yog.C0;
        }
        final List v0 = tdy.v0((Object[])new log[] { (log)o, (log)o2, (log)o3 });
        final int c2 = hab.C0;
        final xab xab = new xab((Iterable)v0);
        m4j.b(Integer.MAX_VALUE, "maxConcurrency");
        final bcb bcb = new bcb((hab)new uab((bnl)xab, (qtb)xpg.C0, 1));
        final i06 d2 = this.b.D0;
        Objects.requireNonNull(d2, "other is null");
        final log o4 = ((n9q)new laq((ubq)new xbq((ubq)bcb, (bnl)new m06((h06)d2)), (fk6)new za6((rtb)new zqb(this, jsi), 28))).w((qtb)new n86((rtb)new arb(this, mqi, jsi), 28)).O();
        zzd.e((Object)o4, "@SuppressLint(\"CheckResu\u2026        }.toMaybe()\n    }");
        return o4;
    }
}
