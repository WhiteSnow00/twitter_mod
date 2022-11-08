// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments.sports;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMomentSportsParticipant extends lhh<jph>
{
    @JsonField
    public jph$b a;
    @JsonField
    public String b;
    @JsonField
    public long c;
    
    @Override
    public final h4j t() {
        final jph$a jph$a = new jph$a();
        jph$a.c = this.a;
        jph$a.b = this.b;
        jph$a.a = this.c;
        return (h4j)jph$a;
    }
}
