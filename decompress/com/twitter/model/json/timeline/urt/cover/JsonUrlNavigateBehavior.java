// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.cover;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUrlNavigateBehavior extends aih<snv$d>
{
    @JsonField
    public q7t a;
    
    @Override
    public final Object s() {
        final q7t a = this.a;
        snv$d snv$d;
        if (a != null) {
            snv$d = new snv$d(a);
        }
        else {
            snv$d = null;
        }
        return snv$d;
    }
}
