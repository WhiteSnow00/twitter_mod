// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.reactions;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetReactionTimelineResponse extends fih<hpu>
{
    @JsonField
    public List<xou> a;
    @JsonField(typeConverter = npu.class)
    public Map<String, String> b;
    
    public final Object s() {
        final mpu$a mpu$a = new mpu$a();
        mpu$a.p((Map)this.b);
        return new hpu(this.a, (mpu)((n4j)mpu$a).e());
    }
}
