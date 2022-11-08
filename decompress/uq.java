import com.twitter.ads.api.JsonVideoAd;
import com.twitter.ads.api.JsonVideoAnalyticsScribe;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uq implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)y00.class, (Class)JsonVideoAnalyticsScribe.class, (bra)null);
        jsonModelRegistry$a.b((Class)cn9.class, (Class)JsonVideoAd.class, (bra)null);
    }
}
