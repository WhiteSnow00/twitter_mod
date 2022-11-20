// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationUser extends fih<mvi>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField(name = { "protected" })
    public boolean e;
    @JsonField(name = { "following" })
    public boolean f;
    
    public final Object s() {
        final long a = this.a;
        Object o;
        if (a == 0L) {
            i48.t("Missing id");
            o = null;
        }
        else {
            final mvi$a mvi$a = new mvi$a();
            mvi$a.a = a;
            mvi$a.c = this.c;
            mvi$a.d = this.d;
            mvi$a.e = this.e;
            mvi$a.f = this.f;
            final String b = this.b;
            if (b != null) {
                mvi$a.o(b);
            }
            o = ((n4j)mvi$a).e();
        }
        return o;
    }
}
