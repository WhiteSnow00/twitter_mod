// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.user;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonIncomingFriendshipsResponse extends aih<ikd>
{
    @JsonField(name = { "ids" })
    public List<ckd> a;
    @JsonField(name = { "next_cursor_str" })
    public String b;
    
    @Override
    public final Object s() {
        return new ikd(this.b, (List)this.a);
    }
}
