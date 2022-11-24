// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.translation;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonProfileTranslationResponse extends tih<z8l>
{
    @JsonField
    public String a;
    @JsonField
    public JsonProfileTranslation b;
    
    @Override
    public final Object s() {
        final z8l$a z8l$a = new z8l$a();
        final JsonProfileTranslation b = this.b;
        ((l1u$a)z8l$a).a = b.c;
        ((l1u$a)z8l$a).b = b.d;
        ((l1u$a)z8l$a).c = b.e;
        ((l1u$a)z8l$a).d = b.f;
        final JsonProfileTranslation b2 = this.b;
        ((l1u$a)z8l$a).e = xd.i0(new rfu(b2.a, b2.b, null), true);
        return ((z4j)z8l$a).j();
    }
}
