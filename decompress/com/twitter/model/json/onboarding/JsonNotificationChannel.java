// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationChannel extends lhh<l6k>
{
    @JsonField
    public String a;
    @JsonField
    public boolean b;
    @JsonField(typeConverter = tge.class)
    public int c;
    @JsonField
    public boolean d;
    @JsonField(typeConverter = uge.class)
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
    
    public final l6k$a u() {
        final l6k$a l6k$a = new l6k$a();
        l6k$a.a = this.a;
        l6k$a.b = this.b;
        l6k$a.o(this.e);
        l6k$a.c = this.c;
        l6k$a.d = this.d;
        l6k$a.g = this.g;
        l6k$a.h = this.h;
        l6k$a.i = this.i;
        l6k$a.j = this.j;
        l6k$a.k = this.k;
        l6k$a.l = this.l;
        return l6k$a;
    }
}
