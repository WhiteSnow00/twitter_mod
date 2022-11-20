import android.app.Activity;
import com.google.android.gms.common.api.a$g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a$d$c;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwa extends b<a$d$c>
{
    public static final a<a$d$c> k;
    
    static {
        k = new a<a$d$c>("Fido.FIDO2_API", (a.a$a<C, a$d$c>)new pwz(), (a.a$g<C>)new a$g());
    }
    
    @Deprecated
    public fwa(final Activity activity) {
        super(activity, (a)fwa.k, (a.d)null, new chw());
    }
}
