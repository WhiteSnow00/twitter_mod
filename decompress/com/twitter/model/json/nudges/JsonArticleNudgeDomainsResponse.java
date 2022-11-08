// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonArticleNudgeDomainsResponse extends lhh<ut0>
{
    @JsonField
    public List<String> a;
    
    @Override
    public final h4j t() {
        final ut0.a a = new ut0.a();
        a.a = this.a;
        return a;
    }
}
