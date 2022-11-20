// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonOcfRichTextQuantityPair extends fih<dym>
{
    @JsonField
    public int a;
    @JsonField
    public JsonOcfRichText b;
    
    public final Object s() {
        final int a = this.a;
        final cej s = JsonOcfRichText.s(this.b);
        jee.l((Object)s);
        return new dym(a, s);
    }
}
