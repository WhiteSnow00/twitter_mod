import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.places.api.PlaceLandingActivityContentViewArgs;
import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgk
{
    public static Intent a(final Context context, final v0c v0c) {
        Intent intent;
        if (asa.b().b("android_urt_geo_enabled", false)) {
            final bn a = an.a();
            final i7w.a a2 = new i7w.a();
            a2.a = "/2/geo/place_page.json";
            final epv$a epv$a = new epv$a();
            epv$a.c = v0c.a.c;
            epv$a.b = new pqv(qjg.o((Object)"place_id", (Object)v0c.a.a));
            a2.b = (epv)((n4j)epv$a).e();
            intent = a.a(context, new wzb((i7w)a2.e()));
        }
        else {
            intent = i81.a().a(context, (ContentViewArgs)new PlaceLandingActivityContentViewArgs(v0c));
        }
        return intent;
    }
}
