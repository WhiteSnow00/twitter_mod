import java.io.IOException;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Map;
import java.util.List;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmw implements Closeable
{
    public final uaq<List<Long>, Map<Long, cgv>> D0;
    public final l6j<Iterable<Long>, Map<Long, cgv>> E0;
    
    public qmw(final Context context, final UserIdentifier userIdentifier) {
        final pmw d0 = new pmw(userIdentifier);
        final j71 e0 = new j71((l6j)new nmw((l6j)new t5w(context.getContentResolver(), (gtl)new nih(((np1)vav.c2(userIdentifier)).T(), (Class)llw.class, (Class)cgv.class), (Closeable)n3e.j())));
        this.D0 = (uaq<List<Long>, Map<Long, cgv>>)d0;
        this.E0 = (l6j<Iterable<Long>, Map<Long, cgv>>)e0;
    }
    
    public final h5j<List<cgv>> a(final List<Long> list) {
        return (h5j<List<cgv>>)this.E0.v((Object)list).flatMap((psb)new cbg((Object)this, (Object)list, 7));
    }
    
    @Override
    public final void close() throws IOException {
        ((s78)this.D0).close();
        ((s78)this.E0).close();
    }
}
