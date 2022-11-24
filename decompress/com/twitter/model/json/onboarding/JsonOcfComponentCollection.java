// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfComponentCollection extends tih<d26>
{
    @JsonField
    public List<rrp> a;
    @JsonField
    public List<rrp> b;
    @JsonField
    public List<rrp> c;
    @JsonField
    public List<rrp> d;
    @JsonField
    public List<rrp> e;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final d26 t() {
        final d26.a a = new d26.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = this.d;
        a.e = this.e;
        return (d26)a.e();
    }
}
