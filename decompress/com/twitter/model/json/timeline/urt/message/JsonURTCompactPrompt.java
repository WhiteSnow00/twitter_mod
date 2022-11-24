// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCompactPrompt extends tih<lrv>
{
    @JsonField(name = { "headerText", "compactHeaderText" })
    public String a;
    @JsonField(name = { "bodyText", "compactBodyText" })
    public String b;
    @JsonField(name = { "primaryButtonAction", "compactPrimaryButtonAction" })
    public nqv c;
    @JsonField(name = { "secondaryButtonAction", "compactSecondaryButtonAction" })
    public nqv d;
    @JsonField(name = { "action", "compactAction" })
    public iqv e;
    @JsonField(name = { "headerRichText", "compactHeaderRichText" })
    public fym f;
    @JsonField(name = { "bodyRichText", "compactBodyRichText" })
    public fym g;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            mqb.o("JsonURTCompactPrompt has no titleText");
            o = null;
        }
        else {
            o = new lrv(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        return o;
    }
}
