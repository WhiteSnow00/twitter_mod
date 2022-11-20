import com.twitter.util.user.UserIdentifier;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yq1 implements u0w
{
    public final l6j<r5w, Cursor> a;
    
    public yq1(final l6j<r5w, Cursor> a, final xbm xbm) {
        this.a = a;
        xbm.i((oj)new qt1((Object)a, 16));
    }
    
    public final h5j<Integer> b(final UserIdentifier userIdentifier) {
        return (h5j<Integer>)this.a.v((Object)this.d(userIdentifier)).map((psb)new gy0((Object)this, 7));
    }
    
    public abstract int c(final Cursor p0);
    
    public abstract r5w d(final UserIdentifier p0);
}
