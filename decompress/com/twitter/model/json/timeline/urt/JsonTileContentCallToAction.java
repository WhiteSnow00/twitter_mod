// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentCallToAction extends aih<dps>
{
    @JsonField
    public String a;
    @JsonField
    public xwm b;
    @JsonField(typeConverter = u77.class)
    public s77 c;
    
    @Override
    public final Object s() {
        dps dps;
        if (pjr.g((CharSequence)this.a)) {
            dps = new dps(this.a, this.b, this.c);
        }
        else {
            dps = null;
        }
        return dps;
    }
}
