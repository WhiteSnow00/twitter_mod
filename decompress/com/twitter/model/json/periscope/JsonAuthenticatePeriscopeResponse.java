// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.periscope;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAuthenticatePeriscopeResponse extends lhh<j51>
{
    @JsonField(name = { "token" })
    public String a;
    
    @Override
    public final h4j t() {
        final j51$a j51$a = new j51$a();
        j51$a.a = this.a;
        return (h4j)j51$a;
    }
}
