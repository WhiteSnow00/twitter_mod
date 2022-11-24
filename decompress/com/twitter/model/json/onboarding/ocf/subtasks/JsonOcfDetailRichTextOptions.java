// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfDetailRichTextOptions extends tih<hdj>
{
    @JsonField
    public ttr a;
    @JsonField
    public List<uym> b;
    
    @Override
    public final Object s() {
        return new hdj(this.a, (List)this.b);
    }
}
