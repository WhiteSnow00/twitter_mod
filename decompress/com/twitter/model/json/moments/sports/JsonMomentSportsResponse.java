// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments.sports;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentSportsResponse extends tih<fqh>
{
    @JsonField
    public List<bqh> a;
    
    @Override
    public final Object s() {
        return new fqh(ojf.x((List)this.a));
    }
}
