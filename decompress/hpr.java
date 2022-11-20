import com.twitter.subscriptions.JsonResource;
import com.twitter.subscriptions.JsonProductSubscriptions;
import com.twitter.subscriptions.JsonProductSubscription;
import com.twitter.subscriptions.JsonClaims;
import com.twitter.subscriptions.JsonClaim;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpr implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)la4.class, (Class)JsonClaim.class, (ypa)null);
        jsonModelRegistry$a.b((Class)ma4.class, (Class)JsonClaims.class, (ypa)null);
        jsonModelRegistry$a.b((Class)z3l.class, (Class)JsonProductSubscription.class, (ypa)null);
        jsonModelRegistry$a.b((Class)b4l.class, (Class)JsonProductSubscriptions.class, (ypa)null);
        jsonModelRegistry$a.b((Class)sqm.class, (Class)JsonResource.class, (ypa)null);
    }
}
