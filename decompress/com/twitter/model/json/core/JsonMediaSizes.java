// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaSizes extends tih<beq>
{
    @JsonField(name = { "large" })
    public JsonMediaSize a;
    
    @Override
    public final Object s() {
        return yih.c((tih)this.a);
    }
}
