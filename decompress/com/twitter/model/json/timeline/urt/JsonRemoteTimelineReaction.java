// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRemoteTimelineReaction extends tih<kem>
{
    @JsonField(typeConverter = JsonRemoteTimelineReaction.JsonRemoteTimelineReaction$a.class)
    public Map<String, String> a;
    @JsonField
    public int b;
    
    @Override
    public final Object s() {
        kem kem;
        if (this.a != null) {
            kem = new kem(this.a, this.b);
        }
        else {
            kem = null;
        }
        return kem;
    }
}
