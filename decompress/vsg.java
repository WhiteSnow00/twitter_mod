import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vsg
{
    public final String a;
    public final r89 b;
    public final UserIdentifier c;
    public final String d;
    public final long e;
    
    public vsg(final a a) {
        this.a = a.a;
        this.d = a.b;
        this.b = a.c;
        this.c = a.d;
        this.e = a.e;
    }
    
    public static final class a extends n4j<vsg>
    {
        public String a;
        public String b;
        public r89 c;
        public UserIdentifier d;
        public long e;
        
        public final Object i() {
            return new vsg(this);
        }
        
        public final boolean l() {
            return this.a != null && this.c != null && this.d != null;
        }
    }
}
