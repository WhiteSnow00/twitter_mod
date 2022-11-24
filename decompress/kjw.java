import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjw
{
    public static final nmp<kjw> j;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    
    static {
        kjw.j = new kjw.kjw$b();
    }
    
    public kjw(final a a) {
        this.a = a.a;
        String b;
        if ((b = a.b) == null) {
            b = "";
        }
        this.b = b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        final Boolean h = a.h;
        final boolean b2 = false;
        this.h = (h != null && h);
        final Boolean i = a.i;
        boolean booleanValue = b2;
        if (i != null) {
            booleanValue = i;
        }
        this.i = booleanValue;
    }
    
    public static final class a extends z4j<kjw>
    {
        public long a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public int g;
        public Boolean h;
        public Boolean i;
        
        public a() {
            this.a = UserIdentifier.UNDEFINED.getId();
        }
        
        public final Object i() {
            return new kjw(this);
        }
        
        public final boolean k() {
            return this.a != UserIdentifier.UNDEFINED.getId();
        }
    }
}
