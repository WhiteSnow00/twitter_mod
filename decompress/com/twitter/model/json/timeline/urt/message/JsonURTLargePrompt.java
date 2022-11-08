// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTLargePrompt extends aih<mqv>
{
    @JsonField(name = { "headerText", "largeHeaderText" })
    public String a;
    @JsonField(name = { "primaryButtonAction", "largePrimaryButtonAction" })
    public fpv b;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            xpa.p("JsonURTLargePrompt has no titleText");
            o = null;
        }
        else {
            o = new mqv(this.a, this.b);
        }
        return o;
    }
}
