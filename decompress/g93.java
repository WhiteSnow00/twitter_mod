import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g93 extends zmg
{
    public final int I0;
    
    public g93(final ContentResolver contentResolver, final Uri uri, final ca7<vxs> ca7, final int i0) {
        super(contentResolver, uri, ca7);
        this.I0 = i0;
    }
    
    @Override
    public final p4e<vxs> b(final evs evs, final int n) {
        return (p4e<vxs>)new fld(evs, (ca7)super.F0, this.I0, n);
    }
}
