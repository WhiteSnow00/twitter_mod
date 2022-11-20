// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetCompositionNudgePayload extends qhh<b0j.b>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public f0j d;
    
    public final n4j t() {
        final b0j.b.a a = new b0j.b.a();
        a.a = this.a;
        final String b = this.b;
        oxm b2;
        if (b != null) {
            b2 = new oxm(b, (Map)k2a.D0);
        }
        else {
            b2 = null;
        }
        a.b = (oxm<sfs>)b2;
        final String c = this.c;
        a.c = c;
        final Icon d = b0j.a.get(c);
        if (d != null) {
            a.d = d;
        }
        a.e = this.d;
        return a;
    }
}
