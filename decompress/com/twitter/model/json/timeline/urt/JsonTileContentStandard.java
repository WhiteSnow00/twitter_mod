// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTileContentStandard extends aih<fps>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public wg1 c;
    
    @Override
    public final Object s() {
        final fps.a a = new fps.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        final fps fps = (fps)a.j();
        if (fps == null) {
            zi.A("title or supporting text or both are empty");
        }
        return fps;
    }
}
