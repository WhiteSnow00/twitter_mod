import com.twitter.database.schema.GlobalSchema;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dd4 extends y0b
{
    public dd4(final Context context, final UserIdentifier userIdentifier) {
        super(context, userIdentifier);
    }
    
    public final void m() {
        final Context f0 = super.F0;
        final GlobalSchema globalSchema = (GlobalSchema)((rp1)i4c.m0()).T();
        new vk6(f0, globalSchema, ((jj1)this).C0);
        ((dwo)globalSchema).b((Class)xk6.class).b((String)null);
    }
}
