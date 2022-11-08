// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.reactions;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGraphQlTweetReactionTypeMap extends aih<sou>
{
    @JsonField(name = { "reaction_type_map" }, typeConverter = tou.class)
    public Map<String, String> a;
    
    @Override
    public final Object s() {
        final sou$a sou$a = new sou$a();
        sou$a.p((Map)this.a);
        return ((h4j)sou$a).e();
    }
}
