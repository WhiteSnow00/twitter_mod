// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCarouselSocialProof extends qhh<dm3>
{
    @JsonField
    public String a;
    @JsonField
    public long b;
    
    public final n4j t() {
        final dm3$a dm3$a = new dm3$a();
        final String a = this.a;
        final nw6 c = dm3.c;
        final boolean e = ikr.e((CharSequence)a);
        int a2 = -1;
        if (!e) {
            Objects.requireNonNull(a);
            if (!a.equals("views")) {
                if (a.equals("viewers")) {
                    a2 = 2;
                }
            }
            else {
                a2 = 1;
            }
        }
        dm3$a.a = a2;
        dm3$a.b = this.b;
        return (n4j)dm3$a;
    }
}
