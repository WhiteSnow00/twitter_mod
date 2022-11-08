import java.io.IOException;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nhw implements Closeable
{
    public final daq<UserIdentifier, snj<hfv>> C0;
    public final f6j<UserIdentifier, snj<hfv>> D0;
    
    public nhw(final daq<UserIdentifier, snj<hfv>> c0, final f6j<UserIdentifier, snj<hfv>> d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public static nhw a(final Context context, final UserIdentifier userIdentifier) {
        return new nhw((daq<UserIdentifier, snj<hfv>>)new fhw(context.getApplicationContext(), userIdentifier), (f6j<UserIdentifier, snj<hfv>>)new q71((f6j)new dew(aav.d2(userIdentifier))));
    }
    
    public final b5j<snj<hfv>> b(final UserIdentifier userIdentifier) {
        return (b5j<snj<hfv>>)this.D0.v(userIdentifier).concatWith((ubq)this.C0.S((Object)userIdentifier)).filter((ptk)asx.V0).take(1L);
    }
    
    @Override
    public final void close() throws IOException {
        ((g88)this.C0).close();
        this.D0.close();
    }
}
