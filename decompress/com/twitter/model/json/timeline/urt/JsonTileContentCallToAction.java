// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentCallToAction extends tih<nqs>
{
    @JsonField
    public String a;
    @JsonField
    public fym b;
    @JsonField(typeConverter = d87.class)
    public b87 c;
    
    @Override
    public final Object s() {
        nqs nqs;
        if (flr.g((CharSequence)this.a)) {
            nqs = new nqs(this.a, this.b, this.c);
        }
        else {
            nqs = null;
        }
        return nqs;
    }
}
