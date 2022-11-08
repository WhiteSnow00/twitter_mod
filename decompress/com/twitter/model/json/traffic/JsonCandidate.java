// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.traffic;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCandidate extends aih<lg3>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Map<String, String> c;
    
    @Override
    public final Object s() {
        lg3 lg3;
        if (!pjr.e((CharSequence)this.a) && !pjr.e((CharSequence)this.b)) {
            lg3 = new lg3(this.a, this.b, ged.c((Map)this.c));
        }
        else {
            lg3 = null;
        }
        return lg3;
    }
}
