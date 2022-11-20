// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFoundMediaImageVariant extends fih<mmb>
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
    
    public final Object s() {
        final String a = this.a;
        mmb mmb;
        if (a != null && !a.isEmpty()) {
            mmb = new mmb(this.a, edq.g(this.c, this.d), this.e, this.b);
        }
        else {
            i48.t("JsonFoundMediaImageVariant has no url");
            mmb = null;
        }
        return mmb;
    }
}
