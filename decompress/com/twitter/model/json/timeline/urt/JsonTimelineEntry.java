// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.util.InvalidDataException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonTimelineEntry extends tih<yvs>
{
    @JsonField(name = { "entryId" })
    public String a;
    @JsonField(name = { "sortIndex" })
    public long b;
    @JsonField(name = { "content" }, typeConverter = a.class)
    public JsonTimelineEntry.JsonTimelineEntry$a c;
    @JsonField
    public long d;
    
    public JsonTimelineEntry() {
        this.d = Long.MAX_VALUE;
    }
    
    @Override
    public final Object s() {
        final String a = this.a;
        final fys fys = null;
        Object t;
        if (a != null) {
            final JsonTimelineEntry.JsonTimelineEntry$a c = this.c;
            final boolean b = c instanceof JsonTimelineItem;
            boolean b2 = false;
            if (b) {
                final int a2 = o5j.a;
                t = this.t((JsonTimelineItem)c, a, false, null);
            }
            else if (c instanceof JsonTimelineOperation) {
                final int a3 = o5j.a;
                final zqv a4 = ((JsonTimelineOperation)c).a;
                t = fys;
                if (a4 != null) {
                    t = new fvs(a, this.b, a4, this.d);
                }
            }
            else {
                t = fys;
                if (c instanceof JsonTimelineModule) {
                    final int a5 = o5j.a;
                    final JsonTimelineModule jsonTimelineModule = (JsonTimelineModule)c;
                    t = fys;
                    if (!kr4.t((Collection)jsonTimelineModule.a)) {
                        t = fys;
                        if (s0t.m.contains(jsonTimelineModule.d)) {
                            final List c2 = kr4.c((List)jsonTimelineModule.a, (lub)new qje(this, (Map)new HashMap()));
                            final String d = jsonTimelineModule.d;
                            final boolean equals = "Carousel".equals(d);
                            boolean a6 = true;
                            if (equals || "GridCarousel".equals(d)) {
                                b2 = true;
                            }
                            if (b2) {
                                final Object p = kr4.p((Iterable)c2);
                                if (p != null) {
                                    a6 = k6e.a((Iterable)c2, (nuk)new e1c((Object)p.getClass(), 5));
                                }
                                if (!a6) {
                                    t = fys;
                                    return t;
                                }
                            }
                            final s0t$a s0t$a = new s0t$a();
                            s0t$a.a = this.a;
                            s0t$a.b = this.b;
                            s0t$a.c = this.d;
                            s0t$a.d = c2;
                            s0t$a.e = jsonTimelineModule.d;
                            s0t$a.f = jsonTimelineModule.b;
                            s0t$a.g = jsonTimelineModule.c;
                            s0t$a.h = yih.b(jsonTimelineModule.e);
                            s0t$a.i = jsonTimelineModule.f;
                            s0t$a.j = jsonTimelineModule.g;
                            s0t$a.k = jsonTimelineModule.h;
                            t = ((z4j)s0t$a).j();
                        }
                    }
                }
            }
        }
        else {
            c0e.i("A JsonTimelineEntry must have a non-null ID");
            t = fys;
        }
        return t;
    }
    
    public final fys t(final JsonTimelineItem jsonTimelineItem, final String s, final boolean b, final pmh pmh) {
        final JsonTimelineEntry.JsonTimelineEntry$b a = jsonTimelineItem.a;
        if (a != null) {
            return a.a(jsonTimelineItem, s, this.b, this.d, b, pmh);
        }
        r9a.h((Throwable)new InvalidDataException("JsonTimelineItem.itemContent is null for the itemEntry"));
        return null;
    }
}
