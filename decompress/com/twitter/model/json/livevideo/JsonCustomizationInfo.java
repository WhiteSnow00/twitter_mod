// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCustomizationInfo extends tih<ke7>
{
    @JsonField
    public b8d a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final ke7.a a = new ke7.a();
        a.a = this.a;
        final String b = this.b;
        if (b != null) {
            try {
                a.b = bs4.X(b);
            }
            catch (final IllegalArgumentException ex) {
                r9a.d((Throwable)ex);
            }
        }
        return a.e();
    }
}
