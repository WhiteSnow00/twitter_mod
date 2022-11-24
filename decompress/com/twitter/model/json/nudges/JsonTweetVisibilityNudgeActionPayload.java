// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetVisibilityNudgeActionPayload extends tih<o0j$c>
{
    @JsonField
    public String a;
    @JsonField
    public fym b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public c9t e;
    @JsonField
    public fym f;
    
    @Override
    public final Object s() {
        final fym f = this.f;
        final Object o = null;
        Icon icon = null;
        String f2;
        if (f != null && !f.F0.isEmpty()) {
            f2 = this.f.F0;
        }
        else {
            f2 = null;
        }
        Object o2;
        if (this.b == null) {
            o2 = o;
        }
        else {
            final String c = this.c;
            if (c != null) {
                icon = (Icon)o0j.a.get(c);
            }
            o2 = new o0j$c(this.a, this.b, this.c, icon, this.d, this.e, f2);
        }
        return o2;
    }
}
