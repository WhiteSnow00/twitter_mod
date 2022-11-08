import java.io.IOException;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Map;
import java.util.List;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wlw implements Closeable
{
    public final daq<List<Long>, Map<Long, hfv>> C0;
    public final f6j<Iterable<Long>, Map<Long, hfv>> D0;
    
    public wlw(final Context context, final UserIdentifier userIdentifier) {
        final vlw c0 = new vlw(userIdentifier);
        final q71 d0 = new q71((f6j)new tlw((f6j)new i5w(context.getContentResolver(), (rsl)new iih(((rp1)aav.d2(userIdentifier)).T(), (Class)tkw.class, (Class)hfv.class), (Closeable)i4e.j())));
        this.C0 = (daq<List<Long>, Map<Long, hfv>>)c0;
        this.D0 = (f6j<Iterable<Long>, Map<Long, hfv>>)d0;
    }
    
    public final b5j<List<hfv>> a(final List<Long> list) {
        return (b5j<List<hfv>>)this.D0.v(list).flatMap((qtb)new zn9((Object)this, (Object)list, 6));
    }
    
    @Override
    public final void close() throws IOException {
        ((g88)this.C0).close();
        this.D0.close();
    }
}
