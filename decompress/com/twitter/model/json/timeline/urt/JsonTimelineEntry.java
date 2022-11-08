// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.twitter.util.InvalidDataException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public final class JsonTimelineEntry extends aih<pus>
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
        final wws wws = null;
        Object t;
        if (a != null) {
            final JsonTimelineEntry.JsonTimelineEntry$a c = this.c;
            final boolean b = c instanceof JsonTimelineItem;
            final int n = 0;
            if (b) {
                final int a2 = w4j.a;
                t = this.t((JsonTimelineItem)c, a, false, null);
            }
            else if (c instanceof JsonTimelineOperation) {
                final int a3 = w4j.a;
                final spv a4 = ((JsonTimelineOperation)c).a;
                t = wws;
                if (a4 != null) {
                    t = new vts(a, this.b, a4, this.d);
                }
            }
            else {
                t = wws;
                if (c instanceof JsonTimelineModule) {
                    final int a5 = w4j.a;
                    final JsonTimelineModule jsonTimelineModule = (JsonTimelineModule)c;
                    t = wws;
                    if (!hr4.t((Collection)jsonTimelineModule.a)) {
                        t = wws;
                        if (jzs.m.contains(jsonTimelineModule.d)) {
                            final List c2 = hr4.c((List)jsonTimelineModule.a, (kub)new kje(this, new HashMap()));
                            final String d = jsonTimelineModule.d;
                            final boolean equals = "Carousel".equals(d);
                            final int n2 = 1;
                            if (equals || "GridCarousel".equals(d)) {
                                final Object p = hr4.p((Iterable)c2);
                                int n3 = 0;
                                Label_0293: {
                                    if (p == null) {
                                        n3 = n2;
                                    }
                                    else {
                                        final Class<?> class1 = p.getClass();
                                        final Iterator iterator = c2.iterator();
                                        while (iterator.hasNext()) {
                                            if (!iterator.next().getClass().equals(class1)) {
                                                n3 = n;
                                                break Label_0293;
                                            }
                                        }
                                        n3 = 1;
                                    }
                                }
                                if (n3 == 0) {
                                    t = wws;
                                    return t;
                                }
                            }
                            final jzs$a jzs$a = new jzs$a();
                            jzs$a.a = this.a;
                            jzs$a.b = this.b;
                            jzs$a.c = this.d;
                            jzs$a.d = c2;
                            jzs$a.e = jsonTimelineModule.d;
                            jzs$a.f = jsonTimelineModule.b;
                            jzs$a.g = jsonTimelineModule.c;
                            jzs$a.h = (qzo)fih.b((aih)jsonTimelineModule.e);
                            jzs$a.i = jsonTimelineModule.f;
                            jzs$a.j = jsonTimelineModule.g;
                            jzs$a.k = jsonTimelineModule.h;
                            t = ((h4j)jzs$a).j();
                        }
                    }
                }
            }
        }
        else {
            zi.A("A JsonTimelineEntry must have a non-null ID");
            t = wws;
        }
        return t;
    }
    
    public final wws t(final JsonTimelineItem jsonTimelineItem, final String s, final boolean b, final vlh vlh) {
        final JsonTimelineEntry.JsonTimelineEntry$b a = jsonTimelineItem.a;
        if (a != null) {
            return a.a(jsonTimelineItem, s, this.b, this.d, b, vlh);
        }
        e9a.h((Throwable)new InvalidDataException("JsonTimelineItem.itemContent is null for the itemEntry"));
        return null;
    }
}
