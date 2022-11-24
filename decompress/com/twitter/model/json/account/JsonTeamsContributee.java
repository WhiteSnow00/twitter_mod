// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTeamsContributee extends tih<vds>
{
    @JsonField
    public qgv a;
    @JsonField
    public Boolean b;
    
    @Override
    public final Object s() {
        final qgv a = this.a;
        if (a != null) {
            final Boolean b = this.b;
            if (b != null) {
                return new vds(a, (boolean)b);
            }
        }
        return null;
    }
}
