// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineSportsEventCard extends tih<r5t>
{
    @JsonField
    public krv a;
    
    @Override
    public final Object s() {
        return new r5t(this.a);
    }
}
