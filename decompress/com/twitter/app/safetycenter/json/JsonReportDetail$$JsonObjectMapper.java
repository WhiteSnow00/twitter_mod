// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetycenter.json;

import com.bluelinelabs.logansquare.typeconverters.StringBasedTypeConverter;
import java.util.List;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonReportDetail$$JsonObjectMapper extends JsonMapper<JsonReportDetail>
{
    public static final tkf LIST_OF_REPORT_ENTITY_RESULT_UNION_CONVERTER;
    public static final ukf LIST_OF_REPORT_ENTITY_UNION_CONVERTER;
    public static final alm REPORT_STATUS_TYPE_CONVERTER;
    public static final dlm REPORT_TYPE_TYPE_CONVERTER;
    public static final tqw VERDICT_TYPE_CONVERTER;
    
    static {
        VERDICT_TYPE_CONVERTER = new tqw();
        REPORT_STATUS_TYPE_CONVERTER = new alm();
        LIST_OF_REPORT_ENTITY_UNION_CONVERTER = new ukf();
        LIST_OF_REPORT_ENTITY_RESULT_UNION_CONVERTER = new tkf();
        REPORT_TYPE_TYPE_CONVERTER = new dlm();
    }
    
    public static JsonReportDetail _parse(final tge tge) throws IOException {
        final JsonReportDetail jsonReportDetail = new JsonReportDetail();
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
            parseField(jsonReportDetail, d, tge);
            tge.l0();
        }
        return jsonReportDetail;
    }
    
    public static void _serialize(final JsonReportDetail jsonReportDetail, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final clm a = jsonReportDetail.a;
        if (a != null) {
            ((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.REPORT_TYPE_TYPE_CONVERTER).serialize((Object)a, "actioned_report_type", true, afe);
        }
        afe.t0("header", jsonReportDetail.b);
        afe.t0("last_update_time", jsonReportDetail.c);
        afe.t0("outcome_text", jsonReportDetail.d);
        final List<Object> f = jsonReportDetail.f;
        if (f != null) {
            ((amf)JsonReportDetail$$JsonObjectMapper.LIST_OF_REPORT_ENTITY_UNION_CONVERTER).b((List)f, "report_entities", afe);
        }
        final List<Object> g = jsonReportDetail.g;
        if (g != null) {
            ((amf)JsonReportDetail$$JsonObjectMapper.LIST_OF_REPORT_ENTITY_RESULT_UNION_CONVERTER).b((List)g, "report_entities_results", afe);
        }
        afe.t0("report_flow_id", jsonReportDetail.h);
        final zkm e = jsonReportDetail.e;
        if (e != null) {
            ((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.REPORT_STATUS_TYPE_CONVERTER).serialize((Object)e, "report_status", true, afe);
        }
        afe.t0("rule_link", jsonReportDetail.i);
        final rqw j = jsonReportDetail.j;
        if (j != null) {
            ((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.VERDICT_TYPE_CONVERTER).serialize((Object)j, "verdict", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonReportDetail jsonReportDetail, final String s, final tge tge) throws IOException {
        if ("actioned_report_type".equals(s)) {
            jsonReportDetail.a = (clm)((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.REPORT_TYPE_TYPE_CONVERTER).parse(tge);
        }
        else if ("header".equals(s)) {
            jsonReportDetail.b = tge.T((String)null);
        }
        else if ("last_update_time".equals(s)) {
            jsonReportDetail.c = tge.T((String)null);
        }
        else if ("outcome_text".equals(s)) {
            jsonReportDetail.d = tge.T((String)null);
        }
        else if ("report_entities".equals(s)) {
            jsonReportDetail.f = ((amf)JsonReportDetail$$JsonObjectMapper.LIST_OF_REPORT_ENTITY_UNION_CONVERTER).a(tge);
        }
        else if ("report_entities_results".equals(s)) {
            jsonReportDetail.g = ((amf)JsonReportDetail$$JsonObjectMapper.LIST_OF_REPORT_ENTITY_RESULT_UNION_CONVERTER).a(tge);
        }
        else if ("report_flow_id".equals(s)) {
            jsonReportDetail.h = tge.T((String)null);
        }
        else if ("report_status".equals(s)) {
            jsonReportDetail.e = (zkm)((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.REPORT_STATUS_TYPE_CONVERTER).parse(tge);
        }
        else if ("rule_link".equals(s)) {
            jsonReportDetail.i = tge.T((String)null);
        }
        else if ("verdict".equals(s)) {
            jsonReportDetail.j = (rqw)((StringBasedTypeConverter)JsonReportDetail$$JsonObjectMapper.VERDICT_TYPE_CONVERTER).parse(tge);
        }
    }
    
    public JsonReportDetail parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonReportDetail jsonReportDetail, final afe afe, final boolean b) throws IOException {
        _serialize(jsonReportDetail, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonReportDetail)o, afe, b);
    }
}
