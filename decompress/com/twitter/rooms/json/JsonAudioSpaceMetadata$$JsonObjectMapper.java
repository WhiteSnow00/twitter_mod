// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.bluelinelabs.logansquare.LoganSquare;
import java.io.IOException;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonAudioSpaceMetadata$$JsonObjectMapper extends JsonMapper<JsonAudioSpaceMetadata>
{
    public static JsonAudioSpaceMetadata _parse(final tge tge) throws IOException {
        final JsonAudioSpaceMetadata jsonAudioSpaceMetadata = new JsonAudioSpaceMetadata();
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
            parseField(jsonAudioSpaceMetadata, d, tge);
            tge.l0();
        }
        return jsonAudioSpaceMetadata;
    }
    
    public static void _serialize(final JsonAudioSpaceMetadata jsonAudioSpaceMetadata, final afe afe, final boolean b) throws IOException {
        if (b) {
            afe.q0();
        }
        final List y = jsonAudioSpaceMetadata.y;
        if (y != null) {
            final Iterator g = hee.g(afe, "admin_twitter_user_ids", y);
            while (g.hasNext()) {
                afe.r0((String)g.next());
            }
            afe.f();
        }
        final List x = jsonAudioSpaceMetadata.x;
        if (x != null) {
            final Iterator g2 = hee.g(afe, "admin_user_ids", x);
            while (g2.hasNext()) {
                afe.r0((String)g2.next());
            }
            afe.f();
        }
        afe.t0("broadcast_id", jsonAudioSpaceMetadata.a);
        afe.t0("canceled_at", jsonAudioSpaceMetadata.n);
        if (jsonAudioSpaceMetadata.T != null) {
            LoganSquare.typeConverterFor((Class)ds5.class).serialize((Object)jsonAudioSpaceMetadata.T, "community_results", true, afe);
        }
        afe.T("conversation_controls", jsonAudioSpaceMetadata.b);
        afe.V("created_at", jsonAudioSpaceMetadata.c);
        if (jsonAudioSpaceMetadata.h != null) {
            LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)jsonAudioSpaceMetadata.h, "creator_results", true, afe);
        }
        afe.e("disallow_join", jsonAudioSpaceMetadata.M);
        afe.e("is_employee_only", jsonAudioSpaceMetadata.e);
        afe.e("enable_server_audio_transcription", jsonAudioSpaceMetadata.s);
        afe.V("ended_at", jsonAudioSpaceMetadata.O);
        afe.V("expected_timeout", (long)jsonAudioSpaceMetadata.H);
        final List k = jsonAudioSpaceMetadata.K;
        if (k != null) {
            final Iterator g3 = hee.g(afe, "guests", k);
            while (g3.hasNext()) {
                final s21 s21 = g3.next();
                if (s21 != null) {
                    LoganSquare.typeConverterFor((Class)s21.class).serialize((Object)s21, "lslocalguestsElement", false, afe);
                }
            }
            afe.f();
        }
        if (jsonAudioSpaceMetadata.J != null) {
            LoganSquare.typeConverterFor((Class)s21.class).serialize((Object)jsonAudioSpaceMetadata.J, "host", true, afe);
        }
        afe.e("host_ready_for_kudos", jsonAudioSpaceMetadata.Q);
        afe.e("is_locked", jsonAudioSpaceMetadata.f);
        afe.T("max_admin_capacity", jsonAudioSpaceMetadata.t);
        afe.t0("media_key", jsonAudioSpaceMetadata.g);
        final List z = jsonAudioSpaceMetadata.z;
        if (z != null) {
            final Iterator g4 = hee.g(afe, "mentioned_twitter_user_ids", z);
            while (g4.hasNext()) {
                afe.r0((String)g4.next());
            }
            afe.f();
        }
        final List i = jsonAudioSpaceMetadata.i;
        if (i != null) {
            final Iterator g5 = hee.g(afe, "mentioned_users_results", i);
            while (g5.hasNext()) {
                final kiw kiw = g5.next();
                if (kiw != null) {
                    LoganSquare.typeConverterFor((Class)kiw.class).serialize((Object)kiw, "lslocalmentioned_users_resultsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.e("is_muted", jsonAudioSpaceMetadata.m);
        afe.T("narrow_cast_space_type", jsonAudioSpaceMetadata.R);
        afe.e("not_available_for_rank", jsonAudioSpaceMetadata.P);
        final List w = jsonAudioSpaceMetadata.w;
        if (w != null) {
            final Iterator g6 = hee.g(afe, "pending_admin_twitter_user_ids", w);
            while (g6.hasNext()) {
                afe.r0((String)g6.next());
            }
            afe.f();
        }
        final List v = jsonAudioSpaceMetadata.v;
        if (v != null) {
            final Iterator g7 = hee.g(afe, "pending_admin_user_ids", v);
            while (g7.hasNext()) {
                afe.r0((String)g7.next());
            }
            afe.f();
        }
        afe.t0("primary_admin_user_id", jsonAudioSpaceMetadata.u);
        afe.V("refunded_at", (long)jsonAudioSpaceMetadata.I);
        afe.V("replay_start_time", jsonAudioSpaceMetadata.N);
        afe.V("scheduled_start", (long)jsonAudioSpaceMetadata.l);
        afe.e("is_space_available_for_clipping", jsonAudioSpaceMetadata.G);
        afe.e("is_space_available_for_replay", jsonAudioSpaceMetadata.F);
        afe.V("start", jsonAudioSpaceMetadata.d);
        afe.t0("state", jsonAudioSpaceMetadata.j);
        afe.T("subscriber_count", jsonAudioSpaceMetadata.S);
        afe.t0("ticket_group_id", jsonAudioSpaceMetadata.B);
        afe.T("tickets_sold", jsonAudioSpaceMetadata.C);
        afe.T("tickets_total", jsonAudioSpaceMetadata.A);
        afe.t0("title", jsonAudioSpaceMetadata.k);
        final List d = jsonAudioSpaceMetadata.D;
        if (d != null) {
            final Iterator g8 = hee.g(afe, "topics", d);
            while (g8.hasNext()) {
                final o21 o21 = g8.next();
                if (o21 != null) {
                    LoganSquare.typeConverterFor((Class)o21.class).serialize((Object)o21, "lslocaltopicsElement", false, afe);
                }
            }
            afe.f();
        }
        afe.T("total_live_listeners", jsonAudioSpaceMetadata.q);
        afe.T("total_participated", jsonAudioSpaceMetadata.p);
        afe.T("total_participating", jsonAudioSpaceMetadata.o);
        afe.T("total_replay_watched", jsonAudioSpaceMetadata.r);
        afe.e("is_trending", jsonAudioSpaceMetadata.L);
        if (jsonAudioSpaceMetadata.E != null) {
            LoganSquare.typeConverterFor((Class)k31.class).serialize((Object)jsonAudioSpaceMetadata.E, "tweet_results", true, afe);
        }
        if (b) {
            afe.h();
        }
    }
    
    public static void parseField(final JsonAudioSpaceMetadata jsonAudioSpaceMetadata, String t, final tge tge) throws IOException {
        final boolean equals = "admin_twitter_user_ids".equals(t);
        final Long n = null;
        final Long n2 = null;
        final Long n3 = null;
        if (equals) {
            if (tge.e() == vie.N0) {
                final ArrayList y = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t2 = tge.T((String)null);
                    if (t2 != null) {
                        y.add(t2);
                    }
                }
                jsonAudioSpaceMetadata.y = y;
            }
            else {
                jsonAudioSpaceMetadata.y = null;
            }
        }
        else if ("admin_user_ids".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList x = new ArrayList();
                while (tge.h0() != vie.O0) {
                    t = tge.T((String)null);
                    if (t != null) {
                        x.add(t);
                    }
                }
                jsonAudioSpaceMetadata.x = x;
            }
            else {
                jsonAudioSpaceMetadata.x = null;
            }
        }
        else if ("broadcast_id".equals(t)) {
            jsonAudioSpaceMetadata.a = tge.T((String)null);
        }
        else if ("canceled_at".equals(t)) {
            jsonAudioSpaceMetadata.n = tge.T((String)null);
        }
        else if ("community_results".equals(t)) {
            jsonAudioSpaceMetadata.T = (ds5)LoganSquare.typeConverterFor((Class)ds5.class).parse(tge);
        }
        else if ("conversation_controls".equals(t)) {
            jsonAudioSpaceMetadata.b = tge.y();
        }
        else if ("created_at".equals(t)) {
            jsonAudioSpaceMetadata.c = tge.K();
        }
        else if ("creator_results".equals(t)) {
            jsonAudioSpaceMetadata.h = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
        }
        else if ("disallow_join".equals(t)) {
            jsonAudioSpaceMetadata.M = tge.k();
        }
        else if ("is_employee_only".equals(t)) {
            jsonAudioSpaceMetadata.e = tge.k();
        }
        else if ("enable_server_audio_transcription".equals(t)) {
            jsonAudioSpaceMetadata.s = tge.k();
        }
        else if ("ended_at".equals(t)) {
            jsonAudioSpaceMetadata.O = tge.K();
        }
        else if ("expected_timeout".equals(t)) {
            Long value;
            if (tge.e() == vie.V0) {
                value = n3;
            }
            else {
                value = tge.K();
            }
            jsonAudioSpaceMetadata.H = value;
        }
        else if ("guests".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList k = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final s21 s21 = (s21)LoganSquare.typeConverterFor((Class)s21.class).parse(tge);
                    if (s21 != null) {
                        k.add(s21);
                    }
                }
                jsonAudioSpaceMetadata.K = k;
            }
            else {
                jsonAudioSpaceMetadata.K = null;
            }
        }
        else if ("host".equals(t)) {
            jsonAudioSpaceMetadata.J = (s21)LoganSquare.typeConverterFor((Class)s21.class).parse(tge);
        }
        else if ("host_ready_for_kudos".equals(t)) {
            jsonAudioSpaceMetadata.Q = tge.k();
        }
        else if ("is_locked".equals(t)) {
            jsonAudioSpaceMetadata.f = tge.k();
        }
        else if ("max_admin_capacity".equals(t)) {
            jsonAudioSpaceMetadata.t = tge.y();
        }
        else if ("media_key".equals(t)) {
            jsonAudioSpaceMetadata.g = tge.T((String)null);
        }
        else if ("mentioned_twitter_user_ids".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList z = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t3 = tge.T((String)null);
                    if (t3 != null) {
                        z.add(t3);
                    }
                }
                jsonAudioSpaceMetadata.z = z;
            }
            else {
                jsonAudioSpaceMetadata.z = null;
            }
        }
        else if ("mentioned_users_results".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList i = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final kiw kiw = (kiw)LoganSquare.typeConverterFor((Class)kiw.class).parse(tge);
                    if (kiw != null) {
                        i.add(kiw);
                    }
                }
                jsonAudioSpaceMetadata.i = i;
            }
            else {
                jsonAudioSpaceMetadata.i = null;
            }
        }
        else if ("is_muted".equals(t)) {
            jsonAudioSpaceMetadata.m = tge.k();
        }
        else if ("narrow_cast_space_type".equals(t)) {
            jsonAudioSpaceMetadata.R = tge.y();
        }
        else if ("not_available_for_rank".equals(t)) {
            jsonAudioSpaceMetadata.P = tge.k();
        }
        else if ("pending_admin_twitter_user_ids".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList w = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t4 = tge.T((String)null);
                    if (t4 != null) {
                        w.add(t4);
                    }
                }
                jsonAudioSpaceMetadata.w = w;
            }
            else {
                jsonAudioSpaceMetadata.w = null;
            }
        }
        else if ("pending_admin_user_ids".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList v = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final String t5 = tge.T((String)null);
                    if (t5 != null) {
                        v.add(t5);
                    }
                }
                jsonAudioSpaceMetadata.v = v;
            }
            else {
                jsonAudioSpaceMetadata.v = null;
            }
        }
        else if ("primary_admin_user_id".equals(t)) {
            jsonAudioSpaceMetadata.u = tge.T((String)null);
        }
        else if ("refunded_at".equals(t)) {
            Long value2;
            if (tge.e() == vie.V0) {
                value2 = n;
            }
            else {
                value2 = tge.K();
            }
            jsonAudioSpaceMetadata.I = value2;
        }
        else if ("replay_start_time".equals(t)) {
            jsonAudioSpaceMetadata.N = tge.K();
        }
        else if ("scheduled_start".equals(t)) {
            Long value3;
            if (tge.e() == vie.V0) {
                value3 = n2;
            }
            else {
                value3 = tge.K();
            }
            jsonAudioSpaceMetadata.l = value3;
        }
        else if ("is_space_available_for_clipping".equals(t)) {
            jsonAudioSpaceMetadata.G = tge.k();
        }
        else if ("is_space_available_for_replay".equals(t)) {
            jsonAudioSpaceMetadata.F = tge.k();
        }
        else if ("start".equals(t)) {
            jsonAudioSpaceMetadata.d = tge.K();
        }
        else if ("state".equals(t)) {
            jsonAudioSpaceMetadata.j = tge.T((String)null);
        }
        else if ("subscriber_count".equals(t)) {
            jsonAudioSpaceMetadata.S = tge.y();
        }
        else if ("ticket_group_id".equals(t)) {
            jsonAudioSpaceMetadata.B = tge.T((String)null);
        }
        else if ("tickets_sold".equals(t)) {
            jsonAudioSpaceMetadata.C = tge.y();
        }
        else if ("tickets_total".equals(t)) {
            jsonAudioSpaceMetadata.A = tge.y();
        }
        else if ("title".equals(t)) {
            jsonAudioSpaceMetadata.k = tge.T((String)null);
        }
        else if ("topics".equals(t)) {
            if (tge.e() == vie.N0) {
                final ArrayList d = new ArrayList();
                while (tge.h0() != vie.O0) {
                    final o21 o21 = (o21)LoganSquare.typeConverterFor((Class)o21.class).parse(tge);
                    if (o21 != null) {
                        d.add(o21);
                    }
                }
                jsonAudioSpaceMetadata.D = d;
            }
            else {
                jsonAudioSpaceMetadata.D = null;
            }
        }
        else if ("total_live_listeners".equals(t)) {
            jsonAudioSpaceMetadata.q = tge.y();
        }
        else if ("total_participated".equals(t)) {
            jsonAudioSpaceMetadata.p = tge.y();
        }
        else if ("total_participating".equals(t)) {
            jsonAudioSpaceMetadata.o = tge.y();
        }
        else if ("total_replay_watched".equals(t)) {
            jsonAudioSpaceMetadata.r = tge.y();
        }
        else if ("is_trending".equals(t)) {
            jsonAudioSpaceMetadata.L = tge.k();
        }
        else if ("tweet_results".equals(t)) {
            jsonAudioSpaceMetadata.E = (k31)LoganSquare.typeConverterFor((Class)k31.class).parse(tge);
        }
    }
    
    public JsonAudioSpaceMetadata parse(final tge tge) throws IOException {
        return _parse(tge);
    }
    
    public /* bridge */ Object parse(final tge tge) throws IOException {
        return this.parse(tge);
    }
    
    public void serialize(final JsonAudioSpaceMetadata jsonAudioSpaceMetadata, final afe afe, final boolean b) throws IOException {
        _serialize(jsonAudioSpaceMetadata, afe, b);
    }
    
    public /* bridge */ void serialize(final Object o, final afe afe, final boolean b) throws IOException {
        this.serialize((JsonAudioSpaceMetadata)o, afe, b);
    }
}
