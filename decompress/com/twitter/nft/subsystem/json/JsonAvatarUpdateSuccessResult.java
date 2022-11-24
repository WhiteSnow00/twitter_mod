// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAvatarUpdateSuccessResult extends tih<f1i.a>
{
    @JsonField(name = { "media_url" })
    public String a;
    
    @Override
    public final Object s() {
        return new f1i.a(this.a);
    }
}
