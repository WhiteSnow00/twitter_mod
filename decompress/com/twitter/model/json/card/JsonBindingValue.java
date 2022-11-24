// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.card;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonBindingValue extends tih<dz1>
{
    @JsonField
    public b8d a;
    @JsonField
    public jlw b;
    @JsonField
    public String c;
    @JsonField
    public Boolean d;
    @JsonField
    public String e;
    
    @Override
    public final Object s() {
        final b8d a = this.a;
        dz1 dz1;
        if (a != null) {
            dz1 = new dz1(a, this.e);
        }
        else {
            final jlw b = this.b;
            if (b != null) {
                dz1 = new dz1(b, this.e);
            }
            else {
                final String c = this.c;
                if (c != null) {
                    dz1 = new dz1(c, this.e);
                }
                else {
                    final Boolean d = this.d;
                    if (d != null) {
                        dz1 = new dz1(d, this.e);
                    }
                    else {
                        dz1 = null;
                    }
                }
            }
        }
        return dz1;
    }
}
