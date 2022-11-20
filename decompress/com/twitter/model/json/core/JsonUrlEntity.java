// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUrlEntity extends qhh<h6w>
{
    @JsonField
    public int[] a;
    @JsonField(name = { "url_https" })
    public String b;
    @JsonField(name = { "expanded_url", "expanded" })
    public String c;
    @JsonField(name = { "display_url", "display" })
    public String d;
    @JsonField(name = { "url" })
    public String e;
    
    public JsonUrlEntity() {
        this.a = new int[] { -1, -1 };
    }
    
    public final n4j t() {
        final h6w$c h6w$c = new h6w$c();
        final int[] a = this.a;
        ((m6a$a)h6w$c).b = a[0];
        final int a2 = c5j.a;
        ((m6a$a)h6w$c).c = a[1];
        String d = this.b;
        if (d == null) {
            d = this.e;
        }
        ((h6w.a)h6w$c).d = d;
        ((h6w.a)h6w$c).e = this.c;
        ((h6w.a)h6w$c).f = this.d;
        return (n4j)h6w$c;
    }
}
