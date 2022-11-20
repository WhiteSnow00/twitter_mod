// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.twitter.model.json.core.JsonMediaSize;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentMedia extends fih<jph>
{
    @JsonField
    public long a;
    @JsonField
    public JsonMediaSize b;
    @JsonField
    public String c;
    
    public final Object s() {
        return new jph(this.a, (edq)kih.c((fih)this.b), this.c);
    }
}
