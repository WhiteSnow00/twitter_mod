// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Collection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRemoveEntriesInstruction extends tih<vem>
{
    @JsonField
    public List<String> a;
    
    @Override
    public final Object s() {
        Object o;
        if (kr4.t((Collection)this.a)) {
            o = null;
        }
        else {
            o = new vem((List)this.a);
        }
        return o;
    }
}
