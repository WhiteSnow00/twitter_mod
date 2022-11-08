import com.twitter.util.user.UserIdentifier;
import androidx.work.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gm8 extends gue implements rtb<c.a, oyv>
{
    public final /* synthetic */ fm8 C0;
    public final /* synthetic */ String D0;
    
    public gm8(final fm8 c0, final String d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final c.a a = (c.a)o;
        fm8.a(this.C0, this.D0, UserIdentifier.UNDEFINED, "failure");
        return oyv.a;
    }
}
