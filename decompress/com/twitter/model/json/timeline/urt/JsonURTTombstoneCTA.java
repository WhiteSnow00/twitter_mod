// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Locale;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTombstoneCTA extends aih<xqv>
{
    @JsonField
    public String a;
    @JsonField
    public q7t b;
    
    @Override
    public final Object s() {
        xqv xqv;
        if (pjr.g((CharSequence)this.a)) {
            xqv = new xqv(this.a, this.b);
        }
        else {
            e9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "Tombstone CTA must have a valid text. text: %s", this.a)));
            xqv = null;
        }
        return xqv;
    }
}
