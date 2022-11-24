// 
// Decompiled by Procyon v0.6.0
// 

public abstract class r7u
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
    }
    
    public static final class b extends r7u
    {
        public final String a;
        
        public b(final String a) {
            e0e.f((Object)a, "reason");
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
            return c0e.h("TrustedFriendsListMemberRemoveInvalid(reason=", this.a, ")");
        }
    }
    
    public static final class c extends r7u
    {
        public final u7u a;
        
        public c(final u7u a) {
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
            final u7u a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("TrustedFriendsListMemberRemoveSuccess(membersResult=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
