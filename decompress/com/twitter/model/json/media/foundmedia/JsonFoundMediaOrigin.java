// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.foundmedia;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonFoundMediaOrigin extends tih<qnb>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final String a = this.a;
        if (a != null) {
            final String b = this.b;
            if (b != null) {
                return new qnb(a, b);
            }
        }
        mqb.o("JsonFoundMediaOrigin has no provider or id");
        return null;
    }
}
