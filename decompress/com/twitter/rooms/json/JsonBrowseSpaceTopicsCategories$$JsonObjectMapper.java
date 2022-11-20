// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBrowseSpaceTopicsCategories$$JsonObjectMapper extends JsonMapper<JsonBrowseSpaceTopicsCategories>
{
    public static JsonBrowseSpaceTopicsCategories _parse(final tge tge) throws IOException {
        final JsonBrowseSpaceTopicsCategories jsonBrowseSpaceTopicsCategories = new JsonBrowseSpaceTopicsCategories();
        if (tge.e() == null) {
            tge.h0();
        }
        if (tge.e() != vie.L0) {
            tge.l0();
            return null;
        }
        while (tge.h0() != vie.M0) {
            final String d = tge.d();
            tge.h0();
            parseField(jsonBrowseSpaceTopicsCategories, d, tge);
            tge.l0();
        }
        return jsonBrowseSpaceTopicsCategories;
    }
    
    public static void _serialize(final JsonBrowseSpaceTopicsCategories jsonBrowseSpaceTopicsCategories, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List a = jsonBrowseSpaceTopicsCategories.a;
        if (a != null) {
            final Iterator g = hee.g(afe, "categories", a);
            while (g.hasNext()) {
                final j31 j31 = g.next();
                if (j31 != null) {
                    LoganSquare.typeConverterFor((Class)j31.class).serialize((Object)j31, "lslocalcategoriesElement", false, afe);
                }
            }
            afe.f();
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonBrowseSpaceTopicsCategories jsonBrowseSpaceTopicsCategories, final String s, final tge tge) throws IOException {
        if ("categories".equals(s)) {
            if (tge.e() != vie.N0) {
                Objects.requireNonNull(jsonBrowseSpaceTopicsCategories);
                czd.f((Object)null, "<set-?>");
                throw null;
            }
            final ArrayList a = new ArrayList();
            while (tge.h0() != vie.O0) {
                final j31 j31 = (j31)LoganSquare.typeConverterFor((Class)j31.class).parse(tge);
                if (j31 != null) {
                    a.add(j31);
                }
            }
            Objects.requireNonNull(jsonBrowseSpaceTopicsCategories);
            jsonBrowseSpaceTopicsCategories.a = a;
        }
    }
    
    public JsonBrowseSpaceTopicsCategories parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonBrowseSpaceTopicsCategories jsonBrowseSpaceTopicsCategories, final afe afe, final boolean b) throws IOException {
        _serialize(jsonBrowseSpaceTopicsCategories, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonBrowseSpaceTopicsCategories)o, afe, b);
    }
}
