// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.AbstractCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetHighlights extends qfe
{
    @JsonField
    public List<okc> a;
    
    public JsonTweetHighlights() {
        final gdd$b e0 = gdd.E0;
        final int a = c5j.a;
        this.a = (AbstractCollection)e0;
    }
}
