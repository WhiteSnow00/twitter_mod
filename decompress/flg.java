import android.content.ContentValues;
import java.lang.ref.WeakReference;
import android.content.ContextWrapper;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flg extends vza
{
    public final int K0;
    public final long L0;
    public final Object M0;
    
    public flg(final Context context, final long l0, final mws m0, final UserIdentifier userIdentifier) {
        this.K0 = 0;
        super(context, userIdentifier);
        this.L0 = l0;
        this.M0 = m0;
    }
    
    public flg(final ContextWrapper contextWrapper, final UserIdentifier userIdentifier, final long l0) {
        this.K0 = 1;
        super((Context)contextWrapper, userIdentifier);
        this.M0 = new WeakReference(contextWrapper);
        this.L0 = l0;
    }
    
    public final void m() {
        switch (this.K0) {
            default: {
                final ContextWrapper contextWrapper = (ContextWrapper)((WeakReference)this.M0).get();
                if (contextWrapper != null) {
                    final nm6 nm6 = new nm6(contextWrapper.getContentResolver());
                    h28.a(((dj1)this).D0).v2().A(this.L0, nm6);
                    nm6.b();
                }
                return;
            }
            case 0: {
                final nm6 h = this.h();
                final dml i2 = vav.I2(((dj1)this).D0);
                new nus(i2);
                final long l0 = this.L0;
                final mws mws = (mws)this.M0;
                final String a = itl.a(new String[] { mws.b(), itl.l("sort_index", (Object)l0) });
                final lzr p = ((ok1)((ycq)i2).D0).p();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("should_highlight", Integer.valueOf(0));
                p.G0();
                final int y2 = p.y2("timeline", 0, contentValues, a, (Object[])null);
                p.z();
                p.A();
                if (y2 > 0) {
                    r0t.c(h, mws);
                }
                h.b();
            }
        }
    }
}
