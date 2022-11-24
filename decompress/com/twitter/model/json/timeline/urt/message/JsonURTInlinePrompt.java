// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.twitter.model.json.timeline.urt.d;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTInlinePrompt extends tih<prv>
{
    @JsonField(name = { "headerText", "inlineHeaderText" })
    public String a;
    @JsonField(name = { "headerRichText", "inlineHeaderRichText" })
    public fym b;
    @JsonField(name = { "bodyText", "inlineBodyText" })
    public String c;
    @JsonField(name = { "bodyRichText", "inlineBodyRichText" })
    public fym d;
    @JsonField(name = { "primaryButtonAction", "inlinePrimaryButtonAction" })
    public nqv e;
    @JsonField(name = { "secondaryButtonAction", "inlineSecondaryButtonAction" })
    public nqv f;
    @JsonField(name = { "socialContext", "inlineSocialContext" }, typeConverter = d.class)
    public o5t g;
    @JsonField(name = { "userFacepile", "inlineTimelineUserFacepile" })
    public y9t h;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null && this.b == null) {
            mqb.o("JsonURTInlinePrompt has no title text");
            o = null;
        }
        else {
            o = new prv(this.a, this.c, this.e, this.f, this.b, this.d, ix.w(this.g), this.h);
        }
        return o;
    }
}
