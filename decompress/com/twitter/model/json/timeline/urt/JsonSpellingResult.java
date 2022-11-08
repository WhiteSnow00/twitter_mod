// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSpellingResult extends aih<z0r>
{
    @JsonField(name = { "text" })
    public String a;
    @JsonField(name = { "hitHighlights" })
    public List<d7w> b;
    @JsonField(name = { "score" })
    public float c;
    
    @Override
    public final Object s() {
        if (!pjr.e((CharSequence)this.a)) {
            final ArrayList b = this.b;
            if (b != null) {
                return new z0r(this.a, (List)b, this.c);
            }
        }
        return null;
    }
}
