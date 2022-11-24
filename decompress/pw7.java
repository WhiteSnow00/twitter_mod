// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pw7 implements sdw
{
    public static final class a extends pw7
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends pw7
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends pw7
    {
        public final hy7$c a;
        
        public c(final hy7$c a) {
            e0e.f((Object)a, "item");
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
            final hy7$c a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ConversationClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends pw7
    {
        public final hy7$c$a a;
        
        public d(final hy7$c$a a) {
            e0e.f((Object)a, "item");
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
            final hy7$c$a a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("GroupAvatarClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends pw7
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends pw7
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends pw7
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends pw7
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends pw7
    {
        public final hy7$h a;
        
        public i(final hy7$h a) {
            e0e.f((Object)a, "item");
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
            final hy7$h a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("RecentSearchClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j extends pw7
    {
        public static final j a;
        
        static {
            a = new j();
        }
    }
    
    public static final class k extends pw7
    {
        public final hy7$c$b a;
        
        public k(final hy7$c$b a) {
            e0e.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof k && e0e.a((Object)this.a, (Object)((k)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final hy7$c$b a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("UserAvatarClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
