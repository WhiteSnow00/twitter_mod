// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaSizeVariant extends tih<l0h>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    @Override
    public final Object s() {
        if (flr.g((CharSequence)this.a)) {
            final int b = this.b;
            if (b > 0) {
                final int c = this.c;
                if (c > 0) {
                    return new l0h(this.a, b, c);
                }
            }
        }
        return null;
    }
}
