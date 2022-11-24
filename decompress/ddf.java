import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.limitedactions.json.JsonLimitedActionResults;
import com.twitter.limitedactions.json.JsonLimitedAction;
import com.twitter.limitedactions.json.JsonBasicLimitedActionPrompt;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddf implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)is1.class, (Class)JsonBasicLimitedActionPrompt.class, (gra)null);
        jsonModelRegistry$a.b((Class)mcf.class, (Class)JsonLimitedAction.class, (gra)null);
        jsonModelRegistry$a.b((Class)vcf.class, (Class)JsonLimitedActionResults.class, (gra)null);
        jsonModelRegistry$a.c((Class)zcf.class, (TypeConverter)new lt5(1));
        jsonModelRegistry$a.c((Class)ssm.class, (TypeConverter)new tsm());
    }
}
