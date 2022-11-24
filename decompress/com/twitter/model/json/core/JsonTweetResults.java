// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetResults extends tih<gqu$a>
{
    @JsonField(typeConverter = iqu.class)
    public gqu$a a;
    
    @Override
    public final Object s() {
        return this.a;
    }
}
