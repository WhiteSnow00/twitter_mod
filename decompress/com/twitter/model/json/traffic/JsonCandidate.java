// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.traffic;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCandidate extends tih<ug3>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Map<String, String> c;
    
    @Override
    public final Object s() {
        ug3 ug3;
        if (!flr.e((CharSequence)this.a) && !flr.e((CharSequence)this.b)) {
            ug3 = new ug3(this.a, this.b, ked.c((Map)this.c));
        }
        else {
            ug3 = null;
        }
        return ug3;
    }
}
