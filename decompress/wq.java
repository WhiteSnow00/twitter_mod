import com.twitter.ads.api.JsonVideoAd;
import com.twitter.ads.api.JsonVideoAnalyticsScribe;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wq implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)y00.class, (Class)JsonVideoAnalyticsScribe.class, (gra)null);
        jsonModelRegistry$a.b((Class)nn9.class, (Class)JsonVideoAd.class, (gra)null);
    }
}
