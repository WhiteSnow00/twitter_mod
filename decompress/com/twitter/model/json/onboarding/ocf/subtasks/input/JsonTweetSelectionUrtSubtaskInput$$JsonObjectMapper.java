// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetSelectionUrtSubtaskInput$$JsonObjectMapper extends JsonMapper<JsonTweetSelectionUrtSubtaskInput>
{
    public static JsonTweetSelectionUrtSubtaskInput _parse(final qhe qhe) throws IOException {
        final JsonTweetSelectionUrtSubtaskInput jsonTweetSelectionUrtSubtaskInput = new JsonTweetSelectionUrtSubtaskInput();
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
            parseField(jsonTweetSelectionUrtSubtaskInput, d, qhe);
            qhe.m0();
        }
        return jsonTweetSelectionUrtSubtaskInput;
    }
    
    public static void _serialize(final JsonTweetSelectionUrtSubtaskInput jsonTweetSelectionUrtSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        if (b) {
            yfe.r0();
        }
        final Set b2 = jsonTweetSelectionUrtSubtaskInput.b;
        if (b2 != null) {
            yfe.i("selected_tweet_ids");
            yfe.q0();
            final Iterator iterator = b2.iterator();
            while (iterator.hasNext()) {
                yfe.r((long)iterator.next());
            }
            yfe.f();
        }
        JsonDefaultSubtaskInput$$JsonObjectMapper._serialize((JsonDefaultSubtaskInput)jsonTweetSelectionUrtSubtaskInput, yfe, false);
        if (b) {
            yfe.h();
        }
    }
    
    public static void parseField(final JsonTweetSelectionUrtSubtaskInput jsonTweetSelectionUrtSubtaskInput, final String s, final qhe qhe) throws IOException {
        if ("selected_tweet_ids".equals(s)) {
            if (qhe.e() == rje.P0) {
                final HashSet b = new HashSet();
                while (qhe.i0() != rje.Q0) {
                    Long value;
                    if (qhe.e() == rje.X0) {
                        value = null;
                    }
                    else {
                        value = qhe.L();
                    }
                    if (value != null) {
                        b.add(value);
                    }
                }
                jsonTweetSelectionUrtSubtaskInput.b = b;
            }
            else {
                jsonTweetSelectionUrtSubtaskInput.b = null;
            }
        }
        else {
            JsonDefaultSubtaskInput$$JsonObjectMapper.parseField((JsonDefaultSubtaskInput)jsonTweetSelectionUrtSubtaskInput, s, qhe);
        }
    }
    
    public JsonTweetSelectionUrtSubtaskInput parse(final qhe qhe) throws IOException {
        return _parse(qhe);
    }
    
    public /* bridge */ Object parse(final qhe qhe) throws IOException {
        return this.parse(qhe);
    }
    
    public void serialize(final JsonTweetSelectionUrtSubtaskInput jsonTweetSelectionUrtSubtaskInput, final yfe yfe, final boolean b) throws IOException {
        _serialize(jsonTweetSelectionUrtSubtaskInput, yfe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final yfe yfe, final boolean b) throws IOException {
        this.serialize((JsonTweetSelectionUrtSubtaskInput)o, yfe, b);
    }
}
