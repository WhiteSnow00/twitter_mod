// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicCategoryChildrenItem extends lhh<mkt>
{
    @JsonField
    public String a;
    @JsonField(typeConverter = qkt.class)
    public int b;
    
    @Override
    public final h4j t() {
        final mkt$a mkt$a = new mkt$a();
        mkt$a.a = this.a;
        mkt$a.b = this.b;
        return (h4j)mkt$a;
    }
}
