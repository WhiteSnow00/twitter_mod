// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEngagementCount extends qhh<b4a>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    
    public final n4j t() {
        final b4a.a a = new b4a.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        return a;
    }
}
