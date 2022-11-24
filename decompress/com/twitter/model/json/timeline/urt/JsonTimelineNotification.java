// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineNotification extends tih<f1t>
{
    @JsonField
    public String a;
    @JsonField(name = { "url" })
    public c9t b;
    @JsonField(typeConverter = d.class)
    public o5t c;
    
    @Override
    public final Object s() {
        if (flr.g((CharSequence)this.a)) {
            final c9t b = this.b;
            if (b != null) {
                return new f1t(this.a, b, ix.w(this.c));
            }
        }
        return null;
    }
}
