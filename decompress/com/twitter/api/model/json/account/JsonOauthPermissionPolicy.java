// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonOauthPermissionPolicy extends aih<e3j>
{
    @JsonField
    public List<d3j> a;
    @JsonField
    public List<d3j> b;
    
    @Override
    public final Object s() {
        return new e3j(this.a, this.b);
    }
}
