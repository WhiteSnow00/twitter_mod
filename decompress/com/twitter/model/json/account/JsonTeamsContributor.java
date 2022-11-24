// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.twitter.util.user.UserIdentifier;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTeamsContributor extends tih<xds>
{
    @JsonField
    public long a;
    @JsonField
    public boolean b;
    
    @Override
    public final Object s() {
        return new xds(UserIdentifier.fromId(this.a), this.b);
    }
}
