// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.translation;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/twitter/model/json/translation/JsonGraphQlTweetTranslation;", "Ltih;", "Ldvu;", "<init>", "()V", "subsystem.tfa.legacy.model.json.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public final class JsonGraphQlTweetTranslation extends tih<dvu>
{
    @JsonField(typeConverter = rux.class)
    public JsonTranslation a;
    
    @Override
    public final Object s() {
        final JsonTranslation a = this.a;
        Object o = null;
        if (a != null) {
            final dvu$a dvu$a = new dvu$a();
            ((l1u$a)dvu$a).b = a.b;
            ((l1u$a)dvu$a).c = a.c;
            ((l1u$a)dvu$a).a = a.s();
            ((l1u$a)dvu$a).d = a.f;
            ((l1u$a)dvu$a).e = xd.i0(new rfu(a.u(), a.t(), null), true);
            o = ((z4j)dvu$a).j();
        }
        return o;
    }
}
