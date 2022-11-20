// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPermissionReport extends fih<r6k>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public z5s h;
    @JsonField
    public yfd i;
    @JsonField
    public Map<String, String> j;
    @JsonField
    public Map<String, JsonNotificationChannel> k;
    
    public final Object s() {
        final r6k$a r6k$a = new r6k$a(this.h, this.i);
        final String a = this.a;
        final boolean g = ikr.g((CharSequence)a);
        final long n = 0L;
        long long1;
        if (g) {
            long1 = Long.parseLong(a);
        }
        else {
            long1 = 0L;
        }
        r6k$a.c = long1;
        r6k$a.d = this.b;
        r6k$a.e = this.c;
        r6k$a.f = this.d;
        r6k$a.g = this.e;
        r6k$a.h = this.f;
        final String g2 = this.g;
        long long2 = n;
        if (ikr.g((CharSequence)g2)) {
            long2 = Long.parseLong(g2);
        }
        r6k$a.i = long2;
        r6k$a.j = this.j;
        r6k$a.k = fq4.B((Map)this.k, (k2j)rce.c);
        return ((n4j)r6k$a).j();
    }
}
