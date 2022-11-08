// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTweetContext extends aih<meu>
{
    @JsonField(name = { "contextType" })
    public yde a;
    @JsonField
    public String b;
    @JsonField
    public List<String> c;
    @JsonField
    public q7t d;
    
    @Override
    public final Object s() {
        final yde a = this.a;
        meu meu;
        if (a != null) {
            final meu$a meu$a = new meu$a();
            meu$a.a = a.a;
            meu$a.b = this.b;
            meu$a.c = this.c;
            meu$a.d = this.d;
            meu = (meu)((h4j)meu$a).j();
        }
        else {
            meu = null;
        }
        return meu;
    }
}
