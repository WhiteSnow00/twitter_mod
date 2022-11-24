// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTranslatedTweet extends tih<dvu>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public qku c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    public JsonTranslatedTweet() {
        this.a = -1L;
    }
    
    @Override
    public final Object s() {
        final long a = this.a;
        Object o = null;
        if (a != -1L) {
            final dvu$a dvu$a = new dvu$a();
            ((l1u$a)dvu$a).b = this.e;
            ((l1u$a)dvu$a).a = this.d;
            ((l1u$a)dvu$a).e = xd.i0(new rfu(this.b, this.c, null), true);
            o = ((z4j)dvu$a).j();
        }
        return o;
    }
}
