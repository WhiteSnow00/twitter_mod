import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dq4
{
    public final String a;
    public final e b;
    public final d c;
    
    public dq4(final String a, final e b, final d c) {
        e0e.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dq4)) {
            return false;
        }
        final dq4 dq4 = (dq4)o;
        return e0e.a((Object)this.a, (Object)dq4.a) && e0e.a((Object)this.b, (Object)dq4.b) && e0e.a((Object)this.c, (Object)dq4.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final e b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final d c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final e b = this.b;
        final d c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Collabs(__typename=");
        sb.append(a);
        sb.append(", onCollabTweet=");
        sb.append(b);
        sb.append(", onCollabInvitation=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final ejw b;
        
        public a(final String a, final ejw b) {
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Collaborator_results(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final ejw b;
        
        public b(final String a, final ejw b) {
            this.a = a;
            this.b = b;
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
            return e0e.a((Object)this.a, (Object)b.a) && e0e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ejw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Collaborators_result(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final no4 a;
        public final a b;
        
        public c(final no4 a, final a b) {
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
            return this.a == c.a && e0e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final no4 a = this.a;
            final a b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Invited_collaborator(collab_invitation_status=");
            sb.append(a);
            sb.append(", collaborator_results=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final List<c> a;
        
        public d(final List<c> a) {
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
            return rh.x("OnCollabInvitation(invited_collaborators=", (List)this.a, ")");
        }
    }
    
    public static final class e
    {
        public final List<b> a;
        
        public e(final List<b> a) {
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
            return rh.x("OnCollabTweet(collaborators_results=", (List)this.a, ")");
        }
    }
}
