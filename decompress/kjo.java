import java.util.Iterator;
import com.twitter.rooms.model.helpers.PostSurveyAdmin;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import com.twitter.rooms.model.helpers.CohostInvite;
import com.twitter.rooms.model.helpers.RoomUserItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.rooms.subsystem.api.args.StationsPlaylistArgs;
import com.twitter.rooms.subsystem.api.args.RoomRecordingEditNameArgs;
import com.twitter.rooms.subsystem.api.args.RoomEndScreenArgs;
import com.twitter.rooms.subsystem.api.args.RoomDmInvitesArgs;
import com.twitter.rooms.subsystem.api.args.RoomPostSurveyArgs;
import com.twitter.rooms.audiospace.nudge.RoomDeclineInviteReasonsArgs;
import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceEditArgs;
import com.twitter.rooms.audiospace.anonymous_users.RoomAnonymousUsersSettingsArgs;
import com.twitter.rooms.subsystem.api.args.RoomPermissionsArgs;
import com.twitter.rooms.subsystem.api.args.RoomRecordingPromptArgs;
import com.twitter.rooms.subsystem.api.args.RoomCohostSwitchToListeningArgs;
import java.util.Set;
import com.twitter.rooms.cohost.invite.RoomCohostInviteArgs;
import com.twitter.rooms.subsystem.api.args.RoomProfileArgs;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjo extends ste implements qsb<ljo, fzv>
{
    public final ijo D0;
    
    public kjo(final ijo d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ljo ljo = (ljo)o;
        czd.f((Object)ljo, "$this$distinct");
        final b6q a = ljo.a;
        if (a instanceof b6q.i) {
            final ijo d0 = this.D0;
            final RoomUserItem a2 = ((b6q.i)a).a;
            Objects.requireNonNull(d0);
            final StringBuilder sb = new StringBuilder();
            sb.append("PROFILE-");
            sb.append(a2);
            sb.append(".twitterUserId");
            d0.a(new RoomProfileArgs(a2), sb.toString());
        }
        else if (a instanceof b6q.c) {
            final ijo d2 = this.D0;
            final b6q.c c = (b6q.c)a;
            final Set<CohostInvite> a3 = c.a;
            final boolean b = c.b;
            final boolean c2 = c.c;
            Objects.requireNonNull(d2);
            d2.a(new RoomCohostInviteArgs((Set)a3, b, c2), "RoomCohostInviteArgs");
        }
        else if (a instanceof b6q.b) {
            final ijo d3 = this.D0;
            final b6q.b b2 = (b6q.b)a;
            final String b3 = b2.b;
            final String a4 = b2.a;
            final String c3 = b2.c;
            final jyk d4 = b2.d;
            Objects.requireNonNull(d3);
            d3.a(new RoomCohostSwitchToListeningArgs(b3, a4, c3, d4), "RoomCohostSwitchToListeningArgs");
        }
        else if (a instanceof b6q.j) {
            final ijo d5 = this.D0;
            final b6q.j j = (b6q.j)a;
            final y0r a5 = j.a;
            final x5m b4 = j.b;
            final String c4 = j.c;
            final Set<RoomUserItem> d6 = j.d;
            final Set<RoomUserItem> e = j.e;
            final Set<RoomUserItem> f = j.f;
            final int g = j.g;
            final String h = j.h;
            final int i = j.i;
            Objects.requireNonNull(d5);
            d5.a(new RoomRecordingPromptArgs(a5, b4, c4, (Set)d6, (Set)e, (Set)f, g, h, i), "RoomRecordingPromptArgs");
        }
        else if (a instanceof b6q.f) {
            final ijo d7 = this.D0;
            final jyk a6 = ((b6q.f)a).a;
            Objects.requireNonNull(d7);
            d7.a(new RoomPermissionsArgs(a6), "RoomPermissionsArgs");
        }
        else if (a instanceof b6q.a) {
            final ijo d8 = this.D0;
            final b6q.a a7 = (b6q.a)a;
            final int a8 = a7.a;
            final String b5 = a7.b;
            Objects.requireNonNull(d8);
            d8.a(new RoomAnonymousUsersSettingsArgs(a8, b5), "RoomAnonymousUsersSettingsArgs");
        }
        else if (a instanceof b6q.n) {
            final ijo d9 = this.D0;
            final b6q.n n = (b6q.n)a;
            final String a9 = n.a;
            final String b6 = n.b;
            final long c5 = n.c;
            final List<AudioSpaceTopicItem> d10 = n.d;
            final boolean e2 = n.e;
            final NarrowcastSpaceType f2 = n.f;
            Objects.requireNonNull(d9);
            d9.a(new RoomScheduledSpaceEditArgs(a9, b6, c5, (List)d10, e2, f2), "RoomScheduledSpaceEditArgs");
        }
        else if (a instanceof b6q.e) {
            final ijo d11 = this.D0;
            final b6q.e e3 = (b6q.e)a;
            final String a10 = e3.a;
            final String b7 = e3.b;
            Objects.requireNonNull(d11);
            d11.a(new RoomDeclineInviteReasonsArgs(a10, b7), "RoomDeclineInviteReasonsArgs");
        }
        else if (a instanceof b6q.h) {
            final ijo d12 = this.D0;
            final b6q.h h2 = (b6q.h)a;
            final lsk a11 = h2.a;
            final String b8 = h2.b;
            final PostSurveyAdmin c6 = h2.c;
            final boolean d13 = h2.d;
            final String e4 = h2.e;
            final Long f3 = h2.f;
            final boolean g2 = h2.g;
            final Set<AudioSpaceTopicItem> h3 = h2.h;
            final boolean k = h2.i;
            final NarrowcastSpaceType l = h2.j;
            final boolean m = h2.k;
            Objects.requireNonNull(d12);
            d12.a(new RoomPostSurveyArgs(a11, b8, c6, d13, e4, f3, g2, (Set)h3, k, m, l), "RoomPostSurveyArgs");
        }
        else if (a instanceof b6q.d) {
            final ijo d14 = this.D0;
            final b6q.d d15 = (b6q.d)a;
            final String a12 = d15.a;
            final gpn b9 = d15.b;
            final Integer c7 = d15.c;
            final Set<RoomUserItem> d16 = d15.d;
            Objects.requireNonNull(d14);
            d14.a(new RoomDmInvitesArgs(a12, b9, c7, (Set)d16), "RoomDmInvitesArgs");
        }
        else if (a instanceof b6q.k) {
            final ijo d17 = this.D0;
            final b6q.k k2 = (b6q.k)a;
            final String a13 = k2.a;
            final String b10 = k2.b;
            final Long c8 = k2.c;
            final boolean d18 = k2.d;
            final Set<AudioSpaceTopicItem> e5 = k2.e;
            final boolean f4 = k2.f;
            final boolean g3 = k2.g;
            final boolean h4 = k2.h;
            Objects.requireNonNull(d17);
            d17.a(new RoomEndScreenArgs(a13, b10, c8, d18, mq4.R0((Iterable)e5), f4, g3, h4), "RoomEndScreenArgs");
        }
        else if (a instanceof b6q.m) {
            final ijo d19 = this.D0;
            final b6q.m m2 = (b6q.m)a;
            final String a14 = m2.a;
            final String b11 = m2.b;
            final Set<String> c9 = m2.c;
            Objects.requireNonNull(d19);
            d19.a(new RoomRecordingEditNameArgs(a14, b11, (Set)c9), "RoomRecordingEditNameArgs");
        }
        else if (a instanceof b6q.l) {
            this.D0.a(((b6q.l)a).a, "RoomHostKudosArgs");
        }
        else if (a instanceof b6q.o) {
            final ijo d20 = this.D0;
            final b6q.o o2 = (b6q.o)a;
            d20.a(new StationsPlaylistArgs(o2.a, (List)o2.b, o2.c), "StationsPlaylistArgs");
        }
        else if (czd.a((Object)a, (Object)b6q.g.a)) {
            final ijo d21 = this.D0;
            final a a15 = new a(d21.H0);
            final List m3 = d21.H0.M();
            czd.e((Object)m3, "fragmentManager.fragments");
            final Iterator iterator = m3.iterator();
            while (iterator.hasNext()) {
                a15.n((Fragment)iterator.next());
            }
            a15.c();
        }
        return fzv.a;
    }
}
