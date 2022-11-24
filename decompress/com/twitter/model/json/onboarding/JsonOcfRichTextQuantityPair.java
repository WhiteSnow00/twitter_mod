// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonOcfRichTextQuantityPair extends tih<uym>
{
    @JsonField
    public int a;
    @JsonField
    public JsonOcfRichText b;
    
    @Override
    public final Object s() {
        final int a = this.a;
        final pej s = JsonOcfRichText.s(this.b);
        vmw.g((Object)s);
        return new uym(a, s);
    }
}
