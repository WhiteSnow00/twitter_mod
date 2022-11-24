// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPermissionReport extends tih<e7k>
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
    public t6s h;
    @JsonField
    public ygd i;
    @JsonField
    public Map<String, String> j;
    @JsonField
    public Map<String, JsonNotificationChannel> k;
    
    @Override
    public final Object s() {
        final e7k$a e7k$a = new e7k$a(this.h, this.i);
        final String a = this.a;
        final boolean g = flr.g((CharSequence)a);
        final long n = 0L;
        long long1;
        if (g) {
            long1 = Long.parseLong(a);
        }
        else {
            long1 = 0L;
        }
        e7k$a.c = long1;
        e7k$a.d = this.b;
        e7k$a.e = this.c;
        e7k$a.f = this.d;
        e7k$a.g = this.e;
        e7k$a.h = this.f;
        final String g2 = this.g;
        long long2 = n;
        if (flr.g((CharSequence)g2)) {
            long2 = Long.parseLong(g2);
        }
        e7k$a.i = long2;
        e7k$a.j = this.j;
        e7k$a.k = kr4.B((Map)this.k, (x2j)pde.c);
        return ((z4j)e7k$a).j();
    }
}
