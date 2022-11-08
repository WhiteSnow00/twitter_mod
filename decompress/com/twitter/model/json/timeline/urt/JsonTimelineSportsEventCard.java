// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineSportsEventCard extends aih<g4t>
{
    @JsonField
    public dqv a;
    
    @Override
    public final Object s() {
        return new g4t(this.a);
    }
}
