import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import android.os.Build$VERSION;
import android.media.AudioManager;
import java.util.List;
import java.util.Objects;
import tv.periscope.model.NarrowcastSpaceType$None;
import tv.periscope.model.NarrowcastSpaceType;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vjo implements v5o
{
    public static final vjo.vjo$a Companion;
    public final cbw a;
    public final v01 b;
    public final Context c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public NarrowcastSpaceType i;
    public boolean j;
    public boolean k;
    public String l;
    
    static {
        Companion = new vjo.vjo$a();
    }
    
    public vjo(final cbw a, final v01 b, final Context c) {
        czd.f((Object)a, "userEventReporter");
        czd.f((Object)b, "spaceComponentPrefixDispatcher");
        czd.f((Object)c, "applicationContext");
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = (NarrowcastSpaceType)NarrowcastSpaceType$None.INSTANCE;
    }
    
    public static void F(final vjo vjo, final String s, final String s2, final String s3, gfv gfv, String s4, final int n) {
        if ((n & 0x8) != 0x0) {
            gfv = null;
        }
        if ((n & 0x10) != 0x0) {
            s4 = null;
        }
        Objects.requireNonNull(vjo);
        vjo.E("", s, s2, s3, gfv, s4);
    }
    
    public static void G(final vjo vjo, final String s, final String s2, final String s3, final String s4, gfv gfv, final int n) {
        if ((n & 0x10) != 0x0) {
            gfv = null;
        }
        vjo.E(s, s2, s3, s4, gfv, null);
    }
    
    public static void H(final vjo vjo, final String s, final String s2, final String s3, final String s4, final String s5, String s6, String s7, String s8, List list, String s9, Integer n, String s10, boolean b, gfv gfv, Boolean b2, String s11, String s12, String s13, Boolean b3, final int n2) {
        if ((n2 & 0x20) != 0x0) {
            s6 = null;
        }
        if ((n2 & 0x40) != 0x0) {
            s7 = null;
        }
        if ((n2 & 0x80) != 0x0) {
            s8 = null;
        }
        if ((n2 & 0x100) != 0x0) {
            list = null;
        }
        if ((n2 & 0x200) != 0x0) {
            s9 = null;
        }
        if ((n2 & 0x400) != 0x0) {
            n = null;
        }
        if ((n2 & 0x800) != 0x0) {
            s10 = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            b = false;
        }
        if ((n2 & 0x2000) != 0x0) {
            gfv = null;
        }
        if ((n2 & 0x4000) != 0x0) {
            b2 = null;
        }
        if ((0x8000 & n2) != 0x0) {
            s11 = null;
        }
        if ((0x10000 & n2) != 0x0) {
            s12 = null;
        }
        if ((0x20000 & n2) != 0x0) {
            s13 = null;
        }
        if ((n2 & 0x40000) != 0x0) {
            b3 = null;
        }
        Objects.requireNonNull(vjo);
        rw0.c((oj)new ujo(s6, vjo, s7, s8, s2, s3, s4, s5, s, gfv, s9, n, s10, b2, s11, b, b3, s12, s13, list));
    }
    
    public static void T(final vjo vjo, final String s, String m0, String s2, final String s3, String s4, String s5, Integer n, String s6, int i) {
        String s7;
        if ((i & 0x2) != 0x0) {
            s7 = "";
        }
        else {
            s7 = m0;
        }
        String s8;
        if ((i & 0x4) != 0x0) {
            s8 = "";
        }
        else {
            s8 = s2;
        }
        Boolean value = null;
        if ((i & 0x10) != 0x0) {
            s4 = null;
        }
        if ((i & 0x20) != 0x0) {
            s5 = null;
        }
        if ((i & 0x40) != 0x0) {
            n = null;
        }
        if ((i & 0x80) != 0x0) {
            s6 = null;
        }
        final Object systemService = vjo.c.getSystemService("audio");
        czd.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        final AudioManager audioManager = (AudioManager)systemService;
        Boolean b3;
        if (Build$VERSION.SDK_INT >= 23) {
            final AudioDeviceInfo[] devices = audioManager.getDevices(2);
            final boolean b = false;
            if (devices != null) {
                final ArrayList list = new ArrayList<String>(devices.length);
                int length;
                for (length = devices.length, i = 0; i < length; ++i) {
                    list.add(vjo.y(devices[i]));
                }
                m0 = mq4.m0((Iterable)mq4.a0((Iterable)list), (CharSequence)null, (CharSequence)null, (CharSequence)null, (qsb)wjo.D0, 31);
            }
            else {
                m0 = null;
            }
            if (devices != null) {
                final int length2 = devices.length;
                i = 0;
                boolean b2;
                while (true) {
                    b2 = b;
                    if (i >= length2) {
                        break;
                    }
                    if (czd.a((Object)vjo.y(devices[i]), (Object)"builtin") ^ true) {
                        b2 = true;
                        break;
                    }
                    ++i;
                }
                value = b2;
            }
            final String s9 = m0;
            b3 = value;
            s2 = s9;
        }
        else {
            b3 = null;
            s2 = null;
        }
        H(vjo, "audiospace", s, s7, s8, s3, s4, null, null, null, s5, n, s6, false, null, b3, s2, null, null, null, 471232);
    }
    
    public static void b0(final vjo vjo, String s, final String s2, String s3, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        String s4;
        if ((n & 0x2) != 0x0) {
            s4 = "";
        }
        else {
            s4 = null;
        }
        if ((n & 0x8) != 0x0) {
            s3 = null;
        }
        Objects.requireNonNull(vjo);
        List r;
        if (s3 != null) {
            final gfv gfv = new gfv();
            gfv.a = Long.parseLong(s3);
            gfv.c = 36;
            r = s9i.r(gfv);
        }
        else {
            r = null;
        }
        H(vjo, "audiospace", "topics_browse", s, s4, s2, null, null, null, r, null, null, null, false, null, null, null, null, null, null, 524000);
    }
    
    public final String A(final owt owt) {
        final int ordinal = ((Enum)owt).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "replay";
            }
            else {
                s = "";
            }
        }
        else {
            s = "podcast";
        }
        return s;
    }
    
    public final void B(final boolean b) {
        String s;
        if (b) {
            s = "cancel_request";
        }
        else {
            s = "request";
        }
        F(this, "controls", s, "click", null, null, 24);
    }
    
    public final void C(final String s, final int n) {
        czd.f((Object)s, "topicId");
        this.Z(s, n, this.b.d(), "topic", "deselect");
    }
    
    public final void D(final owt owt) {
        H(this, "audiospace", this.A(owt), "", "dock", "click", null, null, null, null, null, null, null, false, null, null, null, null, null, null, 524256);
    }
    
    public final void E(final String s, final String s2, final String s3, final String s4, final gfv gfv, final String s5) {
        H(this, "audiospace", s, s2, s3, s4, null, null, null, null, null, null, null, false, gfv, null, null, s5, null, null, 450528);
    }
    
    public final void I(final String s, final String s2, final boolean b) {
        czd.f((Object)s, "hostTwitterId");
        H(this, "audiospace", "creation", "", "", "impression", null, s, s2, null, null, null, null, false, null, null, null, null, null, b, 261920);
    }
    
    public final void J(final boolean b, final String s, final Boolean b2) {
        if (b) {
            H(this, "audiospace", "event", "join", "listener", "success", null, null, null, null, s, null, null, false, null, null, null, null, null, b2, 261600);
        }
        else {
            G(this, "event", "join", "speaker", "success", null, 48);
        }
    }
    
    public final void K(final String s, final String s2) {
        G(this, "scheduled_spaces", "schedule_list", s, s2, null, 48);
    }
    
    public final void L() {
        H(this, "audiospace", "replay", "recording", "delete", "confirm", null, null, null, null, null, null, null, false, null, null, null, null, null, null, 524256);
    }
    
    public final void M() {
        H(this, "audiospace", "creation", "recording", "toggle", "click", null, null, null, null, null, null, null, false, null, null, null, null, null, null, 524256);
    }
    
    public final void N(final String s) {
        H(this, "audiospace", "replay", "recording", s, "click", null, null, null, null, null, null, null, false, null, null, null, null, null, null, 524256);
    }
    
    public final void O(final qqp qqp) {
        czd.f((Object)qqp, "type");
        if (czd.a((Object)qqp, (Object)qqp.q.b)) {
            this.N("send_tweet");
        }
        else if (czd.a((Object)qqp, (Object)qqp.c.b)) {
            this.N("link");
        }
        else if (czd.a((Object)qqp, (Object)qqp.v.b)) {
            this.N("rules");
        }
        else if (czd.a((Object)qqp, (Object)qqp$w.b)) {
            this.N("view_transcriptions");
        }
        else if (czd.a((Object)qqp, (Object)qqp.n.b)) {
            this.N("report");
        }
        else if (czd.a((Object)qqp, (Object)qqp.o.b)) {
            this.N("send_dm");
        }
    }
    
    public final void P(final String s, final int n) {
        czd.f((Object)s, "topicId");
        this.Z(s, n, this.b.d(), "topic", "select");
    }
    
    public final void Q(final qqp qqp) {
        czd.f((Object)qqp, "type");
        if (czd.a((Object)qqp, (Object)qqp.i.b)) {
            F(this, "share_sheet", "send_dm", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp.q.b)) {
            F(this, "share_sheet", "send_tweet", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp.c.b)) {
            F(this, "share_sheet", "link", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp.p.b)) {
            F(this, "caret", "feedback", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp.v.b)) {
            F(this, "caret", "rules", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp.a.b)) {
            F(this, "caret", "settings", "click", null, null, 24);
        }
        else if (czd.a((Object)qqp, (Object)qqp$w.b)) {
            G(this, "", "caret", "view_transcriptions", "click", null, 48);
        }
        else if (czd.a((Object)qqp, (Object)qqp.n.b)) {
            F(this, "caret", "report", "click", null, null, 24);
        }
        else {
            if (!(qqp instanceof qqp.j)) {
                final boolean b = qqp instanceof qqp.k;
                return;
            }
            final f1a b2 = ((qqp.j)qqp).b;
            czd.f((Object)b2, "emoji");
            G(this, "", "reaction_picker", this.z(b2), "click", null, 48);
        }
    }
    
    public final void R(final owt owt) {
        G(this, this.A(owt), "", "", "impression", null, 48);
    }
    
    public final void S(final boolean b) {
        String s;
        if (b) {
            s = "listener";
        }
        else {
            s = "speaker";
        }
        G(this, "event", "switch", s, "success", null, 48);
    }
    
    public final void U() {
        T(this, this.b.d(), null, null, "impression", null, null, null, null, 502);
    }
    
    public final void V() {
        T(this, this.b.d(), null, "", "pull_to_refresh", null, null, null, null, 498);
    }
    
    public final void W(final String s) {
        czd.f((Object)s, "spaceId");
        T(this, "tab", null, "set_reminder", "click", s, null, null, null, 482);
    }
    
    public final void X(final String s) {
        czd.f((Object)s, "spaceId");
        T(this, "tab", null, "unset_reminder", "click", s, null, null, null, 482);
    }
    
    public final void Y(final boolean b) {
        String s;
        if (b) {
            s = "mute";
        }
        else {
            s = "unmute";
        }
        F(this, "controls", s, "click", null, null, 24);
    }
    
    public final void Z(final String s, final int f, final String s2, final String s3, final String s4) {
        final gfv gfv = new gfv();
        gfv.a = Long.parseLong(s);
        gfv.c = 36;
        gfv.f = f;
        this.a0(s2, s3, s4, s9i.r(gfv));
    }
    
    public final void a() {
        G(this, "periscope", "janus", "subscriber_attach", "failure", null, 48);
    }
    
    public final void a0(final String s, final String s2, final String s3, final List<? extends j0p> list) {
        H(this, "audiospace", s, "utt_topic_carousel", s2, s3, null, null, null, list, null, null, null, false, null, null, null, null, null, null, 524000);
    }
    
    public final void b() {
        G(this, "periscope", "janus", "subscriber_attach", "success", null, 48);
    }
    
    public final void c() {
        G(this, "periscope", "guest", "stream_negotiate", "failure", null, 48);
    }
    
    public final void c0(final Set<String> set) {
        final String d = this.b.d();
        final ArrayList list = new ArrayList<j0p>(iq4.H((Iterable)set, 10));
        for (final String s : set) {
            final gfv gfv = new gfv();
            gfv.a = Long.parseLong(s);
            gfv.c = 36;
            list.add(gfv);
        }
        this.a0(d, "topic", "impression", (List<? extends j0p>)list);
    }
    
    public final void d() {
        G(this, "periscope", "guest", "request_to_join", "success", null, 48);
    }
    
    public final void d0(final boolean b) {
        String l;
        if (b) {
            l = "community";
        }
        else {
            l = null;
        }
        this.l = l;
    }
    
    public final void e() {
        G(this, "periscope", "janus", "turn_server", "send", null, 48);
    }
    
    public final void e0(final RoomUserItem roomUserItem) {
        this.k = (roomUserItem != null && roomUserItem.isSuperFollowing());
    }
    
    public final void f() {
        G(this, "periscope", "janus", "turn_server", "failure", null, 48);
    }
    
    public final void f0(final NarrowcastSpaceType i) {
        czd.f((Object)i, "type");
        this.i = i;
    }
    
    public final void g() {
        G(this, "periscope", "janus", "create_session", "send", null, 48);
    }
    
    public final void g0(final boolean b) {
        String h;
        if (b) {
            h = "live_recording";
        }
        else {
            h = "live_not_recording";
        }
        this.h = h;
    }
    
    public final void h() {
        G(this, "periscope", "janus", "subscriber_attach", "send", null, 48);
    }
    
    public final void i() {
        G(this, "periscope", "janus", "multistream_subscribe", "failure", null, 48);
    }
    
    public final void j() {
        G(this, "periscope", "janus", "subscriber_webrtc_up", "success", null, 48);
    }
    
    public final void k() {
        G(this, "periscope", "guest", "request_to_join", "failure", null, 48);
    }
    
    public final void l() {
        G(this, "periscope", "janus", "ice_connection", "restart", null, 48);
    }
    
    public final void m() {
        G(this, "periscope", "guest", "stream_negotiate", "success", null, 48);
    }
    
    public final void n() {
        G(this, "periscope", "janus", "create_session", "success", null, 48);
    }
    
    public final void o() {
        G(this, "periscope", "janus", "create_session", "failure", null, 48);
    }
    
    public final void p() {
        G(this, "periscope", "janus", "multistream_unsubscribe", "success", null, 48);
    }
    
    public final void q() {
        G(this, "periscope", "guest", "stream_negotiate", "send", null, 48);
    }
    
    public final void r() {
        G(this, "periscope", "janus", "publisher_join", "failure", null, 48);
    }
    
    public final void s() {
        G(this, "periscope", "janus", "multistream_subscribe", "success", null, 48);
    }
    
    public final void t() {
        G(this, "periscope", "janus", "publisher_join", "success", null, 48);
    }
    
    public final void u() {
        G(this, "periscope", "janus", "multistream_unsubscribe", "failure", null, 48);
    }
    
    public final void v() {
        G(this, "periscope", "janus", "publisher_webrtc_up", "success", null, 48);
    }
    
    public final void w() {
        G(this, "periscope", "janus", "turn_server", "success", null, 48);
    }
    
    public final void x() {
        G(this, "periscope", "guest", "request_to_join", "send", null, 48);
    }
    
    public final String y(final AudioDeviceInfo audioDeviceInfo) {
        final int type = audioDeviceInfo.getType();
        String s;
        if (type != 1 && type != 2) {
            if (type != 3 && type != 4) {
                if (type != 7 && type != 8) {
                    if (type == 11 || type == 12 || type == 22) {
                        s = "usb";
                        return s;
                    }
                    if (type != 26 && type != 27) {
                        s = "other";
                        return s;
                    }
                }
                s = "bluetooth";
            }
            else {
                s = "wired";
            }
        }
        else {
            s = "builtin";
        }
        return s;
    }
    
    public final String z(final f1a f1a) {
        String s = null;
        switch (((Enum)f1a).ordinal()) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 11: {
                s = "thumbs_down";
                break;
            }
            case 10: {
                s = "thumbs_up";
                break;
            }
            case 9: {
                s = "crying_face";
                break;
            }
            case 8: {
                s = "astonished_face";
                break;
            }
            case 7: {
                s = "raised";
                break;
            }
            case 6: {
                s = "face_with_tears_of_joy";
                break;
            }
            case 5: {
                s = "waving";
                break;
            }
            case 4: {
                s = "victory_hand";
                break;
            }
            case 3: {
                s = "raised_fist";
                break;
            }
            case 2: {
                s = "clapping_hands";
                break;
            }
            case 1: {
                s = "hundred_points_symbol";
                break;
            }
            case 0: {
                s = "heart";
                break;
            }
        }
        return s;
    }
}
