import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.limitedactions.json.JsonLimitedActionResults;
import com.twitter.limitedactions.json.JsonLimitedAction;
import com.twitter.limitedactions.json.JsonBasicLimitedActionPrompt;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ucf implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)fs1.class, (Class)JsonBasicLimitedActionPrompt.class, (bra)null);
        jsonModelRegistry$a.b((Class)ecf.class, (Class)JsonLimitedAction.class, (bra)null);
        jsonModelRegistry$a.b((Class)mcf.class, (Class)JsonLimitedActionResults.class, (bra)null);
        jsonModelRegistry$a.c((Class)qcf.class, (TypeConverter)new ws5(1));
        jsonModelRegistry$a.c((Class)mrm.class, (TypeConverter)new nrm());
    }
}
