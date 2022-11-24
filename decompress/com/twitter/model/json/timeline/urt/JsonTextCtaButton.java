// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTextCtaButton extends tih<b87$d>
{
    @JsonField
    public String a;
    @JsonField
    public c9t b;
    
    @Override
    public final Object s() {
        if (flr.g((CharSequence)this.a)) {
            final c9t b = this.b;
            if (b != null && flr.g((CharSequence)b.a())) {
                return new b87$d(this.a, this.b);
            }
        }
        return null;
    }
}
