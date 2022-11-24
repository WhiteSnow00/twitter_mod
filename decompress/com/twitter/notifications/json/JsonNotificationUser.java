// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationUser extends tih<dwi>
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
    
    @Override
    public final Object s() {
        final long a = this.a;
        Object o;
        if (a == 0L) {
            mqb.o("Missing id");
            o = null;
        }
        else {
            final dwi$a dwi$a = new dwi$a();
            dwi$a.a = a;
            dwi$a.c = this.c;
            dwi$a.d = this.d;
            dwi$a.e = this.e;
            dwi$a.f = this.f;
            final String b = this.b;
            if (b != null) {
                dwi$a.o(b);
            }
            o = ((z4j)dwi$a).e();
        }
        return o;
    }
}
