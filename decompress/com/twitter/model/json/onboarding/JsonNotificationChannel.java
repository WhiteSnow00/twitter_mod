// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationChannel extends qhh<s6k>
{
    @JsonField
    public String a;
    @JsonField
    public boolean b;
    @JsonField(typeConverter = cge.class)
    public int c;
    @JsonField
    public boolean d;
    @JsonField(typeConverter = dge.class)
    public int e;
    @JsonField
    public boolean f;
    @JsonField
    public boolean g;
    @JsonField
    public int h;
    @JsonField
    public long[] i;
    @JsonField
    public boolean j;
    @JsonField
    public boolean k;
    @JsonField
    public String l;
    
    public final /* bridge */ n4j t() {
        return (n4j)this.u();
    }
    
    public final s6k$a u() {
        final s6k$a s6k$a = new s6k$a();
        s6k$a.a = this.a;
        s6k$a.b = this.b;
        s6k$a.o(this.e);
        s6k$a.c = this.c;
        s6k$a.d = this.d;
        s6k$a.g = this.g;
        s6k$a.h = this.h;
        s6k$a.i = this.i;
        s6k$a.j = this.j;
        s6k$a.k = this.k;
        s6k$a.l = this.l;
        return s6k$a;
    }
}
