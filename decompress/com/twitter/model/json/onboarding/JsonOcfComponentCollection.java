// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfComponentCollection extends fih<x06>
{
    @JsonField
    public List<wqp> a;
    @JsonField
    public List<wqp> b;
    @JsonField
    public List<wqp> c;
    @JsonField
    public List<wqp> d;
    @JsonField
    public List<wqp> e;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final x06 t() {
        final x06$a x06$a = new x06$a();
        x06$a.a = this.a;
        x06$a.b = this.b;
        x06$a.c = this.c;
        x06$a.d = this.d;
        x06$a.e = this.e;
        return (x06)((n4j)x06$a).e();
    }
}
