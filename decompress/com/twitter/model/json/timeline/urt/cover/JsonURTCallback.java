// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCallback extends tih<vov>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        vov vov;
        if (flr.g((CharSequence)this.a)) {
            vov = new vov(this.a);
        }
        else {
            vov = null;
        }
        return vov;
    }
}
