// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.message;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonURTMessageAction extends aih<apv>
{
    @JsonField
    public boolean a;
    @JsonField
    public String b;
    @JsonField
    public List<lnv> c;
    
    @Override
    public final Object s() {
        return new apv(this.a, this.b, (List)this.c);
    }
}
