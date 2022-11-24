// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.twitter.model.json.core.JsonMediaSize;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentMedia extends tih<yph>
{
    @JsonField
    public long a;
    @JsonField
    public JsonMediaSize b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        return new yph(this.a, (beq)yih.c((tih)this.b), this.c);
    }
}
