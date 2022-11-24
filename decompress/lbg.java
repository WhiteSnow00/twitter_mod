import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbg
{
    public final String a;
    public final String b;
    public final zbg c;
    public final String d;
    public final int e;
    
    public lbg(final UserIdentifier userIdentifier, final String s, final int n, final String s2, final int n2) {
        this.e = 2;
        this.a = null;
        this.b = null;
        this.c = new zbg(userIdentifier, s, n, s2, n2);
        this.d = null;
    }
    
    public lbg(final String a, final String b, final String d) {
        this.e = 1;
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = d;
    }
}
