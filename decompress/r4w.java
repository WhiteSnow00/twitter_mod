import java.util.Objects;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r4w
{
    public final Context a;
    public final UserIdentifier b;
    public final juu c;
    public final dw0 d;
    
    public r4w(final Context a, final UserIdentifier b, final juu c, final dw0 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static r4w a(final UserIdentifier userIdentifier) {
        return (r4w)((hyr)((fvu)((v4j)ir0.a()).B((Class)fvu.class)).H7()).get((Object)userIdentifier);
    }
    
    public final void b(final ea9 ea9) {
        this.c(ijf.v((Object)ea9), false, new f1k());
    }
    
    public final void c(final List<ea9> list, final boolean b, final f1k f1k) {
        final r4w.r4w$a r4w$a = new r4w.r4w$a(this.c, this.a, this.b, (List)list, b, f1k);
        final dw0 d = this.d;
        Objects.requireNonNull(d);
        d.d((cw0<Object>)new cw0((fw0)r4w$a));
    }
}
