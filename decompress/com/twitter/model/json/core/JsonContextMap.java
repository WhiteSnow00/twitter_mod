// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonContextMap extends tih<vo6>
{
    @JsonField(name = { "key" })
    public String a;
    @JsonField(name = { "value" })
    public String b;
    
    @Override
    public final Object s() {
        return new vo6(this.a, this.b);
    }
}
