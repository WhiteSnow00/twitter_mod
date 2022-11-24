// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUrtRichText extends tih<fym>
{
    @JsonField
    public String a;
    @JsonField
    public List<JsonUrtRichText.JsonUrtRichText$RichTextEntity> b;
    @JsonField(typeConverter = gym.class)
    public int c;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final fym t() {
        if (flr.e((CharSequence)this.a) && kr4.t((Collection)this.b)) {
            return null;
        }
        final ArrayList b = this.b;
        final a a = new a();
        final kkg t = kkg.t();
        if (b != null) {
            for (final JsonUrtRichText.JsonUrtRichText$RichTextEntity jsonUrtRichText$RichTextEntity : b) {
                t.w((Object)a.a(jsonUrtRichText$RichTextEntity), (Object)new fxl(jsonUrtRichText$RichTextEntity.a, jsonUrtRichText$RichTextEntity.b));
            }
        }
        final Map b2 = (Map)((z4j)t).e();
        final fym.b<Object> b3 = new fym.b<Object>();
        b3.a = this.a;
        final int a2 = o5j.a;
        b3.b = b2;
        b3.c = this.c;
        final fym fym = (fym)((z4j)b3).j();
        Objects.requireNonNull(fym);
        final bvh bvh = new bvh(fym);
        xd.j0(bvh, null, true);
        return new fym(bvh);
    }
}
