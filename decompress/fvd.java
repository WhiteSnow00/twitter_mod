// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fvd
{
    public static final a Companion;
    public static final alp<fvd> a;
    
    static {
        Companion = new a();
        fvd.a = (jx6)hx6.b(new pkp[] { new pkp((Class)d.class, (alp)d.fvd$d$a.b), new pkp((Class)b.class, (alp)b.fvd$b$a.b), new pkp((Class)c.class, (alp)c.fvd$c$a.b) });
    }
    
    public static final class a
    {
    }
    
    public static final class b extends fvd
    {
        public final String b;
        public final dtg c;
        
        public b(final String b, final dtg c) {
            zzd.f((Object)b, "preFilledText");
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
            return zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.b.hashCode();
            final dtg c = this.c;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String b = this.b;
            final dtg c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("TweetComposerDestination(preFilledText=");
            sb.append(b);
            sb.append(", media=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends fvd
    {
        public static final c b;
        
        static {
            b = new c();
        }
    }
    
    public static final class d extends fvd
    {
        public final String b;
        
        public d(final String b) {
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && zzd.a((Object)this.b, (Object)((d)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("WebsiteDestination(url=", this.b, ")");
        }
    }
}
