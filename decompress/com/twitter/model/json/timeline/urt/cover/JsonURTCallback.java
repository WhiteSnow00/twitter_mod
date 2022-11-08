// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCallback extends aih<lnv>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        lnv lnv;
        if (pjr.g((CharSequence)this.a)) {
            lnv = new lnv(this.a);
        }
        else {
            lnv = null;
        }
        return lnv;
    }
}
