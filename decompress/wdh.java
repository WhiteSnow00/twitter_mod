import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wdh implements sdw
{
    public static final class a extends wdh
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends wdh
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends wdh
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends wdh
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends wdh
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends wdh
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends wdh
    {
        public static final g a;
        
        static {
            a = new g();
        }
    }
    
    public static final class h extends wdh
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends wdh
    {
    }
    
    public static final class j extends wdh
    {
        public static final j a;
        
        static {
            a = new j();
        }
    }
    
    public static final class k extends wdh
    {
        public final MobileAppPlatformType a;
        public final String b;
        
        public k(final MobileAppPlatformType a, final String b) {
            e0e.f((Object)a, "type");
            e0e.f((Object)b, "urlEntered");
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
            return this.a == k.a && e0e.a((Object)this.b, (Object)k.b);
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
