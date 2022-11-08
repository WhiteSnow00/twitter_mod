// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTHeaderImagePrompt extends aih<gqv>
{
    @JsonField
    public String a;
    @JsonField
    public xwm b;
    @JsonField
    public String c;
    @JsonField
    public xwm d;
    @JsonField
    public dpv e;
    @JsonField
    public fpv f;
    @JsonField
    public fpv g;
    @JsonField
    public apv h;
    
    @Override
    public final Object s() {
        Object o;
        if (this.e == null) {
            xpa.p("JsonURTHeaderImagePrompt has no image");
            o = null;
        }
        else {
            String a;
            if ((a = this.a) == null) {
                a = "";
            }
            o = new gqv(a, this.c, this.f, this.g, this.e, this.h, this.b, this.d);
        }
        return o;
    }
}
