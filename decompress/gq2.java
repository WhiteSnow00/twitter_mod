import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gq2 implements oax
{
    public static final b Companion;
    public final String a;
    public final c b;
    public final String c;
    public final a d;
    public final d e;
    public final boolean f;
    
    static {
        Companion = new b();
    }
    
    public gq2() {
        this(null, null, null, null, null, 63);
    }
    
    public gq2(final String a, final c b, final String c, final a d, final d e, final boolean f) {
        zzd.f((Object)a, "playableUrl");
        zzd.f((Object)b, "destination");
        zzd.f((Object)d, "bottomBarContent");
        zzd.f((Object)e, "uiContent");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static gq2 l(final gq2 gq2, d e, final int n) {
        a d = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = gq2.a;
        }
        else {
            a = null;
        }
        c b;
        if ((n & 0x2) != 0x0) {
            b = gq2.b;
        }
        else {
            b = null;
        }
        String c;
        if ((n & 0x4) != 0x0) {
            c = gq2.c;
        }
        else {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            d = gq2.d;
        }
        if ((n & 0x10) != 0x0) {
            e = gq2.e;
        }
        final boolean b2 = (n & 0x20) != 0x0 && gq2.f;
        Objects.requireNonNull(gq2);
        zzd.f((Object)a, "playableUrl");
        zzd.f((Object)b, "destination");
        zzd.f((Object)d, "bottomBarContent");
        zzd.f((Object)e, "uiContent");
        return new gq2(a, b, c, d, e, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gq2)) {
            return false;
        }
        final gq2 gq2 = (gq2)o;
        return zzd.a((Object)this.a, (Object)gq2.a) && zzd.a((Object)this.b, (Object)gq2.b) && zzd.a((Object)this.c, (Object)gq2.c) && zzd.a((Object)this.d, (Object)gq2.d) && this.e == gq2.e && this.f == gq2.f;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        int f;
        if ((f = (this.f ? 1 : 0)) != 0) {
            f = 1;
        }
        return (hashCode5 + (hashCode4 + ((hashCode2 + hashCode * 31) * 31 + hashCode3) * 31) * 31) * 31 + f;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final c b = this.b;
        final String c = this.c;
        final a d = this.d;
        final d e = this.e;
        final boolean f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("BrowserWithBottomBarViewState(playableUrl=");
        sb.append(a);
        sb.append(", destination=");
        sb.append(b);
        sb.append(", thumbnailUrl=");
        sb.append(c);
        sb.append(", bottomBarContent=");
        sb.append(d);
        sb.append(", uiContent=");
        sb.append(e);
        sb.append(", isDurationEnabled=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public abstract static class a
    {
        public final String a;
        public final String b;
        public final String c;
        
        public a(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public String a() {
            return this.c;
        }
        
        public String b() {
            return this.b;
        }
        
        public String c() {
            return this.a;
        }
        
        public static final class a extends gq2.a
        {
            public final String d;
            public final String e;
            public final String f;
            public final vwl g;
            
            public a(final String d, final String e, final String f, final vwl g) {
                zzd.f((Object)d, "title");
                zzd.f((Object)g, "ratings");
                super(d, e, f);
                this.d = d;
                this.e = e;
                this.f = f;
                this.g = g;
            }
            
            @Override
            public final String a() {
                return this.f;
            }
            
            @Override
            public final String b() {
                return this.e;
            }
            
            @Override
            public final String c() {
                return this.d;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof a)) {
                    return false;
                }
                final a a = (a)o;
                return zzd.a((Object)this.d, (Object)a.d) && zzd.a((Object)this.e, (Object)a.e) && zzd.a((Object)this.f, (Object)a.f) && zzd.a((Object)this.g, (Object)a.g);
            }
            
            @Override
            public final int hashCode() {
                return this.g.hashCode() + l7k.a(this.f, l7k.a(this.e, this.d.hashCode() * 31, 31), 31);
            }
            
            @Override
            public final String toString() {
                final String d = this.d;
                final String e = this.e;
                final String f = this.f;
                final vwl g = this.g;
                final StringBuilder y = mb0.y("App(title=", d, ", subtitle=", e, ", previewImage=");
                y.append(f);
                y.append(", ratings=");
                y.append(g);
                y.append(")");
                return y.toString();
            }
        }
        
        public static final class b extends gq2.a
        {
            public static final b d;
            
            static {
                d = new b();
            }
            
            public b() {
                super("", "", "");
            }
        }
        
        public static final class c extends gq2.a
        {
            public final String d;
            public final String e;
            public final String f;
            
            public c(final String d, final String e, final String f) {
                zzd.f((Object)d, "title");
                super(d, e, f);
                this.d = d;
                this.e = e;
                this.f = f;
            }
            
            @Override
            public final String a() {
                return this.f;
            }
            
            @Override
            public final String b() {
                return this.e;
            }
            
            @Override
            public final String c() {
                return this.d;
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
                return zzd.a((Object)this.d, (Object)c.d) && zzd.a((Object)this.e, (Object)c.e) && zzd.a((Object)this.f, (Object)c.f);
            }
            
            @Override
            public final int hashCode() {
                return this.f.hashCode() + l7k.a(this.e, this.d.hashCode() * 31, 31);
            }
            
            @Override
            public final String toString() {
                return hi.I(mb0.y("Web(title=", this.d, ", subtitle=", this.e, ", previewImage="), this.f, ")");
            }
        }
    }
    
    public static final class b
    {
    }
    
    public abstract static class c
    {
        public final String a;
        
        public c(final String a) {
            this.a = a;
        }
        
        public String a() {
            return this.a;
        }
        
        public static final class a extends gq2.c
        {
            public final String b;
            public final String c;
            public final String d;
            
            public a(final String b, final String c, final String d) {
                zzd.f((Object)d, "appId");
                super(c);
                this.b = b;
                this.c = c;
                this.d = d;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof a)) {
                    return false;
                }
                final a a = (a)o;
                return zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c) && zzd.a((Object)this.d, (Object)a.d);
            }
            
            @Override
            public final int hashCode() {
                return this.d.hashCode() + l7k.a(this.c, this.b.hashCode() * 31, 31);
            }
            
            @Override
            public final String toString() {
                return hi.I(mb0.y("App(deepLinkUrl=", this.b, ", resolvedDeepLinkUrl=", this.c, ", appId="), this.d, ")");
            }
        }
        
        public static final class b extends gq2.c
        {
            public static final b b;
            
            static {
                b = new b();
            }
            
            public b() {
                super("");
            }
        }
        
        public static final class c extends gq2.c
        {
            public final String b;
            
            public c(final String b) {
                super(b);
                this.b = b;
            }
            
            @Override
            public final String a() {
                return this.b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof c && zzd.a((Object)this.b, (Object)((c)o).b));
            }
            
            @Override
            public final int hashCode() {
                return this.b.hashCode();
            }
            
            @Override
            public final String toString() {
                return zi.y("Web(websiteUrl=", this.b, ")");
            }
        }
    }
    
    public enum d
    {
        C0, 
        D0, 
        E0;
    }
}
