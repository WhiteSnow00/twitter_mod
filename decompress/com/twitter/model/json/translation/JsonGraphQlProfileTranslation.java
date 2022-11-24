// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.translation;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/translation/JsonGraphQlProfileTranslation;", "Ltih;", "Lz8l;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonGraphQlProfileTranslation extends tih<z8l>
{
    @JsonField(typeConverter = rux.class)
    public JsonTranslation a;
    
    @Override
    public final Object s() {
        final JsonTranslation a = this.a;
        Object o = null;
        if (a != null) {
            final z8l$a z8l$a = new z8l$a();
            ((l1u$a)z8l$a).b = a.b;
            ((l1u$a)z8l$a).c = a.c;
            ((l1u$a)z8l$a).a = a.s();
            ((l1u$a)z8l$a).d = a.f;
            ((l1u$a)z8l$a).e = xd.i0(new rfu(a.u(), a.t(), null), true);
            o = ((z4j)z8l$a).j();
        }
        return o;
    }
}
