import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.content.ComponentName;
import android.os.Parcelable;
import android.content.ContextWrapper;
import android.content.Intent;
import java.util.Objects;
import android.app.Activity;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djo
{
    public static final djo a;
    public static final long b;
    
    static {
        a = new djo();
        b = TimeUnit.MINUTES.toMillis(10L);
    }
    
    public static final boolean B() {
        return asa.b().b("voice_rooms_share_nudge_enabled", false);
    }
    
    public static final boolean C() {
        return asa.b().b("android_audio_room_replay_clipping_enabled", false);
    }
    
    public static final boolean D() {
        return asa.b().b("android_audio_room_recording_enabled", false);
    }
    
    public static final boolean E() {
        return asa.b().b("android_audio_room_replay_enabled", false);
    }
    
    public static final boolean G() {
        return asa.b().b("android_audio_room_resume_playback_enabled", false);
    }
    
    public static final boolean H() {
        return asa.b().b("voice_rooms_topics_editing_scheduled_enabled", false);
    }
    
    public static final boolean I() {
        return asa.c().b("android_audio_spacebar_vnext_redesign_enabled", false);
    }
    
    public static final boolean J() {
        return asa.b().b("voice_rooms_topics_browsing_enabled", false);
    }
    
    public static final boolean K() {
        return asa.b().b("voice_rooms_topics_tagging_consumption_enabled", false);
    }
    
    public static final void L(final String s, final Activity activity) {
        czd.f((Object)s, "roomId");
        czd.f((Object)activity, "activity");
        final String f = f(s);
        Objects.requireNonNull(activity);
        final Intent setAction = new Intent().setAction("android.intent.action.SEND");
        setAction.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", ((Context)activity).getPackageName());
        setAction.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", ((Context)activity).getPackageName());
        setAction.addFlags(524288);
        while (true) {
            for (Object baseContext = activity; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper)baseContext).getBaseContext()) {
                if (baseContext instanceof Activity) {
                    final Activity activity2 = (Activity)baseContext;
                    if (activity2 != null) {
                        final ComponentName componentName = activity2.getComponentName();
                        setAction.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
                        setAction.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", (Parcelable)componentName);
                    }
                    setAction.setType("text/plain");
                    setAction.putExtra("android.intent.extra.TEXT", (CharSequence)f);
                    setAction.setAction("android.intent.action.SEND");
                    setAction.removeExtra("android.intent.extra.STREAM");
                    gtp.c(setAction);
                    ((Context)activity).startActivity(Intent.createChooser(setAction, (CharSequence)null));
                    return;
                }
            }
            final Activity activity2 = null;
            continue;
        }
    }
    
    public static final boolean M() {
        final boolean d = D();
        boolean b = false;
        if (d) {
            b = b;
            if (asa.b().b("android_audio_room_recording_speaker_prompt", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean O() {
        return asa.b().b("android_audio_room_clip_settings_enabled", false);
    }
    
    public static final boolean P() {
        return asa.b().b("android_audio_host_reconnect_countdown_enabled", false);
    }
    
    public static final boolean Q(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final boolean x = x();
        boolean b2;
        final boolean b = b2 = false;
        if (x) {
            b2 = b;
            if (asa.b().b("android_audio_room_recording_host_nux_enabled", false)) {
                b2 = b;
                if (R("host_infinite_recording_space", userIdentifier)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final boolean R(final String s, final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final mra d = mra.d(s, userIdentifier);
        final boolean c = d.c();
        if (c) {
            d.b();
        }
        return c;
    }
    
    public static final boolean S() {
        return asa.b().b("voice_rooms_replay_ended_flow_speaker_modal_enabled", false);
    }
    
    public static final boolean a() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("android_audio_room_creation_enabled", false) || asa.b().b("android_audio_room_fleets_consumption_enabled", false)) {
            b2 = true;
        }
        return b2;
    }
    
    public static final int b() {
        return asa.b().f("voice_rooms_emoji_version", 0);
    }
    
    public static final Integer c() {
        wk0.b().a();
        return null;
    }
    
    public static final int d() {
        return asa.b().f("android_audio_room_max_speakers", 10);
    }
    
    public static final int e() {
        return asa.b().f("voice_rooms_card_version", 0);
    }
    
    public static final String f(final String s) {
        czd.f((Object)s, "roomID");
        final StringBuilder sb = new StringBuilder();
        sb.append("https://twitter.com/i/spaces/");
        sb.append(s);
        return sb.toString();
    }
    
    public static final boolean g() {
        return asa.b().b("android_audio_room_raised_hands_enabled", false);
    }
    
    public static final boolean h() {
        return b() >= 3;
    }
    
    public static final boolean i() {
        return asa.b().b("voice_rooms_accept_invite_nudge_enabled", false);
    }
    
    public static final boolean j() {
        return asa.b().b("android_audio_room_scheduling_enabled", false);
    }
    
    public static final boolean k(final Long n) {
        if (n != null) {
            final m4s a = hq1.a;
            if (System.currentTimeMillis() - n >= djo.b) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean l() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("android_audio_share_listening_with_followers_setting_enabled", false) || asa.b().b("android_audio_history_management_enabled", false)) {
            b2 = true;
        }
        return b2;
    }
    
    public static final boolean m() {
        return asa.b().b("android_audio_stations_tab_enabled", false);
    }
    
    public static final boolean n() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("android_audio_spaces_tab_enabled", false)) {
            b2 = b2;
            if (!m()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean o() {
        return asa.b().b("android_audio_rooms_notif_skip_preview_enabled", false);
    }
    
    public static final boolean p() {
        return asa.b().b("android_audio_room_cohosts_enabled", false);
    }
    
    public static final boolean q() {
        return asa.b().b("spaces_2022_h2_spaces_communities_creation_enabled", false);
    }
    
    public static final boolean r() {
        return asa.b().b("spaces_2022_h2_spaces_communities", false);
    }
    
    public static final boolean s() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("android_audio_spaces_enable_dm_invite_sheet", false)) {
            b2 = b2;
            if (asa.b().b("android_audio_spaces_enable_dm_invite_sheet_in_creation", false)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final boolean t() {
        return asa.b().b("android_audio_show_end_screen_speaker_list", false);
    }
    
    public static final boolean u() {
        return asa.b().b("android_audio_room_use_graphql", false);
    }
    
    public static final boolean v() {
        return asa.b().b("android_audio_host_reconnect_enabled", false);
    }
    
    public static final boolean w() {
        final boolean x = x();
        boolean b = false;
        if (x) {
            b = b;
            if (asa.b().b("android_audio_room_host_recording_edit_enabled", false)) {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean x() {
        return asa.b().b("android_audio_room_host_recording_enabled", false);
    }
    
    public static final boolean y() {
        return asa.b().b("android_audio_room_live_clipping_enabled", false);
    }
    
    public static final boolean z() {
        return asa.b().b("android_audio_room_live_clip_consumption_enabled", false);
    }
    
    public final boolean A() {
        return asa.b().b("spaces_2022_h2_multi_scheduled", false);
    }
    
    public final boolean F() {
        final fmv b = asa.b();
        boolean b2 = false;
        if (b.b("android_audio_resume_playback_quality_listen_basic_card", false)) {
            b2 = b2;
            if (G()) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean N() {
        return !q3j.M() && h91.d().a() >= 2014;
    }
}
