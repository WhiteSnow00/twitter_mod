// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonValidationError extends tih<uow>
{
    @JsonField(name = { "code" })
    public Integer a;
    @JsonField(name = { "reason" })
    public String b;
    @JsonField(name = { "context" })
    public List<vo6> c;
    
    @Override
    public final Object s() {
        return new uow(this.a, this.b, this.c);
    }
}
