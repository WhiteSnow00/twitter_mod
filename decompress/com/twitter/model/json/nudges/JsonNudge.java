// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import android.annotation.SuppressLint;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudge extends qhh<yzi>
{
    @SuppressLint({ "NullableEnum" })
    @JsonField(typeConverter = hge.class)
    public u1j a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public bfu d;
    
    public final n4j t() {
        final yzi$a yzi$a = new yzi$a();
        yzi$a.b = this.a;
        yzi$a.a = this.b;
        yzi$a.c = this.c;
        final bfu d = this.d;
        if (d != null) {
            yzi$a.d = d.a;
        }
        return (n4j)yzi$a;
    }
}
