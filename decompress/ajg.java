import com.twitter.rooms.model.helpers.RoomUserItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajg
{
    public final znl<a> a;
    
    public ajg() {
        this.a = (znl<a>)new znl();
    }
    
    public abstract static class a
    {
        public static final class a extends ajg.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends ajg.a
        {
            public final RoomUserItem a;
            
            public b(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof b && e0e.a((Object)this.a, (Object)((b)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Approve(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class c extends ajg.a
        {
            public final RoomUserItem a;
            
            public c(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof c && e0e.a((Object)this.a, (Object)((c)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("CancelCohostInvite(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class d extends ajg.a
        {
            public final RoomUserItem a;
            
            public d(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof d && e0e.a((Object)this.a, (Object)((d)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("CancelInvite(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class e extends ajg.a
        {
            public final RoomUserItem a;
            
            public e(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof e && e0e.a((Object)this.a, (Object)((e)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Invite(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class f extends ajg.a
        {
            public final int a;
            
            public f(final int a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof f && this.a == ((f)o).a);
            }
            
            @Override
            public final int hashCode() {
                return this.a;
            }
            
            @Override
            public final String toString() {
                return ffe.m("InviteCohost(openSlots=", this.a, ")");
            }
        }
        
        public static final class g extends ajg.a
        {
            public final RoomUserItem a;
            
            public g(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof g && e0e.a((Object)this.a, (Object)((g)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Reject(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class h extends ajg.a
        {
            public final RoomUserItem a;
            
            public h(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof h && e0e.a((Object)this.a, (Object)((h)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("RemoveCohost(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class i extends ajg.a
        {
            public final RoomUserItem a;
            
            public i(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof i && e0e.a((Object)this.a, (Object)((i)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("RemoveFromSpace(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class j extends ajg.a
        {
            public final RoomUserItem a;
            
            public j(final RoomUserItem a) {
                e0e.f((Object)a, "user");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof j && e0e.a((Object)this.a, (Object)((j)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                final RoomUserItem a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("RemoveSpeaker(user=");
                sb.append(a);
                sb.append(")");
                return sb.toString();
            }
        }
    }
}
