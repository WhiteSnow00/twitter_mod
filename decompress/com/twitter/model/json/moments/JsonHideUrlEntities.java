// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHideUrlEntities extends tih<clc>
{
    @JsonField
    public List<Integer> a;
    
    @Override
    public final Object s() {
        if (this.a.size() == 2) {
            final Integer n = this.a.get(0);
            final Integer n2 = this.a.get(1);
            if (n != null) {
                if (n2 != null) {
                    return new clc((int)n, (int)n2);
                }
            }
        }
        return null;
    }
}
