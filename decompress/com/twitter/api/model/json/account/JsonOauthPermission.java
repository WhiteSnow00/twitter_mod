// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonOauthPermission extends aih<d3j>
{
    @JsonField
    public String a;
    @JsonField
    public List<String> b;
    
    @Override
    public final Object s() {
        return new d3j(this.a, (List)this.b);
    }
}
