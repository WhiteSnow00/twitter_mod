// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUrtHitHighlights extends aih<d7w>
{
    @JsonField(name = { "startIndex" })
    public int a;
    @JsonField(name = { "endIndex" })
    public int b;
    
    public JsonUrtHitHighlights() {
        this.a = -1;
        this.b = -1;
    }
    
    @Override
    public final Object s() {
        final int a = this.a;
        if (a > -1) {
            final int b = this.b;
            if (a <= b) {
                return new d7w(a, b);
            }
        }
        return null;
    }
}
