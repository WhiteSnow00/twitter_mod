// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTextCtaButton extends aih<s77$d>
{
    @JsonField
    public String a;
    @JsonField
    public q7t b;
    
    @Override
    public final Object s() {
        if (pjr.g((CharSequence)this.a)) {
            final q7t b = this.b;
            if (b != null && pjr.g((CharSequence)b.a())) {
                return new s77$d(this.a, this.b);
            }
        }
        return null;
    }
}
