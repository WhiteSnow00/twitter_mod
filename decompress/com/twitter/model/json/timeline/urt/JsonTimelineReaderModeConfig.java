// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineReaderModeConfig extends tih<b3t>
{
    @JsonField(name = { "is_reader_mode_available" })
    public boolean a;
    
    @Override
    public final Object s() {
        return new b3t(this.a);
    }
}
