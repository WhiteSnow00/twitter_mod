// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonHumanizationNudge extends lhh<gtc>
{
    @JsonField
    public List<jtc> a;
    @JsonField
    public List<qtc> b;
    @JsonField
    public String c;
    @JsonField
    public qtc d;
    
    @Override
    public final h4j t() {
        final gtc.b b = new gtc.b();
        Object a;
        if ((a = this.a) == null) {
            a = v2a.C0;
        }
        b.a = (List<jtc>)a;
        Object b2;
        if ((b2 = this.b) == null) {
            b2 = v2a.C0;
        }
        b.b = (List<qtc>)b2;
        b.c = this.c;
        b.d = this.d.G0;
        return b;
    }
}
