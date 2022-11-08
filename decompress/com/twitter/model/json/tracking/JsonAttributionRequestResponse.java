// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.tracking;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonAttributionRequestResponse extends aih<ny0>
{
    @JsonField
    public String a;
    @JsonField(name = { "session_token" })
    public String b;
    
    @Override
    public final Object s() {
        return new ny0(this.a, this.b);
    }
}
