// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTDismissInfo extends tih<opv>
{
    @JsonField
    public List<vov> a;
    
    @Override
    public final Object s() {
        Object o;
        if ((o = this.a) == null) {
            o = h3a.F0;
        }
        return new opv((List<vov>)o);
    }
}
