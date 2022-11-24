// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTimelineMessage extends tih<vrv>
{
    @JsonField(name = { "content" }, typeConverter = o0t.class)
    public zrv a;
    @JsonField
    public List<vov> b;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            mqb.o("JsonURTTimelineMessage has no messagePrompt");
            o = null;
        }
        else {
            o = new vrv(this.a, (List)this.b);
        }
        return o;
    }
}
