// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.translation;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonProfileTranslationResponse extends aih<z7l>
{
    @JsonField
    public String a;
    @JsonField
    public JsonProfileTranslation b;
    
    @Override
    public final Object s() {
        final z7l$a z7l$a = new z7l$a();
        final JsonProfileTranslation b = this.b;
        ((c0u$a)z7l$a).a = b.c;
        ((c0u$a)z7l$a).b = b.d;
        ((c0u$a)z7l$a).c = b.e;
        ((c0u$a)z7l$a).d = b.f;
        final JsonProfileTranslation b2 = this.b;
        ((c0u$a)z7l$a).e = goz.s(new jeu(b2.a, b2.b, (Map)null), true);
        return ((h4j)z7l$a).j();
    }
}
