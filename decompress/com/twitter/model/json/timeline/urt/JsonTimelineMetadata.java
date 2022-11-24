// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineMetadata extends tih<p0t>
{
    @JsonField(name = { "title" })
    public String a;
    @JsonField(name = { "scribeConfig" })
    public j5t b;
    @JsonField(name = { "readerModeConfig" })
    public b3t c;
    
    @Override
    public final Object s() {
        return new p0t(this.a, this.b, this.c);
    }
}
