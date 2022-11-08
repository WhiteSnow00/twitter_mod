// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEngagementCount extends lhh<r4a>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    
    @Override
    public final h4j t() {
        final r4a$a r4a$a = new r4a$a();
        r4a$a.a = this.a;
        r4a$a.b = this.b;
        r4a$a.c = this.c;
        return (h4j)r4a$a;
    }
}
