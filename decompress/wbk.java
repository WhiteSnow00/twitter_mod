import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wbk
{
    public static void a(final Context context, final qdw qdw, final nq nq) {
        final UserIdentifier k = qdw.k();
        if (nq != null && nq.b && k.isDefined() && qdw.A().s) {
            qdw.m((kzt)h4w.d);
            final nda a = nda.a();
            final fg4 fg4 = new fg4();
            ((o1p)fg4).q(new String[] { "settings_personalization::toggle:ads_personalization:opt_out" });
            a.b(k, (tlm)fg4);
            final tsc c = tsc.c();
            final tjw v = tjw.v(context, qdw);
            v.q("allow_ads_personalization", false);
            c.f(((z4j)v).e());
        }
    }
}
