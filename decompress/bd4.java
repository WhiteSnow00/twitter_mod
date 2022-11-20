import android.annotation.SuppressLint;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bd4 implements ihf
{
    public final Context a;
    public final cbw b;
    public final UserIdentifier c;
    public final zc4 d;
    
    public bd4(final Context a, final cbw b, final UserIdentifier c, final zc4 d) {
        czd.f((Object)a, "appContext");
        czd.f((Object)b, "eventReporter");
        czd.f((Object)c, "userIdentifier");
        czd.f((Object)d, "clickTrackingHandler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    public final void a(final vc4 vc4) {
        czd.f((Object)vc4, "payload");
        boolean b = false;
        Label_0040: {
            if (vc4.c) {
                final uil d = vc4.d;
                if (d != null && this.d.b(d) != null) {
                    b = true;
                    break Label_0040;
                }
            }
            b = false;
        }
        if (b) {
            final af4 af4 = new af4(this.c);
            final vba$a companion = vba.Companion;
            final String e = vc4.e;
            final String a = ta0.a(vc4.a);
            final t0p b2 = vc4.b;
            String w2;
            if (b2 == null || (w2 = b2.W2()) == null) {
                w2 = "";
            }
            ((u0p)af4).T = companion.e(e, a, w2, "", "click_id_embed").toString();
            final int a2 = c5j.a;
            final zc4 d2 = this.d;
            final uil d3 = vc4.d;
            czd.c((Object)d3);
            ((u0p)af4).m0 = d2.b(d3);
            q3j.j(af4, this.a, vc4.b, (String)null);
            this.b.c((elm)af4);
            final zc4 d4 = this.d;
            final uil d5 = vc4.d;
            Objects.requireNonNull(d4);
            czd.f((Object)d5, "promotedContent");
            final yc4 yc4 = d4.a.remove(d5);
        }
    }
    
    public final void b(final pp2 pp2) {
    }
    
    public final void c(final pp2 pp2) {
    }
    
    public final void d(final pp2 pp2) {
    }
    
    public final void e(final pp2 pp2) {
    }
    
    public final void f(final pp2 pp2) {
    }
    
    public final void g(final pp2 pp2) {
    }
    
    public final void h(final pp2 pp2) {
    }
}
