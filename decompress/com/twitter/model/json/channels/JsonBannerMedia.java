// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.channels;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonBannerMedia extends tih<zh1>
{
    @JsonField(name = { "media_info" })
    public JsonMediaInfo a;
    
    @Override
    public final Object s() {
        final JsonMediaInfo a = this.a;
        Object o;
        if (a == null) {
            o = null;
        }
        else {
            final zh1$a zh1$a = new zh1$a();
            zh1$a.a = a.a;
            zh1$a.b = a.b;
            zh1$a.c = a.c;
            zh1$a.d = a.d;
            o = ((z4j)zh1$a).j();
        }
        return o;
    }
}
