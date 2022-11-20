// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEndFlow extends qhh<y3a>
{
    @JsonField(typeConverter = egr.class)
    public int a;
    @JsonField(typeConverter = dbi.class)
    public int b;
    
    public final n4j t() {
        final y3a$a y3a$a = new y3a$a();
        y3a$a.k = this.a;
        y3a$a.l = this.b;
        return (n4j)y3a$a;
    }
}
