// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveSportsScore extends fih<z0g>
{
    @JsonField
    public String a;
    @JsonField
    public JsonLiveSportsScoreData b;
    
    public final Object s() {
        final boolean g = ikr.g((CharSequence)this.a);
        Object o = null;
        final mph mph = null;
        if (g) {
            final String a = this.a;
            final JsonLiveSportsScoreData b = this.b;
            mph a2 = mph;
            if (b != null) {
                a2 = b.a;
            }
            o = new z0g(a, a2);
        }
        return o;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonLiveSportsScoreData extends qfe
    {
        @JsonField(name = { "moments" })
        public mph a;
    }
}
