// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonValidationError extends fih<fow>
{
    @JsonField(name = { "code" })
    public Integer a;
    @JsonField(name = { "reason" })
    public String b;
    @JsonField(name = { "context" })
    public List<pn6> c;
    
    public final Object s() {
        return new fow(this.a, this.b, this.c);
    }
}
