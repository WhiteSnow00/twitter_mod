import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fva
{
    public static final b Companion;
    public static final alp<fva> f;
    public final long a;
    public final Map<String, eva> b;
    public final String c;
    public final String d;
    public final String e;
    
    static {
        Companion = new b();
        fva.f = new fva.fva$c();
    }
    
    public fva(final long a, final Map b, final String c, final String d, final String e, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final eva a(final String s) {
        zzd.f((Object)s, "key");
        return this.b.get(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof fva) {
                final Map<String, eva> b = this.b;
                final fva fva = (fva)o;
                if (zzd.a((Object)b, (Object)fva.b) && zzd.a((Object)this.c, (Object)fva.c) && zzd.a((Object)this.d, (Object)fva.d) && zzd.a((Object)this.e, (Object)fva.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.d, l7k.a(this.c, this.b.hashCode() * 31, 31), 31);
        final String e = this.e;
        int hashCode;
        if (e != null) {
            hashCode = e.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a + hashCode;
    }
    
    public static final class a extends h4j<fva>
    {
        public Map<String, eva> a;
        public String b;
        public String c;
        public String d;
        public long e;
        
        public a() {
            this.e = -1L;
        }
        
        public a(final fva fva) {
            zzd.f((Object)fva, "valueMap");
            this.e = -1L;
            this.a = fva.b;
            this.b = fva.c;
            this.c = fva.d;
            this.d = fva.e;
        }
        
        public final Object i() {
            long n = this.e;
            if (n <= 0L) {
                final t3s a = mq1.a;
                n = System.currentTimeMillis();
            }
            Object o;
            if ((o = this.a) == null) {
                o = a3a.C0;
            }
            String b = this.b;
            if (b == null) {
                b = "";
            }
            String c = this.c;
            if (c == null) {
                c = "";
            }
            return new fva(n, (Map)o, b, c, this.d, null);
        }
    }
    
    public static final class b
    {
    }
}
