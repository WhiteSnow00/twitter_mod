import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fdh implements qcw
{
    public static final class a extends fdh
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends fdh
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends fdh
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends fdh
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends fdh
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends fdh
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends fdh
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends fdh
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends fdh
    {
    }
    
    public static final class j extends fdh
    {
        public static final j a;
        
        static {
            a = new j();
        }
    }
    
    public static final class k extends fdh
    {
        public final MobileAppPlatformType a;
        public final String b;
        
        public k(final MobileAppPlatformType a, final String b) {
            zzd.f((Object)a, "type");
            zzd.f((Object)b, "urlEntered");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return this.a == k.a && zzd.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final MobileAppPlatformType a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("UrlEntered(type=");
            sb.append(a);
            sb.append(", urlEntered=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
