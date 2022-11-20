import com.twitter.rooms.model.helpers.CohostInvite;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class von
{
    public static final class a extends von
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends von
    {
        public final Throwable a;
        
        public b(final Throwable a) {
            czd.f((Object)a, "throwable");
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
            return gw8.o("LogError(throwable=", this.a, ")");
        }
    }
    
    public static final class c extends von
    {
        public final Set<CohostInvite> a;
        
        public c(final Set<CohostInvite> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && czd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final Set<CohostInvite> a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OpenCohostInviteView(invites=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends von
    {
        public final Set<uon> a;
        public final gpn b;
        
        public d(final Set<uon> a, final gpn b) {
            czd.f((Object)a, "invites");
            czd.f((Object)b, "inviteType");
            this.a = a;
            this.b = b;
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
            return czd.a((Object)this.a, (Object)d.a) && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final Set<uon> a = this.a;
            final gpn b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowInviteConfirmation(invites=");
            sb.append(a);
            sb.append(", inviteType=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends von
    {
        public final Set<CohostInvite> a;
        
        public e(final Set<CohostInvite> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e && czd.a((Object)this.a, (Object)((e)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final Set<CohostInvite> a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowInviteLimitNotification(invites=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
