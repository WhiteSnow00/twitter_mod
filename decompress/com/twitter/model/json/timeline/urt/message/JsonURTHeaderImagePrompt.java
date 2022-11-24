// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTHeaderImagePrompt extends tih<nrv>
{
    @JsonField
    public String a;
    @JsonField
    public fym b;
    @JsonField
    public String c;
    @JsonField
    public fym d;
    @JsonField
    public lqv e;
    @JsonField
    public nqv f;
    @JsonField
    public nqv g;
    @JsonField
    public iqv h;
    
    @Override
    public final Object s() {
        Object o;
        if (this.e == null) {
            mqb.o("JsonURTHeaderImagePrompt has no image");
            o = null;
        }
        else {
            String a;
            if ((a = this.a) == null) {
                a = "";
            }
            o = new nrv(a, this.c, this.f, this.g, this.e, this.h, this.b, this.d);
        }
        return o;
    }
}
