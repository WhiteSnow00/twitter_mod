// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Locale;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTTombstoneCTA extends tih<dsv>
{
    @JsonField
    public String a;
    @JsonField
    public c9t b;
    
    @Override
    public final Object s() {
        dsv dsv;
        if (flr.g((CharSequence)this.a)) {
            dsv = new dsv(this.a, this.b);
        }
        else {
            r9a.d((Throwable)new IllegalStateException(String.format(Locale.ENGLISH, "Tombstone CTA must have a valid text. text: %s", this.a)));
            dsv = null;
        }
        return dsv;
    }
}
