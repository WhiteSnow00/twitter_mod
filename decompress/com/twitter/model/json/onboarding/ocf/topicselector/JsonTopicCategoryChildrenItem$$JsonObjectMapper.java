// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTopicCategoryChildrenItem$$JsonObjectMapper extends JsonMapper<JsonTopicCategoryChildrenItem>
{
    public static final zlt TOPIC_CHILDREN_TYPE_CONVERTER;
    
    static {
        TOPIC_CHILDREN_TYPE_CONVERTER = new zlt();
    }
    
    public static JsonTopicCategoryChildrenItem _parse(final qhe qhe) throws IOException {
        final JsonTopicCategoryChildrenItem jsonTopicCategoryChildrenItem = new JsonTopicCategoryChildrenItem();
        if (qhe.e() == null) {
            qhe.i0();
        }
        if (qhe.e() != rje.N0) {
            qhe.m0();
            return null;
        }
        while (qhe.i0() != rje.O0) {
            final String d = qhe.d();
            qhe.i0();
            parseField(jsonTopicCategoryChildrenItem, d, qhe);
            qhe.m0();
        }
        return jsonTopicCategoryChildrenItem;
    }
    
    public static void _serialize(final JsonTopicCategoryChildrenItem jsonTopicCategoryChildrenItem, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("id", jsonTopicCategoryChildrenItem.a);
        ((StringBasedTypeConverter)JsonTopicCategoryChildrenItem$$JsonObjectMapper.TOPIC_CHILDREN_TYPE_CONVERTER).serialize((Object)jsonTopicCategoryChildrenItem.b, "type", true, yfe);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTopicCategoryChildrenItem jsonTopicCategoryChildrenItem, final String s, final qhe qhe) throws IOException {
        if ("id".equals(s)) {
            jsonTopicCategoryChildrenItem.a = qhe.T((String)null);
        }
        else if ("type".equals(s)) {
            jsonTopicCategoryChildrenItem.b = (int)((StringBasedTypeConverter)JsonTopicCategoryChildrenItem$$JsonObjectMapper.TOPIC_CHILDREN_TYPE_CONVERTER).parse(qhe);
        }
    }
    
    public JsonTopicCategoryChildrenItem parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTopicCategoryChildrenItem jsonTopicCategoryChildrenItem, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTopicCategoryChildrenItem, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTopicCategoryChildrenItem)o, yfe, b);
    }
}
