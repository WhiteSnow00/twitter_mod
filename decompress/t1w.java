import android.net.Uri;
import com.twitter.database.legacy.gdbh.GlobalDatabaseProvider;
import com.twitter.util.user.UserIdentifier;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t1w extends fr1
{
    public t1w(final x6j<g6w, Cursor> x6j, final kcm kcm) {
        super(x6j, kcm);
    }
    
    @Override
    public final t5j<wg1> a(final UserIdentifier userIdentifier) {
        return (t5j<wg1>)this.b(userIdentifier).map((rtb)new p1p((Object)userIdentifier, 4));
    }
    
    @Override
    public final int c(final Cursor cursor) {
        int int1;
        if (cursor.moveToFirst()) {
            int1 = cursor.getInt(2);
        }
        else {
            int1 = 0;
        }
        return int1;
    }
    
    @Override
    public final g6w d(final UserIdentifier userIdentifier) {
        final g6w$a g6w$a = new g6w$a();
        g6w$a.g = Uri.withAppendedPath(GlobalDatabaseProvider.G0, String.valueOf(userIdentifier));
        g6w$a.h = m4c$a.a;
        return (g6w)((z4j)g6w$a).e();
    }
}
