// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.reactions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGraphQlTweetReactionTypeMap extends fih<mpu>
{
    @JsonField(name = { "reaction_type_map" }, typeConverter = npu.class)
    public Map<String, String> a;
    
    public final Object s() {
        final mpu$a mpu$a = new mpu$a();
        mpu$a.p((Map)this.a);
        return ((n4j)mpu$a).e();
    }
}
