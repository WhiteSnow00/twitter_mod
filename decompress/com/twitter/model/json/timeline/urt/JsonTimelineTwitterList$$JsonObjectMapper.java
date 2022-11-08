// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTimelineTwitterList$$JsonObjectMapper extends JsonMapper<JsonTimelineTwitterList>
{
    public static final ecv TWITTER_LIST_DISPLAY_TYPE_CONVERTER;
    
    static {
        TWITTER_LIST_DISPLAY_TYPE_CONVERTER = new ecv();
    }
    
    public static JsonTimelineTwitterList _parse(final khe khe) throws IOException {
        final JsonTimelineTwitterList list = new JsonTimelineTwitterList();
        if (khe.e() == null) {
            khe.i0();
        }
        if (khe.e() != lje.K0) {
            khe.m0();
            return null;
        }
        while (khe.i0() != lje.L0) {
            final String d = khe.d();
            khe.i0();
            parseField(list, d, khe);
            khe.m0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTimelineTwitterList list, final tfe tfe, final boolean b) throws IOException {
        if (b) {
            tfe.r0();
        }
        ((StringBasedTypeConverter)JsonTimelineTwitterList$$JsonObjectMapper.TWITTER_LIST_DISPLAY_TYPE_CONVERTER).serialize((Object)list.c, "displayType", true, tfe);
        if (list.b != null) {
            LoganSquare.typeConverterFor((Class)k8c.class).serialize((Object)list.b, "list", true, tfe);
        }
        tfe.u0("id", list.a);
        if (b) {
            tfe.h();
        }
    }
    
    public static void parseField(final JsonTimelineTwitterList list, final String s, final khe khe) throws IOException {
        if (!"displayType".equals(s) && !"listDisplayType".equals(s)) {
            if ("list".equals(s)) {
                list.b = (k8c)LoganSquare.typeConverterFor((Class)k8c.class).parse(khe);
            }
            else if ("id".equals(s)) {
                list.a = khe.T((String)null);
            }
        }
        else {
            list.c = (int)((StringBasedTypeConverter)JsonTimelineTwitterList$$JsonObjectMapper.TWITTER_LIST_DISPLAY_TYPE_CONVERTER).parse(khe);
        }
    }
    
    public JsonTimelineTwitterList parse(final khe khe) throws IOException {
        return _parse(khe);
    }
    
    public void serialize(final JsonTimelineTwitterList list, final tfe tfe, final boolean b) throws IOException {
        _serialize(list, tfe, b);
    }
}
