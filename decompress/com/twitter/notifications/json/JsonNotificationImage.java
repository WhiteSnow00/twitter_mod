// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationImage extends eih<usi>
{
    @JsonField
    public String a;
    @JsonField
    public p77 b;
    @JsonField
    public boolean c;
    
    public final z4j t() {
        final usi$a usi$a = new usi$a();
        usi$a.a = this.a;
        usi$a.b = this.b;
        usi$a.c = this.c;
        return (z4j)usi$a;
    }
}
