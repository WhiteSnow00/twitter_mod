// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaResponse extends tih<tnb>
{
    @JsonField
    public inb a;
    @JsonField
    public hnb b;
    
    @Override
    public final Object s() {
        final inb a = this.a;
        Object o = null;
        if (a == null) {
            mqb.o("JsonFoundMediaResponse has no data");
        }
        else {
            final hnb b = this.b;
            if (b == null) {
                mqb.o("JsonFoundMediaResponse has no cursor");
            }
            else {
                o = new tnb(a, b);
            }
        }
        return o;
    }
}
