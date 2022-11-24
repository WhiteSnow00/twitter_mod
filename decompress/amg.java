import com.twitter.database.schema.TwitterSchema;
import android.content.ContentValues;
import java.util.Objects;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amg extends x0b
{
    public final long[] M0;
    public final fxs N0;
    
    public amg(final Context context, final UserIdentifier userIdentifier, final Collection<Long> collection, final fxs n0) {
        super(context, userIdentifier);
        this.M0 = kr4.H((Collection)collection);
        this.N0 = n0;
    }
    
    public final void m() {
        if (this.M0.length <= 0) {
            return;
        }
        final long id = ((gj1)this).F0.getId();
        final kbv g = this.g();
        final tn6 h = this.h();
        final long[] m0 = this.M0;
        final fxs n0 = this.N0;
        Objects.requireNonNull(g);
        int i = 0;
        Label_0390: {
            if (n0 != null && z8t.b(n0.a.a)) {
                final int a = n0.a.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Marking timeline owned by: ");
                sb.append(id);
                sb.append(", of type: ");
                sb.append(a);
                sb.append(" as read.");
                nag.a("DatabaseHelper", sb.toString());
                final h0s h2 = ((sk1)g).H2();
                h2.H0();
                try {
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("is_read", Integer.valueOf(1));
                    int z2;
                    if (m0 == null) {
                        z2 = h2.z2("timeline", 0, contentValues, "owner_id=? AND type=?", (Object[])new String[] { String.valueOf(id), String.valueOf(a) });
                    }
                    else {
                        final int length = m0.length;
                        z2 = 0;
                        for (int j = 0; j < length; ++j) {
                            z2 += h2.z2("timeline", 0, contentValues, ttl.c("_id"), (Object[])new String[] { String.valueOf(m0[j]) });
                        }
                    }
                    h2.A();
                    h2.B();
                    if (z2 > 0) {
                        k1t.a(h);
                    }
                    break Label_0390;
                }
                finally {
                    h2.B();
                }
            }
            final e60 c = ((oxo)((sp1)g).T()).b((Class)ugr.class).c();
            ((ugr$a)c.a).P1(true);
            final Long[] array = new Long[m0.length];
            while (i < m0.length) {
                array[i] = m0[i];
                ++i;
            }
            c.e(ttl.h("_id", (Object[])array));
        }
        h.b();
    }
}
