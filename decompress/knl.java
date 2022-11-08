import tv.periscope.model.NarrowcastSpaceType$None;
import tv.periscope.model.NarrowcastSpaceType;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class knl
{
    public static final class a extends knl
    {
        public final NarrowcastSpaceType a;
        
        public a() {
            this(null, 1, null);
        }
        
        public a(final NarrowcastSpaceType a) {
            zzd.f((Object)a, "narrowCastSpaceType");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
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
    
    public static final class b extends knl
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends knl
    {
        public final String a;
        
        public c(final String a) {
            zzd.f((Object)a, "price");
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
            return zi.y("Purchase(price=", this.a, ")");
        }
    }
    
    public static final class d extends knl
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends knl
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends knl
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
            sb.append("SuperFollow(superFollowsCreatorInfo=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g extends knl
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
}
