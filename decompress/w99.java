import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w99
{
    public final UserIdentifier a;
    public final atg b;
    
    public w99(final atg b, final UserIdentifier a) {
        this.a = a;
        this.b = b;
    }
    
    public final n9q<String> a(final j99 j99, final String s) {
        Object o;
        if (pjr.g((CharSequence)s)) {
            o = this.b.a(s, this.a);
        }
        else {
            o = sz5.C0;
        }
        return (n9q<String>)new faq((ubq)this.b.b(j99, this.a).I(yvo.c()).y(h6q.L()), (h06)o);
    }
}
