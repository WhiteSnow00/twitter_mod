import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lj9 implements psl<lj9.lj9$c>
{
    public static final b Companion;
    
    static {
        Companion = new b();
    }
    
    public final void a(final ale ale, final fa7 fa7) {
        czd.f((Object)fa7, "customScalarAdapters");
    }
    
    public final String b() {
        return "CRhTdESpgdwwlA0mN5PjMg";
    }
    
    public final xq<lj9.lj9$c> c() {
        return (xq<lj9.lj9$c>)ar.c((xq)nj9.a, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && czd.a((Object)v9m.a((Class)o.getClass()), (Object)v9m.a((Class)lj9.class));
    }
    
    @Override
    public final int hashCode() {
        return v9m.a((Class)lj9.class).hashCode();
    }
    
    public final String name() {
        return "DropsActiveChats";
    }
    
    public static final class a
    {
        public final List<e> a;
        
        public a(final List<e> a) {
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
            return wc0.z("CommunityMembershipsSlice(itemsResults=", (List)this.a, ")");
        }
    }
    
    public static final class b
    {
    }
    
    public static final class d
    {
        public final j a;
        
        public d(final j a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && czd.a((Object)this.a, (Object)((d)o).a));
        }
        
        @Override
        public final int hashCode() {
            final j a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final j a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("DropsActiveChatViewer(userResults=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final h b;
        
        public e(final String a, final h b) {
            this.a = a;
            this.b = b;
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
            return czd.a((Object)this.a, (Object)e.a) && czd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final h b = this.b;
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
            final String a = this.a;
            final h b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ItemsResult(communityId=");
            sb.append(a);
            sb.append(", result=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final String a;
        public final ej9 b;
        
        public f(final String a, final ej9 b) {
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
            final String a = this.a;
            final ej9 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCommunity(__typename=");
            sb.append(a);
            sb.append(", dropsActiveChat=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final a a;
        
        public g(final a a) {
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
            final a a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser(communityMembershipsSlice=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h
    {
        public final String a;
        public final f b;
        
        public h(final String a, final f b) {
            czd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
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
            return czd.a((Object)this.a, (Object)h.a) && czd.a((Object)this.b, (Object)h.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final f b = this.b;
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
            final String a = this.a;
            final f b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result1(__typename=");
            sb.append(a);
            sb.append(", onCommunity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class i
    {
        public final String a;
        public final g b;
        
        public i(final String a, final g b) {
            czd.f((Object)a, "__typename");
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
            final g b = this.b;
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
            final String a = this.a;
            final g b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j
    {
        public final i a;
        
        public j(final i a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof j && czd.a((Object)this.a, (Object)((j)o).a));
        }
        
        @Override
        public final int hashCode() {
            final i a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final i a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("UserResults(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
