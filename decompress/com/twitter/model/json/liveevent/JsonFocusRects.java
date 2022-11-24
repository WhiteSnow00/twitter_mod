// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFocusRects extends tih<pfb>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField(name = { "w" })
    public int c;
    @JsonField(name = { "h" })
    public int d;
    
    public JsonFocusRects() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final pfb t() {
        final pfb.a a = new pfb.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = this.d;
        return (pfb)a.e();
    }
}
