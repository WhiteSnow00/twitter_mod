// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonOauthPermissionPolicy extends fih<k3j>
{
    @JsonField
    public List<j3j> a;
    @JsonField
    public List<j3j> b;
    
    public final Object s() {
        return new k3j((List)this.a, (List)this.b);
    }
}
