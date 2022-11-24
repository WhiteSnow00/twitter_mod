// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNavigationLinkOptions extends tih<tbi>
{
    @JsonField
    public List<uym> a;
    @JsonField
    public Integer b;
    @JsonField
    public Integer c;
    @JsonField
    public ttr d;
    
    @Override
    public final Object s() {
        final tbi$a tbi$a = new tbi$a();
        tbi$a.a = this.a;
        tbi$a.b = this.b;
        tbi$a.c = this.c;
        tbi$a.d = this.d;
        return new tbi(tbi$a);
    }
}
