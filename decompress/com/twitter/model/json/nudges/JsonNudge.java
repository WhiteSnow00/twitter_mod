// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import android.annotation.SuppressLint;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudge extends lhh<szi>
{
    @SuppressLint({ "NullableEnum" })
    @JsonField(typeConverter = yge.class)
    public o1j a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public ieu d;
    
    @Override
    public final h4j t() {
        final szi$a szi$a = new szi$a();
        szi$a.b = this.a;
        szi$a.a = this.b;
        szi$a.c = this.c;
        final ieu d = this.d;
        if (d != null) {
            szi$a.d = d.a;
        }
        return (h4j)szi$a;
    }
}
