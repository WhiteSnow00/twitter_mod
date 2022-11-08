// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRequestCursor extends aih<spv>
{
    @JsonField(name = { "value" })
    public String a;
    @JsonField(name = { "cursorType" }, typeConverter = da7.class)
    public int b;
    @JsonField(name = { "displayTreatment" })
    public q97 c;
    
    @Override
    public final Object s() {
        final int b = this.b;
        if (b != -1) {
            final String a = this.a;
            if (a != null) {
                return new spv(this.a, this.b, (long)w4j.h((Object)a, (Object)b, (Object)this.c), this.c);
            }
        }
        return null;
    }
}
