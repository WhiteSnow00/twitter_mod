// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHumanizationNudge extends qhh<ksc>
{
    @JsonField
    public List<nsc> a;
    @JsonField
    public List<usc> b;
    @JsonField
    public String c;
    @JsonField
    public usc d;
    
    public final n4j t() {
        final ksc$b ksc$b = new ksc$b();
        Object a;
        if ((a = this.a) == null) {
            a = f2a.D0;
        }
        ksc$b.a = (List)a;
        Object b;
        if ((b = this.b) == null) {
            b = f2a.D0;
        }
        ksc$b.b = (List)b;
        ksc$b.c = this.c;
        ksc$b.d = this.d.H0;
        return (n4j)ksc$b;
    }
}
