// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.twitter.core.ui.styles.icons.implementation.Icon;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetVisibilityNudgeActionPayload extends fih<b0j.c>
{
    @JsonField
    public String a;
    @JsonField
    public oxm b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public i8t e;
    @JsonField
    public oxm f;
    
    public final Object s() {
        final oxm f = this.f;
        final Object o = null;
        Icon icon = null;
        String d0;
        if (f != null && !f.D0.isEmpty()) {
            d0 = this.f.D0;
        }
        else {
            d0 = null;
        }
        Object o2;
        if (this.b == null) {
            o2 = o;
        }
        else {
            final String c = this.c;
            if (c != null) {
                icon = (Icon)b0j.a.get(c);
            }
            o2 = new b0j.c(this.a, (oxm<sfs>)this.b, this.c, icon, this.d, this.e, d0);
        }
        return o2;
    }
}
