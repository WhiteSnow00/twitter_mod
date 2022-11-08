import com.twitter.business.model.phone.PreviewOpenTimesData;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dmh
{
    public static final class a extends dmh
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends dmh
    {
        public final boolean a;
        
        public b(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("FinishActivity(areModulesUpdated=", this.a, ")");
        }
    }
    
    public static final class c extends dmh
    {
        public final koh a;
        public final wkh b;
        public final String c;
        public final boolean d;
        public final PreviewOpenTimesData e;
        public final boolean f;
        
        public c(final koh a, wkh b, String c, boolean d, PreviewOpenTimesData e, boolean f, final int n) {
            if ((n & 0x2) != 0x0) {
                b = null;
            }
            if ((n & 0x4) != 0x0) {
                c = null;
            }
            if ((n & 0x8) != 0x0) {
                d = false;
            }
            if ((n & 0x10) != 0x0) {
                e = null;
            }
            if ((n & 0x20) != 0x0) {
                f = false;
            }
            zzd.f((Object)a, "type");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
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
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && zzd.a((Object)this.c, (Object)c.c) && this.d == c.d && zzd.a((Object)this.e, (Object)c.e) && this.f == c.f;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final wkh b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final int d = this.d ? 1 : 0;
            int n = 1;
            int n2 = d;
            if (d != 0) {
                n2 = 1;
            }
            final PreviewOpenTimesData e = this.e;
            if (e != null) {
                hashCode2 = e.hashCode();
            }
            final int f = this.f ? 1 : 0;
            if (f == 0) {
                n = f;
            }
            return ((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + n2) * 31 + hashCode2) * 31 + n;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final wkh b = this.b;
            final String c = this.c;
            final boolean d = this.d;
            final PreviewOpenTimesData e = this.e;
            final boolean f = this.f;
            final StringBuilder sb = new StringBuilder();
            sb.append("LaunchConfigureFlow(type=");
            sb.append(a);
            sb.append(", moduleData=");
            sb.append(b);
            sb.append(", moduleId=");
            mag.n(sb, c, ", visibleOnCreation=", d, ", previewOpenTimesData=");
            sb.append(e);
            sb.append(", hasFeaturedSpotlight=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends dmh
    {
        public final boolean a;
        public final boolean b;
        
        public d() {
            this.a = false;
            this.b = false;
        }
        
        public d(final boolean a, final boolean b) {
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
            return this.a == d.a && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            final int a = this.a ? 1 : 0;
            int n = 1;
            int n2 = a;
            if (a != 0) {
                n2 = 1;
            }
            final int b = this.b ? 1 : 0;
            if (b == 0) {
                n = b;
            }
            return n2 * 31 + n;
        }
        
        @Override
        public final String toString() {
            return tok.h("LaunchShopConfigureFlow(hasModuleData=", this.a, ", hasFeaturedSpotlight=", this.b, ")");
        }
    }
    
    public static final class e extends dmh
    {
        public final int a;
        
        public e(final int a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof e && this.a == ((e)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffa.k("ShowErrorToast(messageId=", this.a, ")");
        }
    }
    
    public static final class f extends dmh
    {
        public final boolean a;
        
        public f(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof f && this.a == ((f)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("ShowSpotlightToast(isFeatured=", this.a, ")");
        }
    }
}
