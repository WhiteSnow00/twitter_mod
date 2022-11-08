import android.content.ContentValues;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hlg extends y0b
{
    public final long J0;
    public final aws K0;
    
    public hlg(final Context context, final long j0, final aws k0, final UserIdentifier userIdentifier) {
        super(context, userIdentifier);
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final void m() {
        final hn6 h = this.h();
        final qll j2 = aav.J2(((jj1)this).C0);
        new wts(j2);
        final long j3 = this.J0;
        final aws k0 = this.K0;
        final String a = tsl.a(new String[] { k0.b(), tsl.l("sort_index", (Object)j3) });
        final tyr p = ((tk1)j2.get()).p();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("should_highlight", Integer.valueOf(0));
        p.H0();
        final int z2 = p.z2("timeline", 0, contentValues, a, (Object[])null);
        p.A();
        p.B();
        if (z2 > 0) {
            b0t.c(h, k0);
        }
        h.b();
    }
}
