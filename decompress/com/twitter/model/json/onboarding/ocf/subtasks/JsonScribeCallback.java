// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.util.InvalidDataException;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonScribeCallback extends tih<g0p>
{
    @JsonField(typeConverter = ja3.class)
    public ia3 a;
    @JsonField
    public String b;
    @JsonField
    public tej c;
    
    public JsonScribeCallback() {
        this.a = ia3.H0;
    }
    
    @Override
    public final Object s() {
        final ia3 a = this.a;
        Object o;
        if (a == ia3.H0) {
            r9a.d((Throwable)new InvalidDataException("This trigger type is not supported."));
            o = null;
        }
        else {
            o = new g0p(a, this.b, this.c);
        }
        return o;
    }
}
