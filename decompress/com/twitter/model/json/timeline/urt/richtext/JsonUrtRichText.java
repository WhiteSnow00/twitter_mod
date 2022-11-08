// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt.richtext;

import com.twitter.model.json.timeline.urt.JsonGraphQlRestId;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;
import java.util.Collection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUrtRichText extends aih<xwm>
{
    @JsonField
    public String a;
    @JsonField
    public List<JsonUrtRichText.JsonUrtRichText$RichTextEntity> b;
    @JsonField(typeConverter = ywm.class)
    public int c;
    
    public final xwm t() {
        if (pjr.e((CharSequence)this.a) && hr4.t((Collection)this.b)) {
            return null;
        }
        final ArrayList b = this.b;
        final a a = new a();
        final sjg t = sjg.t();
        if (b != null) {
            for (final JsonUrtRichText.JsonUrtRichText$RichTextEntity jsonUrtRichText$RichTextEntity : b) {
                t.w((Object)a.a(jsonUrtRichText$RichTextEntity), (Object)new ewl(jsonUrtRichText$RichTextEntity.a, jsonUrtRichText$RichTextEntity.b));
            }
        }
        final Map b2 = (Map)((h4j)t).e();
        final xwm$b xwm$b = new xwm$b();
        ((xwm$a)xwm$b).a = this.a;
        final int a2 = w4j.a;
        ((xwm$a)xwm$b).b = b2;
        ((xwm$a)xwm$b).c = this.c;
        final xwm xwm = (xwm)((h4j)xwm$b).j();
        Objects.requireNonNull(xwm);
        final huh huh = new huh((xwm<xes>)xwm);
        goz.t(huh, (List)null, true);
        return new xwm(huh);
    }
    
    @JsonObject
    public static class JsonRichTextMentionEntity extends ige
    {
        @JsonField
        public String a;
        @JsonField
        public long b;
        @JsonField
        public JsonGraphQlRestId c;
    }
    
    @JsonObject
    public static class JsonRichTextTwitterListEntity extends ige
    {
        @JsonField
        public long a;
        @JsonField
        public String b;
    }
    
    @JsonObject
    public static class JsonRichTextUserEntity extends ige
    {
        @JsonField
        public int a;
        @JsonField
        public JsonGraphQlRestId b;
    }
    
    @JsonObject
    public static class ReferenceObject extends ige
    {
        @JsonField
        public q7t a;
        @JsonField
        public JsonRichTextUserEntity b;
        @JsonField
        public JsonRichTextMentionEntity c;
        @JsonField
        public qgc d;
        @JsonField
        public gn3 e;
        @JsonField
        public JsonRichTextTwitterListEntity f;
    }
}
