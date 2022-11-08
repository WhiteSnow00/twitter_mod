import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class k8n
{
    public static final class a extends k8n
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends k8n
    {
        public final Throwable a;
        
        public b(final Throwable a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return x30.D("LogError(throwable=", this.a, ")");
        }
    }
    
    public static final class c extends k8n
    {
        public final String a;
        public final String b;
        public final long c;
        
        public c(final String a, final String b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
            final long c = this.c;
            return a + (int)(c ^ c >>> 32);
        }
        
        @Override
        public final String toString() {
            return b8b.r(mb0.y("OpenReportSpace(twitterUserId=", this.a, ", broadcastId=", this.b, ", startedAt="), this.c, ")");
        }
    }
    
    public static final class d extends k8n
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends k8n
    {
        public final String a;
        public final i5m b;
        public final Set<RoomUserItem> c;
        public final Set<RoomUserItem> d;
        public final Set<RoomUserItem> e;
        public final int f;
        public final String g;
        public final int h;
        
        public e(final String a, final i5m b, final Set<RoomUserItem> c, final Set<RoomUserItem> d, final Set<RoomUserItem> e, final int f, final String g, final int h) {
            zzd.f((Object)a, "roomId");
            zzd.f((Object)c, "admins");
            zzd.f((Object)d, "speakers");
            zzd.f((Object)e, "listeners");
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
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return zzd.a((Object)this.a, (Object)e.a) && this.b == e.b && zzd.a((Object)this.c, (Object)e.c) && zzd.a((Object)this.d, (Object)e.d) && zzd.a((Object)this.e, (Object)e.e) && this.f == e.f && zzd.a((Object)this.g, (Object)e.g) && this.h == e.h;
        }
        
        @Override
        public final int hashCode() {
            return l7k.a(this.g, (dia.p((Set)this.e, dia.p((Set)this.d, dia.p((Set)this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31), 31), 31) + this.f) * 31, 31) + this.h;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final i5m b = this.b;
            final Set<RoomUserItem> c = this.c;
            final Set<RoomUserItem> d = this.d;
            final Set<RoomUserItem> e = this.e;
            final int f = this.f;
            final String g = this.g;
            final int h = this.h;
            final StringBuilder sb = new StringBuilder();
            sb.append("OpenSpaceRecordedConfirmation(roomId=");
            sb.append(a);
            sb.append(", recordingState=");
            sb.append(b);
            sb.append(", admins=");
            sb.append(c);
            sb.append(", speakers=");
            sb.append(d);
            sb.append(", listeners=");
            sb.append(e);
            sb.append(", remainingParticipants=");
            sb.append(f);
            sb.append(", primaryAdminId=");
            sb.append(g);
            sb.append(", maxAdminCapacity=");
            sb.append(h);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f extends k8n
    {
        public final cwr a;
        
        public f(final cwr a) {
            zzd.f((Object)a, "superFollowsCreatorInfo");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && zzd.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final cwr a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OpenSuperFollows(superFollowsCreatorInfo=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g extends k8n
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends k8n
    {
        public final String a;
        
        public h(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof h && zzd.a((Object)this.a, (Object)((h)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("PurchaseTicket(id=", this.a, ")");
        }
    }
    
    public static final class i extends k8n
    {
        public final boolean a;
        
        public i(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && this.a == ((i)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("ShowEndAudioSpaceConfirmation(shouldAutoJoin=", this.a, ")");
        }
    }
    
    public static final class j extends k8n
    {
        public final String a;
        public final boolean b;
        
        public j(final String a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return zzd.a((Object)this.a, (Object)j.a) && this.b == j.b;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            return hashCode * 31 + b;
        }
        
        @Override
        public final String toString() {
            return eta.g("ShowSFAccessInfoSheet(hostName=", this.a, ", isSuperFollowing=", this.b, ")");
        }
    }
    
    public static final class k extends k8n
    {
        public static final k a;
        
        static {
            a = new k();
        }
    }
}
