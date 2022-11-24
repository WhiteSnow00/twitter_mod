// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaImageVariant extends tih<nnb>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    @JsonField
    public int e;
    
    @Override
    public final Object s() {
        final String a = this.a;
        nnb nnb;
        if (a != null && !a.isEmpty()) {
            nnb = new nnb(this.a, beq.g(this.c, this.d), this.e, this.b);
        }
        else {
            mqb.o("JsonFoundMediaImageVariant has no url");
            nnb = null;
        }
        return nnb;
    }
}
