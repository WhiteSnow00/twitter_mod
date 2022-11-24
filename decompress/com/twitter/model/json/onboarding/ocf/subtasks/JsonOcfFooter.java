// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfFooter extends tih<rdj>
{
    @JsonField(typeConverter = JsonOcfFooter.JsonOcfFooter$a.class)
    public rdj.b a;
    
    @Override
    public final Object s() {
        final rdj.b a = this.a;
        final rdj.b g0 = rdj.b.G0;
        rdj.b b = a;
        if (a == null) {
            b = g0;
        }
        return new rdj(b);
    }
}
