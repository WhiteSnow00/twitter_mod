// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSpellingResult extends tih<r2r>
{
    @JsonField(name = { "text" })
    public String a;
    @JsonField(name = { "hitHighlights" })
    public List<c8w> b;
    @JsonField(name = { "score" })
    public float c;
    
    @Override
    public final Object s() {
        if (!flr.e((CharSequence)this.a)) {
            final ArrayList b = this.b;
            if (b != null) {
                return new r2r(this.a, b, this.c);
            }
        }
        return null;
    }
}
