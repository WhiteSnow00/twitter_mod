// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMediaVideoVariant extends fih<j2h>
{
    @JsonField
    public String a;
    @JsonField(name = { "content_type", "contentType" })
    public String b;
    @JsonField(name = { "bit_rate", "bitrate" })
    public int c;
    
    public final Object s() {
        j2h j2h;
        if (ikr.g((CharSequence)this.a) && ikr.g((CharSequence)this.b)) {
            j2h = new j2h(this.a, this.b, this.c);
        }
        else {
            j2h = null;
        }
        return j2h;
    }
}
