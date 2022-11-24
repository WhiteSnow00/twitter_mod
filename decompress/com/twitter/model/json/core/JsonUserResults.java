// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserResults extends tih<ziw>
{
    @JsonField(typeConverter = djw.class)
    public ziw a;
    
    @Override
    public final Object s() {
        return this.a;
    }
}
