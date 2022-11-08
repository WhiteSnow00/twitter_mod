// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dw7 implements qcw
{
    public static final class a extends dw7
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends dw7
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends dw7
    {
        public final wx7$c a;
        
        public c(final wx7$c a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final wx7$c a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ConversationClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends dw7
    {
        public final wx7$c$a a;
        
        public d(final wx7$c$a a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && zzd.a((Object)this.a, (Object)((d)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final wx7$c$a a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("GroupAvatarClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends dw7
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends dw7
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends dw7
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends dw7
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends dw7
    {
        public final wx7$h a;
        
        public i(final wx7$h a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof i && zzd.a((Object)this.a, (Object)((i)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final wx7$h a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("RecentSearchClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class j extends dw7
    {
        public static final j a;
        
        static {
            a = new j();
        }
    }
    
    public static final class k extends dw7
    {
        public final wx7$c$b a;
        
        public k(final wx7$c$b a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof k && zzd.a((Object)this.a, (Object)((k)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final wx7$c$b a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("UserAvatarClicked(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
