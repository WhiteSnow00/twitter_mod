// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTCompactPrompt extends aih<eqv>
{
    @JsonField(name = { "headerText", "compactHeaderText" })
    public String a;
    @JsonField(name = { "bodyText", "compactBodyText" })
    public String b;
    @JsonField(name = { "primaryButtonAction", "compactPrimaryButtonAction" })
    public fpv c;
    @JsonField(name = { "secondaryButtonAction", "compactSecondaryButtonAction" })
    public fpv d;
    @JsonField(name = { "action", "compactAction" })
    public apv e;
    @JsonField(name = { "headerRichText", "compactHeaderRichText" })
    public xwm f;
    @JsonField(name = { "bodyRichText", "compactBodyRichText" })
    public xwm g;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            xpa.p("JsonURTCompactPrompt has no titleText");
            o = null;
        }
        else {
            o = new eqv(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        return o;
    }
}
