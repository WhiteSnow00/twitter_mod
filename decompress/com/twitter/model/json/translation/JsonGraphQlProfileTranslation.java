// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.translation;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/translation/JsonGraphQlProfileTranslation;", "Laih;", "Lz7l;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonGraphQlProfileTranslation extends aih<z7l>
{
    @JsonField(typeConverter = itx.class)
    public JsonTranslation a;
    
    @Override
    public final Object s() {
        final JsonTranslation a = this.a;
        Object o = null;
        if (a != null) {
            final z7l$a z7l$a = new z7l$a();
            ((c0u$a)z7l$a).b = a.b;
            ((c0u$a)z7l$a).c = a.c;
            ((c0u$a)z7l$a).a = a.s();
            ((c0u$a)z7l$a).d = a.f;
            ((c0u$a)z7l$a).e = goz.s(new jeu(a.u(), a.t(), (Map)null), true);
            o = ((h4j)z7l$a).j();
        }
        return o;
    }
}
