// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.twitter.model.json.timeline.urt.richtext.JsonUrtRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserUnavailable extends qhh<ekw>
{
    @JsonField
    public ekw$b a;
    @JsonField
    public String b;
    @JsonField
    public JsonUrtRichText c;
    
    public JsonUserUnavailable() {
        this.a = ekw$b.E0;
    }
    
    public final n4j t() {
        final ekw$a ekw$a = new ekw$a();
        ekw$a.a = this.a;
        final JsonUrtRichText c = this.c;
        if (c != null) {
            ekw$a.b = c.t();
        }
        return (n4j)ekw$a;
    }
}
