// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonReplaceEntriesInstruction extends tih<kwv>
{
    @JsonField(name = { "entry" })
    public yvs a;
    @JsonField(name = { "entryIdToReplace" })
    public String b;
    
    @Override
    public final Object s() {
        final yvs a = this.a;
        if (a != null) {
            final String b = this.b;
            if (b != null) {
                return new kwv(a, b);
            }
        }
        return null;
    }
}
