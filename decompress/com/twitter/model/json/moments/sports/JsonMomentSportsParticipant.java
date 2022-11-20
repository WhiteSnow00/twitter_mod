// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments.sports;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonMomentSportsParticipant extends qhh<oph>
{
    @JsonField
    public oph$b a;
    @JsonField
    public String b;
    @JsonField
    public long c;
    
    public final n4j t() {
        final oph$a oph$a = new oph$a();
        oph$a.c = this.a;
        oph$a.b = this.b;
        oph$a.a = this.c;
        return (n4j)oph$a;
    }
    
    @JsonObject
    public static class JsonParticipantMedia extends fih<oph$b>
    {
        @JsonField
        public String a;
        
        public final Object s() {
            return new oph$b(this.a);
        }
    }
}
