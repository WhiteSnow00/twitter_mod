import tv.periscope.model.NarrowcastSpaceType$None;
import tv.periscope.model.NarrowcastSpaceType;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kol
{
    public static final class a extends kol
    {
        public final NarrowcastSpaceType a;
        
        public a() {
            this(null, 1, null);
        }
        
        public a(final NarrowcastSpaceType a) {
            e0e.f((Object)a, "narrowCastSpaceType");
            this.a = a;
        }
        
        public a(final NarrowcastSpaceType narrowcastSpaceType, final int n, final wg8 wg8) {
            this((NarrowcastSpaceType)NarrowcastSpaceType$None.INSTANCE);
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final NarrowcastSpaceType a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("JoinSpace(narrowCastSpaceType=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends kol
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends kol
    {
        public final String a;
        
        public c(final String a) {
            e0e.f((Object)a, "price");
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
            return c0e.h("Purchase(price=", this.a, ")");
        }
    }
    
    public static final class d extends kol
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends kol
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends kol
    {
        public final qxr a;
        
        public f(final qxr a) {
            e0e.f((Object)a, "superFollowsCreatorInfo");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && e0e.a((Object)this.a, (Object)((f)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final qxr a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("SuperFollow(superFollowsCreatorInfo=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g extends kol
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
}
