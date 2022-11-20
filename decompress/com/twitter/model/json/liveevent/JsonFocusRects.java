// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFocusRects extends fih<oeb>
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
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final oeb t() {
        final oeb$a oeb$a = new oeb$a();
        oeb$a.a = this.a;
        oeb$a.b = this.b;
        oeb$a.c = this.c;
        oeb$a.d = this.d;
        return (oeb)((n4j)oeb$a).e();
    }
}
