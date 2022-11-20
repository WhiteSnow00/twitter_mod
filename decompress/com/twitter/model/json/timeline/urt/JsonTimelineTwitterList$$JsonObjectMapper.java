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
    public static final ycv TWITTER_LIST_DISPLAY_TYPE_CONVERTER;
    
    static {
        TWITTER_LIST_DISPLAY_TYPE_CONVERTER = new ycv();
    }
    
    public static JsonTimelineTwitterList _parse(final tge tge) throws IOException {
        final JsonTimelineTwitterList list = new JsonTimelineTwitterList();
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
            parseField(list, d, tge);
            tge.l0();
        }
        return list;
    }
    
    public static void _serialize(final JsonTimelineTwitterList list, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        ((StringBasedTypeConverter)JsonTimelineTwitterList$$JsonObjectMapper.TWITTER_LIST_DISPLAY_TYPE_CONVERTER).serialize((Object)list.c, "displayType", true, afe);
        if (list.b != null) {
            LoganSquare.typeConverterFor((Class)l7c.class).serialize((Object)list.b, "list", true, afe);
        }
        afe.t0("id", list.a);
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonTimelineTwitterList list, final String s, final tge tge) throws IOException {
        if (!"displayType".equals(s) && !"listDisplayType".equals(s)) {
            if ("list".equals(s)) {
                list.b = (l7c)LoganSquare.typeConverterFor((Class)l7c.class).parse(tge);
            }
            else if ("id".equals(s)) {
                list.a = tge.T((String)null);
            }
        }
        else {
            list.c = (int)((StringBasedTypeConverter)JsonTimelineTwitterList$$JsonObjectMapper.TWITTER_LIST_DISPLAY_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonTimelineTwitterList parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonTimelineTwitterList list, final afe afe, final boolean b) throws IOException {
        _serialize(list, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonTimelineTwitterList)o, afe, b);
    }
}
