import com.twitter.util.user.UserIdentifier;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fr1 implements k1w
{
    public final x6j<g6w, Cursor> a;
    
    public fr1(final x6j<g6w, Cursor> a, final kcm kcm) {
        this.a = a;
        kcm.i((sj)new gwt((Object)a, 14));
    }
    
    @Override
    public final t5j<Integer> b(final UserIdentifier userIdentifier) {
        return (t5j<Integer>)this.a.w(this.d(userIdentifier)).map((rtb)new zx9((Object)this, 6));
    }
    
    public abstract int c(final Cursor p0);
    
    public abstract g6w d(final UserIdentifier p0);
}
