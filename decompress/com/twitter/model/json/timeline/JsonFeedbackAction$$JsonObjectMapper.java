// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.model.json.timeline.urt.JsonClientEventInfo$$JsonObjectMapper;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonFeedbackAction$$JsonObjectMapper extends JsonMapper<JsonFeedbackAction>
{
    public static final xfe JSON_FEEDBACK_CONFIRMATION_DISPLAY_TYPE_CONVERTER;
    public static final cle JSON_U_R_T_ICON_TYPE_CONVERTER;
    public static final y3t TIMELINE_RICH_FEEDBACK_BEHAVIOR_UNION_CONVERTER;
    
    static {
        JSON_U_R_T_ICON_TYPE_CONVERTER = new cle();
        TIMELINE_RICH_FEEDBACK_BEHAVIOR_UNION_CONVERTER = new y3t();
        JSON_FEEDBACK_CONFIRMATION_DISPLAY_TYPE_CONVERTER = new xfe();
    }
    
    public static JsonFeedbackAction _parse(final qhe qhe) throws IOException {
        final JsonFeedbackAction jsonFeedbackAction = new JsonFeedbackAction();
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
            parseField(jsonFeedbackAction, d, qhe);
            qhe.m0();
        }
        return jsonFeedbackAction;
    }
    
    public static void _serialize(final JsonFeedbackAction jsonFeedbackAction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final ArrayList g = jsonFeedbackAction.g;
        if (g != null) {
            final Iterator e = d10.E(yfe, "childKeys", g);
            while (e.hasNext()) {
                yfe.s0((String)e.next());
            }
            yfe.f();
        }
        if (jsonFeedbackAction.i != null) {
            yfe.i("clientEventInfo");
            JsonClientEventInfo$$JsonObjectMapper._serialize(jsonFeedbackAction.i, yfe, true);
        }
        yfe.u0("confirmation", jsonFeedbackAction.c);
        ((StringBasedTypeConverter)JsonFeedbackAction$$JsonObjectMapper.JSON_FEEDBACK_CONFIRMATION_DISPLAY_TYPE_CONVERTER).serialize((Object)jsonFeedbackAction.h, "confirmationDisplayType", true, yfe);
        yfe.u0("encodedFeedbackRequest", jsonFeedbackAction.d);
        yfe.u0("feedbackType", jsonFeedbackAction.a);
        yfe.u0("feedbackUrl", jsonFeedbackAction.e);
        yfe.e("hasUndoAction", jsonFeedbackAction.f);
        final dqv j = jsonFeedbackAction.j;
        if (j != null) {
            JsonFeedbackAction$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.serialize((Object)j, "icon", true, yfe);
        }
        yfe.u0("prompt", jsonFeedbackAction.b);
        final o3t k = jsonFeedbackAction.k;
        if (k == null) {
            if (b) {
                yfe.h();
            }
            return;
        }
        ((nxj)JsonFeedbackAction$$JsonObjectMapper.TIMELINE_RICH_FEEDBACK_BEHAVIOR_UNION_CONVERTER).serialize((Object)k, "richBehavior", true, yfe);
        throw null;
    }
    
    public static void parseField(final JsonFeedbackAction jsonFeedbackAction, final String s, final qhe qhe) throws IOException {
        if ("childKeys".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList g = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final String t = qhe.T((String)null);
                    if (t != null) {
                        g.add(t);
                    }
                }
                jsonFeedbackAction.g = g;
            }
            else {
                jsonFeedbackAction.g = null;
            }
        }
        else if ("clientEventInfo".equals(s)) {
            jsonFeedbackAction.i = JsonClientEventInfo$$JsonObjectMapper._parse(qhe);
        }
        else if ("confirmation".equals(s)) {
            jsonFeedbackAction.c = qhe.T((String)null);
        }
        else if ("confirmationDisplayType".equals(s)) {
            jsonFeedbackAction.h = (int)((StringBasedTypeConverter)JsonFeedbackAction$$JsonObjectMapper.JSON_FEEDBACK_CONFIRMATION_DISPLAY_TYPE_CONVERTER).parse(qhe);
        }
        else if ("encodedFeedbackRequest".equals(s)) {
            jsonFeedbackAction.d = qhe.T((String)null);
        }
        else if ("feedbackType".equals(s)) {
            jsonFeedbackAction.a = qhe.T((String)null);
        }
        else if ("feedbackUrl".equals(s)) {
            jsonFeedbackAction.e = qhe.T((String)null);
        }
        else if ("hasUndoAction".equals(s)) {
            jsonFeedbackAction.f = qhe.l();
        }
        else if ("icon".equals(s)) {
            jsonFeedbackAction.j = (dqv)JsonFeedbackAction$$JsonObjectMapper.JSON_U_R_T_ICON_TYPE_CONVERTER.parse(qhe);
        }
        else if ("prompt".equals(s)) {
            jsonFeedbackAction.b = qhe.T((String)null);
        }
        else if ("richBehavior".equals(s)) {
            jsonFeedbackAction.k = ((fge<o3t>)JsonFeedbackAction$$JsonObjectMapper.TIMELINE_RICH_FEEDBACK_BEHAVIOR_UNION_CONVERTER).parse(qhe);
        }
    }
    
    public JsonFeedbackAction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonFeedbackAction jsonFeedbackAction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonFeedbackAction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonFeedbackAction)o, yfe, b);
    }
}
