// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.notifications;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationMentionEntity extends qhh<i4h>
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
    
    public final n4j t() {
        final i4h.a a = new i4h.a();
        final int[] a2 = this.a;
        a.b = a2[0];
        final int a3 = c5j.a;
        a.c = a2[1];
        a.e = this.b;
        a.d = this.c;
        a.f = this.d;
        return (n4j)a;
    }
}
