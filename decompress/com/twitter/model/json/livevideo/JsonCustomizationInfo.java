// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livevideo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCustomizationInfo extends fih<hd7>
{
    @JsonField
    public z6d a;
    @JsonField
    public String b;
    
    public final Object s() {
        final hd7$a hd7$a = new hd7$a();
        hd7$a.a = this.a;
        final String b = this.b;
        if (b != null) {
            try {
                hd7$a.b = ffz.k0(b);
            }
            catch (final IllegalArgumentException ex) {
                m8a.d((Throwable)ex);
            }
        }
        return ((n4j)hd7$a).e();
    }
}
