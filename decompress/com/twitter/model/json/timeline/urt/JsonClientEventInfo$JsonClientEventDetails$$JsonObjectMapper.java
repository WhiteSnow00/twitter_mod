// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonClientEventInfo$JsonClientEventDetails$$JsonObjectMapper extends JsonMapper<JsonClientEventInfo.JsonClientEventDetails>
{
    public static JsonClientEventInfo.JsonClientEventDetails _parse(final qhe qhe) throws IOException {
        final JsonClientEventInfo.JsonClientEventDetails jsonClientEventDetails = new JsonClientEventInfo.JsonClientEventDetails();
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
            parseField(jsonClientEventDetails, d, qhe);
            qhe.m0();
        }
        return jsonClientEventDetails;
    }
    
    public static void _serialize(final JsonClientEventInfo.JsonClientEventDetails jsonClientEventDetails, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        if (jsonClientEventDetails.i != null) {
            yfe.i("articleDetails");
            JsonClientEventInfo$JsonArticleDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.i, yfe, true);
        }
        if (jsonClientEventDetails.f != null) {
            yfe.i("conversationDetails");
            JsonClientEventInfo$JsonConversationDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.f, yfe, true);
        }
        if (jsonClientEventDetails.g != null) {
            yfe.i("guideDetails");
            JsonClientEventInfo$JsonGuideDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.g, yfe, true);
        }
        if (jsonClientEventDetails.d != null) {
            yfe.i("liveEventDetails");
            JsonClientEventInfo$JsonLiveEventDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.d, yfe, true);
        }
        if (jsonClientEventDetails.c != null) {
            yfe.i("momentsDetails");
            JsonClientEventInfo$JsonMomentsDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.c, yfe, true);
        }
        if (jsonClientEventDetails.h != null) {
            yfe.i("notificationDetails");
            JsonClientEventInfo$JsonNotificationDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.h, yfe, true);
        }
        if (jsonClientEventDetails.e != null) {
            yfe.i("periscopeDetails");
            JsonClientEventInfo$JsonPeriscopeDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.e, yfe, true);
        }
        if (jsonClientEventDetails.a != null) {
            yfe.i("timelinesDetails");
            JsonClientEventInfo$JsonTimelinesDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.a, yfe, true);
        }
        if (jsonClientEventDetails.b != null) {
            yfe.i("trendsDetails");
            JsonClientEventInfo$JsonTrendDetails$$JsonObjectMapper._serialize(jsonClientEventDetails.b, yfe, true);
        }
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonClientEventInfo.JsonClientEventDetails jsonClientEventDetails, final String s, final qhe qhe) throws IOException {
        if ("articleDetails".equals(s)) {
            jsonClientEventDetails.i = JsonClientEventInfo$JsonArticleDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("conversationDetails".equals(s)) {
            jsonClientEventDetails.f = JsonClientEventInfo$JsonConversationDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("guideDetails".equals(s)) {
            jsonClientEventDetails.g = JsonClientEventInfo$JsonGuideDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("liveEventDetails".equals(s)) {
            jsonClientEventDetails.d = JsonClientEventInfo$JsonLiveEventDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("momentsDetails".equals(s)) {
            jsonClientEventDetails.c = JsonClientEventInfo$JsonMomentsDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("notificationDetails".equals(s)) {
            jsonClientEventDetails.h = JsonClientEventInfo$JsonNotificationDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("periscopeDetails".equals(s)) {
            jsonClientEventDetails.e = JsonClientEventInfo$JsonPeriscopeDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("timelinesDetails".equals(s)) {
            jsonClientEventDetails.a = JsonClientEventInfo$JsonTimelinesDetails$$JsonObjectMapper._parse(qhe);
        }
        else if ("trendsDetails".equals(s)) {
            jsonClientEventDetails.b = JsonClientEventInfo$JsonTrendDetails$$JsonObjectMapper._parse(qhe);
        }
    }
    
    public JsonClientEventInfo.JsonClientEventDetails parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonClientEventInfo.JsonClientEventDetails jsonClientEventDetails, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonClientEventDetails, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonClientEventInfo.JsonClientEventDetails)o, yfe, b);
    }
}
