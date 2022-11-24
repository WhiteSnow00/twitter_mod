import com.twitter.longform.adfreearticles.json.JsonAdfreeExchangeTokenResponse;
import com.twitter.longform.adfreearticles.json.JsonAdFreeArticleDomains;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rs implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)rp.class, (Class)JsonAdFreeArticleDomains.class, (gra)null);
        jsonModelRegistry$a.b((Class)ts.class, (Class)JsonAdfreeExchangeTokenResponse.class, (gra)null);
    }
}
