import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbk
{
    public static void a(final Context context, final ocw ocw, final lq lq) {
        final UserIdentifier k = ocw.k();
        if (lq != null && lq.b && k.isDefined() && ocw.A().s) {
            ocw.m((byt)d74.c);
            final xca a = xca.a();
            final zf4 zf4 = new zf4();
            zf4.q(new String[] { "settings_personalization::toggle:ads_personalization:opt_out" });
            a.b(k, (okm)zf4);
            final psc c = psc.c();
            final liw v = liw.v(context, ocw);
            v.q("allow_ads_personalization", false);
            c.f((ksc)((h4j)v).e());
        }
    }
}
