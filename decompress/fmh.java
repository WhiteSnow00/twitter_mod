// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fmh implements qcw
{
    public static final class a extends fmh
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends fmh
    {
        public final koh a;
        public final ual b;
        public final String c;
        
        public b(final koh a, final ual b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final ual b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final ual b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("ConfigureClicked(moduleType=");
            sb.append(a);
            sb.append(", moduleData=");
            sb.append(b);
            sb.append(", moduleId=");
            return hi.I(sb, c, ")");
        }
    }
    
    public static final class c extends fmh
    {
        public final koh a;
        public final String b;
        
        public c(final koh a, final String b) {
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
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("FeatureSpotlightClicked(moduleType=");
            sb.append(a);
            sb.append(", moduleId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends fmh
    {
        public final koh a;
        public final String b;
        public final ual c;
        
        public d(final koh a, final String b, final ual c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b) && zzd.a((Object)this.c, (Object)d.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final ual c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final String b = this.b;
            final ual c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("ModuleSelected(moduleType=");
            sb.append(a);
            sb.append(", moduleId=");
            sb.append(b);
            sb.append(", moduleData=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends fmh
    {
        public final koh a;
        public final boolean b;
        public final String c;
        
        public e(final koh a, final boolean b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)e.a) && this.b == e.b && zzd.a((Object)this.c, (Object)e.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            final String c = this.c;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + b) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final boolean b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("ModuleToggled(moduleType=");
            sb.append(a);
            sb.append(", isChecked=");
            sb.append(b);
            sb.append(", moduleId=");
            return hi.I(sb, c, ")");
        }
    }
    
    public static final class f extends fmh
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends fmh
    {
        public final koh a;
        public final String b;
        
        public g(final koh a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return zzd.a((Object)this.a, (Object)g.a) && zzd.a((Object)this.b, (Object)g.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final koh a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("RemoveSpotlightClicked(moduleType=");
            sb.append(a);
            sb.append(", moduleId=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h extends fmh
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
}
