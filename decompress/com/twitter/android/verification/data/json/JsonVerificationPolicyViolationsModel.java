// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.verification.data.json;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVerificationPolicyViolationsModel extends fih<prw>
{
    @JsonField
    public long a;
    @JsonField
    public oxm b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public List<JsonVerificationPolicyViolation> e;
    
    public final Object s() {
        final rif h = rif.H();
        final ArrayList e = this.e;
        if (e != null) {
            for (final JsonVerificationPolicyViolation jsonVerificationPolicyViolation : e) {
                h.p((Object)new irw(jsonVerificationPolicyViolation.c, jsonVerificationPolicyViolation.a, jsonVerificationPolicyViolation.b, jsonVerificationPolicyViolation.d));
            }
        }
        return new prw(this.c, (oxm<?>)this.b, this.a, (List<irw>)((n4j)h).e(), this.d);
    }
}
