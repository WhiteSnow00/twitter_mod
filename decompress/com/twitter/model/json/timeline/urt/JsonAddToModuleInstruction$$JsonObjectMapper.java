// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import java.util.Iterator;
import java.util.ArrayList;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAddToModuleInstruction$$JsonObjectMapper extends JsonMapper<JsonAddToModuleInstruction>
{
    public static JsonAddToModuleInstruction _parse(final qhe qhe) throws IOException {
        final JsonAddToModuleInstruction jsonAddToModuleInstruction = new JsonAddToModuleInstruction();
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
            parseField(jsonAddToModuleInstruction, d, qhe);
            qhe.m0();
        }
        return jsonAddToModuleInstruction;
    }
    
    public static void _serialize(final JsonAddToModuleInstruction jsonAddToModuleInstruction, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        yfe.u0("moduleEntryId", jsonAddToModuleInstruction.a);
        yfe.u0("moduleItemEntryId", jsonAddToModuleInstruction.b);
        final ArrayList c = jsonAddToModuleInstruction.c;
        if (c != null) {
            final Iterator e = d10.E(yfe, "moduleItems", c);
            while (e.hasNext()) {
                final JsonTimelineModuleItem jsonTimelineModuleItem = e.next();
                if (jsonTimelineModuleItem != null) {
                    JsonTimelineModuleItem$$JsonObjectMapper._serialize(jsonTimelineModuleItem, yfe, true);
                }
            }
            yfe.f();
        }
        yfe.e("prepend", jsonAddToModuleInstruction.d);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonAddToModuleInstruction jsonAddToModuleInstruction, final String s, final qhe qhe) throws IOException {
        if ("moduleEntryId".equals(s)) {
            jsonAddToModuleInstruction.a = qhe.T((String)null);
        }
        else if ("moduleItemEntryId".equals(s)) {
            jsonAddToModuleInstruction.b = qhe.T((String)null);
        }
        else if ("moduleItems".equals(s)) {
            if (qhe.e() == rje.P0) {
                final ArrayList c = new ArrayList();
                while (qhe.i0() != rje.Q0) {
                    final JsonTimelineModuleItem parse = JsonTimelineModuleItem$$JsonObjectMapper._parse(qhe);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonAddToModuleInstruction.c = c;
            }
            else {
                jsonAddToModuleInstruction.c = null;
            }
        }
        else if ("prepend".equals(s)) {
            jsonAddToModuleInstruction.d = qhe.l();
        }
    }
    
    public JsonAddToModuleInstruction parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonAddToModuleInstruction jsonAddToModuleInstruction, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonAddToModuleInstruction, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonAddToModuleInstruction)o, yfe, b);
    }
}
