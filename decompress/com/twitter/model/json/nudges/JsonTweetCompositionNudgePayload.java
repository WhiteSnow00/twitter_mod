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
public class JsonTweetCompositionNudgePayload extends lhh<vzi$b>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public zzi d;
    
    @Override
    public final h4j t() {
        final vzi$b$a vzi$b$a = new vzi$b$a();
        vzi$b$a.a = this.a;
        final String b = this.b;
        xwm b2;
        if (b != null) {
            b2 = new xwm(b, (Map)a3a.C0);
        }
        else {
            b2 = null;
        }
        vzi$b$a.b = b2;
        final String c = this.c;
        vzi$b$a.c = c;
        final Icon d = vzi.a.get(c);
        if (d != null) {
            vzi$b$a.d = d;
        }
        vzi$b$a.e = this.d;
        return (h4j)vzi$b$a;
    }
}
