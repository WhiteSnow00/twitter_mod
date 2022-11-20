// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaCursor extends fih<gmb>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final Object s() {
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        return new gmb(a);
    }
}
