import java.util.List;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b5r extends y4r
{
    public final long q1;
    
    public b5r(final Context context, final UserIdentifier userIdentifier, final Uri uri, final m1h m1h, final long q1, final List<d2h> list) {
        super(userIdentifier, uri, m1h, (List)list, true);
        this.q1 = q1;
    }
    
    public final void o0(final tqc$a tqc$a) {
        tqc$a.e = arc$b.F0;
        final int a = c5j.a;
        tqc$a.d("command", "STATUS");
        tqc$a.c("media_id", this.q1);
    }
}
