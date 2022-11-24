import org.json.JSONObject;
import android.content.Context;
import com.twitter.onboarding.ocf.OcfContentViewResult;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ph6 implements ny9<wh6>
{
    public static final ph6.ph6$a Companion;
    public final Activity F0;
    public final jo6<hej, OcfContentViewResult> G0;
    public final nh6 H0;
    
    static {
        Companion = new ph6.ph6$a();
    }
    
    public ph6(final Activity f0, final jo6<hej, OcfContentViewResult> g0, final nh6 h0) {
        e0e.f((Object)f0, "context");
        e0e.f((Object)g0, "starter");
        e0e.f((Object)h0, "delegate");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        g0.c().onErrorResumeNext((rtb)new yql((stb)qh6.F0, 8)).subscribe((rk6)new xql((stb)new rh6(this), 8));
    }
    
    public final void r(final Object o) {
        final wh6 wh6 = (wh6)o;
        e0e.f((Object)wh6, "effect");
        if (wh6 instanceof wh6.a) {
            final i6r a = ((wh6.a)wh6).a;
            final dej.a a2 = new dej.a((Context)this.F0);
            final fds.a z = rk0.z("sso_disconnect");
            z.d = "settings";
            final xrd$a xrd$a = new xrd$a();
            xrd$a.d = new JSONObject(mlg.S(new awj[] { new awj((Object)"provider", (Object)a.F0), new awj((Object)"state", (Object)"state"), new awj((Object)"id_token", (Object)"test") })).toString();
            z.e = (xrd)((z4j)xrd$a).e();
            a2.d = (fds)z.e();
            final hej b = ((dej)a2.e()).b();
            e0e.e((Object)b, "Builder(context)\n       \u2026build()\n            .args");
            this.G0.d((Object)b);
        }
    }
}
