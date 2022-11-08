// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.AbstractCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetHighlights extends ige
{
    @JsonField
    public List<olc> a;
    
    public JsonTweetHighlights() {
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        this.a = (AbstractCollection)d0;
    }
    
    @JsonObject
    public static class JsonTweetHighlight extends aih<olc>
    {
        @JsonField
        public int a;
        @JsonField
        public int b;
        
        @Override
        public final Object s() {
            final olc$a olc$a = new olc$a();
            ((d7a.a)olc$a).b = this.a;
            final int a = w4j.a;
            ((d7a.a)olc$a).c = this.b;
            return ((h4j)olc$a).j();
        }
    }
}
