import android.content.ContentResolver;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rnc
{
    public final UserIdentifier a;
    public final ContentResolver b;
    public final k3c c;
    public final c9v d;
    
    public rnc(final UserIdentifier a, final ContentResolver b, final k3c c, final plc plc, final c9v d, final xbm xbm) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        czd.f((Object)plc, "<this>");
        final h5j ofType = plc.v0().ofType((Class)qlf$b.class);
        czd.e((Object)ofType, "onEvent().ofType(clazz)");
        f.j(ofType, (n93)new jgk((Object)this, 11), (z9a)xbm);
    }
}
