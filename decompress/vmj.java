import com.twitter.rooms.subsystem.api.models.StationTrack;
import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import com.twitter.rooms.model.helpers.PostSurveyAdmin;
import com.twitter.rooms.model.helpers.RoomUserItem;
import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vmj
{
    public static final class a extends vmj
    {
        public final int a;
        public final String b;
        
        public a() {
            this.a = 0;
            this.b = "";
        }
        
        public a(final int a, final String b) {
            czd.f((Object)b, "roomId");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a * 31;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("AnonymousUsersView(remainingUsersCount=");
            sb.append(a);
            sb.append(", roomId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends vmj
    {
        public final Set<CohostInvite> a;
        public final boolean b;
        public final boolean c;
        
        public b(final Set set) {
            this(set, true, false);
        }
        
        public b(final Set<CohostInvite> a, final boolean b, final boolean c) {
            czd.f((Object)a, "invites");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int b = this.b ? 1 : 0;
            int n = 1;
            int n2 = b;
            if (b != 0) {
                n2 = 1;
            }
            final int c = this.c ? 1 : 0;
            if (c == 0) {
                n = c;
            }
            return (hashCode * 31 + n2) * 31 + n;
        }
        
        @Override
        public final String toString() {
            final Set<CohostInvite> a = this.a;
            final boolean b = this.b;
            final boolean c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("CohostInviteView(invites=");
            sb.append(a);
            sb.append(", isHost=");
            sb.append(b);
            sb.append(", isSpaceRecording=");
            return wnj.D(sb, c, ")");
        }
    }
    
    public static final class c extends vmj
    {
        public final String a;
        public final String b;
        public final String c;
        public final jyk d;
        
        public c(final String a, final String b, final String c, final jyk d) {
            czd.f((Object)a, "twitterId");
            czd.f((Object)b, "periscopeUserId");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b) && czd.a((Object)this.c, (Object)c.c) && this.d == c.d;
        }
        
        @Override
        public final int hashCode() {
            final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
            final String c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return this.d.hashCode() + (f + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final String c = this.c;
            final jyk d = this.d;
            final StringBuilder q = tqf.q("CohostSwitchToListeningView(twitterId=", a, ", periscopeUserId=", b, ", roomId=");
            q.append(c);
            q.append(", previousShownView=");
            q.append(d);
            q.append(")");
            return q.toString();
        }
    }
    
    public static final class d extends vmj
    {
        public final lsi a;
        public final String b;
        public final Integer c;
        
        public d(final lsi a, final String b, final Integer c) {
            czd.f((Object)b, "text");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && czd.a((Object)this.b, (Object)d.b) && czd.a((Object)this.c, (Object)d.c);
        }
        
        @Override
        public final int hashCode() {
            final lsi a = this.a;
            final int n = 0;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            final int f = hmg.f(this.b, hashCode * 31, 31);
            final Integer c = this.c;
            int hashCode2;
            if (c == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = c.hashCode();
            }
            return f + hashCode2;
        }
        
        @Override
        public final String toString() {
            final lsi a = this.a;
            final String b = this.b;
            final Integer c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("DismissView(notificationInfo=");
            sb.append(a);
            sb.append(", text=");
            sb.append(b);
            sb.append(", iconIdentifier=");
            return sde.f(sb, c, ")");
        }
    }
    
    public static final class e extends vmj
    {
        public final String a;
        public final gpn b;
        public final Integer c;
        public final Set<RoomUserItem> d;
        
        public e(final String a, gpn e0, final int n) {
            if ((n & 0x2) != 0x0) {
                e0 = gpn.E0;
            }
            Object d0;
            if ((n & 0x8) != 0x0) {
                d0 = p2a.D0;
            }
            else {
                d0 = null;
            }
            czd.f((Object)a, "roomId");
            czd.f((Object)e0, "inviteType");
            czd.f(d0, "inviteList");
            this.a = a;
            this.b = e0;
            this.c = null;
            this.d = (Set<RoomUserItem>)d0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return czd.a((Object)this.a, (Object)e.a) && this.b == e.b && czd.a((Object)this.c, (Object)e.c) && czd.a((Object)this.d, (Object)e.d);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int hashCode2 = this.b.hashCode();
            final Integer c = this.c;
            int hashCode3;
            if (c == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = c.hashCode();
            }
            return this.d.hashCode() + ((hashCode2 + hashCode * 31) * 31 + hashCode3) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final gpn b = this.b;
            final Integer c = this.c;
            final Set<RoomUserItem> d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("DmInvitesView(roomId=");
            sb.append(a);
            sb.append(", inviteType=");
            sb.append(b);
            sb.append(", maxInvites=");
            sb.append(c);
            sb.append(", inviteList=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f extends vmj
    {
        public final String a;
        public final String b;
        
        public f(final String a, final String b) {
            czd.f((Object)a, "roomId");
            czd.f((Object)b, "invitedBy");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return czd.a((Object)this.a, (Object)f.a) && czd.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return zh8.o("InviteDeclineView(roomId=", this.a, ", invitedBy=", this.b, ")");
        }
    }
    
    public static final class g extends vmj
    {
        public final jyk a;
        
        public g() {
            this(null, 1, null);
        }
        
        public g(jyk e0) {
            e0 = jyk.E0;
            this.a = e0;
        }
        
        public g(jyk d0, final int n, final rf8 rf8) {
            d0 = jyk.D0;
            this.a = d0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && this.a == ((g)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final jyk a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("MicroPermissionView(previousShownView=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h extends vmj
    {
        public final String a;
        public final Integer b;
        public final boolean c;
        
        public h() {
            this(null, null, false, 7);
        }
        
        public h(String a, Integer b, boolean c, final int n) {
            if ((n & 0x1) != 0x0) {
                a = null;
            }
            if ((n & 0x2) != 0x0) {
                b = null;
            }
            if ((n & 0x4) != 0x0) {
                c = false;
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return czd.a((Object)this.a, (Object)h.a) && czd.a((Object)this.b, (Object)h.b) && this.c == h.c;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Integer b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return (hashCode2 * 31 + hashCode) * 31 + c;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final Integer b = this.b;
            final boolean c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("None(dismissalPrompt=");
            sb.append(a);
            sb.append(", iconIdentifier=");
            sb.append(b);
            sb.append(", showLeaveButton=");
            return wnj.D(sb, c, ")");
        }
    }
    
    public static final class i extends vmj
    {
        public final lsk a;
        public final String b;
        public final PostSurveyAdmin c;
        public final boolean d;
        public final String e;
        public final Long f;
        public final boolean g;
        public final Set<AudioSpaceTopicItem> h;
        public final boolean i;
        public final NarrowcastSpaceType j;
        public final boolean k;
        
        public i(final lsk a, final String b, final PostSurveyAdmin c, final boolean d, final String e, final Long f, final boolean g, final Set<AudioSpaceTopicItem> h, final boolean i, final NarrowcastSpaceType j, final boolean k) {
            czd.f((Object)a, "surveyType");
            czd.f((Object)c, "admin");
            czd.f((Object)h, "topics");
            czd.f((Object)j, "narrowCastSpaceType");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return this.a == i.a && czd.a((Object)this.b, (Object)i.b) && czd.a((Object)this.c, (Object)i.c) && this.d == i.d && czd.a((Object)this.e, (Object)i.e) && czd.a((Object)this.f, (Object)i.f) && this.g == i.g && czd.a((Object)this.h, (Object)i.h) && this.i == i.i && czd.a((Object)this.j, (Object)i.j) && this.k == i.k;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final int hashCode4 = this.c.hashCode();
            final int d = this.d ? 1 : 0;
            final int n = 1;
            int n2 = d;
            if (d != 0) {
                n2 = 1;
            }
            final String e = this.e;
            int hashCode5;
            if (e == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = e.hashCode();
            }
            final Long f = this.f;
            if (f != null) {
                hashCode2 = f.hashCode();
            }
            int g;
            if ((g = (this.g ? 1 : 0)) != 0) {
                g = 1;
            }
            final int b2 = zip.b((Set)this.h, (((((hashCode4 + (hashCode * 31 + hashCode3) * 31) * 31 + n2) * 31 + hashCode5) * 31 + hashCode2) * 31 + g) * 31, 31);
            int i;
            if ((i = (this.i ? 1 : 0)) != 0) {
                i = 1;
            }
            final int hashCode6 = this.j.hashCode();
            int k = this.k ? 1 : 0;
            if (k != 0) {
                k = n;
            }
            return (hashCode6 + (b2 + i) * 31) * 31 + k;
        }
        
        @Override
        public final String toString() {
            final lsk a = this.a;
            final String b = this.b;
            final PostSurveyAdmin c = this.c;
            final boolean d = this.d;
            final String e = this.e;
            final Long f = this.f;
            final boolean g = this.g;
            final Set<AudioSpaceTopicItem> h = this.h;
            final boolean i = this.i;
            final NarrowcastSpaceType j = this.j;
            final boolean k = this.k;
            final StringBuilder sb = new StringBuilder();
            sb.append("PostSurveyView(surveyType=");
            sb.append(a);
            sb.append(", roomId=");
            sb.append(b);
            sb.append(", admin=");
            sb.append(c);
            sb.append(", shouldLaunchEndScreen=");
            sb.append(d);
            sb.append(", title=");
            sb.append(e);
            sb.append(", startedAt=");
            sb.append(f);
            sb.append(", isHost=");
            sb.append(g);
            sb.append(", topics=");
            sb.append(h);
            sb.append(", isAvailableForReplay=");
            sb.append(i);
            sb.append(", narrowCastSpaceType=");
            sb.append(j);
            sb.append(", isAvailableForClipping=");
            return wnj.D(sb, k, ")");
        }
    }
    
    public static final class j extends vmj
    {
        public final RoomUserItem a;
        
        public j(final RoomUserItem a) {
            czd.f((Object)a, "roomUserItem");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof j && czd.a((Object)this.a, (Object)((j)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final RoomUserItem a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ProfileView(roomUserItem=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class k extends vmj
    {
        public final y0r a;
        public final x5m b;
        public final String c;
        public final Set<RoomUserItem> d;
        public final Set<RoomUserItem> e;
        public final Set<RoomUserItem> f;
        public final int g;
        public final String h;
        public final int i;
        
        public k(final y0r y0r, final x5m x5m, final String s) {
            final p2a d0 = p2a.D0;
            this(y0r, x5m, s, (Set<RoomUserItem>)d0, (Set<RoomUserItem>)d0, (Set<RoomUserItem>)d0, 0, "", 0);
        }
        
        public k(final y0r a, final x5m b, final String c, final Set<RoomUserItem> d, final Set<RoomUserItem> e, final Set<RoomUserItem> f, final int g, final String h, final int i) {
            czd.f((Object)b, "recordingState");
            czd.f((Object)c, "roomId");
            czd.f((Object)d, "admins");
            czd.f((Object)e, "speakers");
            czd.f((Object)f, "listeners");
            czd.f((Object)h, "primaryAdminId");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return this.a == k.a && this.b == k.b && czd.a((Object)this.c, (Object)k.c) && czd.a((Object)this.d, (Object)k.d) && czd.a((Object)this.e, (Object)k.e) && czd.a((Object)this.f, (Object)k.f) && this.g == k.g && czd.a((Object)this.h, (Object)k.h) && this.i == k.i;
        }
        
        @Override
        public final int hashCode() {
            return hmg.f(this.h, (zip.b((Set)this.f, zip.b((Set)this.e, zip.b((Set)this.d, hmg.f(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31), 31), 31) + this.g) * 31, 31) + this.i;
        }
        
        @Override
        public final String toString() {
            final y0r a = this.a;
            final x5m b = this.b;
            final String c = this.c;
            final Set<RoomUserItem> d = this.d;
            final Set<RoomUserItem> e = this.e;
            final Set<RoomUserItem> f = this.f;
            final int g = this.g;
            final String h = this.h;
            final int i = this.i;
            final StringBuilder sb = new StringBuilder();
            sb.append("RecordingPromptView(speakingState=");
            sb.append(a);
            sb.append(", recordingState=");
            sb.append(b);
            sb.append(", roomId=");
            sb.append(c);
            sb.append(", admins=");
            sb.append(d);
            sb.append(", speakers=");
            sb.append(e);
            sb.append(", listeners=");
            sb.append(f);
            sb.append(", remainingParticipants=");
            i81.x(sb, g, ", primaryAdminId=", h, ", maxAdminCapacity=");
            return wc0.A(sb, i, ")");
        }
    }
    
    public static final class l extends vmj
    {
        public final String a;
        public final String b;
        public final Long c;
        public final boolean d;
        public final Set<AudioSpaceTopicItem> e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        
        public l(final String s, final String s2, final Long n, final boolean b, final Set set, final boolean b2, final boolean b3) {
            this(s, s2, n, b, set, false, b2, b3);
        }
        
        public l(final String a, final String b, final Long c, final boolean d, final Set<AudioSpaceTopicItem> e, final boolean f, final boolean g, final boolean h) {
            czd.f((Object)a, "roomId");
            czd.f((Object)e, "topics");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            return czd.a((Object)this.a, (Object)l.a) && czd.a((Object)this.b, (Object)l.b) && czd.a((Object)this.c, (Object)l.c) && this.d == l.d && czd.a((Object)this.e, (Object)l.e) && this.f == l.f && this.g == l.g && this.h == l.h;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final Long c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            final int d = this.d ? 1 : 0;
            final int n = 1;
            int n2 = d;
            if (d != 0) {
                n2 = 1;
            }
            final int b2 = zip.b((Set)this.e, (((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31 + n2) * 31, 31);
            int f;
            if ((f = (this.f ? 1 : 0)) != 0) {
                f = 1;
            }
            int g;
            if ((g = (this.g ? 1 : 0)) != 0) {
                g = 1;
            }
            int h = this.h ? 1 : 0;
            if (h != 0) {
                h = n;
            }
            return ((b2 + f) * 31 + g) * 31 + h;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final Long c = this.c;
            final boolean d = this.d;
            final Set<AudioSpaceTopicItem> e = this.e;
            final boolean f = this.f;
            final boolean g = this.g;
            final boolean h = this.h;
            final StringBuilder q = tqf.q("RoomEndScreenView(roomId=", a, ", title=", b, ", startedAt=");
            q.append(c);
            q.append(", isHost=");
            q.append(d);
            q.append(", topics=");
            q.append(e);
            q.append(", fromSpacesTab=");
            q.append(f);
            q.append(", isAvailableForReplay=");
            return w1e.B(q, g, ", isAvailableForClipping=", h, ")");
        }
    }
    
    public static final class m extends vmj
    {
        public final RoomHostKudosArgs a;
        
        public m(final RoomHostKudosArgs a) {
            czd.f((Object)a, "args");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof m && czd.a((Object)this.a, (Object)((m)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final RoomHostKudosArgs a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("RoomHostKudosView(args=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class n extends vmj
    {
        public final String a;
        public final String b;
        public final Set<String> c;
        
        public n(final String a, final String b, final Set<String> c) {
            czd.f((Object)a, "roomId");
            czd.f((Object)c, "topicIds");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof n)) {
                return false;
            }
            final n n = (n)o;
            return czd.a((Object)this.a, (Object)n.a) && czd.a((Object)this.b, (Object)n.b) && czd.a((Object)this.c, (Object)n.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final Set<String> c = this.c;
            final StringBuilder q = tqf.q("RoomRecordingEditNameView(roomId=", a, ", title=", b, ", topicIds=");
            q.append(c);
            q.append(")");
            return q.toString();
        }
    }
    
    public static final class o extends vmj
    {
        public final String a;
        public final String b;
        public final long c;
        public final List<AudioSpaceTopicItem> d;
        public final boolean e;
        public final NarrowcastSpaceType f;
        
        public o(final String a, final String b, final long c, final List<AudioSpaceTopicItem> d, final boolean e, final NarrowcastSpaceType f) {
            czd.f((Object)a, "broadcastId");
            czd.f((Object)b, "spaceName");
            czd.f((Object)d, "topics");
            czd.f((Object)f, "narrowcastSpaceType");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof o)) {
                return false;
            }
            final o o2 = (o)o;
            return czd.a((Object)this.a, (Object)o2.a) && czd.a((Object)this.b, (Object)o2.b) && this.c == o2.c && czd.a((Object)this.d, (Object)o2.d) && this.e == o2.e && czd.a((Object)this.f, (Object)o2.f);
        }
        
        @Override
        public final int hashCode() {
            final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
            final long c = this.c;
            final int d = sde.d((List)this.d, (f + (int)(c ^ c >>> 32)) * 31, 31);
            int e;
            if ((e = (this.e ? 1 : 0)) != 0) {
                e = 1;
            }
            return this.f.hashCode() + (d + e) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final long c = this.c;
            final List<AudioSpaceTopicItem> d = this.d;
            final boolean e = this.e;
            final NarrowcastSpaceType f = this.f;
            final StringBuilder q = tqf.q("ScheduledEditView(broadcastId=", a, ", spaceName=", b, ", scheduledStartAtInMillis=");
            q.append(c);
            q.append(", topics=");
            q.append(d);
            q.append(", isRecording=");
            q.append(e);
            q.append(", narrowcastSpaceType=");
            q.append(f);
            q.append(")");
            return q.toString();
        }
    }
    
    public static final class p extends vmj
    {
        public final String a;
        public final List<StationTrack> b;
        public final Integer c;
        
        public p(final String a, final List<? extends StationTrack> b, final Integer c) {
            czd.f((Object)a, "stationName");
            czd.f((Object)b, "stationTracks");
            this.a = a;
            this.b = (List<StationTrack>)b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof p)) {
                return false;
            }
            final p p = (p)o;
            return czd.a((Object)this.a, (Object)p.a) && czd.a((Object)this.b, (Object)p.b) && czd.a((Object)this.c, (Object)p.c);
        }
        
        @Override
        public final int hashCode() {
            final int d = sde.d((List)this.b, this.a.hashCode() * 31, 31);
            final Integer c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return d + hashCode;
        }
        
        @Override
        public final String toString() {
            return sde.f(e1.A("StationPlaylistView(stationName=", this.a, ", stationTracks=", (List)this.b, ", currentTrackIndex="), this.c, ")");
        }
    }
}
