// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTimelineMessage extends aih<oqv>
{
    @JsonField(name = { "content" }, typeConverter = fzs.class)
    public tqv a;
    @JsonField
    public List<lnv> b;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            xpa.p("JsonURTTimelineMessage has no messagePrompt");
            o = null;
        }
        else {
            o = new oqv(this.a, this.b);
        }
        return o;
    }
}
