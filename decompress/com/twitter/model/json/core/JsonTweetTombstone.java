// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetTombstone extends qhh<auu>
{
    @JsonField(name = { "tombstone" })
    public wrv a;
    
    public final n4j t() {
        final auu$a auu$a = new auu$a();
        auu$a.D0 = this.a;
        return (n4j)auu$a;
    }
}
