// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEndFlow extends lhh<o4a>
{
    @JsonField(typeConverter = kfr.class)
    public int a;
    @JsonField(typeConverter = bbi.class)
    public int b;
    
    @Override
    public final h4j t() {
        final o4a$a o4a$a = new o4a$a();
        o4a$a.k = this.a;
        o4a$a.l = this.b;
        return (h4j)o4a$a;
    }
}
