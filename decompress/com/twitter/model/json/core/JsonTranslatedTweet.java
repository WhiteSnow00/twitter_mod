// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTranslatedTweet extends fih<quu>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public eku c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    public JsonTranslatedTweet() {
        this.a = -1L;
    }
    
    public final Object s() {
        final long a = this.a;
        Object o = null;
        if (a != -1L) {
            final quu$a quu$a = new quu$a();
            ((s0u$a)quu$a).b = this.e;
            ((s0u$a)quu$a).a = this.d;
            ((s0u$a)quu$a).e = ii8.q(new cfu(this.b, this.c, (Map)null), true);
            o = ((n4j)quu$a).j();
        }
        return o;
    }
}
