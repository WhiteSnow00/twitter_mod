import com.twitter.util.user.UserIdentifier;
import com.twitter.media.util.MediaException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzg extends jj1<Object>
{
    public final oyg F0;
    public MediaException G0;
    public kvg H0;
    
    public bzg(final UserIdentifier userIdentifier, final oyg f0) {
        super(userIdentifier);
        this.F0 = f0;
    }
    
    public final Object b() {
        final kvg next = this.F0.next();
        this.H0 = next;
        if (next == null) {
            this.G0 = new MediaException("Error in MediaProcessor");
        }
        return null;
    }
}
