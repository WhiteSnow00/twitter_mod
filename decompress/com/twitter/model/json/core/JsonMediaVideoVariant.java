// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaVideoVariant extends tih<a3h>
{
    @JsonField
    public String a;
    @JsonField(name = { "content_type", "contentType" })
    public String b;
    @JsonField(name = { "bit_rate", "bitrate" })
    public int c;
    
    @Override
    public final Object s() {
        a3h a3h;
        if (flr.g((CharSequence)this.a) && flr.g((CharSequence)this.b)) {
            a3h = new a3h(this.a, this.b, this.c);
        }
        else {
            a3h = null;
        }
        return a3h;
    }
}
