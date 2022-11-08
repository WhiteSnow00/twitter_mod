// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineMetadata extends aih<gzs>
{
    @JsonField(name = { "title" })
    public String a;
    @JsonField(name = { "scribeConfig" })
    public z3t b;
    @JsonField(name = { "readerModeConfig" })
    public r1t c;
    
    @Override
    public final Object s() {
        return new gzs(this.a, this.b, this.c);
    }
}
