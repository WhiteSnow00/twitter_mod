import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.newsletters.json.JsonRevueSubscribeResult;
import com.twitter.newsletters.json.JsonRevueProfileInfo;
import com.twitter.newsletters.json.JsonNewsletterInfo;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgi implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)hhi.class, (Class)JsonNewsletterInfo.class, (gra)null);
        jsonModelRegistry$a.b((Class)zwm.class, (Class)JsonRevueProfileInfo.class, (gra)null);
        jsonModelRegistry$a.b((Class)dxm.class, (Class)JsonRevueSubscribeResult.class, (gra)null);
        jsonModelRegistry$a.c((Class)xor.class, (TypeConverter)new kje());
    }
}
