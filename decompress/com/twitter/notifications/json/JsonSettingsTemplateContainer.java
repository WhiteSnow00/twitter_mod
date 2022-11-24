// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingsTemplateContainer extends eih<jrp>
{
    @JsonField
    public irp a;
    @JsonField
    public String b;
    
    public final z4j t() {
        final jrp.a a = new jrp.a();
        a.a = this.a;
        a.b = this.b;
        return a;
    }
}
