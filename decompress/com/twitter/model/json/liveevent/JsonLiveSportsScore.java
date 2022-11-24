// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveSportsScore extends tih<x1g>
{
    @JsonField
    public String a;
    @JsonField
    public JsonLiveSportsScore.JsonLiveSportsScore$JsonLiveSportsScoreData b;
    
    @Override
    public final Object s() {
        final boolean g = flr.g((CharSequence)this.a);
        Object o = null;
        final bqh bqh = null;
        if (g) {
            final String a = this.a;
            final JsonLiveSportsScore.JsonLiveSportsScore$JsonLiveSportsScoreData b = this.b;
            bqh a2 = bqh;
            if (b != null) {
                a2 = b.a;
            }
            o = new x1g(a, a2);
        }
        return o;
    }
}
