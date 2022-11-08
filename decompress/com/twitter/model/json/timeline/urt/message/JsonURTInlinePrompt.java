// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.twitter.model.json.timeline.urt.d;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTInlinePrompt extends aih<iqv>
{
    @JsonField(name = { "headerText", "inlineHeaderText" })
    public String a;
    @JsonField(name = { "headerRichText", "inlineHeaderRichText" })
    public xwm b;
    @JsonField(name = { "bodyText", "inlineBodyText" })
    public String c;
    @JsonField(name = { "bodyRichText", "inlineBodyRichText" })
    public xwm d;
    @JsonField(name = { "primaryButtonAction", "inlinePrimaryButtonAction" })
    public fpv e;
    @JsonField(name = { "secondaryButtonAction", "inlineSecondaryButtonAction" })
    public fpv f;
    @JsonField(name = { "socialContext", "inlineSocialContext" }, typeConverter = d.class)
    public d4t g;
    @JsonField(name = { "userFacepile", "inlineTimelineUserFacepile" })
    public m8t h;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null && this.b == null) {
            xpa.p("JsonURTInlinePrompt has no title text");
            o = null;
        }
        else {
            o = new iqv(this.a, this.c, this.e, this.f, this.b, this.d, poa.V(this.g), this.h);
        }
        return o;
    }
}
