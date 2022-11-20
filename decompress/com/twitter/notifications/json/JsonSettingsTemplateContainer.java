// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSettingsTemplateContainer extends qhh<oqp>
{
    @JsonField
    public nqp a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final oqp$a oqp$a = new oqp$a();
        oqp$a.a = this.a;
        oqp$a.b = this.b;
        return (n4j)oqp$a;
    }
}
