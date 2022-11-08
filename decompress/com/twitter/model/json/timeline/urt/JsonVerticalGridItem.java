// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonVerticalGridItem extends aih<csw>
{
    @JsonField(name = { "content" }, typeConverter = t8t.class)
    public csw a;
    
    @Override
    public final Object s() {
        return this.a;
    }
}
