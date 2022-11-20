import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.commerce.json.merchantconfiguration.JsonUploadProductsResponse;
import com.twitter.commerce.json.merchantconfiguration.JsonUploadProductResult;
import com.twitter.commerce.json.merchantconfiguration.JsonProductUpsertError;
import com.twitter.commerce.json.merchantconfiguration.JsonCommerceProductSet;
import com.twitter.commerce.json.merchantconfiguration.JsonCatalogCatalogWriteError;
import com.twitter.commerce.json.merchantconfiguration.JsonCommerceCatalog;
import com.twitter.commerce.json.merchantconfiguration.JsonCatalogCoreData;
import com.twitter.commerce.json.merchantconfiguration.JsonUploadProductDataInput;
import com.twitter.commerce.json.merchantconfiguration.JsonUploadProductDataImageInput;
import com.twitter.commerce.json.merchantconfiguration.JsonProductSetItemInput;
import com.twitter.commerce.json.merchantconfiguration.JsonProductSetConfigInput;
import com.twitter.commerce.json.merchantconfiguration.JsonCommerceConfigRequestInput;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yr4 implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final zgd e = zgd.e;
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)bs4.class, (Class)JsonCommerceConfigRequestInput.class, (ypa)e);
        jsonModelRegistry$a.b((Class)w3l.class, (Class)JsonProductSetConfigInput.class, (ypa)o1x.l);
        jsonModelRegistry$a.b((Class)x3l.class, (Class)JsonProductSetItemInput.class, (ypa)t41.j);
        jsonModelRegistry$a.b((Class)k4w.class, (Class)JsonUploadProductDataImageInput.class, (ypa)si4.l);
        jsonModelRegistry$a.b((Class)l4w.class, (Class)JsonUploadProductDataInput.class, (ypa)n1x.h);
        jsonModelRegistry$a.b((Class)qm3.class, (Class)JsonCatalogCoreData.class, (ypa)null);
        jsonModelRegistry$a.b((Class)zr4$a.class, (Class)JsonCommerceCatalog.class, (ypa)null);
        jsonModelRegistry$a.b((Class)zr4$b.class, (Class)JsonCatalogCatalogWriteError.class, (ypa)null);
        jsonModelRegistry$a.b((Class)vv4$a.class, (Class)JsonCommerceProductSet.class, (ypa)null);
        jsonModelRegistry$a.b((Class)c4l.class, (Class)JsonProductUpsertError.class, (ypa)null);
        jsonModelRegistry$a.b((Class)m4w.class, (Class)JsonUploadProductResult.class, (ypa)null);
        jsonModelRegistry$a.b((Class)n4w.class, (Class)JsonUploadProductsResponse.class, (ypa)null);
        jsonModelRegistry$a.c((Class)as4.class, (TypeConverter)new wce());
        jsonModelRegistry$a.c((Class)cs4.class, (TypeConverter)new yce());
        jsonModelRegistry$a.c((Class)y3l.class, (TypeConverter)new ghe());
        jsonModelRegistry$a.c((Class)zr4.class, (TypeConverter)new xce());
        jsonModelRegistry$a.c((Class)vv4.class, (TypeConverter)new zce());
    }
}
