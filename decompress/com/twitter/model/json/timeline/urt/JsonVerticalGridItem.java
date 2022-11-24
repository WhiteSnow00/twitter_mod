// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonVerticalGridItem extends tih<ktw>
{
    @JsonField(name = { "content" }, typeConverter = fat.class)
    public ktw a;
    
    @Override
    public final Object s() {
        return this.a;
    }
}
