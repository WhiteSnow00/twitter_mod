// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaSize extends tih<beq>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    
    @Override
    public final Object s() {
        return beq.g(this.a, this.b);
    }
}
