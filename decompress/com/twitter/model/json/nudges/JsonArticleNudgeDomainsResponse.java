// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonArticleNudgeDomainsResponse extends qhh<nt0>
{
    @JsonField
    public List<String> a;
    
    public final n4j t() {
        final nt0$a nt0$a = new nt0$a();
        nt0$a.a = this.a;
        return (n4j)nt0$a;
    }
}
