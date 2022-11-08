// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineNotification extends aih<wzs>
{
    @JsonField
    public String a;
    @JsonField(name = { "url" })
    public q7t b;
    @JsonField(typeConverter = d.class)
    public d4t c;
    
    @Override
    public final Object s() {
        if (pjr.g((CharSequence)this.a)) {
            final q7t b = this.b;
            if (b != null) {
                return new wzs(this.a, b, poa.V(this.c));
            }
        }
        return null;
    }
}
