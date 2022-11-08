import java.util.Date;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qua
{
    public static final a Companion;
    public static final alp<qua> f;
    public final String a;
    public final int b;
    public final List<b> c;
    public final Date d;
    public final Date e;
    
    static {
        Companion = new a();
        qua.f = new qua.qua$c();
    }
    
    public qua(final String a, final int b, final List<b> c, final Date d, final Date e) {
        zzd.f((Object)a, "name");
        zzd.f((Object)c, "buckets");
        zzd.f((Object)d, "startTime");
        zzd.f((Object)e, "endTime");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public static final a Companion;
        public static final alp<b> c;
        public final String a;
        public final int b;
        
        static {
            Companion = new a();
            b.c = new b.qua$b$b();
        }
        
        public b(final String a, final int b) {
            zzd.f((Object)a, "name");
            this.a = a;
            this.b = b;
        }
        
        public static final class a
        {
        }
    }
}
