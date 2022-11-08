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
public class JsonTweetReactionTimelineResponse extends aih<nou>
{
    @JsonField
    public List<dou> a;
    @JsonField(typeConverter = tou.class)
    public Map<String, String> b;
    
    @Override
    public final Object s() {
        final sou$a sou$a = new sou$a();
        sou$a.p((Map)this.b);
        return new nou(this.a, (sou)((h4j)sou$a).e());
    }
}
