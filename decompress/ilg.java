import java.util.Iterator;
import android.content.ContentValues;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilg extends y0b
{
    public final Collection<String> J0;
    
    public ilg(final Context context, final UserIdentifier userIdentifier, final Collection<String> j0) {
        super(context, userIdentifier);
        this.J0 = j0;
    }
    
    public final void m() {
        final hn6 h = this.h();
        final aav g = this.g();
        final Collection<String> j0 = this.J0;
        Objects.requireNonNull(g);
        final ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_read", Integer.valueOf(1));
        final tyr h2 = ((tk1)g).H2();
        h2.H0();
        try {
            final String[] array = { null };
            final Iterator<String> iterator = j0.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                array[0] = iterator.next();
                n += h2.z2("timeline", 0, contentValues, "entity_id=?", (Object[])array);
            }
            h2.A();
            h2.B();
            if (n > 0) {
                b0t.a(h);
            }
            h.b();
        }
        finally {
            h2.B();
        }
    }
}
