// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationMentionEntity extends lhh<h4h>
{
    @JsonField
    public int[] a;
    @JsonField
    public String b;
    @JsonField
    public long c;
    @JsonField
    public String d;
    
    public JsonNotificationMentionEntity() {
        this.a = new int[] { -1, -1 };
    }
    
    @Override
    public final h4j t() {
        final h4h$a h4h$a = new h4h$a();
        final int[] a = this.a;
        ((d7a.a)h4h$a).b = a[0];
        final int a2 = w4j.a;
        ((d7a.a)h4h$a).c = a[1];
        h4h$a.e = this.b;
        h4h$a.d = this.c;
        h4h$a.f = this.d;
        return (h4j)h4h$a;
    }
}
