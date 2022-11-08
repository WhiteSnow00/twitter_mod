import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.customtimelines.network.JsonUserEnabledContentControlToolSliceResponse;
import com.twitter.customtimelines.network.JsonMyContentControlToolPutResponse;
import com.twitter.customtimelines.network.JsonMyContentControlToolDeleteResponse;
import com.twitter.customtimelines.network.JsonContentControlToolByRestIdResponse;
import com.twitter.customtimelines.network.JsonCustomTimeline;
import com.twitter.customtimelines.model.CustomTimeline;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ac7 implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)CustomTimeline.class, (Class)JsonCustomTimeline.class, (bra)null);
        jsonModelRegistry$a.b((Class)nl6.class, (Class)JsonContentControlToolByRestIdResponse.class, (bra)null);
        jsonModelRegistry$a.b((Class)kzh.class, (Class)JsonMyContentControlToolDeleteResponse.class, (bra)null);
        jsonModelRegistry$a.b((Class)mzh.class, (Class)JsonMyContentControlToolPutResponse.class, (bra)null);
        jsonModelRegistry$a.b((Class)raw.class, (Class)JsonUserEnabledContentControlToolSliceResponse.class, (bra)null);
        jsonModelRegistry$a.c((Class)h79.class, (TypeConverter)new zee());
    }
}
