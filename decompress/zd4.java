import android.annotation.SuppressLint;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zd4 implements xhf
{
    public final Context a;
    public final saw b;
    public final UserIdentifier c;
    public final xd4 d;
    
    public zd4(final Context a, final saw b, final UserIdentifier c, final xd4 d) {
        zzd.f((Object)a, "appContext");
        zzd.f((Object)b, "eventReporter");
        zzd.f((Object)c, "userIdentifier");
        zzd.f((Object)d, "clickTrackingHandler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    public final void a(final td4 td4) {
        zzd.f((Object)td4, "payload");
        boolean b = false;
        Label_0040: {
            if (td4.c) {
                final hil d = td4.d;
                if (d != null && this.d.b(d) != null) {
                    b = true;
                    break Label_0040;
                }
            }
            b = false;
        }
        if (b) {
            final zf4 zf4 = new zf4(this.c);
            final nca$a companion = nca.Companion;
            final String e = td4.e;
            final String c = nh.c(td4.a);
            final c0p b2 = td4.b;
            String x2;
            if (b2 == null || (x2 = b2.X2()) == null) {
                x2 = "";
            }
            zf4.T = companion.e(e, c, x2, "", "click_id_embed").toString();
            final int a = w4j.a;
            final xd4 d2 = this.d;
            final hil d3 = td4.d;
            zzd.c((Object)d3);
            zf4.m0 = d2.b(d3);
            wvz.c(zf4, this.a, td4.b, (String)null);
            this.b.c((okm)zf4);
            final xd4 d4 = this.d;
            final hil d5 = td4.d;
            Objects.requireNonNull(d4);
            zzd.f((Object)d5, "promotedContent");
            final wd4 wd4 = d4.a.remove(d5);
        }
    }
    
    public final void b(final zp2 zp2) {
    }
    
    public final void c(final zp2 zp2) {
    }
    
    public final void d(final zp2 zp2) {
    }
    
    public final void e(final zp2 zp2) {
    }
    
    public final void f(final zp2 zp2) {
    }
    
    public final void g(final zp2 zp2) {
    }
    
    public final void h(final zp2 zp2) {
    }
}
