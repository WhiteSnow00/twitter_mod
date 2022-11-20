import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vln
{
    public final nnl<a> a;
    
    public vln() {
        this.a = (nnl<a>)new nnl();
    }
    
    public final void a(final a a) {
        this.a.onNext((Object)a);
    }
    
    public abstract static class a
    {
        public static final class a extends vln.a
        {
            public final String a;
            
            public a(final String a) {
                czd.f((Object)a, "twitterUserId");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return da8.j("AddAsCoHost(twitterUserId=", this.a, ")");
            }
        }
        
        public static final class b extends vln.a
        {
            public final String a;
            
            public b(final String a) {
                czd.f((Object)a, "periscopeUserId");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof b && czd.a((Object)this.a, (Object)((b)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return da8.j("AddAsSpeaker(periscopeUserId=", this.a, ")");
            }
        }
        
        public static final class c extends vln.a
        {
            public final String a;
            public final String b;
            
            public c(final String a, final String b) {
                czd.f((Object)a, "periscopeUserId");
                czd.f((Object)b, "twitterUserId");
                this.a = a;
                this.b = b;
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
                return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b);
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 31;
            }
            
            @Override
            public final String toString() {
                return zh8.o("CancelInvite(periscopeUserId=", this.a, ", twitterUserId=", this.b, ")");
            }
        }
        
        public static final class d extends vln.a
        {
            public final boolean a;
            public final long b;
            public final String c;
            public final String d;
            
            public d(final boolean a, final long b, final String c, final String d) {
                czd.f((Object)c, "name");
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
                if (!(o instanceof d)) {
                    return false;
                }
                final d d = (d)o;
                return this.a == d.a && this.b == d.b && czd.a((Object)this.c, (Object)d.c) && czd.a((Object)this.d, (Object)d.d);
            }
            
            @Override
            public final int hashCode() {
                int a;
                if ((a = (this.a ? 1 : 0)) != 0) {
                    a = 1;
                }
                final long b = this.b;
                final int f = hmg.f(this.c, (a * 31 + (int)(b ^ b >>> 32)) * 31, 31);
                final String d = this.d;
                int hashCode;
                if (d == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = d.hashCode();
                }
                return f + hashCode;
            }
            
            @Override
            public final String toString() {
                final boolean a = this.a;
                final long b = this.b;
                final String c = this.c;
                final String d = this.d;
                final StringBuilder sb = new StringBuilder();
                sb.append("CohostInviteReplyReceived(acceptedInvite=");
                sb.append(a);
                sb.append(", twitterUserId=");
                sb.append(b);
                nb0.z(sb, ", name=", c, ", profileUrl=", d);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class e extends vln.a
        {
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof e)) {
                    return false;
                }
                Objects.requireNonNull(o);
                return true;
            }
            
            @Override
            public final int hashCode() {
                return 0;
            }
            
            @Override
            public final String toString() {
                return "DeclineInvite(declineReason=0)";
            }
        }
        
        public static final class f extends vln.a
        {
            public final String a;
            public final String b;
            
            public f(final String a, final String b) {
                czd.f((Object)a, "periscopeUserId");
                czd.f((Object)b, "twitterUserId");
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
                return zh8.o("Invite(periscopeUserId=", this.a, ", twitterUserId=", this.b, ")");
            }
        }
        
        public static final class g extends vln.a
        {
            public final String a;
            
            public g(final String a) {
                czd.f((Object)a, "periscopeUserId");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof g && czd.a((Object)this.a, (Object)((g)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return da8.j("RejectSpeakerRequest(periscopeUserId=", this.a, ")");
            }
        }
        
        public static final class h extends vln.a
        {
            public final String a;
            public final String b;
            public final RoomUserItem c;
            
            public h(final String a, final String b, final RoomUserItem c) {
                czd.f((Object)a, "periscopeUserId");
                czd.f((Object)b, "twitterUserId");
                czd.f((Object)c, "roomUserItem");
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
                return czd.a((Object)this.a, (Object)h.a) && czd.a((Object)this.b, (Object)h.b) && czd.a((Object)this.c, (Object)h.c);
            }
            
            @Override
            public final int hashCode() {
                return this.c.hashCode() + hmg.f(this.b, this.a.hashCode() * 31, 31);
            }
            
            @Override
            public final String toString() {
                final String a = this.a;
                final String b = this.b;
                final RoomUserItem c = this.c;
                final StringBuilder q = tqf.q("Remove(periscopeUserId=", a, ", twitterUserId=", b, ", roomUserItem=");
                q.append(c);
                q.append(")");
                return q.toString();
            }
        }
        
        public static final class i extends vln.a
        {
            public final String a;
            public final String b;
            
            public i(final String a, final String b) {
                czd.f((Object)a, "twitterUserId");
                this.a = a;
                this.b = b;
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
                return czd.a((Object)this.a, (Object)i.a) && czd.a((Object)this.b, (Object)i.b);
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
                return hashCode * 31 + hashCode2;
            }
            
            @Override
            public final String toString() {
                return zh8.o("RemoveAsCoHost(twitterUserId=", this.a, ", periscopeUserId=", this.b, ")");
            }
        }
        
        public static final class j extends vln.a
        {
            public final String a;
            public final String b;
            
            public j(final String a, final String b) {
                czd.f((Object)a, "periscopeUserId");
                czd.f((Object)b, "twitterUserId");
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
                return czd.a((Object)this.a, (Object)j.a) && czd.a((Object)this.b, (Object)j.b);
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode() + this.a.hashCode() * 31;
            }
            
            @Override
            public final String toString() {
                return zh8.o("RemoveAsSpeaker(periscopeUserId=", this.a, ", twitterUserId=", this.b, ")");
            }
        }
        
        public static final class k extends vln.a
        {
            public static final k a;
            
            static {
                a = new k();
            }
        }
    }
}
