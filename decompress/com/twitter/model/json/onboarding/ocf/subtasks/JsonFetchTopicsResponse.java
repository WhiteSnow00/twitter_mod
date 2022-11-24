// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Collection;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchTopicsResponse extends tih<exa>
{
    @JsonField
    public List<String> a;
    @JsonField
    public Map<String, ilt> b;
    
    @Override
    public final Object s() {
        exa exa;
        if (!kr4.t((Collection)this.a) && !kr4.u((Map)this.b)) {
            exa = new exa((List)this.a, (Map)this.b);
        }
        else {
            exa = null;
        }
        return exa;
    }
}
